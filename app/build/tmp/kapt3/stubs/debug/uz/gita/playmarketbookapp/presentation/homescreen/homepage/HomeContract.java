package uz.gita.playmarketbookapp.presentation.homescreen.homepage;

import java.lang.System;

/**
 * Created by Jamik on 6/25/2023 ot 9:21 AM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Luz/gita/playmarketbookapp/presentation/homescreen/homepage/HomeContract;", "", "Intent", "UiState", "ViewModel", "app_debug"})
public abstract interface HomeContract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Luz/gita/playmarketbookapp/presentation/homescreen/homepage/HomeContract$Intent;", "", "AllBooks", "ReadBook", "Luz/gita/playmarketbookapp/presentation/homescreen/homepage/HomeContract$Intent$AllBooks;", "Luz/gita/playmarketbookapp/presentation/homescreen/homepage/HomeContract$Intent$ReadBook;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Luz/gita/playmarketbookapp/presentation/homescreen/homepage/HomeContract$Intent$ReadBook;", "Luz/gita/playmarketbookapp/presentation/homescreen/homepage/HomeContract$Intent;", "data", "Luz/gita/playmarketbookapp/data/model/BookData;", "(Luz/gita/playmarketbookapp/data/model/BookData;)V", "getData", "()Luz/gita/playmarketbookapp/data/model/BookData;", "app_debug"})
        public static final class ReadBook implements uz.gita.playmarketbookapp.presentation.homescreen.homepage.HomeContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final uz.gita.playmarketbookapp.data.model.BookData data = null;
            
            public ReadBook(@org.jetbrains.annotations.NotNull
            uz.gita.playmarketbookapp.data.model.BookData data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.playmarketbookapp.data.model.BookData getData() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/playmarketbookapp/presentation/homescreen/homepage/HomeContract$Intent$AllBooks;", "Luz/gita/playmarketbookapp/presentation/homescreen/homepage/HomeContract$Intent;", "()V", "app_debug"})
        public static final class AllBooks implements uz.gita.playmarketbookapp.presentation.homescreen.homepage.HomeContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.playmarketbookapp.presentation.homescreen.homepage.HomeContract.Intent.AllBooks INSTANCE = null;
            
            private AllBooks() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0004H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Luz/gita/playmarketbookapp/presentation/homescreen/homepage/HomeContract$UiState;", "", "allList", "", "Luz/gita/playmarketbookapp/data/model/HomeItemData;", "allBooks", "(Ljava/util/List;Luz/gita/playmarketbookapp/data/model/HomeItemData;)V", "getAllBooks", "()Luz/gita/playmarketbookapp/data/model/HomeItemData;", "getAllList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class UiState {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<uz.gita.playmarketbookapp.data.model.HomeItemData> allList = null;
        @org.jetbrains.annotations.NotNull
        private final uz.gita.playmarketbookapp.data.model.HomeItemData allBooks = null;
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.playmarketbookapp.presentation.homescreen.homepage.HomeContract.UiState copy(@org.jetbrains.annotations.NotNull
        java.util.List<uz.gita.playmarketbookapp.data.model.HomeItemData> allList, @org.jetbrains.annotations.NotNull
        uz.gita.playmarketbookapp.data.model.HomeItemData allBooks) {
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
        
        public UiState(@org.jetbrains.annotations.NotNull
        java.util.List<uz.gita.playmarketbookapp.data.model.HomeItemData> allList, @org.jetbrains.annotations.NotNull
        uz.gita.playmarketbookapp.data.model.HomeItemData allBooks) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<uz.gita.playmarketbookapp.data.model.HomeItemData> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<uz.gita.playmarketbookapp.data.model.HomeItemData> getAllList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.playmarketbookapp.data.model.HomeItemData component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.playmarketbookapp.data.model.HomeItemData getAllBooks() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Luz/gita/playmarketbookapp/presentation/homescreen/homepage/HomeContract$ViewModel;", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Luz/gita/playmarketbookapp/presentation/homescreen/homepage/HomeContract$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEventDispatcher", "", "intent", "Luz/gita/playmarketbookapp/presentation/homescreen/homepage/HomeContract$Intent;", "app_debug"})
    public static abstract interface ViewModel {
        
        @org.jetbrains.annotations.NotNull
        public abstract kotlinx.coroutines.flow.StateFlow<uz.gita.playmarketbookapp.presentation.homescreen.homepage.HomeContract.UiState> getUiState();
        
        public abstract void onEventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.playmarketbookapp.presentation.homescreen.homepage.HomeContract.Intent intent);
    }
}