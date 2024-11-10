package com.example.raazinama.network_layer.response.specificServiceResponse

data class ServiceParameters(
    val created_at: String,
    val documents: List<Any>,
    val id: Int,
    val image: String,
    val is_comprehensively_reviewed: Boolean,
    val name: String,
    val points: List<Point>,
    val rating: Any,
    val slug: String,
    val updated_at: String,
    val urls: List<String>
)