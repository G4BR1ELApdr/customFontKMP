package org.insights.project.conf

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import fontstyles.composeapp.generated.resources.REM_Italic
import fontstyles.composeapp.generated.resources.REM_Regular
import fontstyles.composeapp.generated.resources.REM_SemiBold
import fontstyles.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font


@Composable
fun TitleInsight(
    text: String,
) {
    Text(
        text = text,
        color = Color(0xFF140f2f),
        fontWeight = FontWeight.SemiBold,
        fontFamily = FontFamily(Font(Res.font.REM_SemiBold)),
    )
}

@Composable
fun SubTitleInsight(
    text: String,
) {
    Text(
        text = text,
        color = Color(0xFF140f2f),
        fontWeight = FontWeight.Normal,
        fontFamily = FontFamily(Font(Res.font.REM_Italic)),
    )
}
@Composable
fun ParagraphInsight(
    text: String,
) {
    Text(
        text = text,
        color = Color(0xFF140f2f),
        fontWeight = FontWeight.Normal,
        fontFamily = FontFamily(Font(Res.font.REM_Regular)),
    )
}