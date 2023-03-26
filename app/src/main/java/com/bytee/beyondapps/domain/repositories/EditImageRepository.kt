package com.bytee.beyondapps.domain.repositories

import android.graphics.Bitmap
import com.bytee.beyondapps.data.imagefilter.ImageFilter

interface EditImageRepository {
    fun loadImageFilters(image: Bitmap) : List<ImageFilter>
    suspend fun saveFilteredImage(filteredBitmap: Bitmap): String?
}