package com.example.ai_chat.presentation.model

data class MessageModel(
    val id: String,
    val message: String,
    val time: String,
    val isFromUser: Boolean
)
