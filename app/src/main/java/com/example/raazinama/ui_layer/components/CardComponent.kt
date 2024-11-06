package com.example.raazinama.ui_layer.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
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
import coil3.compose.AsyncImage
import com.example.raazinama.R
import com.example.raazinama.network_layer.response.Point

@Composable
fun CardComponent(
    name:String,
    rating:String?="Not rated",
    image:String,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 50.dp, start = 8.dp, end = 8.dp)
            .border(width = 1.dp, shape = RectangleShape, color = Color(216, 217, 217, 255)),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 6.dp)
                .background(Color(222, 221, 221, 255)),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            AsyncImage(
                model = image,
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 8.dp, bottom = 8.dp, start = 12.dp, end = 6.dp)
                    .size(64.dp)
                    .clip(CircleShape), contentScale = ContentScale.Crop
            )
            Text(name, modifier = Modifier.padding(4.dp))
            CustomButton(
                onClick = {},
                buttonColor = ButtonDefaults.buttonColors(containerColor = Color.Red),
                icon = null,
                text = rating!!
            )


        }
        Column(modifier = Modifier.padding(8.dp)) {
            CustomTextBox(description = "This Description is too fucking long", boxColor = Color(
                248,214,219,255
            ))
            CustomTextBox(description = "This Description is too fucking ",boxColor = Color(
                248,214,219,255
            ))
            CustomTextBox(description = "This Description is too ",boxColor = Color(
                248,214,219,255
            ))
            CustomButton(
                onClick = {},
                buttonColor = ButtonDefaults.buttonColors(containerColor = Color.Red),
                icon = R.drawable.eye,
                text = "View All Points on Phoenix!"
            )
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 6.dp)
            .background(Color(222, 221, 221, 255)),
            verticalAlignment = Alignment.CenterVertically) {
            CustomButton(
                onClick = {},
                buttonColor = ButtonDefaults.buttonColors(containerColor = Color.Blue),
                icon = R.drawable.eye,
                text = "View Documents"
            )
            Spacer(modifier = Modifier.width(8.dp))
            CustomButton(
                onClick = {},
                buttonColor = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
                icon = R.drawable.eye,
                text = "View Service"
            )

        }
    }
}

