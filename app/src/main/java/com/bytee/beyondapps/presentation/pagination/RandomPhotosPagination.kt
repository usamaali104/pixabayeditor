package com.bytee.beyondapps.presentation.pagination

import androidx.paging.PagingSource
import androidx.paging.PagingState
import coil.network.HttpException
import com.bytee.beyondapps.data.utils.Result
import com.bytee.beyondapps.data.model.RandomPhotos
import com.bytee.beyondapps.domain.usecases.GetRandomPhotosUseCase
import io.ktor.utils.io.errors.*

class RandomPhotosPagination(val useCase: GetRandomPhotosUseCase) :
    PagingSource<Int, RandomPhotos>() {

    override fun getRefreshKey(state: PagingState<Int, RandomPhotos>): Int? {
        return state.anchorPosition
    }
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, RandomPhotos> {
        return try {
            val nextPage = params.key ?: 1
            val randomList =
                useCase.invoke(page = nextPage)
            when (randomList) {
                is Result.Success -> {
                    LoadResult.Page(
                        data = randomList.data.randomPhotos,
                        prevKey = if (nextPage == 1) null else nextPage - 1,
                        nextKey = if (randomList.data.randomPhotos.isEmpty()) null else nextPage + 1
                    )
                }
                is Result.Error -> {
                    LoadResult.Error(Throwable("Something went Wrong"))
                }
            }

        } catch (exception: IOException) {
            return LoadResult.Error(exception)
        } catch (exception: HttpException) {
            return LoadResult.Error(exception)
        }
    }
}