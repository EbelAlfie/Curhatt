package com.app.curhat.screen.chat.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import com.app.curhat.R

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
      onValueChange = {}
    )
  }
}

@Composable
fun ChatField(
  modifier: Modifier = Modifier,
  textFieldValue: TextFieldValue,
  onValueChange: (TextFieldValue) -> Unit
) {
  OutlinedTextField(
    modifier = modifier,
    value = textFieldValue,
    onValueChange = onValueChange,
    placeholder = { Text(text = stringResource(R.string.chat_bar_hint)) },
    shape = RoundedCornerShape(50),
    colors = OutlinedTextFieldDefaults.colors(
      unfocusedContainerColor = Color.Gray,
      focusedContainerColor = Color.Gray,
    )
  )
}