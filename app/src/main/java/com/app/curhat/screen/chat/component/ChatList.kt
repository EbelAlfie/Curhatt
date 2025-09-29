package com.app.curhat.screen.chat.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.DismissibleDrawerSheet
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

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
      Text(text = "TETOTTTT", color = Color.White)
    }
  }
}