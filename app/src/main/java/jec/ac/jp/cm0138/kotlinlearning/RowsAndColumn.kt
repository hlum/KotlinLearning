package jec.ac.jp.cm0138.kotlinlearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import jec.ac.jp.cm0138.kotlinlearning.ui.theme.KotlinLearningTheme

class RowsAndColumn : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColumnsAndRows()
        }
    }
}

@Composable
fun ColumnsAndRows() {
    Column (
        Modifier
//            .fillMaxSize(0.8f)
            .width(200.dp)
            .height(400.dp)
            .background(Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ){
        Text("Hello")
        Text("Word")
        Text("HI")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    KotlinLearningTheme {
        ColumnsAndRows()
    }
}