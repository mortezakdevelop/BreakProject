package com.example.countdown

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.countdown.component.Counter
import com.example.designsystem.theme.ComposeBreakTheme


@Composable
fun CountDownRoute(
    viewModel: CountDownViewModel
) {
    CountDownScreen(minute = "19", second = "39")
}


@Composable
fun CountDownScreen(
    minute: String,
    second: String,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Counter(minute = minute, second = second )
    }
}


@Preview(showSystemUi = true)
@Composable
private fun CountDownScreenPreview() {
    ComposeBreakTheme {
        Surface {
            CountDownScreen(minute = "19", second = "39")
        }
    }
}