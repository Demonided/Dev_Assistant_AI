package com.example.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.update

abstract class BaseViewModel<State : BaseViewState, Event : BaseEvent> : ViewModel() {
    private val _state = MutableStateFlow(initialState())
    val state: StateFlow<State> = _state.asStateFlow()

    private val _events = Channel<Event>(Channel.BUFFERED)
    val events: Flow<Event> = _events.receiveAsFlow()

    protected fun updateState(update: State.() -> State) {
        _state.update { it.update() }
    }

    protected fun sendEvent(event: Event) {
        _events.trySend(event)
    }

    final override fun onCleared() {
        super.onCleared() // viewModelScope отменяется автоматически
        onClearedViewModel()
    }

    /**
     * Optional: override if you need custom cleanup in subclasses.
     */
    protected open fun onClearedViewModel() {}

    abstract fun initialState(): State
}