package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
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
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .background(Color(0xFFEADDFF))
                .align(Alignment.TopStart)

        ){
            Column(
                modifier = Modifier.padding(16.dp).align(Alignment.Center)
            ) {
                Text(
                    text = "Text composable",
                    modifier= Modifier.padding(bottom = 16.dp).align(Alignment.CenterHorizontally),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold
                    )

                )
                Text(
                    text = "Display text and follows the recommended Material Design guidelines",
                    style = TextStyle(
                        textAlign = TextAlign.Justify
                    )
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .background(Color(0xFFD0BCFF))
                .align(Alignment.TopEnd)
        ){
            Column(
                modifier = Modifier.padding(16.dp).align(Alignment.Center)
            ) {
                Text(
                    text = "Image composable",
                    modifier= Modifier.padding(bottom = 16.dp).align(Alignment.CenterHorizontally),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold
                    )

                )
                Text(
                    text = "Creates a composable that lays out and draws a given painter class object",
                    style = TextStyle(
                        textAlign = TextAlign.Justify
                    )
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .background(Color(0xFFB69DF8))
                .align(Alignment.BottomStart)
        ){
            Column(
                modifier = Modifier.padding(16.dp).align(Alignment.Center)
            ) {
                Text(
                    text = "Row composable",
                    modifier= Modifier.padding(bottom = 16.dp).align(Alignment.CenterHorizontally),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold
                    )

                )
                Text(
                    text = "A layout composable that places its children in a horizontal sequence",
                    style = TextStyle(
                        textAlign = TextAlign.Justify
                    )
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .background(Color(0xFFF6EDFF))
                .align(Alignment.BottomEnd)
        ){
            Column(
                modifier = Modifier.padding(16.dp).align(Alignment.Center)
            ) {
                Text(
                    text = "Column composable",
                    modifier= Modifier.padding(bottom = 16.dp).align(Alignment.CenterHorizontally),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold
                    )

                )
                Text(
                    text = "A layout composable that places its children in a vertical sequence",
                    style = TextStyle(
                        textAlign = TextAlign.Justify
                    )
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Greeting("Android")
    }
}