package com.example.raazinama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.raazinama.ui.theme.RaaziNamaTheme
import com.example.raazinama.ui_layer.AppViewModel
import com.example.raazinama.ui_layer.screen.MainScreen
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val viewModel: AppViewModel by viewModels()
        setContent {
            RaaziNamaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                 Box(modifier = Modifier.padding(innerPadding)){
                     MainScreen(viewModel)
                 }
                }
            }
        }
    }
}
