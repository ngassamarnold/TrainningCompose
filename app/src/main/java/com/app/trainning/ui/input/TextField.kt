package com.app.trainning.ui.input

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import com.app.trainning.R

@Composable
fun EditNumberField(
    value: String,
    onValueChanged: (value: String) -> Unit,
    @StringRes placeholder: Int = R.string.cost_of_service,
    keyboardOptions: KeyboardOptions,
    keyboardActions: KeyboardActions
) {

    TextField(
        label = {
            Text(text = stringResource(id = placeholder))
        },
        singleLine = true,
        keyboardOptions = keyboardOptions,
        keyboardActions=keyboardActions,
        modifier = Modifier.fillMaxWidth(),
        value = value,
        onValueChange = onValueChanged
    )
}