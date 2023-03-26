package com.bytee.beyondapps.presentation.viewmodel

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import com.bytee.beyondapps.data.imagefilter.ImageFilter
import com.bytee.beyondapps.data.savedimage.SavedFilteredImageState
import com.bytee.beyondapps.domain.repositories.EditImageRepository
import com.bytee.beyondapps.data.imagefilter.ImageFilterState
import com.bytee.beyondapps.util.CoroutineThread
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject


@HiltViewModel
class EditImageViewModel @Inject constructor(
    private val editImageRepository: EditImageRepository
) : ViewModel() {

    private val imageFilterDataState = MutableStateFlow(ImageFilterState())
    val imageFilterUIState: StateFlow<ImageFilterState> get() = imageFilterDataState

    private val _filteredBitmap = MutableStateFlow<Bitmap?>(null)
    val filteredBitmap: StateFlow<Bitmap?> get() = _filteredBitmap

    private val _hasSelectedFilter = MutableStateFlow(false)
    val hasSelectedFilter: StateFlow<Boolean> get() = _hasSelectedFilter

    private val savedImageFilterDataState = MutableStateFlow(SavedFilteredImageState())
    val savedImageFilterUIState: StateFlow<SavedFilteredImageState> get() = savedImageFilterDataState


    fun selectedFilter(filterName: String) {
        _hasSelectedFilter.value = filterName != "Normal"
    }

    fun saveFilteredImage() {
        CoroutineThread.io {
            kotlin.runCatching {
                emitSavedFilteredImageUIState(isLoading = true)
                filteredBitmap.value?.let { editImageRepository.saveFilteredImage(it) }
            }.onSuccess { imageName ->
                emitSavedFilteredImageUIState(imageName = imageName)
            }.onFailure {
                emitSavedFilteredImageUIState(error = it.message.toString())
            }
        }
    }


    fun setFilteredBitmap(filteredBitmap: Bitmap) {
        _filteredBitmap.value = filteredBitmap
    }

    fun loadImageFilters(origImage: Bitmap) {
        CoroutineThread.io {
            kotlin.runCatching {
                emitImageFilterUIState(isLoading = true)
                val image = getPreviewImage(origImage = origImage)
                editImageRepository.loadImageFilters(image = image)
            }.onSuccess {
                emitImageFilterUIState(imageFilters = it)
            }.onFailure {
                emitImageFilterUIState(error = it.message.toString())
            }
        }
    }

    private fun getPreviewImage(origImage: Bitmap): Bitmap {
        return kotlin.runCatching {
            val previewWidth = 150
            val previewHeight = origImage.height * previewWidth / origImage.width
            Bitmap.createScaledBitmap(origImage, previewWidth, previewHeight, false)
        }.getOrDefault(origImage)
    }

    private fun emitImageFilterUIState(
        isLoading: Boolean = false,
        imageFilters: List<ImageFilter> = emptyList(),
        error: String? = null
    ) {
        val imageFilterState = ImageFilterState(isLoading, imageFilters, error)
        imageFilterDataState.value = imageFilterState
    }

    private fun emitSavedFilteredImageUIState(
        isLoading: Boolean = false,
        imageName: String? = null,
        error: String? = null
    ) {
        val dataState = SavedFilteredImageState(isLoading, imageName, error)
        savedImageFilterDataState.value = dataState
    }


}