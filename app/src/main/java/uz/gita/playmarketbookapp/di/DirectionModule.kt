package uz.gita.playmarketbookapp.di

import dagger.*
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadDirection
import uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadDirectionImpl
import uz.gita.playmarketbookapp.presentation.homescreen.*
import uz.gita.playmarketbookapp.presentation.savescreen.*
import javax.inject.Singleton

/**
 *   Created by Jamik on 6/23/2023 ot 5:04 PM
 **/
@Module
@InstallIn(SingletonComponent::class)
interface DirectionModule {

    @[Binds Singleton]
    fun homeDirection(impl: HomeDirectionImpl): HomeDirection

    @[Binds Singleton]
    fun saveScreenDirection(impl: SaveScreenDirectionImpl): SaveScreenDirection

    @[Binds Singleton]
    fun readBookScreenDirection(impl: ReadDirectionImpl): ReadDirection

}