package uz.gita.playmarketbookapp.presentation.savescreen

import uz.gita.playmarketbookapp.data.model.BookData
import uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadScreen
import uz.gita.playmarketbookapp.util.navigation.AppNavigator
import javax.inject.Inject

/**
 *   Created by Jamik on 6/26/2023 ot 4:04 PM
 **/
interface SaveScreenDirection {
    suspend fun backToScreen()
    suspend fun sweetchToReadScreen(bookData: BookData)
}

class SaveScreenDirectionImpl @Inject constructor(
    private val navigator: AppNavigator,
) : SaveScreenDirection {
    override suspend fun backToScreen() {
        navigator.back()
    }

    override suspend fun sweetchToReadScreen(bookData: BookData) {
        navigator.navigateTo(ReadScreen(bookData))
    }
}