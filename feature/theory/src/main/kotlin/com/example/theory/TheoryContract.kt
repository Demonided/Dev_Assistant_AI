package com.example.theory

import com.example.com.example.devassistantai.viewmodel.BaseViewState

object TheoryContract {

    data class State(
        val screenName: String
    ): BaseViewState {
        companion object {
            val DEFAULT = State("")
        }
    }
}