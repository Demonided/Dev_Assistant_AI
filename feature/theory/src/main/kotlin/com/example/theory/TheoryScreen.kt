package com.example.theory

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun TheoryScreen() {
    val viewModel = TheoryViewModel()
    val state by viewModel.state.collectAsState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(DevAssistantTheme.colors.bottomBarDashboard.backgroundBottomBar)
    ) {
        Text(
            text = state.screenName,
            style = DevAssistantTheme.typography.primaryText
        )
        Text(
            text = "Hello",
            style = DevAssistantTheme.typography.primaryText,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    TheoryScreen()
}