package uz.gita.playmarketbookapp.presentation.savescreen;

import java.lang.System;

/**
 * Created by Jamik on 6/26/2023 ot 4:00 PM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract;", "", "Intent", "UiState", "ViewModel", "app_debug"})
public abstract interface SaveScreenContract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$Intent;", "", "BackToScreen", "ReadScreenTo", "SaveToBook", "Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$Intent$BackToScreen;", "Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$Intent$ReadScreenTo;", "Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$Intent$SaveToBook;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$Intent$SaveToBook;", "Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$Intent;", "book", "Luz/gita/playmarketbookapp/data/model/BookData;", "(Luz/gita/playmarketbookapp/data/model/BookData;)V", "getBook", "()Luz/gita/playmarketbookapp/data/model/BookData;", "app_debug"})
        public static final class SaveToBook implements uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final uz.gita.playmarketbookapp.data.model.BookData book = null;
            
            public SaveToBook(@org.jetbrains.annotations.NotNull
            uz.gita.playmarketbookapp.data.model.BookData book) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.playmarketbookapp.data.model.BookData getBook() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$Intent$BackToScreen;", "Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$Intent;", "()V", "app_debug"})
        public static final class BackToScreen implements uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenContract.Intent.BackToScreen INSTANCE = null;
            
            private BackToScreen() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$Intent$ReadScreenTo;", "Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$Intent;", "book", "Luz/gita/playmarketbookapp/data/model/BookData;", "(Luz/gita/playmarketbookapp/data/model/BookData;)V", "getBook", "()Luz/gita/playmarketbookapp/data/model/BookData;", "app_debug"})
        public static final class ReadScreenTo implements uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final uz.gita.playmarketbookapp.data.model.BookData book = null;
            
            public ReadScreenTo(@org.jetbrains.annotations.NotNull
            uz.gita.playmarketbookapp.data.model.BookData book) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.playmarketbookapp.data.model.BookData getBook() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$UiState;", "", "showOrHide", "", "progress", "", "(ZF)V", "getProgress", "()F", "getShowOrHide", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class UiState {
        private final boolean showOrHide = false;
        private final float progress = 0.0F;
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenContract.UiState copy(boolean showOrHide, float progress) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public UiState() {
            super();
        }
        
        public UiState(boolean showOrHide, float progress) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getShowOrHide() {
            return false;
        }
        
        public final float component2() {
            return 0.0F;
        }
        
        public final float getProgress() {
            return 0.0F;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$ViewModel;", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEvenDispatcher", "", "intent", "Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenContract$Intent;", "app_debug"})
    public static abstract interface ViewModel {
        
        @org.jetbrains.annotations.NotNull
        public abstract kotlinx.coroutines.flow.StateFlow<uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenContract.UiState> getUiState();
        
        public abstract void onEvenDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenContract.Intent intent);
    }
}