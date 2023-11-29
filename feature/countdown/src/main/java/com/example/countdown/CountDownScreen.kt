package com.example.countdown

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.designsystem.theme.ComposeBreakTheme


@Composable
fun CountDownRoute(
    viewModel: CountDownViewModel
) {

}


@Composable
fun CountDownScreen(
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

    }
}


@Preview(showSystemUi = true)
@Composable
private fun CountDownScreenPreview() {
    ComposeBreakTheme {
        CountDownScreen()
    }
}