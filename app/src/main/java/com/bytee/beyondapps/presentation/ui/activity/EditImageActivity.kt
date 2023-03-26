package com.bytee.beyondapps.presentation.ui.activity

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.core.content.res.ResourcesCompat
import com.bytee.beyondapps.R
import com.bytee.beyondapps.presentation.ui.activity.components.EditImageBottomContent
import com.bytee.beyondapps.presentation.ui.activity.components.EditImageMidContent
import com.bytee.beyondapps.presentation.ui.activity.components.EditImageTopContent
import com.bytee.beyondapps.presentation.ui.activity.ui.theme.Light200
import com.bytee.beyondapps.presentation.ui.activity.ui.theme.PixabayTheme
import com.bytee.beyondapps.presentation.viewmodel.EditImageViewModel
import dagger.hilt.android.AndroidEntryPoint
import jp.co.cyberagent.android.gpuimage.GPUImage


@AndroidEntryPoint
class EditImageActivity : ComponentActivity() {

    var imageUrl: String = ""
    var bitmap: Bitmap?=null
    private val viewModel: EditImageViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        imageUrl = (intent.extras?.getString("image")) ?: ""

        setContent {
            PixabayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                    ) {
                        EditImageUi(viewModel = viewModel, bitmap = imageUrl)
                    }
                }
            }
        }
    }
}

@Composable
fun EditImageUi(
    viewModel: EditImageViewModel,
    bitmap: String
) {
    val context = LocalContext.current
    val gpuImage = GPUImage(context)

    val originalBitmap = (ResourcesCompat.getDrawable(
        context.resources,
        R.drawable.mountain,
        null
    ) as BitmapDrawable?)!!.bitmap

    gpuImage.setImage(originalBitmap)
    viewModel.loadImageFilters(originalBitmap)

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Light200)
    ) {
        val (topContent, midContent, bottomContent) = createRefs()

        val topModifier = Modifier.constrainAs(topContent) {
            width = Dimension.fillToConstraints
            height = Dimension.value(56.dp)
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }

        val midModifier = Modifier.constrainAs(midContent) {
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
            top.linkTo(topContent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(bottomContent.top)
        }

        val bottomModifier = Modifier.constrainAs(bottomContent) {
            width = Dimension.fillToConstraints
            height = Dimension.value(120.dp)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }

        val hasFilteredImage = viewModel.hasSelectedFilter.collectAsState()
        EditImageTopContent(
            hasFilteredImage = hasFilteredImage.value,
            modifier = topModifier,
            onSave = {
                     viewModel.saveFilteredImage()
            }, onBack = {
                (context as EditImageActivity).finish()
            }
        )
        val filteredBitmap = viewModel.filteredBitmap.collectAsState()
        filteredBitmap.value?.let {
            EditImageMidContent(
                bitmap = it,
                modifier = midModifier
            )
        }
        EditImageBottomContent(
            viewModel = viewModel,
            gpuImage = gpuImage,
            modifier = bottomModifier
        )
    }
}




