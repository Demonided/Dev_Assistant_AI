package com.example.devassistantai.presentation.navigation.navbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.example.devassistantai.presentation.navigation.ChatAI
import com.example.devassistantai.presentation.navigation.Profile
import com.example.devassistantai.presentation.navigation.Quiz
import com.example.devassistantai.presentation.navigation.Settings
import com.example.devassistantai.presentation.navigation.Theory
import com.example.devassistantai.presentation.navigation.currentRoute

@Composable
fun CustomBottomBar(
    navController: NavController
) {
    CustomNavBar(
        currentRoute = currentRoute(navController),
        onTheoryClick = {
            navController.navigate(Theory.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        },
        onQuizClick = {
            navController.navigate(Quiz.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        },
        onMessageAIClick = {
            navController.navigate(ChatAI.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        },
        onProfileClick = {
            navController.navigate(Profile.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        },
        onSettingsClick = {
            navController.navigate(Settings.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        },
        modifier = Modifier
    )
}