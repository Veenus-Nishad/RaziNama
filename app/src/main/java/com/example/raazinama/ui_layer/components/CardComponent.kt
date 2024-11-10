package com.example.raazinama.ui_layer.components


import android.util.Log
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
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.raazinama.R
import com.example.raazinama.network_layer.response.specificServiceResponse.ServiceParameters


@Composable
fun CardComponent(
    service: ServiceParameters,
    modifier: Modifier = Modifier
) {
    val localUriHandler = LocalUriHandler.current

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
                model = service.image,
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 8.dp, bottom = 8.dp, start = 12.dp, end = 6.dp)
                    .size(64.dp)
                    .clip(CircleShape), contentScale = ContentScale.Crop
            )
            Text(service.name, modifier = Modifier.padding(4.dp))
            CustomButton(
                onClick = {},
                buttonColor = ButtonDefaults.buttonColors(containerColor = Color.Red),
                icon = null,
                rating = service.rating
            )


        }

        Column(modifier = Modifier.padding(8.dp)) {
            service.points.take(3).forEach{point->
                CustomTextBox(description = point.title, boxColor =when (point.case.classification) {
                    "good" -> Color.Green.copy(alpha = 0.1f)
                    "bad" -> Color.Red.copy(alpha = 0.1f)
                    "neutral" -> Color.Gray.copy(alpha = 0.1f)
                    else -> Color.Yellow
                }, onClick = {
                    val points= service.points[1]
                    localUriHandler.openUri("https://edit.tosdr.org/cases/${points.case.id}")
                    Log.d("URL", "https://edit.tosdr.org/cases/${points.case.id}")
                })
            }

            CustomButton(
                onClick = {
                    localUriHandler.openUri("https://edit.tosdr.org/services/${service.id}")
                },
                buttonColor = ButtonDefaults.buttonColors(containerColor = Color.Red),
                icon = R.drawable.eye,
                rating = "View All Points on Phoenix!"
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
                rating = "View Documents"
            )
            Spacer(modifier = Modifier.width(8.dp))
            CustomButton(
                onClick = {
                    val link="https://${service.urls.first()}"

                    localUriHandler.openUri("https://${service.urls.first()}")
                    Log.d("URL", link)

                },
                buttonColor = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
                icon = R.drawable.eye,
                rating = "View Service"
            )

        }
    }
}

