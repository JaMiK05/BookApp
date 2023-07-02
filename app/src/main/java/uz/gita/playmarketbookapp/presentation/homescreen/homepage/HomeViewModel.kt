package uz.gita.playmarketbookapp.presentation.homescreen.homepage

import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import uz.gita.playmarketbookapp.data.model.*
import uz.gita.playmarketbookapp.domain.repository.AppRepository
import uz.gita.playmarketbookapp.presentation.homescreen.HomeDirection
import uz.gita.playmarketbookapp.util.myLog
import javax.inject.Inject

/**
 *   Created by Jamik on 6/25/2023 ot 9:25 AM
 **/
@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: AppRepository,
    private val direction: HomeDirection,
) : ViewModel(), HomeContract.ViewModel {
    override val uiState = MutableStateFlow(HomeContract.UiState())

    init {
        repository.getALlBooks().onEach { list ->
            val category = CategoryData("Barcha Kitoblar", arrayListOf())
            val data = HomeItemData(category, list)
            uiState.update { it.copy(allBooks = data) }
        }.launchIn(viewModelScope)

        repository.getAllCategories().onEach { categories ->
            val alList = ArrayList<HomeItemData>()
            categories.forEach { category ->
                repository.getBooks(category.list)
                    .onEach { booklist ->
                        val homeData = HomeItemData(
                            category,
                            booklist
                        )
                        if (!alList.contains(homeData)) {
                            alList.add(homeData)
                        }
                        uiState.update { it.copy(allList = alList) }
                    }.launchIn(viewModelScope)

            }
        }.launchIn(viewModelScope)
    }

    override fun onEventDispatcher(intent: HomeContract.Intent) {
        when (intent) {
            is HomeContract.Intent.ReadBook -> {
                viewModelScope.launch {
                    direction.savedTo(intent.data)
                }
            }
        }
    }
}