package uz.gita.playmarketbookapp.domain.repository;

import java.lang.System;

/**
 * Created by Jamik on 6/25/2023 ot 1:01 AM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H&J\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\r\u001a\u00020\nH&J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\r\u001a\u00020\nH&J\u001f\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00032\u0006\u0010\u0012\u001a\u00020\u0005H&\u00f8\u0001\u0000J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0005H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Luz/gita/playmarketbookapp/domain/repository/AppRepository;", "", "getALlBooks", "Lkotlinx/coroutines/flow/Flow;", "", "Luz/gita/playmarketbookapp/data/model/BookData;", "getAllCategories", "Luz/gita/playmarketbookapp/data/model/CategoryData;", "getBooks", "list", "", "getBooksDatabase", "getDatabaseSearchBook", "name", "getFirebaseSearchBooks", "saveBook", "Lkotlin/Result;", "", "book", "saveBookDatabase", "", "app_debug"})
public abstract interface AppRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.playmarketbookapp.data.model.CategoryData>> getAllCategories();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.playmarketbookapp.data.model.BookData>> getBooks(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> list);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.playmarketbookapp.data.model.BookData>> getALlBooks();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.playmarketbookapp.data.model.BookData>> getFirebaseSearchBooks(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.Float>> saveBook(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.data.model.BookData book);
    
    public abstract void saveBookDatabase(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.data.model.BookData book);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.playmarketbookapp.data.model.BookData>> getBooksDatabase();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.playmarketbookapp.data.model.BookData>> getDatabaseSearchBook(@org.jetbrains.annotations.NotNull
    java.lang.String name);
}