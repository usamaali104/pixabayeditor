package com.bytee.beyondapps.data.utils

class PBThrowable(val errorCode: Int? = 0, val errorMessage: String? = null, val errorTitle: String? = null) : Throwable(errorMessage)