package uz.gita.playmarketbookapp.presentation.bookReadScreen;

import java.lang.System;

/**
 * Created by Jamik on 6/29/2023 ot 1:54 PM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Luz/gita/playmarketbookapp/presentation/bookReadScreen/ReadBookContract;", "", "Intent", "ViewModel", "app_debug"})
public abstract interface ReadBookContract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Luz/gita/playmarketbookapp/presentation/bookReadScreen/ReadBookContract$Intent;", "", "BackToScreen", "Luz/gita/playmarketbookapp/presentation/bookReadScreen/ReadBookContract$Intent$BackToScreen;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/playmarketbookapp/presentation/bookReadScreen/ReadBookContract$Intent$BackToScreen;", "Luz/gita/playmarketbookapp/presentation/bookReadScreen/ReadBookContract$Intent;", "()V", "app_debug"})
        public static final class BackToScreen implements uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadBookContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadBookContract.Intent.BackToScreen INSTANCE = null;
            
            private BackToScreen() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Luz/gita/playmarketbookapp/presentation/bookReadScreen/ReadBookContract$ViewModel;", "", "onEventDispatcher", "", "intent", "Luz/gita/playmarketbookapp/presentation/bookReadScreen/ReadBookContract$Intent;", "app_debug"})
    public static abstract interface ViewModel {
        
        public abstract void onEventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadBookContract.Intent intent);
    }
}