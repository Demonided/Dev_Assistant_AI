package com.example.theory.subject

import com.example.com.example.devassistantai.viewmodel.BaseViewState
import com.example.theory.subject.data.SubjectData

object SubjectContract {

    data class State(
        val subjects: List<SubjectData>
    ): BaseViewState {
        companion object {
            val DEFAULT = State(emptyList())
        }
    }
}