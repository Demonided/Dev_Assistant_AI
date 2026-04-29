package com.example.ai_chat.presentation.model

data class MessageModel(
    val id: String,
    val text: String,
    val time: String,
    val isFromUser: Boolean
)
