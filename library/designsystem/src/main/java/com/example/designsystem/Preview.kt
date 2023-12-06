package com.example.designsystem

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(name = "Light" , showBackground = true, backgroundColor = 0xFFFFFFFF)
@Preview(name = "Dark" , showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES, backgroundColor = 0xFFFFFFFF)

annotation class ThemesPreview

@Preview(name = "phone", device = "spec:width=411dp,height=891dp")
annotation class DevicePreviews
