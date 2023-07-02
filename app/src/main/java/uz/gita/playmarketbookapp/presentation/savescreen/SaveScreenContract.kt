package uz.gita.playmarketbookapp.presentation.savescreen

import kotlinx.coroutines.flow.StateFlow
import uz.gita.playmarketbookapp.data.model.BookData
import uz.gita.playmarketbookapp.data.model.CategoryData
import uz.gita.playmarketbookapp.data.model.HomeItemData
import uz.gita.playmarketbookapp.presentation.homescreen.homepage.HomeContract

/**
 *   Created by Jamik on 6/26/2023 ot 4:00 PM
 **/
interface SaveScreenContract {

    sealed interface Intent {
        class SaveToBook(val book: BookData) : Intent
        object BackToScreen : Intent
        class ReadScreenTo(val book: BookData) : Intent
    }

    data class UiState(
        val showOrHide: Boolean = false,
        val progress: Float = 0f,
    )


    interface ViewModel {
        val uiState: StateFlow<UiState>
        fun onEvenDispatcher(intent: Intent)

    }

}