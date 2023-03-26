package com.bytee.beyondapps.presentation.ui.activity.mapper

import com.bytee.beyondapps.data.imagefilter.ImageFilter
import jp.co.cyberagent.android.gpuimage.GPUImage

interface EditImageMapper {
    fun mapToImageFilters(gpuImage: GPUImage): List<ImageFilter>
}