package com.app.curhat.screen.chat.message

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ChatBubble() {
  val shape = RoundedCornerShape(10.dp)
  Box(
    modifier = Modifier
      .clip(shape)
      .background(Color.Blue, shape)
  ) {

  }
}