package uz.gita.playmarketbookapp.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 *   Created by Jamik on 6/30/2023 ot 7:40 PM
 **/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search(
    function: ((str: String) -> Unit)? = null,
) {
    var str by remember { mutableStateOf("") }
    TextField(modifier = Modifier.fillMaxWidth(),
        value = str,
        onValueChange = {
            str = it
            function?.invoke(it)
        },
        colors = TextFieldDefaults.textFieldColors(
            disabledTextColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        placeholder = { Text(text = "Search", color = Color.Gray) },
        singleLine = true,
        shape = RoundedCornerShape(16.dp),
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
        })

}

@Preview
@Composable
fun SerachPrev() {
    MaterialTheme() {
        Surface(modifier = Modifier.fillMaxSize()) {
            Card(modifier = Modifier.height(70.dp)) {
                Search() {}
            }
        }
    }
}