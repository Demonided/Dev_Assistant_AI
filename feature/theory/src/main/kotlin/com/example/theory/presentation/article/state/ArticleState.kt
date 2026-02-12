package com.example.theory.presentation.article.state

import com.example.com.example.devassistantai.viewmodel.BaseViewState

data class ArticleState(
    val title: String,
    val content: String,
    val duration: Int,
) : BaseViewState {
    companion object {
        val DEFAULT = ArticleState(
            title = "",
            content = "",
            duration = 0
        )
    }
}
