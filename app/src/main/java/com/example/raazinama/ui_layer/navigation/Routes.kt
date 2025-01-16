package com.example.raazinama.ui_layer.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Routes(val rout: String) {
    object Explore: Routes("explore_screen")
    object InstalledApps: Routes("installed_apps_screen")
    object Setting: Routes("setting_screen")
}

data class NavigationItem(
    val title: String,
    val icon: ImageVector,
    val route: String
)

