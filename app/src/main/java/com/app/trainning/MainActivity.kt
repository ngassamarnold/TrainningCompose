package com.app.trainning

import LemonTextAndImage
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.trainning.dto.Lemon
import com.app.trainning.ui.theme.TestComposeTheme
import java.util.Objects

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
    var lemon=Lemon()
    var step by remember { mutableStateOf(1) }
    lemon = when(step){
        1-> {
            lemon.title=stringResource(R.string.tap_lemon)
            lemon.image= R.drawable.lemon_tree
            lemon
        }
        2-> {
            if(numberRadom==0) numberRadom = (2..4).random()
            lemon.title=stringResource(R.string.keep_tapping)
            lemon.image= R.drawable.lemon_squeeze
            lemon
        }
        3-> {
            lemon.title=stringResource(R.string.lemonade_to_drink)
            lemon.image= R.drawable.lemon_drink
            lemon
        }
        else -> {
            lemon.title=stringResource(R.string.start_again)
            lemon.image= R.drawable.lemon_restart
            lemon
        }
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