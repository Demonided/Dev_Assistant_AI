package com.example.theory

import com.example.com.example.devassistantai.viewmodel.BaseViewModel

class TheoryViewModel: BaseViewModel<TheoryContract.State, Nothing>() {

    override fun initialState(): TheoryContract.State = TheoryContract.State.DEFAULT

    init {
        updateState {
            copy(screenName = "Theory screen")
        }
    }
}