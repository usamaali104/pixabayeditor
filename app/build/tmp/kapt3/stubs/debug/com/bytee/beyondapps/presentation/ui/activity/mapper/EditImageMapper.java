package com.bytee.beyondapps.presentation.ui.activity.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/bytee/beyondapps/presentation/ui/activity/mapper/EditImageMapper;", "", "mapToImageFilters", "", "Lcom/bytee/beyondapps/data/imagefilter/ImageFilter;", "gpuImage", "Ljp/co/cyberagent/android/gpuimage/GPUImage;", "app_debug"})
public abstract interface EditImageMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.bytee.beyondapps.data.imagefilter.ImageFilter> mapToImageFilters(@org.jetbrains.annotations.NotNull()
    jp.co.cyberagent.android.gpuimage.GPUImage gpuImage);
}