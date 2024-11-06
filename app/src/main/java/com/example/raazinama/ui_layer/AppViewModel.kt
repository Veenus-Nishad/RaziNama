package com.example.raazinama.ui_layer

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.raazinama.network_layer.response.ServiceResponse
import com.example.raazinama.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AppViewModel:ViewModel() {
    private val repository = Repository()

    private val _data = mutableStateOf<ServiceResponse?>(null)
    val data: State<ServiceResponse?> = _data

    init {
        viewModelScope.launch(Dispatchers.IO) {
            getAppViewModel()
        }
    }

    suspend fun getAppViewModel() {
        try {
            val response = repository.getServiceRepo()
            val serviceResponse = response.body()

            if (serviceResponse == null) {
                // Log or handle null response
                Log.e("AppViewModel", "Received null response")
                _data.value = null
            } else {
                _data.value = serviceResponse
            }
        } catch (e: Exception) {
            Log.e("AppViewModel", "Error fetching data: ${e.message}")
            _data.value = null
        }
    }
}