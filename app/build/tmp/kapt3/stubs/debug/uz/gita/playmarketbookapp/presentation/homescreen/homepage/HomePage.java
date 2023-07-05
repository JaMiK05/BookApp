package uz.gita.playmarketbookapp.presentation.homescreen.homepage;

import java.lang.System;

/**
 * Created by Jamik on 6/25/2023 ot 8:28 AM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0017J*\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000eH\u0003J\b\u0010\u0010\u001a\u00020\bH\u0003R\u0014\u0010\u0003\u001a\u00020\u00048WX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Luz/gita/playmarketbookapp/presentation/homescreen/homepage/HomePage;", "Lcafe/adriel/voyager/navigator/tab/Tab;", "()V", "options", "Lcafe/adriel/voyager/navigator/tab/TabOptions;", "getOptions", "()Lcafe/adriel/voyager/navigator/tab/TabOptions;", "Content", "", "HomeContent", "uiState", "Landroidx/compose/runtime/State;", "Luz/gita/playmarketbookapp/presentation/homescreen/homepage/HomeContract$UiState;", "onEvenDispatcher", "Lkotlin/Function1;", "Luz/gita/playmarketbookapp/presentation/homescreen/homepage/HomeContract$Intent;", "PrewHomeContent", "app_debug"})
public final class HomePage implements cafe.adriel.voyager.navigator.tab.Tab {
    
    public HomePage() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.compose.runtime.Composable
    @java.lang.Override
    public cafe.adriel.voyager.navigator.tab.TabOptions getOptions() {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    @java.lang.Override
    public void Content() {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    private final void HomeContent(androidx.compose.runtime.State<uz.gita.playmarketbookapp.presentation.homescreen.homepage.HomeContract.UiState> uiState, kotlin.jvm.functions.Function1<? super uz.gita.playmarketbookapp.presentation.homescreen.homepage.HomeContract.Intent, kotlin.Unit> onEvenDispatcher) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    private final void PrewHomeContent() {
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmName(name = "getIcon")
    @androidx.compose.runtime.Composable
    @java.lang.Deprecated
    public androidx.compose.ui.graphics.painter.Painter getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmName(name = "getTitle")
    @androidx.compose.runtime.Composable
    @java.lang.Deprecated
    public java.lang.String getTitle() {
        return null;
    }
}