package com.bytee.beyondapps.domain.usecases

import com.bytee.beyondapps.data.utils.PBThrowable
import com.bytee.beyondapps.domain.repositories.RandomPhotosRepository
import javax.inject.Inject
import  com.bytee.beyondapps.data.utils.Result
import com.bytee.beyondapps.domain.model.RandomImagesResponse

class GetRandomPhotosUseCase @Inject constructor(
    private val repository: RandomPhotosRepository
) {
    suspend operator fun invoke(page: Int
    ): Result<RandomImagesResponse> {

        return when (val apiResponse = repository.getAllRecipe(page = page)) {
            is Result.Success -> {
                Result.Success(apiResponse.data)
            }
            is Result.Error -> {
                Result.Error(PBThrowable(errorMessage = "Unable to connect"))
            }
        }
    }
}