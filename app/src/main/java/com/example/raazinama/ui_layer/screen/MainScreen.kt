package com.example.raazinama.ui_layer.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.raazinama.network_layer.response.Parameters
import com.example.raazinama.ui_layer.AppViewModel
import com.example.raazinama.ui_layer.components.CardComponent

@Composable
fun MainScreen(viewModel: AppViewModel){
    val data = viewModel.data.value?.parameters
    if (data == null) {
        // Show loading or an error message if parameters is null
        Text("Error: Parameters not available.")
        CircularProgressIndicator() // Alternatively, show a loading indicator
    } else {
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
       items(listOf(data)){
           CardComponent(
              parameter=data
           )
       }
    }
}}