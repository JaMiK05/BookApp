package uz.gita.playmarketbookapp.presentation.savescreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import uz.gita.playmarketbookapp.domain.repository.AppRepository
import javax.inject.Inject

/**
 *   Created by Jamik on 6/26/2023 ot 4:02 PM
 **/
@HiltViewModel
class SaveScreenViewModel @Inject constructor(
    private val repository: AppRepository,
    private val direction: SaveScreenDirection,
) : ViewModel(), SaveScreenContract.ViewModel {
    override val uiState = MutableStateFlow(SaveScreenContract.UiState())

    override fun onEvenDispatcher(intent: SaveScreenContract.Intent) {
        when (intent) {
            is SaveScreenContract.Intent.SaveToBook -> {
                val book = intent.book
                repository.saveBook(book).onEach { result ->
                    result.onSuccess { progress ->
                        when (progress) {
                            -1f -> {
                                book.save = true
                            }

                            101f -> {
                                book.save = true
                                repository.saveBookDatabase(book)
                                uiState.update { it.copy(showOrHide = false) }
                            }

                            else -> {
                                uiState.update { it.copy(showOrHide = true, progress = progress) }
                            }
                        }
                    }
                    result.onFailure {
                    }
                }.launchIn(viewModelScope)
            }

            is SaveScreenContract.Intent.BackToScreen -> {
                viewModelScope.launch {
                    direction.backToScreen()
                }
            }

            is SaveScreenContract.Intent.ReadScreenTo -> {
                viewModelScope.launch {
                    direction.sweetchToReadScreen(intent.book)
                }
            }
        }
    }
}