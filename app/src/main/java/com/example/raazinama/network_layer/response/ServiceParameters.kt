package com.example.raazinama.network_layer.response

data class ServiceParameters(
    val id: Int,
    val is_comprehensively_reviewed: Boolean,
    val name: String,
    val updated_at: String,
    val created_at: String,
    val slug: String,
    val rating: String?,
    val urls: List<String>,
    val image: String,
    val documents: List<Document>,
    val points: List<Point>
)





