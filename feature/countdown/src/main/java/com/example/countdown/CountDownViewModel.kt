package com.example.countdown

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CountDownViewModel : ViewModel() {
    //backing field technique(encapsulation)
    private val _countdownState = mutableStateOf(CountdownStateModel())
    val countdownState :State<CountdownStateModel> = _countdownState

}

data class CountdownStateModel(
    val counterState: CounterState = CounterState.INITIAL,
    val workingState: WorkingState = WorkingState.REST,
    val remainTime: Int = REST_DURATION,
)

enum class CounterState() {
    INITIAL, START, PAUSE,
}

enum class WorkingState {
    REST, WORK,
}

const val REST_DURATION = 20
const val WORKING_DURATION = 20 * 60