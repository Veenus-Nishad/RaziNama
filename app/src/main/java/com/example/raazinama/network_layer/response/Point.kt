package com.example.raazinama.network_layer.response

data class Point(
    val analysis: String,
    val case: Case,
    val created_at: String,
    val document_id: Int,
    val id: Int,
    val source: String,
    val status: String,
    val title: String,
    val updated_at: String
)