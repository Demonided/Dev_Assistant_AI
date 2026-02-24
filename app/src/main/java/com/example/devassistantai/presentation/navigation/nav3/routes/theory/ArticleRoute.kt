package com.example.devassistantai.presentation.navigation.nav3.routes.theory

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class ArticleRoute(val topicId: String) : NavKey
