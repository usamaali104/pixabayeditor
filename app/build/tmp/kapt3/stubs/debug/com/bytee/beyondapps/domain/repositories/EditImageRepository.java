package com.bytee.beyondapps.domain.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/bytee/beyondapps/domain/repositories/EditImageRepository;", "", "loadImageFilters", "", "Lcom/bytee/beyondapps/data/imagefilter/ImageFilter;", "image", "Landroid/graphics/Bitmap;", "saveFilteredImage", "", "filteredBitmap", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface EditImageRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.bytee.beyondapps.data.imagefilter.ImageFilter> loadImageFilters(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap image);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveFilteredImage(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap filteredBitmap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1);
}