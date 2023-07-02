package uz.gita.playmarketbookapp.ui.components

/**
 *   Created by Jamik on 6/25/2023 ot 5:32 PM
 **/
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.gita.playmarketbookapp.R
import uz.gita.playmarketbookapp.data.model.BookData
import uz.gita.playmarketbookapp.data.model.SliderBook
import uz.gita.playmarketbookapp.presentation.homescreen.allbooks.AllBooksContract
import uz.gita.playmarketbookapp.util.myLog

@Composable
fun DataSliderView(booklist: List<BookData>, onClick: ((book: BookData) -> Unit)? = null) {

    Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
        Image(
            modifier = Modifier
                .size(40.dp)
                .clickable {
                    if (SliderBook.Slide.value > 0) {
                        SliderBook.Slide.value -= 1f
                    } else {
                        SliderBook.Slide.value = 4f
                    }
                },
            painter = painterResource(id = R.drawable.left_arrow),
            contentDescription = null
        )
        Box(modifier = Modifier.weight(1f)) {
            AllBooksItem(book = booklist[SliderBook.Slide.value.toInt()], onClick = onClick)
        }
        Image(
            modifier = Modifier
                .size(40.dp)
                .clickable {
                    if (SliderBook.Slide.value < 4) {
                        SliderBook.Slide.value += 1f
                    } else {
                        SliderBook.Slide.value = 0f
                    }
                },
            painter = painterResource(id = R.drawable.next_arrow),
            contentDescription = null
        )
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
