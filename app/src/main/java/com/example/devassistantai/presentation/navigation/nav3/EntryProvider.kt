package com.example.devassistantai.presentation.navigation.nav3

import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import com.example.ai_chat.ChatAIScreen
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.AccountRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.ChatAIRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.QuizRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.SettingsRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.TheoryRoutes.ArticleRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.TheoryRoutes.SubjectRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.TheoryRoutes.TopicRoutes
import com.example.profile.ProfileScreen
import com.example.settings.SettingsScreen
import com.example.tests.presentation.QuizScreen
import com.example.theory.presentation.article.ArticleScreen
import com.example.theory.presentation.subject.SubjectScreen
import com.example.theory.presentation.topic.TopicScreen

class EntryProvider() {
    companion object {
        fun getProvider(navigator: Navigator) =
            entryProvider<NavKey> {
                entry<SubjectRoutes> {
                    SubjectScreen(
                        onSubjectClick = { subjectId -> navigator.navigate(TopicRoutes(subjectId = subjectId)) }
                    )
                }
                entry<TopicRoutes> { key ->
                    TopicScreen(
                        subjectId = key.subjectId,
                        onTopicCLick = { topicId -> navigator.navigate(ArticleRoutes(topicId = topicId)) },
                        onBackButtonClick = { navigator.goBack() }
                    )
                }
                entry<ArticleRoutes> { key ->
                    ArticleScreen(
                        topicId = key.topicId,
                        onBackButtonClick = { navigator.goBack() }
                    )
                }
                entry<QuizRoutes> { QuizScreen() }
                entry<ChatAIRoutes> { ChatAIScreen() }
                entry<AccountRoutes> { ProfileScreen() }
                entry<SettingsRoutes> { SettingsScreen() }
            }
    }
}
