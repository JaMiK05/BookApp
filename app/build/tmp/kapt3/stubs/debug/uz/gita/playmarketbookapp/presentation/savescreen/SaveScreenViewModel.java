package uz.gita.playmarketbookapp.presentation.savescreen;

import java.lang.System;

/**
 * Created by Jamik on 6/26/2023 ot 4:02 PM
 */
@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$ViewModel;", "repository", "Luz/gita/playmarketbookapp/domain/repository/AppRepository;", "direction", "Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenDirection;", "(Luz/gita/playmarketbookapp/domain/repository/AppRepository;Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenDirection;)V", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "onEvenDispatcher", "", "intent", "Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$Intent;", "app_debug"})
public final class SaveScreenViewModel extends androidx.lifecycle.ViewModel implements uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenContract.ViewModel {
    private final uz.gita.playmarketbookapp.domain.repository.AppRepository repository = null;
    private final uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenDirection direction = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenContract.UiState> uiState = null;
    
    @javax.inject.Inject
    public SaveScreenViewModel(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.domain.repository.AppRepository repository, @org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenDirection direction) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.MutableStateFlow<uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenContract.UiState> getUiState() {
        return null;
    }
    
    @java.lang.Override
    public void onEvenDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenContract.Intent intent) {
    }
}