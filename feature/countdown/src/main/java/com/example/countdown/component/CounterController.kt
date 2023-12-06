package com.example.countdown.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.countdown.CounterState
import com.example.designsystem.ThemesPreview
import com.example.designsystem.theme.ComposeBreakTheme

@Composable
fun CounterController(
    counterState: CounterState,
    onResetClicked: () -> Unit,
    onStartClicked: () -> Unit,
) {

    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
    ){
        Button(
            modifier = Modifier.fillMaxWidth(0.3f),
            onClick =
        {  when(counterState){
            CounterState.INITIAL -> onStartClicked()
            CounterState.START -> onResetClicked()
            CounterState.PAUSE -> onResetClicked()
        }
        }
        ) {
            Icon(
                imageVector = when(counterState){
                    CounterState.INITIAL -> Icons.Default.PlayArrow
                    CounterState.START -> Icons.Default.Close
                    CounterState.PAUSE ->  Icons.Default.PlayArrow
                },
                contentDescription = null,
            )
        }
    }
}

@ThemesPreview
@Composable
fun CounterControllerPreview() {
    ComposeBreakTheme {
        Surface {
            CounterController(
                counterState = CounterState.INITIAL,
                onResetClicked = {},
                onStartClicked = {},
            )
        }
    }
}