package com.app.trainning.ui.tipTime

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.trainning.ui.input.EditNumberField
import java.text.NumberFormat

@Composable
fun TipTimeScreen(text1:Int, text2: Int) {
    var amountInput by remember { mutableStateOf("") }
    val amount = amountInput.toDoubleOrNull() ?: 0.0
    val tip = calculateTip(amount)

    val onValueChanged: (value: String) -> Unit = {
        amountInput = it
    }

    Column(
        modifier = Modifier.padding(32.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Text(
            text = stringResource(text1),
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(16.dp))
        EditNumberField(value = amountInput, onValueChanged = onValueChanged)
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = stringResource(text2, tip),
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

private fun calculateTip(
    amount: Double, tipPercent: Double = 15.0
): String {
    val tip = tipPercent / 100 * amount
    return NumberFormat.getCurrencyInstance().format(tip)
}