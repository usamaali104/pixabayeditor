package com.bytee.beyondapps.domain.repositories

import com.bytee.beyondapps.data.api.PixabayNetworkClient
import com.bytee.beyondapps.data.api.ApiEndPoints
import com.bytee.beyondapps.data.utils.PBThrowable
import io.ktor.client.request.*
import io.ktor.http.*
import javax.inject.Inject
import  com.bytee.beyondapps.data.utils.Result
import com.bytee.beyondapps.data.model.RandomImagesResponse

class RandomPhotosRepository @Inject constructor(
    private val pixabayNetworkClient: PixabayNetworkClient,
    ) {
    suspend fun getAllRecipe(page: Int): Result<RandomImagesResponse> {
        val response = pixabayNetworkClient.client.get<RandomImagesResponse> {
            url(
                ApiEndPoints.randomListEndPoint +
                        "&page="+page
            )
            contentType(ContentType.Application.Json)
        }

        return if (response.randomPhotos.isNotEmpty()) {
            Result.Success(response)
        } else {
            Result.Error(
                PBThrowable(
                    errorCode = 400,
                    errorMessage = "Unable to connect"
                )
            )
        }

    }
}