package com.example.jetpackcomposearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposearticle.ui.theme.JetPackComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = stringResource(R.string.article_heading),
            modifier = Modifier
                .align(Alignment.Start)
                .padding(top = 30.dp, bottom = 15.dp, start = 15.dp),
            style = TextStyle(
                fontSize = 25.sp, // Use sp (scale-independent pixels) for font size
                fontWeight = FontWeight.Bold

            )
        )
        Text(
            text = stringResource(R.string.para_one),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(15.dp),
            style = TextStyle(
                fontSize = 20.sp, // Use sp (scale-independent pixels) for font size
                color = androidx.compose.ui.graphics.Color.Black,
                textAlign = TextAlign.Justify
            )
        )
        Text(
            text = stringResource(R.string.para_two),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(15.dp),
            style = TextStyle(
                fontSize = 20.sp, // Use sp (scale-independent pixels) for font size
                color = androidx.compose.ui.graphics.Color.Black,
                textAlign = TextAlign.Justify
            )
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComposeArticleTheme {
        Greeting("Android")
    }
}