package com.example.devassistantai.presentation.navigation.nav3

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed interface AppRoutes : NavKey {

    @Serializable
    sealed interface AuthRoutes : AppRoutes {

    }

    @Serializable
    sealed interface TheoryRoutes : AppRoutes {
        @Serializable
        data object SubjectRoutes : TheoryRoutes

        @Serializable
        data class TopicRoutes(val subjectId: String) : TheoryRoutes

        @Serializable
        data class ArticleRoutes(val topicId: String) : TheoryRoutes
    }

    @Serializable
    data object QuizRoutes : AppRoutes

    @Serializable
    data object ChatAIRoutes : AppRoutes

    @Serializable
    data object SettingsRoutes : AppRoutes

    @Serializable
    data object AccountRoutes : AppRoutes
}