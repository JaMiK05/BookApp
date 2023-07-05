package uz.gita.playmarketbookapp.data.local.room.database;

import java.lang.System;

/**
 * Created by Jamik on 6/26/2023 ot 3:19 PM
 */
@androidx.room.Database(entities = {uz.gita.playmarketbookapp.data.local.room.entity.BookEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Luz/gita/playmarketbookapp/data/local/room/database/BookDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getDao", "Luz/gita/playmarketbookapp/data/local/room/dao/AppDao;", "app_debug"})
public abstract class BookDatabase extends androidx.room.RoomDatabase {
    
    public BookDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.playmarketbookapp.data.local.room.dao.AppDao getDao();
}