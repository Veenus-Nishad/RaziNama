package com.example.raazinama.network_layer

import com.example.raazinama.network_layer.response.allServiceResponse.AllServiceModel
import com.example.raazinama.network_layer.response.specificServiceResponse.SpecificServiceModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {

    @GET("service/v2/")
    suspend fun getAllServices(): Response<AllServiceModel>

    @GET("service/v2/")
    suspend fun getServiceById(
        @Query("id") id: Int
    ): retrofit2.Response<SpecificServiceModel>
}