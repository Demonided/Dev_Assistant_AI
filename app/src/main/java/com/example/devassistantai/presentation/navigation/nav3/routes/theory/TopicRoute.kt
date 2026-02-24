package com.example.devassistantai.presentation.navigation.nav3.routes.theory

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class TopicRoute(val subjectId: String) : NavKey
