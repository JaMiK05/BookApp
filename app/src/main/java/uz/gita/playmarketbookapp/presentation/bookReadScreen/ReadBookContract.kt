package uz.gita.playmarketbookapp.presentation.bookReadScreen

/**
 *   Created by Jamik on 6/29/2023 ot 1:54 PM
 **/
interface ReadBookContract {

    sealed interface Intent {
        object BackToScreen : Intent
    }

    interface ViewModel {
        fun onEventDispatcher(intent: Intent)
    }

}