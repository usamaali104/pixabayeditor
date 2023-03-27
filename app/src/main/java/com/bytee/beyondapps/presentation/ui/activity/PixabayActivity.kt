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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import coil.compose.AsyncImage
import coil.compose.SubcomposeAsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import coil.request.ImageRequest
import com.bytee.beyondapps.R
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
                            TopAppBar(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(color = Teal200)
                            ) {
                                Text(
                                    text = "  Mountains Wallpaper",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp,
                                    style = MaterialTheme.typography.body1
                                )
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
                        ConstraintLayout(modifier = Modifier.fillMaxSize()) {
                            val (tags, profile, name) = createRefs()
                            SubcomposeAsyncImage(
                                model = ImageRequest.Builder(LocalContext.current)
                                    .data(randomPhotos?.largeImageURL)
                                    .crossfade(true)
                                    .build(),
                                contentDescription = "images",
                                contentScale = ContentScale.Crop,
                                loading = {
                                    Box(modifier = Modifier.fillMaxSize().align(Alignment.Center)) {
                                        CircularProgressIndicator(modifier = Modifier
                                            .align(Alignment.Center)
                                            .size(30.dp))
                                    }
                                }
                            )

                            Card(
                                modifier = Modifier
                                    .constrainAs(profile) {
                                        top.linkTo(parent.top)
                                        start.linkTo(parent.start)
                                    }
                                    .size(50.dp)
                                    .padding(5.dp),
                                elevation = 10.dp,
                                shape = CircleShape
                            ) {
                                Image(
                                    rememberImagePainter(data = randomPhotos?.userImageURL),
                                    contentDescription = "images",
                                    contentScale = ContentScale.Crop,
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .constrainAs(name) {
                                        start.linkTo(profile.end)
                                        top.linkTo(parent.top)
                                    }
                                    .wrapContentWidth()
                                    .padding(5.dp)
                                    .background(
                                        color = Color.Black.copy(alpha = 0.5f),
                                        RoundedCornerShape(5.dp)
                                    )
                                    .padding(5.dp)
                            ) {
                                Text(
                                    text = randomPhotos?.user.toString(),
                                    color = Color.White,
                                    fontSize = 10.sp,
                                    style = MaterialTheme.typography.body1
                                )
                            }

                            Column(modifier = Modifier
                                .constrainAs(tags) {
                                    bottom.linkTo(parent.bottom)
                                    start.linkTo(parent.start)
                                }
                                .fillMaxWidth()) {

                                Box(
                                    modifier = Modifier
                                        .wrapContentWidth()
                                        .padding(5.dp)
                                        .background(
                                            color = Color.Black.copy(alpha = 0.5f),
                                            RoundedCornerShape(5.dp)
                                        )
                                        .padding(5.dp)
                                ) {
                                    Text(
                                        text = randomPhotos?.tags.toString(),
                                        color = Color.White,
                                        fontSize = 10.sp,
                                        style = MaterialTheme.typography.body1
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .wrapContentWidth()
                                        .padding(5.dp)
                                        .background(
                                            color = Color.Black.copy(alpha = 0.5f),
                                            RoundedCornerShape(5.dp)
                                        )
                                        .padding(5.dp)
                                ) {

                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Text(
                                            text = "Likes \n${randomPhotos?.likes.toString()}",
                                            color = Color.White,
                                            fontSize = 9.sp,
                                            style = MaterialTheme.typography.body1,
                                            textAlign = TextAlign.Center
                                        )

                                        Text(
                                            text = "Downloads \n${randomPhotos?.downloads.toString()}",
                                            color = Color.White,
                                            fontSize = 9.sp,
                                            style = MaterialTheme.typography.body1,
                                            textAlign = TextAlign.Center
                                        )

                                        Text(
                                            text = "Comments \n${randomPhotos?.comments.toString()}",
                                            color = Color.White,
                                            fontSize = 9.sp,
                                            style = MaterialTheme.typography.body1,
                                            textAlign = TextAlign.Center
                                        )
                                    }

                                }
                            }

                        }

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




