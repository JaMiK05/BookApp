package uz.gita.playmarketbookapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 *   Created by Jamik on 6/26/2023 ot 3:33 PM
 **/
@Module
@InstallIn(SingletonComponent::class)
class ContextModule {
    @[Provides Singleton]
    fun provideContext(@ApplicationContext context: Context): Context = context
}