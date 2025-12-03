package com.example.devassistantai.presentation.ui

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun HomeScreenContainer() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = DevAssistantTheme.colors.textTitle)
    ) {
        Log.d("MyLog", "HomeScreenContainer: Я запустился")
        Text(
            text = "Я запустился",
            style = DevAssistantTheme.typography.primaryText,
            color = Color.Blue
        )
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    DevAssistantAITheme {
        HomeScreenContainer()
    }
}