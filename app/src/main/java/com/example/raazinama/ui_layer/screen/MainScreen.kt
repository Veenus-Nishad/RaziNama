package com.example.raazinama.ui_layer.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.raazinama.ui_layer.AppViewModel
import com.example.raazinama.ui_layer.components.CardComponent

@Composable
fun MainScreen(viewModel: AppViewModel){
    val data = viewModel.data.value?.parameters?: emptyList()
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(data){ service->
            CardComponent(
                name=service.name,
                rating = service.rating,
                image = service.image
            )

        }
    }
}