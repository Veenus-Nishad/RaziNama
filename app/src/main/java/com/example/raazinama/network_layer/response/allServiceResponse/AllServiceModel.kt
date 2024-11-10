package com.example.raazinama.network_layer.response.allServiceResponse

data class AllServiceModel(
    val error: Int,
    val message: String,
    val parameters: AllServiceParameters
)