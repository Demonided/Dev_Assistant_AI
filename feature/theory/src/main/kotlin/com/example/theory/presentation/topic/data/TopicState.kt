package com.example.theory.presentation.topic.data

import androidx.compose.ui.graphics.Color
import com.example.com.example.devassistantai.viewmodel.BaseViewState
import com.example.theory.presentation.topic.model.TopicModel

data class TopicState(
    val subjectName: String,
    val subjectDescription: String,
    val color: List<Color>,
    val topics: List<TopicModel>,
    val isLoading: Boolean,
    val errorMessage: String?
) : BaseViewState {
    companion object {
        val DEFAULT = TopicState(
            subjectName = "",
            subjectDescription = "",
            color = emptyList(),
            topics = emptyList(),
            isLoading = true,
            errorMessage = null
        )
    }
}
