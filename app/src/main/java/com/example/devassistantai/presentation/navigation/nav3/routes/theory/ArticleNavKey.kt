package com.example.devassistantai.presentation.navigation.nav3.routes.theory

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class ArticleNavKey(val topicId: String) : NavKey
