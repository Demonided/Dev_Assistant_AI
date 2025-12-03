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

object User : DevAssistantDestination {
    override val route = "user"
}

object Settings : DevAssistantDestination {
    override val route = "settings"
}