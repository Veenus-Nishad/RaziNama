package com.example.raazinama.network_layer.response.allServiceResponse

data class Service(
    val created_at: String,
    val id: Int,
    val is_comprehensively_reviewed: Boolean,
    val name: String,
    val rating: Any,
    val slug: String,
    val updated_at: String,
    val urls: List<String>
)