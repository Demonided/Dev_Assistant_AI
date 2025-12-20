package com.example.theory.presentation.topic.data

import androidx.compose.ui.graphics.Color
import com.example.com.example.devassistantai.viewmodel.BaseViewState

data class TopicState(
    val name: String,
    val color: List<Color>
) : BaseViewState {
    companion object {
        val DEFAULT = TopicState(name = "", color = emptyList())
    }
}
