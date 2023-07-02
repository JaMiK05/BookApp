package uz.gita.playmarketbookapp.di

import android.content.Context
import androidx.room.Room
import dagger.*
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import uz.gita.playmarketbookapp.data.local.room.dao.AppDao
import uz.gita.playmarketbookapp.data.local.room.database.BookDatabase
import javax.inject.Singleton

/**
 *   Created by Jamik on 6/26/2023 ot 3:21 PM
 **/
@Module
@InstallIn(SingletonComponent::class)
class BookDataBaseModule {

    @[Provides Singleton]
    fun providerBookDatabase(@ApplicationContext context: Context): BookDatabase =
        Room.databaseBuilder(context, BookDatabase::class.java, "MyBook")
            .fallbackToDestructiveMigration()
            .build()

    @[Provides Singleton]
    fun provideBookDao(database: BookDatabase): AppDao = database.getDao()

}