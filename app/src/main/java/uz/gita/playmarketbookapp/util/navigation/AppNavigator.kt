package uz.gita.playmarketbookapp.util.navigation

import cafe.adriel.voyager.androidx.AndroidScreen

/**
 *   Created by Jamik on 6/23/2023 ot 4:56 PM
 **/

typealias AppScreen = AndroidScreen

interface AppNavigator {

    suspend fun stackLog()
    suspend fun back()
    suspend fun backUntilRoot()
    suspend fun backAll()
    suspend fun navigateTo(screen: AppScreen)
    suspend fun replace(screen: AppScreen)
    suspend fun replaceAll(screen: AppScreen)


}