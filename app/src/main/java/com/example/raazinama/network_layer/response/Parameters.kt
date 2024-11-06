package com.example.raazinama.network_layer.response

data class Parameters(
    val created_at: String,
    val documents: List<Document>,
    val id: Int,
    val image: String,
    val is_comprehensively_reviewed: Boolean,
    val name: String,
    val points: List<Point>,
    val rating: String,
    val slug: String,
    val updated_at: String,
    val urls: List<String>
)