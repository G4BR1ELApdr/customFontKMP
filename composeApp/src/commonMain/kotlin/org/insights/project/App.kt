package org.insights.project

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import fontstyles.composeapp.generated.resources.LogoInsights
import fontstyles.composeapp.generated.resources.Res
import org.insights.project.conf.ParagraphInsight
import org.insights.project.conf.SubTitleInsight
import org.insights.project.conf.TitleInsight
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(
            Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color(0xFFE1EAF7), Color(0xFF93A6C4))
                    )
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(Res.drawable.LogoInsights),
                contentDescription = null,
                modifier = Modifier.size(150.dp)
            )
            Box(
                modifier = Modifier
                    .padding(horizontal = 24.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    TitleInsight("Hi KMP developers")
                    ParagraphInsight("Feel free to customize your app's typography by integrating custom fonts. With just a few steps, you can enhance your app's look and feel. Happy coding!")
                    SubTitleInsight("Follow me on Instagram at @ux_ui_insights")
                }

            }
        }
    }
}
