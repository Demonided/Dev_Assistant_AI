package com.example.theory.presentation.subject.state

import com.example.com.example.devassistantai.viewmodel.BaseViewState
import com.example.theory.presentation.subject.model.StatisticsModel
import com.example.theory.presentation.subject.model.SubjectModel

data class SubjectState(
    val isSubjectsLoading: Boolean,
    val isStatisticsLoading: Boolean,
    var subjectItems: List<SubjectModel>,
    val statisticsModel: StatisticsModel,
    val errorMessage: String? = null
) : BaseViewState {
    companion object {
        val DEFAULT = SubjectState(
            isSubjectsLoading = false,
            isStatisticsLoading = false,
            subjectItems = emptyList(),
            statisticsModel = StatisticsModel(0, 0, 0),
            errorMessage = null
        )
    }
}
