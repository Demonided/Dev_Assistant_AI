package com.example.devassistantai.presentation.navigation.navbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavKey
import com.example.devassistantai.presentation.navigation.nav3.Navigator
import com.example.devassistantai.presentation.navigation.nav3.routes.AccountRoute
import com.example.devassistantai.presentation.navigation.nav3.routes.ChatAIRoute
import com.example.devassistantai.presentation.navigation.nav3.routes.QuizRoute
import com.example.devassistantai.presentation.navigation.nav3.routes.SettingsRoute
import com.example.devassistantai.presentation.navigation.nav3.routes.theory.SubjectRoute

@Composable
fun CustomBottomBar(
    currentRoute: NavKey,
    navigator: Navigator
) {
    CustomNavBar(
        currentRoute = currentRoute,
        onTheoryClick = { navigator.navigate(route = SubjectRoute) },
        onQuizClick = { navigator.navigate(route = QuizRoute) },
        onMessageAIClick = { navigator.navigate(route = ChatAIRoute) },
        onProfileClick = { navigator.navigate(route = AccountRoute) },
        onSettingsClick = { navigator.navigate(route = SettingsRoute) },
        modifier = Modifier
    )
}