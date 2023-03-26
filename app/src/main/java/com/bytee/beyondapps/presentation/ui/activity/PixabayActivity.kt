package com.bytee.beyondapps.presentation.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import coil.compose.rememberImagePainter
import com.bytee.beyondapps.presentation.ui.activity.ui.theme.PixabayTheme
import com.bytee.beyondapps.presentation.ui.activity.ui.theme.Teal200
import com.bytee.beyondapps.presentation.viewmodel.PixaBayViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PixabayActivity : ComponentActivity() {

    private val viewModel: PixaBayViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PixabayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(modifier = Modifier
                                .fillMaxWidth()
                                .background(color = Teal200)) {
                                Text(text = "  Mountains Wallpaper",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp,
                                    style = MaterialTheme.typography.body1)
                            }
                        }
                    ) {
                        RandomPhotosUi(viewModel = viewModel) {
                            val bundle = Bundle()
                            bundle.putString("image", it)
                            val intent = Intent(this@PixabayActivity, EditImageActivity::class.java)
                            intent.putExtras(bundle)
                            startActivity(intent)
                        }
                    }
                }
            }
        }
    }

}

@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterialApi::class)
@Composable
fun RandomPhotosUi(
    viewModel: PixaBayViewModel, onClick: (String) -> Unit
) {

    val randomPhotos = viewModel.getRandomPhotos().collectAsLazyPagingItems()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

//        EditImageTopContent(
//            modifier = Modifier,
//            onSave = {},
//            onBack = {},
//            title = "Mountains Wallpapers",
//            showActionIcon = false,
//            showNavigationIcon = false)

        LazyVerticalGrid(
            modifier = Modifier.padding(5.dp), cells = GridCells.Fixed(2)
        ) {
            items(randomPhotos) { randomPhotos ->
                Card(
                    onClick = {
                        onClick(randomPhotos?.largeImageURL ?: "")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    elevation = 10.dp,
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .height(200.dp)
                            .align(Alignment.CenterHorizontally),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            rememberImagePainter(data = randomPhotos?.largeImageURL),
                            contentDescription = "images",
                            contentScale = ContentScale.Crop,
                        )
                    }
                }
            }

            randomPhotos.apply {
                when {
                    loadState.refresh is LoadState.NotLoading -> {

                    }
                    loadState.refresh is LoadState.Loading -> {
                        item {
                            Box(modifier = Modifier.fillMaxSize()) {
                                CircularProgressIndicator(
                                    modifier = Modifier.align(alignment = Alignment.Center),
                                    color = Color.Black
                                )
                            }
                        }
                    }
                    loadState.append is LoadState.Loading -> {
                        item {
                            Box(modifier = Modifier.fillMaxWidth()) {
                                CircularProgressIndicator(
                                    modifier = Modifier.align(alignment = Alignment.Center),
                                    color = Color.Black
                                )

                            }
                        }
                    }
                    loadState.append is LoadState.Error -> {
                        //You can use modifier to show error message
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
fun <T : Any> LazyGridScope.items(
    lazyPagingItems: LazyPagingItems<T>, itemContent: @Composable LazyGridScope.(value: T?) -> Unit
) {
    items(lazyPagingItems.itemCount) { index ->
        itemContent(lazyPagingItems.getAsState(index).value)
    }
}




