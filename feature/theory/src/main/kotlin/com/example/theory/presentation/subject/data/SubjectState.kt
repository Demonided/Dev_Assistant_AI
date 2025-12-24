package com.example.theory.presentation.subject.data

import com.example.com.example.devassistantai.viewmodel.BaseViewState
import com.example.theory.presentation.subject.ui.model.StatisticsModel
import com.example.theory.presentation.subject.ui.model.SubjectModel

data class SubjectState(
    var subjectItems: List<SubjectModel>,
    val statisticsModel: StatisticsModel
) : BaseViewState {
    companion object {
        val DEFAULT = SubjectState(
            subjectItems = emptyList(),
            statisticsModel = StatisticsModel(0, 0, 0)
        )
    }
}
