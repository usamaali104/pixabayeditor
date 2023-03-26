package com.bytee.beyondapps.presentation.ui.activity.components

import android.graphics.Bitmap
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bytee.beyondapps.presentation.ui.activity.ui.theme.DarkTransparent
import com.bytee.beyondapps.presentation.ui.activity.ui.theme.Light200
import com.bytee.beyondapps.presentation.ui.activity.ui.theme.Shapes
import com.bytee.beyondapps.presentation.viewmodel.EditImageViewModel
import com.bytee.beyondapps.util.CoroutineThread
import jp.co.cyberagent.android.gpuimage.GPUImage
import kotlinx.coroutines.delay

@Composable
fun EditImageBottomContent(
    viewModel: EditImageViewModel,
    gpuImage: GPUImage,
    modifier: Modifier
) {
    val imageFilters = viewModel
        .imageFilterUIState
        .collectAsState()
        .value
        .imageFilters

    val listState = rememberLazyListState()
    Box(
        modifier = modifier
    ) {
        LazyRow(state = listState) {
            items(imageFilters) { imageFilter ->
                ImageFilter(
                    image = imageFilter.filterPreview,
                    filterName = imageFilter.name
                ) {
                    with(imageFilter) {
                        gpuImage.setFilter(filter)
                        viewModel.setFilteredBitmap(gpuImage.bitmapWithFilterApplied)
                        viewModel.selectedFilter(imageFilter.name)
                    }
                }
            }
        }
    }
}

@Composable
private fun ImageFilter(
    image: Bitmap,
    filterName: String,
    onClick: () -> Unit
) {
    var isVisible by remember { mutableStateOf(filterName.isNotEmpty()) }
    Box(
        modifier = Modifier
            .width(90.dp)
            .background(Light200)
            .padding(6.dp)
            .clip(Shapes.medium)
            .clickable(enabled = true) {
                onClick.invoke()
            }
    ) {
        Image(
            bitmap = image.asImageBitmap(),
            contentDescription = "filter image",
            modifier = Modifier
                .height(120.dp)
                .fillMaxWidth(),
            alignment = Alignment.Center,
            contentScale = ContentScale.FillBounds
        )
        Text(
            text = filterName,
            color = Light200,
            modifier = Modifier
                .fillMaxWidth()
                .background(DarkTransparent)
                .align(Alignment.BottomCenter),
            textAlign = TextAlign.Center,
            fontSize = 12.sp
        )
    }
    CoroutineThread.main {
        delay(500)
        isVisible = false
    }
}