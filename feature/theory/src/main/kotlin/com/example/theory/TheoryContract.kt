package com.example.theory

import com.example.base.viewmodel.BaseViewState

object TheoryContract {

    data class State(
        val screenName: String
    ): BaseViewState {
        companion object {
            val DEFAULT = State("")
        }
    }
}