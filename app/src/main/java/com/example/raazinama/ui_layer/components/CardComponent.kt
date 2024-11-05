package com.example.raazinama.ui_layer.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.raazinama.R

@Preview(showSystemUi = true)
@Composable
fun CardComponent(){
    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(top=50.dp, start = 8.dp, end = 8.dp)
            .border(width = 1.dp, shape = RectangleShape ,color = Color(216,217,217,255)),
        verticalArrangement = Arrangement.Center
    ) {
        Row(modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 6.dp)
            .background(Color(247, 246, 246,255)),
            verticalAlignment = Alignment.CenterVertically,
            ){
            Image(
                painter = painterResource(R.drawable.stark),contentDescription = null,
                modifier = Modifier.padding(top=8.dp, bottom = 8.dp, start = 12.dp, end = 6.dp).size(64.dp).clip(CircleShape), contentScale = ContentScale.Crop
            )
            Text(text="Service Name")
            Text(text="Grade")

        }
        Column(modifier=Modifier.padding(8.dp)) {
            Text("Description")
            Text("Description")
            Text("Description")
        }
        Button(onClick = {}) {
            Text("ViewAll Points on Pheonix")
        }
        Column {
            TextButton(onClick = {}) {
                Text("Visit Documents")
            }
            TextButton(onClick = {}) {
                Text("Visit Documents")
            }
        }
    }
}

