package com.example.raazinama.network_layer.response

data class Case(
    val classification: String,
    val created_at: String,
    val description: String,
    val id: Int,
    val title: String,
    val topic_id: Int,
    val updated_at: String,
    val weight: Int
)