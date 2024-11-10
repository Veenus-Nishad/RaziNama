package com.example.raazinama.network_layer.response.specificServiceResponse

data class SpecificServiceModel(
    val error: Int,
    val message: String,
    val parameters: ServiceParameters
)