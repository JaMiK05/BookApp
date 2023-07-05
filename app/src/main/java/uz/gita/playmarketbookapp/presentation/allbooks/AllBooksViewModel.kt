package uz.gita.playmarketbookapp.presentation.allbooks

import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import uz.gita.playmarketbookapp.data.model.BookData
import uz.gita.playmarketbookapp.data.model.SliderBook
import uz.gita.playmarketbookapp.domain.repository.AppRepository
import uz.gita.playmarketbookapp.presentation.homescreen.HomeDirection
import uz.gita.playmarketbookapp.util.myLog
import javax.inject.Inject

/**
 *   Created by Jamik on 6/25/2023 ot 3:09 PM
 **/

@HiltViewModel
class AllBooksViewModel @Inject constructor(
    private val direction: HomeDirection,
    private val repository: AppRepository,
) : ViewModel(), AllBooksContract.ViewModel {
    override val uiState = MutableStateFlow(AllBooksContract.UiState())

    init {
        setSlider()
        getAllBooks()
    }

    private fun getAllBooks() {
        repository.getALlBooks().onEach { bookList ->
            bookList.shuffled()
            uiState.update { it.copy(allList = bookList) }
            setSlideList()
        }.launchIn(viewModelScope)
    }

    private fun getSearchBooks(str: String) {
        repository.getFirebaseSearchBooks(str).onEach { bookList ->
            bookList.shuffled()
            uiState.update { it.copy(allList = bookList) }
        }.launchIn(viewModelScope)
    }

    private fun setSlideList() {
        val list = ArrayList<BookData>(uiState.value.allList)
        list.shuffle()
        uiState.update { it.copy(slideList = list.subList(0, 5)) }
    }

    override fun onEventDispatcher(intent: AllBooksContract.Intent) {
        when (intent) {
            is AllBooksContract.Intent.ReadBook -> {
                viewModelScope.launch {
                    direction.savedTo(intent.data)
                }
            }
            is AllBooksContract.Intent.GetBooks -> {
                if (intent.str.isEmpty()) {
                    getAllBooks()
                } else {
                    getSearchBooks(intent.str)
                }
            }
        }
    }

    private fun setSlider() {
        var time: Long = 0
        viewModelScope.launch {
            while (true) {
                if (time == 180_000L) {
                    setSlideList()
                    time = 0
                }
                if (SliderBook.Slide.value == 5f) {
                    SliderBook.Slide.value = 0f
                }
                delay(5000)
                time += 5000L
                SliderBook.Slide.value += 1f
            }
        }
    }

}