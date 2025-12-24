package com.example.theory.presentation.topic

import com.example.com.example.devassistantai.viewmodel.BaseViewModel
import com.example.theory.presentation.topic.data.TopicState
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject

@HiltViewModel
class TopicViewModel @Inject constructor(

) : BaseViewModel<TopicState, Nothing>() {
    override fun initialState(): TopicState = TopicState.DEFAULT


}