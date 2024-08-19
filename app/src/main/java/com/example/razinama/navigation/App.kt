package com.example.razinama.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.razinama.screens.Explore
import com.example.razinama.screens.InstalledApp

@Composable
fun App(modifier:Modifier){
    val navController= rememberNavController()
    
    NavHost(navController = navController, startDestination =ExploreScreen ) {
        composable<ExploreScreen>{
            Explore(navController)
        }

        composable<InstalledAppScreen>{
            InstalledApp(navController)
        }
    }
}

@Composable
fun NavigationBottomBar(
    navController: NavHostController,
){
    BottomAppBar {
       IconButton(onClick = { navController.navigate(ExploreScreen) }) {
           Icon(Icons.Filled.Search, contentDescription =null)
       }
    }
}