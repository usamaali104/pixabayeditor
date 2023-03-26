package com.bytee.beyondapps.data.api


import android.util.Log
import com.bytee.beyondapps.data.api.ApiEndPoints.Companion.baseUrl

import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import io.ktor.client.features.observer.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.serialization.json.Json

class PixabayNetworkClient() {
    val client = HttpClient(OkHttp) {

        install(HttpTimeout) {
            requestTimeoutMillis = 20000
            connectTimeoutMillis = 20000
            socketTimeoutMillis = 20000
        }
        install(JsonFeature) {
            serializer = KotlinxSerializer(json).apply {  }
        }

        install(Logging) {
            logger = object : Logger {
                override fun log(message: String) {
                    Log.v("Logger Ktor =>", message)
                }
            }
            level = LogLevel.ALL
        }
        install(ResponseObserver) {
            onResponse { response ->
                Log.d("HTTP status:", "${response.status.value}")
            }
        }
        install(DefaultRequest) {
            contentType(ContentType.Application.Json)
        }

        defaultRequest {
            url {
                host = baseUrl
                protocol = URLProtocol.HTTPS
            }
            header(HttpHeaders.ContentType, ContentType.Application.Json)
        }
        engine {

        }
    }

}
val json = Json {
    isLenient = true // no json in response but response is html
    ignoreUnknownKeys = true
    encodeDefaults = true
    prettyPrint = true
    explicitNulls = false

}
