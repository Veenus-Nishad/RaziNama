package com.example.razinama.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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