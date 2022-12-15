package com.app.trainning

import CardText
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.app.trainning.ui.theme.TestComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AppQuadrant()
                }
            }
        }
    }
}

@Composable
fun AppQuadrant(modifier: Modifier=Modifier){
    Column(
        modifier= modifier.fillMaxWidth()
    ) {
       Row(modifier.weight(1f)) {
           CardText(
               tile = stringResource(R.string.title_1),
               description = stringResource(R.string.description_quadrant_1),
               color=Color.Red,
               modifier=modifier
                   .weight(1f)
           )
           CardText(tile = stringResource(R.string.title_2),
               description = stringResource(R.string.description_quadrant_2),
               color=Color.Cyan,
               modifier=modifier
                   .weight(1f)
           )
       }
        Row(
            modifier
                .fillMaxWidth()
                .weight(1f)) {
            CardText(
                tile = stringResource(R.string.title_3),
                description = stringResource(R.string.description_quadrant_3),
                color=Color.Magenta,
                modifier=modifier
                    .weight(1f)
            )
            CardText(
                tile = stringResource(R.string.title_4),
                description = stringResource(R.string.description_quadrant_4),
                color=Color.LightGray,
                modifier=modifier
                    .weight(1f)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    TestComposeTheme {
        AppQuadrant()
    }
}