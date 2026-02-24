package com.example.devassistantai.presentation.navigation.nav3

import androidx.navigation3.runtime.entryProvider
import com.example.ai_chat.ChatAIScreen
import com.example.devassistantai.presentation.navigation.nav3.routes.AccountRoute
import com.example.devassistantai.presentation.navigation.nav3.routes.ChatAIRoute
import com.example.devassistantai.presentation.navigation.nav3.routes.QuizRoute
import com.example.devassistantai.presentation.navigation.nav3.routes.SettingsRoute
import com.example.devassistantai.presentation.navigation.nav3.routes.theory.ArticleRoute
import com.example.devassistantai.presentation.navigation.nav3.routes.theory.SubjectRoute
import com.example.devassistantai.presentation.navigation.nav3.routes.theory.TopicRoute
import com.example.profile.ProfileScreen
import com.example.settings.SettingsScreen
import com.example.tests.presentation.QuizRoute
import com.example.theory.presentation.article.ArticleScreen
import com.example.theory.presentation.subject.SubjectScreen
import com.example.theory.presentation.topic.TopicScreen

class EntryProvider() {
    companion object {
        fun getProvider(navigator: Navigator) =
            entryProvider {
                entry<SubjectRoute> {
                    SubjectScreen(
                        onSubjectClick = { subjectId -> navigator.navigate(TopicRoute(subjectId = subjectId)) }
                    )
                }
                entry<TopicRoute> { key ->
                    TopicScreen(
                        subjectId = key.subjectId,
                        onTopicCLick = { topicId -> navigator.navigate(ArticleRoute(topicId = topicId)) },
                        onBackButtonClick = { navigator.goBack() }
                    )
                }
                entry<ArticleRoute> { key ->
                    ArticleScreen(
                        topicId = key.topicId,
                        onBackButtonClick = { navigator.goBack() }
                    )
                }
                entry<QuizRoute> { QuizRoute() }
                entry<ChatAIRoute> { ChatAIScreen() }
                entry<AccountRoute> { ProfileScreen() }
                entry<SettingsRoute> { SettingsScreen() }
            }
    }
}
