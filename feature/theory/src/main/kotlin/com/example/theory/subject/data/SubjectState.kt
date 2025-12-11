package com.example.theory.subject.data

import com.example.com.example.devassistantai.viewmodel.BaseViewState

data class SubjectState(
    val subjects: List<SubjectData>
) : BaseViewState {
    companion object {
        val DEFAULT = SubjectState(emptyList())
    }
}