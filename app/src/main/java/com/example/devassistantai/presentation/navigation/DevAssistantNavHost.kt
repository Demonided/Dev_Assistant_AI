package com.example.devassistantai.presentation.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ai_chat.ChatAIScreen
import com.example.devassistantai.presentation.ui.HomeScreenContainer
import com.example.profile.ProfileScreen
import com.example.settings.SettingsScreen
import com.example.tests.presentation.QuizRoute
import com.example.tests.presentation.QuizScreen
import com.example.theory.presentation.subject.SubjectScreen
import com.example.theory.presentation.topic.TopicScreen

@Composable
fun DevAssistantNavHost(
    startDestination: String,
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier.fillMaxSize()
    ) {
        composable(route = Home.route) {
            HomeScreenContainer()
        }
        composable(route = ChatAI.route) {
            ChatAIScreen()
        }
        composable(route = Theory.route) {
            SubjectScreen(
                onSubjectClick = { navController.navigate(TheoryTopic.route) }
            )
        }
        composable(route = Quiz.route) {
            QuizRoute()
        }
        composable(route = Profile.route) {
            ProfileScreen()
        }
        composable(route = Settings.route) {
            SettingsScreen()
        }
        composable(route = TheoryTopic.route) {
            TopicScreen(
                onBackButtonClick = { navController.navigate(Theory.route) }
            )
        }
    }
}