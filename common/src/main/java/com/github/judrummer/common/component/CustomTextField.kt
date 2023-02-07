package com.github.judrummer.common.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.judrummer.common.theme.AppTheme

@Composable
fun CustomTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    error: String? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
) {
    Box(modifier = modifier) {
        Column(
            modifier = modifier.fillMaxWidth()
        ) {
            TextField(
                value = value,
                onValueChange = onValueChange,
                modifier = Modifier.fillMaxWidth(),
                label = { Text(label) },
                isError = error.isNullOrBlank().not(),
                visualTransformation = visualTransformation,
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = error.orEmpty(),
                style = MaterialTheme.typography.caption.copy(color = MaterialTheme.colors.error),
            )
        }
    }
}

@Composable
@Preview(group = "TextField", name = "Empty", showBackground = true)
fun Preview_CustomTextField_Empty() = AppTheme {
    CustomTextField(value = "", onValueChange = {}, label = "Label")
}

@Composable
@Preview(group = "TextField", name = "Empty - Error", showBackground = true)
fun Preview_CustomTextField_Empty_Error() = AppTheme {
    CustomTextField(value = "", onValueChange = {}, label = "Label", error = "Required this field")
}

@Composable
@Preview(group = "TextField", name = "Value", showBackground = true)
fun Preview_CustomTextField_Value() = AppTheme {
    CustomTextField(value = "Value", onValueChange = {}, label = "Label")
}

@Composable
@Preview(group = "TextField", name = "Value - Error", showBackground = true)
fun Preview_CustomTextField_Value_Error() = AppTheme {
    CustomTextField(value = "Value", onValueChange = {}, label = "Label", error = "Invalid value")
}

@Composable
@Preview(group = "TextField", name = "Password", showBackground = true)
fun Preview_CustomTextField_Password() = AppTheme {
    CustomTextField(
        value = "123456", onValueChange = {}, label = "Label",
        visualTransformation = PasswordVisualTransformation(),
    )
}

@Composable
@Preview(group = "TextField", name = "Password - Error", showBackground = true)
fun Preview_CustomTextField_Password_Error() = AppTheme {
    CustomTextField(
        value = "123456",
        onValueChange = {},
        label = "Label",
        visualTransformation = PasswordVisualTransformation(),
        error = "Invalid password"
    )
}