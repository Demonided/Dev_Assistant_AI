package com.example.devassistantai.presentation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.example.devassistantai.presentation.navigation.nav3.Navigator
import com.example.devassistantai.presentation.navigation.nav3.rememberNavigationState
import com.example.devassistantai.presentation.navigation.nav3.routes.AccountNavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.ChatAINavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.QuizNavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.SettingsNavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.theory.SubjectNavKey
import com.example.devassistantai.presentation.navigation.navbar.CustomBottomBar

@Composable
fun DevAssistantScreen(
    startDestination: String,
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()

    val navigationState = rememberNavigationState(
        startRoute = SubjectNavKey,
        topLevelRoutes = setOf(SubjectNavKey, QuizNavKey, ChatAINavKey, AccountNavKey, SettingsNavKey)
    )
    val navigator = remember { Navigator(navigationState) }

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