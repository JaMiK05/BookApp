package uz.gita.playmarketbookapp.data.local.room.dao;

import java.lang.System;

/**
 * Created by Jamik on 6/26/2023 ot 3:07 PM
 */
@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Luz/gita/playmarketbookapp/data/local/room/dao/AppDao;", "", "addBook", "", "book", "Luz/gita/playmarketbookapp/data/local/room/entity/BookEntity;", "getAllSaveBook", "Lkotlinx/coroutines/flow/Flow;", "", "getBooks", "name", "", "app_debug"})
public abstract interface AppDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void addBook(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.data.local.room.entity.BookEntity book);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM books")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.playmarketbookapp.data.local.room.entity.BookEntity>> getAllSaveBook();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM books WHERE name LIKE :name || \'%\'  ORDER BY UPPER(name) ASC")
    public abstract java.util.List<uz.gita.playmarketbookapp.data.local.room.entity.BookEntity> getBooks(@org.jetbrains.annotations.NotNull
    java.lang.String name);
}