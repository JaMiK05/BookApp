package uz.gita.playmarketbookapp.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.gita.playmarketbookapp.data.model.BookData
import uz.gita.playmarketbookapp.data.model.CategoryData

/**
 *   Created by Jamik on 6/25/2023 ot 1:01 AM
 **/
interface AppRepository {

    fun getAllCategories(): Flow<List<CategoryData>>

    fun getBooks(list: List<String>): Flow<List<BookData>>

    fun getALlBooks(): Flow<List<BookData>>

    fun getFirebaseSearchBooks(name:String): Flow<List<BookData>>

    fun saveBook(book: BookData): Flow<Result<Float>>

    fun saveBookDatabase(book: BookData)

    fun getBooksDatabase(): Flow<List<BookData>>

    fun getDatabaseSearchBook(name: String): Flow<List<BookData>>

}