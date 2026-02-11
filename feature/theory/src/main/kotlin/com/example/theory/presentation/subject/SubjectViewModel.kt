package com.example.theory.presentation.subject

import androidx.lifecycle.viewModelScope
import com.devassistantai.domain.usecase.GetStatisticsUseCase
import com.devassistantai.domain.usecase.GetSubjectsListUseCase
import com.example.com.example.devassistantai.viewmodel.BaseViewModel
import com.example.theory.common.ui.components.data.SubjectState
import com.example.theory.presentation.mapper.toStatisticsModel
import com.example.theory.presentation.mapper.toSubjectModel
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch

@HiltViewModel
class SubjectViewModel @Inject constructor(
    private val getAllSubjects: GetSubjectsListUseCase,
    private val getStatistics: GetStatisticsUseCase
) : BaseViewModel<SubjectState, Nothing>() {

    override fun initialState(): SubjectState = SubjectState.DEFAULT

    init {
        loadData()
    }

    private fun loadData() {
        viewModelScope.launch {
            getAllSubjects()
                .onStart { updateState { copy(isSubjectsLoading = true) } }
                .catch { error -> updateState { copy(isSubjectsLoading = false, errorMessage = "Fail to load Subjects") } }
                .collect { subjects ->
                    updateState {
                        copy(
                            isSubjectsLoading = false,
                            subjectItems = subjects.toSubjectModel()
                        )
                    }
                }
        }

        viewModelScope.launch {
            getStatistics()
                .onStart { updateState { copy(isStatisticsLoading = true) } }
                .catch { error -> updateState { copy(isSubjectsLoading = false, errorMessage = "Fail to load Statistic") } }
                .collect { statistics ->
                    updateState {
                        copy(
                            isStatisticsLoading = false,
                            statisticsModel = statistics.toStatisticsModel()
                        )
                    }
                }
        }
    }
}