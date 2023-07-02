package uz.gita.playmarketbookapp.presentation.homescreen.homepage

import kotlinx.coroutines.flow.StateFlow
import uz.gita.playmarketbookapp.data.model.*

/**
 *   Created by Jamik on 6/25/2023 ot 9:21 AM
 **/
interface HomeContract {

    sealed interface Intent {
        class ReadBook(val data: BookData) : Intent
    }

    data class UiState(
        val allList: List<HomeItemData> = emptyList(),
        val allBooks: HomeItemData = HomeItemData(
            CategoryData("All Books", arrayListOf()),
            arrayListOf()
        ),
    )

    interface ViewModel {
        val uiState: StateFlow<UiState>
        fun onEventDispatcher(intent: Intent)
    }

}