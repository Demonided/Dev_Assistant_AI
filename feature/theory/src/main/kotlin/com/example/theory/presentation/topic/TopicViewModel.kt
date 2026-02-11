package com.example.theory.presentation.topic

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewModelScope
import com.devassistantai.domain.usecase.GetAllTopicsBySubjectIdUseCase
import com.example.com.example.devassistantai.viewmodel.BaseViewModel
import com.example.theory.presentation.mapper.toTopicModel
import com.example.theory.presentation.topic.data.TopicState
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch

@HiltViewModel
class TopicViewModel @Inject constructor(
    private val getAllTopicsBySubjectIdUseCase: GetAllTopicsBySubjectIdUseCase
) : BaseViewModel<TopicState, Nothing>() {
    override fun initialState(): TopicState = TopicState.DEFAULT

    fun loadData(subjectId: String, subjectTitle: String, subjectDescription: String) {
        viewModelScope.launch(Dispatchers.IO) {
            getAllTopicsBySubjectIdUseCase(subjectId = subjectId)
                .onStart {
                    updateState { copy(isLoading = true) }
                }
                .catch { error -> updateState { copy(isLoading = false, errorMessage = "Fail to load Topics") } }
                .collect { topics ->
                    updateState {
                        copy(
                            subjectName = subjectTitle,
                            subjectDescription = subjectDescription,
                            topics = topics.toTopicModel(),
                            isLoading = false,
                            color = listOf(Color(0xFFad46ff), Color(0xFF9810fa))
                        )
                    }
                }
        }
    }
}