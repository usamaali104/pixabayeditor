package com.bytee.beyondapps.data.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RandomImagesResponse(
    @SerialName("hits")
    val randomPhotos: MutableList<RandomPhotos> = mutableListOf(),
    @SerialName("total")
    val total: Int? = 0,
    @SerialName("totalHits")
    val totalHits: Int? = 0
)