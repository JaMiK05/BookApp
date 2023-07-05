package uz.gita.playmarketbookapp.domain.repository

import android.content.Context
import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking
import uz.gita.playmarketbookapp.data.local.room.dao.AppDao
import uz.gita.playmarketbookapp.data.model.BookData
import uz.gita.playmarketbookapp.data.model.CategoryData
import uz.gita.playmarketbookapp.util.myLog
import java.io.File
import javax.inject.Inject

/**
 *   Created by Jamik on 6/25/2023 ot 1:00 AM
 **/
class AppRepositoryImpl @Inject constructor() : AppRepository {

    private val firestore = Firebase.firestore
    private val storage = Firebase.storage.reference
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    @Inject
    lateinit var dao: AppDao

    @Inject
    lateinit var context: Context

    override fun getAllCategories(): Flow<List<CategoryData>> = callbackFlow {
        val categoryRef = firestore.collection("category")
        categoryRef
            .addSnapshotListener { snapshots, e ->
                if (e != null) {
                    Log.w("TTT", "listen:error", e)
                    return@addSnapshotListener
                }
                val categories = ArrayList<CategoryData>()
                for (dc in snapshots!!.documents) {
                    val category = CategoryData(
                        name = dc.get("name") as String,
                        list = dc.get("list") as ArrayList<String>
                    )
                    categories.add(category)
                }
                trySend(categories)
            }
        awaitClose()
    }

    override fun getBooks(list: List<String>): Flow<List<BookData>> = callbackFlow {
        val documents = firestore.collection("books")
        val books = ArrayList<BookData>()
        list.forEach {
            documents.whereEqualTo("name", it)
                .addSnapshotListener { snapshots, e ->
                    if (e != null) {
                        Log.w("TTT", "listen:error", e)
                        return@addSnapshotListener
                    }
                    for (data in snapshots!!.documents) {
                        val book = BookData(
                            bookUrl = data["bookUrl"] as String,
                            coverUrl = data["coverUrl"] as String,
                            name = data["name"] as String,
                            owner = data["owner"] as String,
                            onlineBookUrl = data["onlineBookUrl"] as String,
                            description = data["description"] as String,
                            reference = data["reference"] as String,
                        )
                        book.save = saveOrNotSave("${book.reference}.pdf")
                        books.add(book)
                    }
                    trySend(books)
                }
        }
        awaitClose()
    }

    override fun getALlBooks(): Flow<List<BookData>> = callbackFlow {
        val documents = firestore.collection("books")
        val books = ArrayList<BookData>()
        documents
            .addSnapshotListener { snapshots, e ->
                if (e != null) {
                    Log.w("TTT", "listen:error", e)
                    return@addSnapshotListener
                }
                for (data in snapshots!!.documents) {
                    val book = BookData(
                        bookUrl = data["bookUrl"] as String,
                        coverUrl = data["coverUrl"] as String,
                        name = data["name"] as String,
                        owner = data["owner"] as String,
                        onlineBookUrl = data["onlineBookUrl"] as String,
                        description = data["description"] as String,
                        reference = data["reference"] as String,
                    )
                    book.save = saveOrNotSave("${book.reference}.pdf")
                    books.add(book)
                }
                trySend(books)
            }
        awaitClose()
    }

    override fun getFirebaseSearchBooks(name: String): Flow<List<BookData>> = callbackFlow {
        val documents = firestore.collection("books")
        val books = ArrayList<BookData>()

        documents.get()
            .addOnSuccessListener { querySnapshot ->
                querySnapshot.forEach { data ->
                    val dataName = data["name"] as String
                    if (dataName.startsWith(name, ignoreCase = true)) {
                        val book = BookData(
                            bookUrl = data["bookUrl"] as String,
                            coverUrl = data["coverUrl"] as String,
                            name = data["name"] as String,
                            owner = data["owner"] as String,
                            onlineBookUrl = data["onlineBookUrl"] as String,
                            description = data["description"] as String,
                            reference = data["reference"] as String,
                        )
                        book.save = saveOrNotSave("${book.reference}.pdf")
                        books.add(book)
                    }
                }
                trySend(books)
            }
        awaitClose()
    }

    override fun saveBook(book: BookData): Flow<Result<Float>> = callbackFlow {
        myLog("repostory in savebook")
        val reference = "${book.reference}.pdf"
        if (saveOrNotSave(reference)) {
            trySend(Result.success(-1f))
        } else {
            storage.child("books/${book.bookUrl}")
                .getFile(File(context.filesDir, reference))
                .addOnProgressListener { taskSnapshot ->
                    val progress =
                        (100.0 * taskSnapshot.bytesTransferred / taskSnapshot.totalByteCount).toFloat()
                    trySend(Result.success(progress))
                    myLog(progress.toString())
                }
                .addOnSuccessListener {
                    trySend(Result.success(101f))
                }
                .addOnFailureListener {
                    trySend(Result.failure(it))
                }
        }
        awaitClose()
    }

    override fun saveBookDatabase(book: BookData) {
        runBlocking(Dispatchers.IO) {
            dao.addBook(book.dataToEntity())
        }
    }

    override fun getBooksDatabase(): Flow<List<BookData>> = callbackFlow {
        dao.getAllSaveBook().onEach { list ->
            val result = ArrayList<BookData>()
            list.forEach {
                result.add(it.bookEntityToBookData())
            }
            trySend(result)
        }.launchIn(scope)
        awaitClose()
    }

    override fun getDatabaseSearchBook(name: String): Flow<List<BookData>> = flow {
        val list = dao.getBooks(name)
        val result = ArrayList<BookData>()
        list.forEach {
            result.add(it.bookEntityToBookData())
        }
        emit(result)
    }.flowOn(Dispatchers.IO)

    private fun saveOrNotSave(reference: String) =
        File(context.filesDir, reference).exists()
}