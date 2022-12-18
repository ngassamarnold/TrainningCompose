package com.app.trainning

import LemonTextAndImage
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.app.trainning.dto.Lemon
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
                    LemonadeApp()
                }
            }
        }
    }
}

@Composable
fun LemonadeApp(){
    initLemonApp(modifier= Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun initLemonApp(modifier:Modifier= Modifier){
    var numberRadom= 0
    var lemon:Lemon
    var step by remember { mutableStateOf(1) }
    lemon = when(step){
        1-> Lemon(title =stringResource(R.string.tap_lemon), image = R.drawable.lemon_tree)
        2-> {
            if(numberRadom==0) numberRadom = (2..4).random()
            Lemon(title =stringResource(R.string.keep_tapping), image = R.drawable.lemon_squeeze)
        }
        3-> Lemon(title =stringResource(R.string.lemonade_to_drink), image = R.drawable.lemon_drink)
        else -> Lemon(title =stringResource(R.string.start_again), image = R.drawable.lemon_restart)
    }

    val imageClick: () -> Unit ={
         when(step){
             1, 3-> step++
             2-> {
                 numberRadom--
                 if (numberRadom == 0) {
                     step++
                 }
             }
            else-> step=1
         }
    }
    LemonTextAndImage(lemon,modifier=modifier,onImageClick=imageClick)
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    TestComposeTheme {
        LemonadeApp()
    }
}