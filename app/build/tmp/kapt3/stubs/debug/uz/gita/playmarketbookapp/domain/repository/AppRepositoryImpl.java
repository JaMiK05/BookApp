package uz.gita.playmarketbookapp.domain.repository;

import java.lang.System;

/**
 * Created by Jamik on 6/25/2023 ot 1:00 AM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00170\u0016H\u0016J\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017H\u0016J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H\u0016J\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\u0006\u0010 \u001a\u00020\u001dH\u0016J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\u0006\u0010 \u001a\u00020\u001dH\u0016J\u001f\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u00162\u0006\u0010%\u001a\u00020\u0018H\u0016\u00f8\u0001\u0000J\u0010\u0010&\u001a\u00020\'2\u0006\u0010%\u001a\u00020\u0018H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001dH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Luz/gita/playmarketbookapp/domain/repository/AppRepositoryImpl;", "Luz/gita/playmarketbookapp/domain/repository/AppRepository;", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "dao", "Luz/gita/playmarketbookapp/data/local/room/dao/AppDao;", "getDao", "()Luz/gita/playmarketbookapp/data/local/room/dao/AppDao;", "setDao", "(Luz/gita/playmarketbookapp/data/local/room/dao/AppDao;)V", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "storage", "Lcom/google/firebase/storage/StorageReference;", "getALlBooks", "Lkotlinx/coroutines/flow/Flow;", "", "Luz/gita/playmarketbookapp/data/model/BookData;", "getAllCategories", "Luz/gita/playmarketbookapp/data/model/CategoryData;", "getBooks", "list", "", "getBooksDatabase", "getDatabaseSearchBook", "name", "getFirebaseSearchBooks", "saveBook", "Lkotlin/Result;", "", "book", "saveBookDatabase", "", "saveOrNotSave", "", "reference", "app_debug"})
public final class AppRepositoryImpl implements uz.gita.playmarketbookapp.domain.repository.AppRepository {
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    private final com.google.firebase.storage.StorageReference storage = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @javax.inject.Inject
    public uz.gita.playmarketbookapp.data.local.room.dao.AppDao dao;
    @javax.inject.Inject
    public android.content.Context context;
    
    @javax.inject.Inject
    public AppRepositoryImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final uz.gita.playmarketbookapp.data.local.room.dao.AppDao getDao() {
        return null;
    }
    
    public final void setDao(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.data.local.room.dao.AppDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.playmarketbookapp.data.model.CategoryData>> getAllCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.playmarketbookapp.data.model.BookData>> getBooks(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> list) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.playmarketbookapp.data.model.BookData>> getALlBooks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.playmarketbookapp.data.model.BookData>> getFirebaseSearchBooks(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.Float>> saveBook(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.data.model.BookData book) {
        return null;
    }
    
    @java.lang.Override
    public void saveBookDatabase(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.data.model.BookData book) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.playmarketbookapp.data.model.BookData>> getBooksDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.playmarketbookapp.data.model.BookData>> getDatabaseSearchBook(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    private final boolean saveOrNotSave(java.lang.String reference) {
        return false;
    }
}