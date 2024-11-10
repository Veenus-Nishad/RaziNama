package com.example.raazinama.network_layer.response.specificServiceResponse

data class Point(
    val analysis: String,
    val case: Case,
    val created_at: String,
    val document_id: Any,
    val id: Int,
    val quoteEnd: Any,
    val quoteStart: Any,
    val quoteText: Any,
    val source: String,
    val status: String,
    val title: String,
    val updated_at: String
)