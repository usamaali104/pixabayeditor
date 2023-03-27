package com.bytee.beyondapps.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/bytee/beyondapps/presentation/viewmodel/PixaBayViewModel;", "Landroidx/lifecycle/ViewModel;", "pagination", "Lcom/bytee/beyondapps/presentation/pagination/RandomPhotosPagination;", "(Lcom/bytee/beyondapps/presentation/pagination/RandomPhotosPagination;)V", "randomImagesApiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/bytee/beyondapps/data/utils/UiState;", "Lcom/bytee/beyondapps/data/model/RandomImagesResponse;", "getRandomImagesApiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setRandomImagesApiState", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "getRandomPhotos", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/bytee/beyondapps/data/model/RandomPhotos;", "app_debug"})
public final class PixaBayViewModel extends androidx.lifecycle.ViewModel {
    private final com.bytee.beyondapps.presentation.pagination.RandomPhotosPagination pagination = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.bytee.beyondapps.data.utils.UiState<com.bytee.beyondapps.data.model.RandomImagesResponse>> randomImagesApiState;
    
    @javax.inject.Inject()
    public PixaBayViewModel(@org.jetbrains.annotations.NotNull()
    com.bytee.beyondapps.presentation.pagination.RandomPhotosPagination pagination) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.bytee.beyondapps.data.utils.UiState<com.bytee.beyondapps.data.model.RandomImagesResponse>> getRandomImagesApiState() {
        return null;
    }
    
    public final void setRandomImagesApiState(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<com.bytee.beyondapps.data.utils.UiState<com.bytee.beyondapps.data.model.RandomImagesResponse>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.bytee.beyondapps.data.model.RandomPhotos>> getRandomPhotos() {
        return null;
    }
}