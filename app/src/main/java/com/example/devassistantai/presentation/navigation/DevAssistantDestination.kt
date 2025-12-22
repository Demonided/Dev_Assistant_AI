package com.example.devassistantai.presentation.navigation

interface DevAssistantDestination {
    val route: String
}

object Home : DevAssistantDestination {
    override val route = "home"
}

object ChatAI : DevAssistantDestination {
    override val route = "chat"
}

object Theory : DevAssistantDestination {
    override val route = "theory"
}

object Quiz : DevAssistantDestination {
    override val route = "quiz"
}

object Settings : DevAssistantDestination {
    override val route = "settings"
}

object Profile : DevAssistantDestination {
    override val route = "profile"
}

object TheoryTopic : DevAssistantDestination {
    override val route = "theory/topic"
}

val devAssistantBottomTabRowScreens =
    listOf(Theory.route, Quiz.route, ChatAI.route, Profile.route, Settings.route, TheoryTopic.route)