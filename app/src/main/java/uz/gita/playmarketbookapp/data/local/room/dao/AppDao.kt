package uz.gita.playmarketbookapp.data.local.room.dao

import androidx.room.*
import uz.gita.playmarketbookapp.data.local.room.entity.BookEntity

/**
 *   Created by Jamik on 6/26/2023 ot 3:07 PM
 **/
@Dao
interface AppDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addBook(book: BookEntity)

    @Query("SELECT * FROM books")
    fun getAllSaveBook(): List<BookEntity>

    @Query("SELECT * FROM books WHERE name LIKE :name || '%'  ORDER BY UPPER(name) ASC")
    fun getBooks(name: String): List<BookEntity>
}