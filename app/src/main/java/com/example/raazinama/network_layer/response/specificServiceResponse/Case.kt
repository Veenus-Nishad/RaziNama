package com.example.raazinama.network_layer.response.specificServiceResponse

data class Case(
    val classification: String,
    val description: String,
    val id: Int,
    val title: String,
    val topic_id: Int,
    val weight: Int
)