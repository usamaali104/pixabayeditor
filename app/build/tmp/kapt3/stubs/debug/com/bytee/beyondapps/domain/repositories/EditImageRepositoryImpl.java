package com.bytee.beyondapps.domain.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/bytee/beyondapps/domain/repositories/EditImageRepositoryImpl;", "Lcom/bytee/beyondapps/domain/repositories/EditImageRepository;", "context", "Landroid/content/Context;", "mapper", "Lcom/bytee/beyondapps/presentation/ui/activity/mapper/EditImageMapper;", "fileHelper", "Lcom/bytee/beyondapps/util/FileHelper;", "(Landroid/content/Context;Lcom/bytee/beyondapps/presentation/ui/activity/mapper/EditImageMapper;Lcom/bytee/beyondapps/util/FileHelper;)V", "loadImageFilters", "", "Lcom/bytee/beyondapps/data/imagefilter/ImageFilter;", "image", "Landroid/graphics/Bitmap;", "saveFile", "", "file", "Ljava/io/File;", "bitmap", "saveFilteredImage", "", "filteredBitmap", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class EditImageRepositoryImpl implements com.bytee.beyondapps.domain.repositories.EditImageRepository {
    private final android.content.Context context = null;
    private final com.bytee.beyondapps.presentation.ui.activity.mapper.EditImageMapper mapper = null;
    private final com.bytee.beyondapps.util.FileHelper fileHelper = null;
    
    @javax.inject.Inject()
    public EditImageRepositoryImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.bytee.beyondapps.presentation.ui.activity.mapper.EditImageMapper mapper, @org.jetbrains.annotations.NotNull()
    com.bytee.beyondapps.util.FileHelper fileHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.bytee.beyondapps.data.imagefilter.ImageFilter> loadImageFilters(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap image) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveFilteredImage(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap filteredBitmap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1) {
        return null;
    }
    
    private final void saveFile(java.io.File file, android.graphics.Bitmap bitmap) {
    }
}