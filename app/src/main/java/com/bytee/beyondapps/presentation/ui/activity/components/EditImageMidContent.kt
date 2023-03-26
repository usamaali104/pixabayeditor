package com.bytee.beyondapps.presentation.ui.activity.components

import android.graphics.Bitmap
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import com.bytee.beyondapps.presentation.ui.activity.ui.theme.Dark700
import com.lacolinares.jetpicexpress.util.CoroutineThread
import kotlinx.coroutines.delay


@Composable
fun EditImageMidContent(
    bitmap: Bitmap,
    modifier: Modifier
) {
    var isVisible by remember { mutableStateOf(true) }
    Box(modifier = modifier.background(Dark700)) {
        Image(
            bitmap = bitmap.asImageBitmap(),
            contentDescription = "selected photo",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
    }
    CoroutineThread.main {
        delay(500)
        isVisible = false
    }
}