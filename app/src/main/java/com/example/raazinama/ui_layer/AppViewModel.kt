package com.example.raazinama.ui_layer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.raazinama.network_layer.response.allServiceResponse.Service
import com.example.raazinama.network_layer.response.specificServiceResponse.ServiceParameters
import com.example.raazinama.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AppViewModel  @Inject constructor(private val repository: Repository):ViewModel() {

    sealed class UiState {
        object Loading : UiState()
        data class ServicesList(val services: List<Service>) : UiState()
        data class ServiceDetail(val service: ServiceParameters) : UiState()
        data class Error(val message: String) : UiState()
    }

    private val _uiState = MutableStateFlow<UiState>(UiState.Loading)
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    init { // runs when a new Instance of class
        fetchAllServices()
    }

    fun fetchAllServices() {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            repository.getAllServices()
                .onSuccess { services ->
                    _uiState.value = UiState.ServicesList(services)
                }
                .onFailure { exception ->
                    _uiState.value = UiState.Error(exception.message ?: "Unknown error occurred")
                }
        }
    }

    fun fetchServiceById(id: Int) {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            repository.getServiceById(id)
                .onSuccess { service ->
                    _uiState.value = UiState.ServiceDetail(service)
                }
                .onFailure { exception ->
                    _uiState.value = UiState.Error(exception.message ?: "Unknown error occurred")
                }
        }
    }
}



