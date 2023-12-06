package com.example.countdown.component

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.countdown.CounterState
import com.example.designsystem.ThemesPreview
import com.example.designsystem.theme.ComposeBreakTheme

@Composable
fun Counter(
    counterState: CounterState,
) {
    val minutes by remember {
        mutableStateOf("")
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {

        //CustomCountdownText(text = minute)

        Text(
            text = " : ",
            fontWeight = FontWeight.Bold
        )

        //CustomCountdownText(text = second)
    }
}

@ThemesPreview
@Composable
private fun CounterScreen() {
    ComposeBreakTheme {
        Surface {
            //Counter(minute = "19", second = "25")
        }
    }
}