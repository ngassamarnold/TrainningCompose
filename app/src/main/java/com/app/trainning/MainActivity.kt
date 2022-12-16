package com.app.trainning

import CardBusiness
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
                    AppCardBusiness()
                }
            }
        }
    }
}


@Composable
fun AppCardBusiness(){
    val image= painterResource(R.drawable.android_logo)
    CardBusiness(
        name = stringResource(R.string.name),
        position = stringResource(R.string.position),
        picture = image,
        phone = stringResource(R.string.phone),
        email = stringResource(R.string.email),
        share = stringResource(R.string.share)
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    TestComposeTheme {
        AppCardBusiness()
    }
}