package com.example.raazinama.ui_layer.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.raazinama.R


@Composable
fun CustomTextBox(
    onClick: () -> Unit,
    description: String,
    boxColor: Color
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = boxColor)
            .border(width = 1.dp, color = Color(217, 189, 190), shape = RoundedCornerShape(2.dp))
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = description,
                modifier = Modifier.weight(9f),
                color = Color(132, 32, 118),
                fontSize = 16.sp,
            )
            Icon(
                painter = painterResource(R.drawable.suitcasepng), contentDescription = null,
                modifier = Modifier
                    .padding(end = 4.dp)
                    .size(23.dp)
                    .clickable(onClick = {onClick()})
            )
        }
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewCustomTextBox() {
    // You can modify the parameters to customize the preview
    CustomTextBox(
        onClick = {},
        description = "Secret chats content is encrypted, and this service cannot decrypt it ",
        boxColor = Color.LightGray
    )
}
