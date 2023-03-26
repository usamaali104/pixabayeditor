package com.bytee.beyondapps.data.api

abstract class ApiEndPoints {

    companion object{
        const val baseUrl = "pixabay.com"
        const val apiKey = "/api/?key=21361571-225988f8d640b5cab646fcbb6"
        const val randomListEndPoint = "$apiKey&q=mountains&image_type=photo&orientation=vertical&min_height=600"
    }
}