package uz.gita.playmarketbookapp.presentation.allbooks;

import java.lang.System;

/**
 * Created by Jamik on 6/25/2023 ot 3:07 PM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Luz/gita/playmarketbookapp/presentation/allbooks/AllBooksContract;", "", "Intent", "UiState", "ViewModel", "app_debug"})
public abstract interface AllBooksContract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Luz/gita/playmarketbookapp/presentation/allbooks/AllBooksContract$Intent;", "", "GetBooks", "ReadBook", "Luz/gita/playmarketbookapp/presentation/allbooks/AllBooksContract$Intent$GetBooks;", "Luz/gita/playmarketbookapp/presentation/allbooks/AllBooksContract$Intent$ReadBook;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Luz/gita/playmarketbookapp/presentation/allbooks/AllBooksContract$Intent$ReadBook;", "Luz/gita/playmarketbookapp/presentation/allbooks/AllBooksContract$Intent;", "data", "Luz/gita/playmarketbookapp/data/model/BookData;", "(Luz/gita/playmarketbookapp/data/model/BookData;)V", "getData", "()Luz/gita/playmarketbookapp/data/model/BookData;", "app_debug"})
        public static final class ReadBook implements uz.gita.playmarketbookapp.presentation.allbooks.AllBooksContract.Intent {
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
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Luz/gita/playmarketbookapp/presentation/allbooks/AllBooksContract$Intent$GetBooks;", "Luz/gita/playmarketbookapp/presentation/allbooks/AllBooksContract$Intent;", "str", "", "(Ljava/lang/String;)V", "getStr", "()Ljava/lang/String;", "app_debug"})
        public static final class GetBooks implements uz.gita.playmarketbookapp.presentation.allbooks.AllBooksContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String str = null;
            
            public GetBooks(@org.jetbrains.annotations.NotNull
            java.lang.String str) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getStr() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Luz/gita/playmarketbookapp/presentation/allbooks/AllBooksContract$UiState;", "", "allList", "", "Luz/gita/playmarketbookapp/data/model/BookData;", "slideList", "(Ljava/util/List;Ljava/util/List;)V", "getAllList", "()Ljava/util/List;", "getSlideList", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class UiState {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<uz.gita.playmarketbookapp.data.model.BookData> allList = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<uz.gita.playmarketbookapp.data.model.BookData> slideList = null;
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.playmarketbookapp.presentation.allbooks.AllBooksContract.UiState copy(@org.jetbrains.annotations.NotNull
        java.util.List<uz.gita.playmarketbookapp.data.model.BookData> allList, @org.jetbrains.annotations.NotNull
        java.util.List<uz.gita.playmarketbookapp.data.model.BookData> slideList) {
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
        java.util.List<uz.gita.playmarketbookapp.data.model.BookData> allList, @org.jetbrains.annotations.NotNull
        java.util.List<uz.gita.playmarketbookapp.data.model.BookData> slideList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<uz.gita.playmarketbookapp.data.model.BookData> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<uz.gita.playmarketbookapp.data.model.BookData> getAllList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<uz.gita.playmarketbookapp.data.model.BookData> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<uz.gita.playmarketbookapp.data.model.BookData> getSlideList() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Luz/gita/playmarketbookapp/presentation/allbooks/AllBooksContract$ViewModel;", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Luz/gita/playmarketbookapp/presentation/allbooks/AllBooksContract$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEventDispatcher", "", "intent", "Luz/gita/playmarketbookapp/presentation/allbooks/AllBooksContract$Intent;", "app_debug"})
    public static abstract interface ViewModel {
        
        @org.jetbrains.annotations.NotNull
        public abstract kotlinx.coroutines.flow.StateFlow<uz.gita.playmarketbookapp.presentation.allbooks.AllBooksContract.UiState> getUiState();
        
        public abstract void onEventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.playmarketbookapp.presentation.allbooks.AllBooksContract.Intent intent);
    }
}