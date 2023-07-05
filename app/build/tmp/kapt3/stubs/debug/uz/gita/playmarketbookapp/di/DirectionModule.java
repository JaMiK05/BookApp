package uz.gita.playmarketbookapp.di;

import java.lang.System;

/**
 * Created by Jamik on 6/23/2023 ot 5:04 PM
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Luz/gita/playmarketbookapp/di/DirectionModule;", "", "homeDirection", "Luz/gita/playmarketbookapp/presentation/homescreen/HomeDirection;", "impl", "Luz/gita/playmarketbookapp/presentation/homescreen/HomeDirectionImpl;", "readBookScreenDirection", "Luz/gita/playmarketbookapp/presentation/bookReadScreen/ReadDirection;", "Luz/gita/playmarketbookapp/presentation/bookReadScreen/ReadDirectionImpl;", "saveScreenDirection", "Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenDirection;", "Luz/gita/playmarketbookapp/presentation/savescreen/SaveScreenDirectionImpl;", "app_debug"})
@dagger.Module
public abstract interface DirectionModule {
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.playmarketbookapp.presentation.homescreen.HomeDirection homeDirection(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.presentation.homescreen.HomeDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenDirection saveScreenDirection(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadDirection readBookScreenDirection(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadDirectionImpl impl);
}