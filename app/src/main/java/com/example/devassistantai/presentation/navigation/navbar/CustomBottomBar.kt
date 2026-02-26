package com.example.devassistantai.presentation.navigation.navbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavKey
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.AccountRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.ChatAIRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.QuizRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.SettingsRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.TheoryRoutes.SubjectRoutes
import com.example.devassistantai.presentation.navigation.nav3.Navigator

@Composable
fun CustomBottomBar(
    currentRoute: NavKey,
    navigator: Navigator
) {
    CustomNavBar(
        currentRoute = currentRoute,
        onTheoryClick = { navigator.navigate(route = SubjectRoutes) },
        onQuizClick = { navigator.navigate(route = QuizRoutes) },
        onMessageAIClick = { navigator.navigate(route = ChatAIRoutes) },
        onProfileClick = { navigator.navigate(route = AccountRoutes) },
        onSettingsClick = { navigator.navigate(route = SettingsRoutes) },
        modifier = Modifier
    )
}