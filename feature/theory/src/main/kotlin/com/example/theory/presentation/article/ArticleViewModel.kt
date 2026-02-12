package com.example.theory.presentation.article

import androidx.lifecycle.viewModelScope
import com.devassistantai.domain.usecase.GetArticleByTopicIdUseCase
import com.example.com.example.devassistantai.viewmodel.BaseViewModel
import com.example.theory.presentation.article.state.ArticleState
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch

@HiltViewModel
class ArticleViewModel @Inject constructor(
    private val getArticleByTopicIdUseCase: GetArticleByTopicIdUseCase
) : BaseViewModel<ArticleState, Nothing>() {
    override fun initialState() = ArticleState.DEFAULT

    fun loadState(topicId: String) {
        viewModelScope.launch(Dispatchers.IO) {
            getArticleByTopicIdUseCase(topicId = topicId)
                .onStart { updateState { copy(isLoading = true) } }
                .catch { error -> updateState { copy(isLoading = false, errorMessage = "Fail to load Topics") } }
                .collect { article ->
                    updateState {
                        copy(
                            title = article.topicTitle,
                            content = article.content,
                            duration = article.topicDuration,
                            isLoading = false
                        )
                    }
                }
        }
    }
}