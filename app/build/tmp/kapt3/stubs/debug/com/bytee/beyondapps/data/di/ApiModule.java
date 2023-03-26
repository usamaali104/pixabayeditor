package com.bytee.beyondapps.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/bytee/beyondapps/data/di/ApiModule;", "", "()V", "providesApiClient", "Lcom/bytee/beyondapps/data/api/PixabayNetworkClient;", "app_debug"})
@dagger.Module()
public final class ApiModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.bytee.beyondapps.data.di.ApiModule INSTANCE = null;
    
    private ApiModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.bytee.beyondapps.data.api.PixabayNetworkClient providesApiClient() {
        return null;
    }
}