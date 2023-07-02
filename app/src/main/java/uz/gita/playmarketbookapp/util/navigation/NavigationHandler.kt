package uz.gita.playmarketbookapp.util.navigation

import cafe.adriel.voyager.navigator.Navigator
import kotlinx.coroutines.flow.Flow

/**
 *   Created by Jamik on 6/23/2023 ot 4:57 PM
 **/

typealias NavigationArgs = Navigator.() -> Unit

interface NavigationHandler {
    val navigationStack: Flow<NavigationArgs>
}