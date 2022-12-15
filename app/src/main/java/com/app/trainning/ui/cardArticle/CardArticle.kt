package com.app.trainning.ui.cardArticle

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HeaderImg(image: Painter){
    Image(
        painter = image,
        contentDescription =null,
    )
}

@Composable
fun AticleCard(image: Painter, title:String, description:String, content:String, modifier: Modifier = Modifier){
    Column(modifier=modifier) {
        HeaderImg(image)
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = description,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = content,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}