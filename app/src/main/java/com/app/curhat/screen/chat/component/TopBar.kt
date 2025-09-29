package com.app.curhat.screen.chat.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TopBar(
  modifier: Modifier = Modifier,
  openChatListAction: () -> Unit,
  newMessageAction: () -> Unit
) {
  Row(
    modifier = modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceBetween
  ) {
    IconButton(
      onClick = openChatListAction
    ) {
      Icon(
        imageVector = Icons.Outlined.Menu,
        contentDescription = null
      )
    }

    IconButton(
      onClick = newMessageAction
    ) {
      Icon(
        imageVector = Icons.Outlined.AddCircle,
        contentDescription = null
      )
    }
  }
}