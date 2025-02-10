package jec.ac.jp.cm0138.kotlinlearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import jec.ac.jp.cm0138.kotlinlearning.ui.theme.KotlinLearningTheme

class LearnModifiers : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            learnModifiers()
        }
    }
}

@Composable
fun learnModifiers() {
    Column(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxHeight(0.5f)
            .fillMaxWidth()
            .border(5.dp,Color.Magenta)
            .padding(30.dp)

    ) {
        Text("Hello", modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .background(Color.Red)
            .padding(10.dp)
            .clickable {

            })
        Spacer(modifier = Modifier.height(50.dp))
        Text("World")
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    KotlinLearningTheme {
        learnModifiers()
    }
}