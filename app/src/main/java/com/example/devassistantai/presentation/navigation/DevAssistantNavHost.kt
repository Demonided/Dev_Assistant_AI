package com.example.devassistantai.presentation.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.devassistantai.presentation.ui.HomeScreenContainer

@Composable
fun DevAssistantNavHost(
    startDestination: String,
    modifier: Modifier = Modifier,
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier.fillMaxSize()
    ) {
        composable(route = Home.route) {
            HomeScreenContainer()
        }
        composable(route = ChatAI.route) {

        }
        composable(route = Theory.route) {

        }
        composable(route = Quiz.route) {

        }
        composable(route = User.route) {

        }
        composable(route = Settings.route) {

        }
    }
}