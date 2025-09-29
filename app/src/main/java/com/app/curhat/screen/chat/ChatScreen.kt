package com.app.curhat.screen.chat

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.DismissibleNavigationDrawer
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.app.curhat.screen.chat.component.BottomBar
import com.app.curhat.screen.chat.component.ChatList
import com.app.curhat.screen.chat.component.MainScreen
import com.app.curhat.screen.chat.component.TopBar
import kotlinx.coroutines.launch

@Composable
fun ChatScreen() {
  val drawerCoroutine = rememberCoroutineScope()
  val drawerState = rememberDrawerState(DrawerValue.Closed)
  val openChatListAction: () -> Unit = remember {
    {
      drawerCoroutine.launch {
        if (drawerState.isOpen) drawerState.close() else drawerState.open()
      }
    }
  }
  DismissibleNavigationDrawer(
    drawerState = drawerState,
    drawerContent = {
      ChatList(modifier = Modifier.fillMaxHeight())
    }
  ) {
    Scaffold(
      modifier = Modifier
        .fillMaxSize(),
      topBar = {
        TopBar(
          modifier = Modifier.systemBarsPadding(),
          openChatListAction = openChatListAction,
          {}
        )
      },
      bottomBar = {
        BottomBar(
          modifier = Modifier.navigationBarsPadding()
        )
      }
    ) {
      MainScreen(modifier = Modifier.padding(it))
    }
  }
}