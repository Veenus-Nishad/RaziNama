package com.example.raazinama.repository

import com.example.raazinama.network_layer.ApiProvider

class Repository {
    suspend fun getTosdrRepo() = ApiProvider.ProvideApi().getSpecificServiceInfo()
}