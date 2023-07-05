package uz.gita.playmarketbookapp.presentation.bookReadScreen;

import java.lang.System;

/**
 * Created by Jamik on 6/29/2023 ot 1:56 PM
 */
@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Luz/gita/playmarketbookapp/presentation/bookReadScreen/ReadScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/playmarketbookapp/presentation/bookReadScreen/ReadBookContract$ViewModel;", "direction", "Luz/gita/playmarketbookapp/presentation/bookReadScreen/ReadDirection;", "(Luz/gita/playmarketbookapp/presentation/bookReadScreen/ReadDirection;)V", "onEventDispatcher", "", "intent", "Luz/gita/playmarketbookapp/presentation/bookReadScreen/ReadBookContract$Intent;", "app_debug"})
public final class ReadScreenViewModel extends androidx.lifecycle.ViewModel implements uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadBookContract.ViewModel {
    private final uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadDirection direction = null;
    
    @javax.inject.Inject
    public ReadScreenViewModel(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadDirection direction) {
        super();
    }
    
    @java.lang.Override
    public void onEventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadBookContract.Intent intent) {
    }
}