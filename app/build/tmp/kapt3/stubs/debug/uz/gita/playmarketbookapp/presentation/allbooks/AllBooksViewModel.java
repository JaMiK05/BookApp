package uz.gita.playmarketbookapp.presentation.allbooks;

import java.lang.System;

/**
 * Created by Jamik on 6/25/2023 ot 3:09 PM
 */
@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Luz/gita/playmarketbookapp/presentation/allbooks/AllBooksViewModel;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/playmarketbookapp/presentation/allbooks/AllBooksContract$ViewModel;", "direction", "Luz/gita/playmarketbookapp/presentation/homescreen/HomeDirection;", "repository", "Luz/gita/playmarketbookapp/domain/repository/AppRepository;", "(Luz/gita/playmarketbookapp/presentation/homescreen/HomeDirection;Luz/gita/playmarketbookapp/domain/repository/AppRepository;)V", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Luz/gita/playmarketbookapp/presentation/allbooks/AllBooksContract$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getAllBooks", "", "getSearchBooks", "str", "", "onEventDispatcher", "intent", "Luz/gita/playmarketbookapp/presentation/allbooks/AllBooksContract$Intent;", "setSlideList", "setSlider", "app_debug"})
public final class AllBooksViewModel extends androidx.lifecycle.ViewModel implements uz.gita.playmarketbookapp.presentation.allbooks.AllBooksContract.ViewModel {
    private final uz.gita.playmarketbookapp.presentation.homescreen.HomeDirection direction = null;
    private final uz.gita.playmarketbookapp.domain.repository.AppRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<uz.gita.playmarketbookapp.presentation.allbooks.AllBooksContract.UiState> uiState = null;
    
    @javax.inject.Inject
    public AllBooksViewModel(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.presentation.homescreen.HomeDirection direction, @org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.domain.repository.AppRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.MutableStateFlow<uz.gita.playmarketbookapp.presentation.allbooks.AllBooksContract.UiState> getUiState() {
        return null;
    }
    
    private final void getAllBooks() {
    }
    
    private final void getSearchBooks(java.lang.String str) {
    }
    
    private final void setSlideList() {
    }
    
    @java.lang.Override
    public void onEventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.presentation.allbooks.AllBooksContract.Intent intent) {
    }
    
    private final void setSlider() {
    }
}