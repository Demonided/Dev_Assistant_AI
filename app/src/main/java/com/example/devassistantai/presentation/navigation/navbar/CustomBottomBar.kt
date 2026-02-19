package com.example.devassistantai.presentation.navigation.navbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavKey
import com.example.devassistantai.presentation.navigation.nav3.Navigator
import com.example.devassistantai.presentation.navigation.nav3.routes.AccountNavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.ChatAINavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.QuizNavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.SettingsNavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.theory.SubjectNavKey

@Composable
fun CustomBottomBar(
    currentRoute: NavKey,
    navigator: Navigator
) {
    CustomNavBar(
        currentRoute = currentRoute,
        onTheoryClick = { navigator.navigate(route = SubjectNavKey) },
        onQuizClick = { navigator.navigate(route = QuizNavKey) },
        onMessageAIClick = { navigator.navigate(route = ChatAINavKey) },
        onProfileClick = { navigator.navigate(route = AccountNavKey) },
        onSettingsClick = { navigator.navigate(route = SettingsNavKey) },
        modifier = Modifier
    )
}