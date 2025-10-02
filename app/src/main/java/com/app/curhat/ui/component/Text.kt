package com.app.curhat.ui.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

@Composable
fun SecondaryText(
  text: String,
  color: Color = Color.White,
  textAlign: TextAlign? = null
) {
  Text(
    text = text,
    color = color,
    textAlign = textAlign
  )
}