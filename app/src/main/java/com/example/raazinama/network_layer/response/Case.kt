package com.example.raazinama.network_layer.response

data class Case(
    val id: Int,
    val weight: Int,
    val title: String,
    val description: String,
    val updated_at: String,
    val created_at: String,
    val topic_id: Int,
    val classification: String
)