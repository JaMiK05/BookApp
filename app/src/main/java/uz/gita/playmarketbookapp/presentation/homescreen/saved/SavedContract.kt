package uz.gita.playmarketbookapp.presentation.homescreen.saved

import kotlinx.coroutines.flow.StateFlow
import uz.gita.playmarketbookapp.data.model.BookData

/**
 *   Created by Jamik on 6/29/2023 ot 9:32 AM
 **/
interface SavedContract {


    sealed interface Intent {
        class ReadScreenTo(val book: BookData) : Intent
        class GetSearchBooks(val str: String) : Intent
        object UpdateData : Intent
    }

    data class UiState(
        val savedList: List<BookData> = emptyList(),
        val progresbar: Boolean = false,
    )

    interface ViewModel {
        val uiState: StateFlow<UiState>
        fun onEventDispatcher(intent: Intent)
    }

}