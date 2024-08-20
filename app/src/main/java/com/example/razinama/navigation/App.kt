package com.example.razinama.navigation

import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.razinama.screens.Explore
import com.example.razinama.screens.InstalledApp

@Composable
fun App() {
    val navController = rememberNavController()
    val navItemList = listOf(
        // Minimum 3 and max 5
        NavItem("Explore", Icons.Default.Search), // index 0
        NavItem("Installed Apps", Icons.Default.Person),
        NavItem("Settings", Icons.Default.Settings),
    )
    var selectedIndex by remember{
        mutableStateOf(0)
    }
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navItemList.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = { selectedIndex=index
                                  }, //yaha pe pass karna hai
                        icon = { Icon(imageVector = navItem.icon, contentDescription ="Icon" ) },
                        label = { Text(text = navItem.label) })
                }
            }
        }
    ) { innerPadding ->
        NavHost(navController = navController, startDestination = ExploreScreen) {
            composable<ExploreScreen> {
                Explore(navController,modifier=Modifier.padding(innerPadding))
            }

            composable<InstalledAppScreen> {
                InstalledApp(navController,modifier=Modifier.padding(innerPadding))
            }
            composable<ProfileScreen> {
                InstalledApp(navController,modifier=Modifier.padding(innerPadding))
            }
        }
    }


}


@Composable
fun ContentScreen(modifier: Modifier=Modifier) {
    Column(modifier=Modifier.fillMaxSize(),verticalArrangement = Arrangement.Center) {
        Text(text = "Main Hoon Content")
    }
}

