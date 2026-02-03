package com.example.theory.common.ui.components.data

import com.example.com.example.devassistantai.viewmodel.BaseViewState
import com.example.theory.presentation.subject.ui.model.StatisticsModel
import com.example.theory.presentation.subject.ui.model.SubjectModel

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
