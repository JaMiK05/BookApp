package uz.gita.playmarketbookapp.data.local.room.database

import androidx.room.*
import uz.gita.playmarketbookapp.data.local.room.dao.AppDao
import uz.gita.playmarketbookapp.data.local.room.entity.BookEntity

/**
 *   Created by Jamik on 6/26/2023 ot 3:19 PM
 **/
@Database(entities = [BookEntity::class], version = 1)
abstract class BookDatabase : RoomDatabase() {
    abstract fun getDao():AppDao
}