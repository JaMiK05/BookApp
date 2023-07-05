package uz.gita.playmarketbookapp.di;

import java.lang.System;

/**
 * Created by Jamik on 6/26/2023 ot 3:33 PM
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Luz/gita/playmarketbookapp/di/ContextModule;", "", "()V", "provideContext", "Landroid/content/Context;", "context", "app_debug"})
@dagger.Module
public final class ContextModule {
    
    public ContextModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
}