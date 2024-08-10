package com.example.razinama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.razinama.ui.theme.RaziNamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RaziNamaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RaziNamaTheme {
        Greeting("Android")
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppSearchBar(modifier:Modifier) {
    var text by remember { mutableStateOf("") } /* For entries*/
    var active by remember { mutableStateOf(false) }
    var history = remember { mutableStateListOf("") }
    Row(
        horizontalArrangement = Arrangement.Center
    ) {
        SearchBar(
            query = text,
            onQueryChange = {
                text = it
            }, /*updates text*/
            onSearch = { /* Search Button Dabane pe Kya hoga */
                history.add(text)
                active = false
                text = ""
            },
            active = active,
            onActiveChange = {
                active = it
            },
            placeholder = {
                Text(text = "Search a Service")
            },
            leadingIcon = {
                Icon(Icons.Default.Search, contentDescription = "Search Icon")
            },
            trailingIcon = {
                if (active) {
                    Icon(
                        /* to make things clickable*/
                        modifier = Modifier.clickable {
                            if (text.isNotEmpty()) {
                                text = ""
                            } else { /*What this does is if the string is empty and you again click the button
                            the searchBox will Close the Search bar*/
                                active = false
                            }
                        },
                        imageVector = Icons.Default.Close,
                        contentDescription = "Close Search"
                    )

                }
            }
        ) {
            history.forEach {
                if (history.isNotEmpty()) {
                    Row(modifier = Modifier.padding(all = 10.dp)) {
                        Icon(
                            modifier = Modifier.padding(end = 10.dp),
                            imageVector = Icons.Default.AccountBox,
                            contentDescription = "History Icon"
                        )
                    }
                }
            }
        }
    }

}
