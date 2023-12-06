package com.example.countdown

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.countdown.component.Counter
import com.example.countdown.component.CounterController
import com.example.designsystem.theme.ComposeBreakTheme


@Composable
fun CountDownRoute(
    viewModel: CountDownViewModel
) {
    //CountDownScreen(minute = "19", second = "39")
}


@Composable
fun CountDownScreen(
    counterState: CounterState,
    onStartCLicked: () -> Unit,
    onResetClicked: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Counter(minute = "19", second = "39" )
        Spacer(modifier = Modifier.height(16.dp))
        CounterController(
            counterState = counterState,
            onResetClicked = {},
            onStartClicked = {},

            )
    }
}


@Preview(showSystemUi = true)
@Composable
private fun CountDownScreenPreview() {
    ComposeBreakTheme {
        Surface {
            CountDownScreen(
                counterState = CounterState.INITIAL,
                onStartCLicked = {},
                onResetClicked = {},
            )
        }
    }
}