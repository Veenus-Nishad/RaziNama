package com.example.raazinama.network_layer.response

data class ToSdrApiResponse (
    val error: Int,
    val message: String,
    val parameters: List<ServiceParameters>
)