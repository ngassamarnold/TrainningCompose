package com.app.trainning.ui.input

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import com.app.trainning.R

@Composable
fun EditNumberField(
    value: String,
    onValueChanged: (value: String) -> Unit,
) {

    TextField(
        label = {
            Text(text = stringResource(R.string.cost_of_service))
        },
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        modifier = Modifier.fillMaxWidth(),
        value = value,
        onValueChange = onValueChanged
    )
}