package com.example.headsup_db

import retrofit2.Call
import retrofit2.http.*
interface APIInterface {
    @GET("/celebrities/")
    fun getCelebrities(): Call<ArrayList<Celebrity>>


}