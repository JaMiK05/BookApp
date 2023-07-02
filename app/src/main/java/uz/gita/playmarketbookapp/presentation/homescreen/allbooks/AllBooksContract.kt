package uz.gita.playmarketbookapp.presentation.homescreen.allbooks

import kotlinx.coroutines.flow.StateFlow
import uz.gita.playmarketbookapp.data.model.BookData

/**
 *   Created by Jamik on 6/25/2023 ot 3:07 PM
 **/
interface AllBooksContract {
    sealed interface Intent {
        class ReadBook(val data: BookData) : Intent
        class GetBooks(val str: String) : Intent
    }

    data class UiState(
        val allList: List<BookData> = emptyList(),
        val slideList: List<BookData> = emptyList(),
    )

    interface ViewModel {
        val uiState: StateFlow<UiState>
        fun onEventDispatcher(intent: Intent)
    }

}