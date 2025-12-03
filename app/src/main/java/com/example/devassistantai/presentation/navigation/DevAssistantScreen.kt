package com.example.devassistantai.presentation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun DevAssistantScreen(
    startDestination: String,
    modifier: Modifier = Modifier
) {
    Scaffold(
        contentColor = Color.Transparent
    ) { paddingValues ->
        DevAssistantNavHost(
            startDestination = startDestination,
            modifier = modifier.padding(paddingValues)
        )
    }
}