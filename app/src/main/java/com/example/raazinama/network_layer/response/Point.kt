package com.example.raazinama.network_layer.response

data class Point(
    val id: Int,
    val title: String,
    val source: String,
    val status: String,
    val analysis: String,
    val case: Case,
    val document_id: Int?,
    val updated_at: String,
    val created_at: String
)