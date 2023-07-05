package uz.gita.playmarketbookapp.ui.components

import androidx.compose.foundation.clickable
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
    modifier: Modifier = Modifier,
    onCLick: (() -> Unit)? = null,
    function: ((str: String) -> Unit)? = null,
) {
    var str by remember { mutableStateOf("") }
    TextField(modifier = modifier,
        value = str,
        onValueChange = {
            str = it
            function?.invoke(it)
        },
        colors = TextFieldDefaults.textFieldColors(
            disabledTextColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            containerColor = MaterialTheme.colorScheme.primary.copy(0.5f),
            textColor = MaterialTheme.colorScheme.onPrimary
        ),
        placeholder = { Text(text = "Search", color = MaterialTheme.colorScheme.onPrimary.copy(0.7f)) },
        singleLine = true,
        shape = RoundedCornerShape(8.dp),
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