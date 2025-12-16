package com.example.theory.subject.data

import com.example.com.example.devassistantai.viewmodel.BaseViewState

data class SubjectState(
    val subjects: SubjectData
) : BaseViewState {
    companion object {
        val DEFAULT = SubjectState(SubjectData.EMPTY)
    }
}