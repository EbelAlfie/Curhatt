package com.app.curhat.screen.chat.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.DismissibleDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ChatList(
  modifier: Modifier = Modifier
) {
  DismissibleDrawerSheet(
    drawerContentColor = Color.Black
  ) {
    Column(
      modifier = modifier
        .systemBarsPadding()
        .navigationBarsPadding()
    ) {
      LazyColumn(
        modifier = Modifier.fillMaxHeight()
      ) {
        item { ChatItem("Test") }
      }
    }
  }
}

@Composable
fun ChatItem(
  title: String
) {
  Text(
    modifier = Modifier.padding(10.dp),
    textAlign = TextAlign.Center,
    text = title,
    color = Color.White
  )
}