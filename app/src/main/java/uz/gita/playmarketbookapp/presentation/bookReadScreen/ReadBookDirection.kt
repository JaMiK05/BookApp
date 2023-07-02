package uz.gita.playmarketbookapp.presentation.bookReadScreen

import uz.gita.playmarketbookapp.data.model.BookData
import uz.gita.playmarketbookapp.presentation.homescreen.HomeDirection
import uz.gita.playmarketbookapp.presentation.savescreen.SaveScreen
import uz.gita.playmarketbookapp.util.navigation.AppNavigator
import javax.inject.Inject

/**
 *   Created by Jamik on 6/29/2023 ot 1:58 PM
 **/

interface ReadDirection {
    suspend fun backTo()
}
class ReadDirectionImpl @Inject constructor(
    private val navigator: AppNavigator,
) : ReadDirection {
    override suspend fun backTo() {
        navigator.back()
    }
}