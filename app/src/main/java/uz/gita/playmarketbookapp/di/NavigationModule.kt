package uz.gita.playmarketbookapp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.playmarketbookapp.util.navigation.AppNavigator
import uz.gita.playmarketbookapp.util.navigation.NavigationDispatcher
import uz.gita.playmarketbookapp.util.navigation.NavigationHandler
import javax.inject.Singleton

/**
 *   Created by Jamik on 6/23/2023 ot 5:02 PM
 **/
@Module
@InstallIn(SingletonComponent::class)
interface NavigationModule {

    @[Binds Singleton]
    fun bindAppNavigator(impl: NavigationDispatcher): AppNavigator

    @[Binds Singleton]
    fun bindNavigationHandler(impl: NavigationDispatcher): NavigationHandler

}