package com.example.raazinama.network_layer.response

data class ServiceResponse(
    val error: Int,
    val message: String,
    val parameters: Parameters
)