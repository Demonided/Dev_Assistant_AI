package com.example.devassistantai.presentation.navigation.nav3

import androidx.navigation3.runtime.entryProvider
import com.example.ai_chat.ChatAIScreen
import com.example.devassistantai.presentation.navigation.nav3.routes.AccountNavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.ChatAINavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.QuizNavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.SettingsNavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.theory.ArticleNavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.theory.SubjectNavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.theory.TopicNavKey
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
                entry<SubjectNavKey> {
                    SubjectScreen(
                        onSubjectClick = { subjectId -> navigator.navigate(TopicNavKey(subjectId = subjectId)) }
                    )
                }
                entry<TopicNavKey> { key ->
                    TopicScreen(
                        subjectId = key.subjectId,
                        onTopicCLick = { topicId -> navigator.navigate(ArticleNavKey(topicId = topicId)) },
                        onBackButtonClick = { navigator.goBack() }
                    )
                }
                entry<ArticleNavKey> { key ->
                    ArticleScreen(
                        topicId = key.topicId,
                        onBackButtonClick = { navigator.goBack() }
                    )
                }
                entry<QuizNavKey> { QuizRoute() }
                entry<ChatAINavKey> { ChatAIScreen() }
                entry<AccountNavKey> { ProfileScreen() }
                entry<SettingsNavKey> { SettingsScreen() }
            }
    }
}
