package com.example.theory.presentation.topic.data

import androidx.compose.ui.graphics.Color
import com.example.com.example.devassistantai.viewmodel.BaseViewState
import com.example.theory.presentation.topic.model.TopicModel

data class TopicState(
    val name: String,
    val description: String,
    val duration: Int,
    val color: List<Color>,
    val topics: List<TopicModel>
) : BaseViewState {
    companion object {
        val DEFAULT = TopicState(
            name = "",
            description = "",
            duration = 0,
            color = emptyList(),
            topics = emptyList()
        )
    }
}
