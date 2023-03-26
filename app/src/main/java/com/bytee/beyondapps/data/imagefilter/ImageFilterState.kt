package com.bytee.beyondapps.data.imagefilter

import com.bytee.beyondapps.data.imagefilter.ImageFilter

data class ImageFilterState(
    val isLoading: Boolean = false,
    val imageFilters: List<ImageFilter> = emptyList(),
    val error: String? = null
)