package com.example.theory.presentation.topic

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.Color
import com.example.com.example.devassistantai.viewmodel.BaseViewModel
import com.example.theory.presentation.topic.data.TopicState
import com.example.theory.presentation.topic.model.TopicModel
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject

@HiltViewModel
class TopicViewModel @Inject constructor(

) : BaseViewModel<TopicState, Nothing>() {
    override fun initialState(): TopicState = TopicState.DEFAULT

    init {
        val stubTopicList = listOf(
            TopicModel(
                id = "1",
                orderNumber = 1,
                title = "Kotlin basic",
                duration = 40,
                isCompleted = true,
                icon = Icons.Default.Home
            ),
            TopicModel(
                id = "2",
                orderNumber = 2,
                title = "Null safety",
                duration = 15,
                isCompleted = true,
                icon = Icons.Default.Home
            ),
            TopicModel(
                id = "3",
                orderNumber = 3,
                title = "Classes and Objects",
                duration = 25,
                isCompleted = false,
                icon = Icons.Default.Home
            )
        )
        val topicState = TopicState(
            name = "Kotlin",
            description = "Kotlin syntax cor",
            color = listOf(
                Color(0xFFad46ff),
                Color(0xFF9810fa)
            ),
            topics = stubTopicList
        )
        updateState {
            topicState
        }
    }

}