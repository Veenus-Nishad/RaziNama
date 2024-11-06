package com.example.raazinama.ui_layer.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CustomTextBox(
    description:String,
    boxColor:Color
){
        Box(modifier=Modifier.fillMaxWidth().background(color=boxColor).border(width = 1.dp, color = Color(217, 189, 190), shape = RoundedCornerShape(2.dp))){
          Row(verticalAlignment = Alignment.CenterVertically) {
              Text(text=description,modifier=Modifier.padding(10.dp),color= Color(132,32,118), fontSize = 16.sp)
              IconButton(onClick = {}) {
                  Image(imageVector = Icons.Default.AccountBox,contentDescription = null)
              }
          }
        }


}