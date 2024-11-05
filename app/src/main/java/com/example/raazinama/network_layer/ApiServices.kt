package com.example.raazinama.network_layer

import com.example.raazinama.network_layer.response.ToSdrApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {
    @GET("service/v2/")
    suspend fun getSpecificServiceInfo(
        @Query("id") id:Int? =null
    ): retrofit2.Response<ToSdrApiResponse>
}