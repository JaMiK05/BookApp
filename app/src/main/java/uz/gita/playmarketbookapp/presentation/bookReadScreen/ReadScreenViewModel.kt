package uz.gita.playmarketbookapp.presentation.bookReadScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import uz.gita.playmarketbookapp.presentation.homescreen.HomeDirection
import javax.inject.Inject

/**
 *   Created by Jamik on 6/29/2023 ot 1:56 PM
 **/
@HiltViewModel
class ReadScreenViewModel @Inject constructor(
    private val direction: ReadDirection
) : ViewModel(), ReadBookContract.ViewModel {
    override fun onEventDispatcher(intent: ReadBookContract.Intent){
        when(intent){
            is ReadBookContract.Intent.BackToScreen->{
                viewModelScope.launch {
                    direction.backTo()
                }
            }
        }
    }
}