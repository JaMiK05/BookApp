package uz.gita.playmarketbookapp.di;

import java.lang.System;

/**
 * Created by Jamik on 6/25/2023 ot 10:43 AM
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Luz/gita/playmarketbookapp/di/RepositoryModule;", "", "appRepositoryBind", "Luz/gita/playmarketbookapp/domain/repository/AppRepository;", "impl", "Luz/gita/playmarketbookapp/domain/repository/AppRepositoryImpl;", "app_debug"})
@dagger.Module
public abstract interface RepositoryModule {
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.playmarketbookapp.domain.repository.AppRepository appRepositoryBind(@org.jetbrains.annotations.NotNull
    uz.gita.playmarketbookapp.domain.repository.AppRepositoryImpl impl);
}