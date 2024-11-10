package com.example.raazinama.repository

import com.example.raazinama.network_layer.ApiProvider
import com.example.raazinama.network_layer.ApiServices
import com.example.raazinama.network_layer.response.allServiceResponse.AllServiceModel
import com.example.raazinama.network_layer.response.allServiceResponse.Service
import com.example.raazinama.network_layer.response.specificServiceResponse.ServiceParameters
import com.example.raazinama.network_layer.response.specificServiceResponse.SpecificServiceModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject


class Repository @Inject constructor(
    private val api:ApiServices
) {
    suspend fun getAllServices(): Result<List<Service>> {
        return try {
            val response = api.getAllServices()
            Result.success(response.body()?.parameters!!.services)
        } catch (e: Exception) {
            Result.failure(e)
        }

    }
    suspend fun getServiceById(id: Int): Result<ServiceParameters> {
        return try {
            val response = api.getServiceById(id)
            Result.success(response.body()!!.parameters)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
