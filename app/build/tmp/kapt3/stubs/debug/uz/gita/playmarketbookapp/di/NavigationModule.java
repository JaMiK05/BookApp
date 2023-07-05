package uz.gita.playmarketbookapp.di;

import java.lang.System;

/**
 * Created by Jamik on 6/23/2023 ot 5:02 PM
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\b"}, d2 = {"Luz/gita/playmarketbookapp/di/NavigationModule;", "", "bindAppNavigator", "Luz/gita/playmarketbookapp/util/navigation/AppNavigator;", "impl", "Luz/gita/playmarketbookapp/util/navigation/NavigationDispatcher;", "bindNavigationHandler", "Luz/gita/playmarketbookapp/util/navigation/NavigationHandler;", "app_debug"})
@dagger.Module
public abstract interface NavigationModule {
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.playmarketbookapp.util.navigation.AppNavigator bindAppNavigator(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.util.navigation.NavigationDispatcher impl);
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.playmarketbookapp.util.navigation.NavigationHandler bindNavigationHandler(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.util.navigation.NavigationDispatcher impl);
}