package uz.gita.playmarketbookapp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.playmarketbookapp.domain.repository.AppRepository
import uz.gita.playmarketbookapp.domain.repository.AppRepositoryImpl
import javax.inject.Singleton

/**
 *   Created by Jamik on 6/25/2023 ot 10:43 AM
 **/
@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @[Binds Singleton]
    fun appRepositoryBind(impl: AppRepositoryImpl): AppRepository

}