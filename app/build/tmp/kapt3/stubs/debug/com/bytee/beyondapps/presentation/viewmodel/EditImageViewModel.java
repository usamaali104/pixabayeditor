package com.bytee.beyondapps.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\t2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J*\u0010 \u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0002J\u000e\u0010$\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0007J\u0006\u0010%\u001a\u00020\u0019J\u000e\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020\u001fJ\u000e\u0010(\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0007R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\r\u00a8\u0006)"}, d2 = {"Lcom/bytee/beyondapps/presentation/viewmodel/EditImageViewModel;", "Landroidx/lifecycle/ViewModel;", "editImageRepository", "Lcom/bytee/beyondapps/domain/repositories/EditImageRepository;", "(Lcom/bytee/beyondapps/domain/repositories/EditImageRepository;)V", "_filteredBitmap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroid/graphics/Bitmap;", "_hasSelectedFilter", "", "filteredBitmap", "Lkotlinx/coroutines/flow/StateFlow;", "getFilteredBitmap", "()Lkotlinx/coroutines/flow/StateFlow;", "hasSelectedFilter", "getHasSelectedFilter", "imageFilterDataState", "Lcom/bytee/beyondapps/data/imagefilter/ImageFilterState;", "imageFilterUIState", "getImageFilterUIState", "savedImageFilterDataState", "Lcom/bytee/beyondapps/data/savedimage/SavedFilteredImageState;", "savedImageFilterUIState", "getSavedImageFilterUIState", "emitImageFilterUIState", "", "isLoading", "imageFilters", "", "Lcom/bytee/beyondapps/data/imagefilter/ImageFilter;", "error", "", "emitSavedFilteredImageUIState", "imageName", "getPreviewImage", "origImage", "loadImageFilters", "saveFilteredImage", "selectedFilter", "filterName", "setFilteredBitmap", "app_debug"})
public final class EditImageViewModel extends androidx.lifecycle.ViewModel {
    private final com.bytee.beyondapps.domain.repositories.EditImageRepository editImageRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.bytee.beyondapps.data.imagefilter.ImageFilterState> imageFilterDataState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<android.graphics.Bitmap> _filteredBitmap = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _hasSelectedFilter = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.bytee.beyondapps.data.savedimage.SavedFilteredImageState> savedImageFilterDataState = null;
    
    @javax.inject.Inject()
    public EditImageViewModel(@org.jetbrains.annotations.NotNull()
    com.bytee.beyondapps.domain.repositories.EditImageRepository editImageRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.bytee.beyondapps.data.imagefilter.ImageFilterState> getImageFilterUIState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<android.graphics.Bitmap> getFilteredBitmap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getHasSelectedFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.bytee.beyondapps.data.savedimage.SavedFilteredImageState> getSavedImageFilterUIState() {
        return null;
    }
    
    public final void selectedFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String filterName) {
    }
    
    public final void saveFilteredImage() {
    }
    
    public final void setFilteredBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap filteredBitmap) {
    }
    
    public final void loadImageFilters(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap origImage) {
    }
    
    private final android.graphics.Bitmap getPreviewImage(android.graphics.Bitmap origImage) {
        return null;
    }
    
    private final void emitImageFilterUIState(boolean isLoading, java.util.List<com.bytee.beyondapps.data.imagefilter.ImageFilter> imageFilters, java.lang.String error) {
    }
    
    private final void emitSavedFilteredImageUIState(boolean isLoading, java.lang.String imageName, java.lang.String error) {
    }
}