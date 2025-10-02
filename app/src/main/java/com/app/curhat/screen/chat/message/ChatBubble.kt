package com.app.curhat.screen.chat.message

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import com.app.curhat.ui.component.SecondaryText

@Composable
fun OwnMessageBubble(
  text: String
) {
  val shape = RoundedCornerShape(
    topStart = 10.dp,
    topEnd = 10.dp,
    bottomStart = 10.dp,
    bottomEnd = 8.dp
  )

  Box(
    modifier = Modifier
      .clip(shape)
      .background(Color.Blue, shape)
      .padding(8.dp)
  ) {
    SecondaryText(text = text)
  }
}

@Composable
fun MessageAction() {
  Popup(
    onDismissRequest = {},
    properties = PopupProperties(
      dismissOnClickOutside = true,
      dismissOnBackPress = true
    )
  ) {
    val shape = remember { RoundedCornerShape(8.dp) }
    Column(
      modifier = Modifier
        .clip(shape)
        .background(Color.Black, shape),
      horizontalAlignment = Alignment.Start,
      verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {

    }
  }
}