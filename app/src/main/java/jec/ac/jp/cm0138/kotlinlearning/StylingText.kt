package jec.ac.jp.cm0138.kotlinlearning

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import jec.ac.jp.cm0138.kotlinlearning.ui.theme.KotlinLearningTheme

class StylingText : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            stylingText()
        }
    }
}

@Composable
fun stylingText() {
    val fontFamily = FontFamily(
        Font(R.font.japanese_font, FontWeight.Thin)
    )

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF101010)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "こんにちは",
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = fontFamily,
            textAlign = TextAlign.End
        )
    }
}
