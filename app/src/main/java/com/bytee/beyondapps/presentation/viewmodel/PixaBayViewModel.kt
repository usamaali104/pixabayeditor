package com.bytee.beyondapps.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.bytee.beyondapps.data.utils.PBThrowable
import com.bytee.beyondapps.data.utils.UiState
import com.bytee.beyondapps.data.model.RandomPhotos
import com.bytee.beyondapps.data.model.RandomImagesResponse
import com.bytee.beyondapps.presentation.pagination.RandomPhotosPagination
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject


@HiltViewModel
class PixaBayViewModel @Inject constructor(
    private val pagination: RandomPhotosPagination
) : ViewModel() {

     var randomImagesApiState =
        MutableStateFlow(UiState<RandomImagesResponse>(loading = true , data = null , exception = PBThrowable()))

    fun getRandomPhotos(): Flow<PagingData<RandomPhotos>> = Pager(
        PagingConfig(pageSize = 10 , initialLoadSize = 1 , enablePlaceholders = true)
    ) {
        pagination
    }.flow.cachedIn(viewModelScope)


}