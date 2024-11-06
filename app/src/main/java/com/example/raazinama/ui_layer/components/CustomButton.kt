package com.example.raazinama.ui_layer.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun CustomButton(
    onClick:()->Unit,
    buttonColor:ButtonColors,
    icon: Int?=null,
    text:String?=null,
) {

    Button(
        onClick = {onClick()},
        shape = RoundedCornerShape(4.dp),
        contentPadding = PaddingValues(6.dp),
        modifier = Modifier.defaultMinSize(
            minWidth = 1.dp,
            minHeight = 10.dp
        ),
        colors = buttonColor

    ) {
        Row() {
            if (icon != null) {
                Icon(
                    painter = painterResource(icon),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .size(23.dp)
                )
            }
            if (text != null) {
                Text(text=text)
            }
        }

    }


}