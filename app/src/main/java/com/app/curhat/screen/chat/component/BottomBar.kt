package com.app.curhat.screen.chat.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.app.curhat.R
import com.app.curhat.ui.theme.SecondaryBackground

@Composable
fun BottomBar(
  modifier: Modifier = Modifier
) {
  val textFieldValue by remember {
    mutableStateOf(TextFieldValue())
  }

  Row (
    modifier = modifier.fillMaxWidth(),
  ) {
    ChatField(
      modifier = Modifier.weight(1f),
      textFieldValue = textFieldValue,
      onValueChange = {},
      onSendClicked = {}
    )
  }
}

@Composable
fun ChatField(
  modifier: Modifier = Modifier,
  textFieldValue: TextFieldValue,
  onValueChange: (TextFieldValue) -> Unit,
  onSendClicked: () -> Unit
) {
  OutlinedTextField(
    modifier = modifier,
    value = textFieldValue,
    onValueChange = onValueChange,
    trailingIcon = { SendIcon(modifier = Modifier.padding(horizontal = 8.dp), onSendClicked = onSendClicked) },
    placeholder = { Text(text = stringResource(R.string.chat_bar_hint)) },
    shape = RoundedCornerShape(50),
    colors = OutlinedTextFieldDefaults.colors(
      unfocusedContainerColor = SecondaryBackground,
      focusedContainerColor = SecondaryBackground,
      unfocusedBorderColor = SecondaryBackground,
      focusedBorderColor = SecondaryBackground,
      cursorColor = SecondaryBackground
    )
  )
}

@Composable
fun SendIcon(
  modifier: Modifier = Modifier,
  onSendClicked: () -> Unit
) {
  IconButton(
    modifier = modifier
      .clip(CircleShape)
      .background(Color.Blue, CircleShape),
    onClick = onSendClicked
  ) {
    Icon(
      imageVector = Icons.AutoMirrored.Filled.Send,
      contentDescription = null
    )
  }
}