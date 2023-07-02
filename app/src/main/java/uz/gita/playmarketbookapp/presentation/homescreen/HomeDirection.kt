package uz.gita.playmarketbookapp.presentation.homescreen

import uz.gita.playmarketbookapp.data.model.BookData
import uz.gita.playmarketbookapp.presentation.savescreen.SaveScreen
import uz.gita.playmarketbookapp.util.navigation.AppNavigator
import javax.inject.Inject

/**
 *   Created by Jamik on 6/25/2023 ot 10:37 AM
 **/
interface HomeDirection {
    suspend fun savedTo(bookData: BookData)
}

class HomeDirectionImpl @Inject constructor(
    private val navigator: AppNavigator,
) : HomeDirection {
    override suspend fun savedTo(bookData: BookData) {
        navigator.navigateTo(SaveScreen(bookData))
    }
}