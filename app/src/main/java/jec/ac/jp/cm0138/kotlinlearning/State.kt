package jec.ac.jp.cm0138.kotlinlearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import jec.ac.jp.cm0138.kotlinlearning.ui.theme.KotlinLearningTheme
import kotlin.random.Random

class State : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnState()
        }
    }
}

@Composable
fun LearnState() {
    val color = remember {
        mutableStateOf(Color.Yellow)
    }
    Column (Modifier.fillMaxSize()) {
        ColorBox(
            Modifier
                .weight(1f)
                .fillMaxSize()
        ) {
            color.value = it
        }

        Box(modifier = Modifier
            .background(color.value)
            .weight(1f)
            .fillMaxSize()
        )
    }
}

@Composable
fun ColorBox(modifier: Modifier = Modifier
    , updateColor: (Color) -> Unit
) {
    Box(modifier = modifier
        .background(Color.Red)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        }
    )
}