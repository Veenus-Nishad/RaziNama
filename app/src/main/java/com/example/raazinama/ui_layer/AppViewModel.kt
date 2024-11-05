package com.example.raazinama.ui_layer

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.raazinama.network_layer.response.ToSdrApiResponse
import com.example.raazinama.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AppViewModel:ViewModel() {
    val repository = Repository()
    val data = mutableStateOf<ToSdrApiResponse?>(null)

    init {
        viewModelScope.launch(Dispatchers.IO) {
            getAppViewModel()
        }

    }

    suspend fun getAppViewModel() {
        data.value = repository.getTosdrRepo().body()
    }
}