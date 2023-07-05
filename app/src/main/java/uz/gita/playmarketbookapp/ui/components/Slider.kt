package uz.gita.playmarketbookapp.ui.components

/**
 *   Created by Jamik on 6/25/2023 ot 5:32 PM
 **/
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.gita.playmarketbookapp.R
import uz.gita.playmarketbookapp.data.model.*

@Composable
fun DataSliderView(booklist: List<BookData>, onClick: ((book: BookData) -> Unit)? = null) {

    Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
        IconButton(
            onClick = {
            if (SliderBook.Slide.value > 0) {
                SliderBook.Slide.value -= 1f
            } else {
                SliderBook.Slide.value = 4f
            }
        }) {
            Icon(
                modifier = Modifier.size(40.dp),
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = "back btn"
            )
        }
        Box(modifier = Modifier.weight(1f)) {
            AllBooksItem(book = booklist[SliderBook.Slide.value.toInt()], onClick = onClick)
        }
        IconButton(
            onClick = {
                if (SliderBook.Slide.value < 4) {
                    SliderBook.Slide.value += 1f
                } else {
                    SliderBook.Slide.value = 0f
                }
            }) {
            Icon(
                modifier = Modifier.size(40.dp),
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "back btn",
            )
        }
    }
}

@Preview
@Composable
fun PreviewDataSliderView() {
    val bookData = BookData(
        name = "Kitob nomi",
        bookUrl = "https://kitob.com/kitob",
        coverUrl = "https://kitob.com/cover",
        owner = "Kitob egasi",
        description = "Kitob haqida ma'lumot",
        reference = "Kitob haqida manba",
        onlineBookUrl = "",
        save = true
    )

    val list = ArrayList<BookData>()
    list.add(bookData)
    list.add(bookData)
    list.add(bookData)
    list.add(bookData)
    list.add(bookData)
    list.add(bookData)
    list.add(bookData)

    DataSliderView(booklist = list)
}
