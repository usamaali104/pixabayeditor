package com.bytee.beyondapps.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/bytee/beyondapps/data/di/RepoModule;", "", "()V", "provideFoodRecipeUseCase", "Lcom/bytee/beyondapps/domain/usecases/GetRandomPhotosUseCase;", "randomPhotosRepository", "Lcom/bytee/beyondapps/domain/repositories/RandomPhotosRepository;", "providePagination", "Lcom/bytee/beyondapps/presentation/pagination/RandomPhotosPagination;", "useCase", "providesApiClient", "pixabayNetworkClient", "Lcom/bytee/beyondapps/data/api/PixabayNetworkClient;", "app_debug"})
@dagger.Module()
public final class RepoModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.bytee.beyondapps.data.di.RepoModule INSTANCE = null;
    
    private RepoModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.bytee.beyondapps.domain.usecases.GetRandomPhotosUseCase provideFoodRecipeUseCase(@org.jetbrains.annotations.NotNull()
    com.bytee.beyondapps.domain.repositories.RandomPhotosRepository randomPhotosRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.bytee.beyondapps.presentation.pagination.RandomPhotosPagination providePagination(@org.jetbrains.annotations.NotNull()
    com.bytee.beyondapps.domain.usecases.GetRandomPhotosUseCase useCase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.bytee.beyondapps.domain.repositories.RandomPhotosRepository providesApiClient(@org.jetbrains.annotations.NotNull()
    com.bytee.beyondapps.data.api.PixabayNetworkClient pixabayNetworkClient) {
        return null;
    }
}