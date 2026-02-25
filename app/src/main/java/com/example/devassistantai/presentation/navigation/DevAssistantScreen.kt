package com.example.devassistantai.presentation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation3.ui.NavDisplay
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.AccountRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.ChatAIRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.QuizRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.SettingsRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.TheoryRoutes.SubjectRoutes
import com.example.devassistantai.presentation.navigation.nav3.EntryProvider
import com.example.devassistantai.presentation.navigation.nav3.Navigator
import com.example.devassistantai.presentation.navigation.nav3.rememberAppNavigationState
import com.example.devassistantai.presentation.navigation.nav3.toEntries
import com.example.devassistantai.presentation.navigation.navbar.CustomBottomBar

@Composable
fun DevAssistantScreen(
    modifier: Modifier = Modifier
) {
    val navigationState = rememberAppNavigationState(
        startRoute = SubjectRoutes,
        topLevelRoutes = setOf(SubjectRoutes, QuizRoutes, ChatAIRoutes, AccountRoutes, SettingsRoutes)
    )
    val navigator = remember { Navigator(navigationState) }

    Scaffold(
        bottomBar = {
            CustomBottomBar(
                currentRoute = navigationState.topLevelRoute,
                navigator = navigator
            )
        },
        contentColor = Color.Transparent
    ) { paddingValues ->
        NavDisplay(
            entries = navigationState.toEntries(entryProvider = EntryProvider.getProvider(navigator = navigator)),
            onBack = { navigator.goBack() },
            modifier = modifier.padding(paddingValues)
        )
    }
}