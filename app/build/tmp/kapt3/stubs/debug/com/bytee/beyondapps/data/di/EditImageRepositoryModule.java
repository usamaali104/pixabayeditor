package com.bytee.beyondapps.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\"\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/bytee/beyondapps/data/di/EditImageRepositoryModule;", "", "()V", "provideEditImageMapper", "Lcom/bytee/beyondapps/presentation/ui/activity/mapper/EditImageMapper;", "provideEditImageRepository", "Lcom/bytee/beyondapps/domain/repositories/EditImageRepository;", "context", "Landroid/content/Context;", "mapper", "fileHelper", "Lcom/bytee/beyondapps/util/FileHelper;", "provideFoodViewModel", "Lcom/bytee/beyondapps/presentation/viewmodel/EditImageViewModel;", "editImageRepository", "app_debug"})
@dagger.Module()
public final class EditImageRepositoryModule {
    
    public EditImageRepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.bytee.beyondapps.presentation.ui.activity.mapper.EditImageMapper provideEditImageMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.bytee.beyondapps.domain.repositories.EditImageRepository provideEditImageRepository(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.bytee.beyondapps.presentation.ui.activity.mapper.EditImageMapper mapper, @org.jetbrains.annotations.NotNull()
    com.bytee.beyondapps.util.FileHelper fileHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.bytee.beyondapps.presentation.viewmodel.EditImageViewModel provideFoodViewModel(@org.jetbrains.annotations.NotNull()
    com.bytee.beyondapps.domain.repositories.EditImageRepository editImageRepository) {
        return null;
    }
}