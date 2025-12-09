package com.example.devassistantai.presentation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.example.devassistantai.presentation.navigation.navbar.CustomBottomBar

@Composable
fun DevAssistantScreen(
    startDestination: String,
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            if (devAssistantBottomTabRowScreens.contains(currentRoute(navController = navController))) {
                CustomBottomBar(navController = navController)
            }
        },
        contentColor = Color.Transparent
    ) { paddingValues ->
        DevAssistantNavHost(
            startDestination = startDestination,
            navController = navController,
            modifier = modifier.padding(paddingValues)
        )
    }
}