package uz.gita.playmarketbookapp.presentation.homescreen.saved

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import uz.gita.playmarketbookapp.domain.repository.AppRepository
import uz.gita.playmarketbookapp.presentation.homescreen.HomeDirection
import uz.gita.playmarketbookapp.util.myLog
import javax.inject.Inject

/**
 *   Created by Jamik on 6/29/2023 ot 9:36 AM
 **/
@HiltViewModel
class SavedViewModel @Inject constructor(
    private val repository: AppRepository,
    private val direction: HomeDirection,
) : ViewModel(), SavedContract.ViewModel {
    override val uiState = MutableStateFlow(SavedContract.UiState())

    init {
        myLog("saved init")
        getData()
    }

    private fun getData() {
        uiState.update { it.copy(progresbar = true) }
        repository.getBooksDatabase().onEach { booList ->
            uiState.update { it.copy(progresbar = false) }
            uiState.update { it.copy(savedList = booList) }
        }.launchIn(viewModelScope)
    }

    private fun getSearchData(string: String) {
        uiState.update { it.copy(progresbar = true) }
        repository.getDatabaseSearchBook(string).onEach { booList ->
            uiState.update { it.copy(progresbar = false) }
            uiState.update { it.copy(savedList = booList) }
        }.launchIn(viewModelScope)
    }

    override fun onEventDispatcher(intent: SavedContract.Intent) {
        when (intent) {
            is SavedContract.Intent.ReadScreenTo -> {
                viewModelScope.launch {
                    direction.savedTo(intent.book)
                }
            }

            is SavedContract.Intent.UpdateData -> {
                getData()
            }

            is SavedContract.Intent.GetSearchBooks -> {
                if (intent.str.isEmpty()) {
                    getData()
                } else {
                    getSearchData(intent.str)
                }
            }
        }
    }
}