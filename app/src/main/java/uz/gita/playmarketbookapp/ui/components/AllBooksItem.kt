package uz.gita.playmarketbookapp.ui.components

import android.content.Context
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import coil.compose.AsyncImage
import coil.request.ImageRequest
import uz.gita.playmarketbookapp.R
import uz.gita.playmarketbookapp.data.model.BookData
import uz.gita.playmarketbookapp.ui.theme.PlayMarketBookAppTheme

/**
 *   Created by Jamik on 6/25/2023 ot 3:13 PM
 **/


private val listPlaceHolder = ArrayList<Int>()
private val listError = ArrayList<Int>()
private val listColor = ArrayList<Color>()

fun getPlaceHolder(): Int {
    if (listPlaceHolder.isEmpty()) {
        listPlaceHolder.add(R.drawable.book1)
        listPlaceHolder.add(R.drawable.book2)
        listPlaceHolder.add(R.drawable.book3)
        listPlaceHolder.add(R.drawable.book4)
        listPlaceHolder.add(R.drawable.book5)
    }
    listPlaceHolder.shuffle()
    return listPlaceHolder[0]
}

fun getError(): Int {
    if (listError.isEmpty()) {
        listError.add(R.drawable.book_net1)
        listError.add(R.drawable.book_net2)
        listError.add(R.drawable.book_net3)
        listError.add(R.drawable.book_net4)
    }
    listError.shuffle()
    return listError[0]
}

private fun getColorr(contex: Context): Color {

    if (listColor.isEmpty()) {
        listColor.add(Color.Green)
        listColor.add(Color.LightGray)
        listColor.add(Color(contex.getColor(R.color.teal_200)))
    }
    listColor.shuffle()
    return listColor[0]
}


@Preview
@Composable
private fun HmPrev() {

    val bookData = BookData(
        name = "Alpomish",
        bookUrl = "",
        coverUrl = "",
        owner = "I. M. Jamshidbek",
        description = "djjdjdjdjkdkkdkddddkdkdkkdkkdkdkdkdkkddkkddkdkkdkdkdkkdkkdkkkkkdjjdjdjdjkdkkdkddddkdkdkkdkkdkdkdkdkkddkkddkdkkdkdkdkkdkkdkkkkkdjjdjdjdjkdkkdkddddkdkdkkdkkdkdkdkdkkddkkddkdkkdkdkdkkdkkdkkkkkdjjdjdjdjkdkkdkddddkdkdkkdkkdkdkdkdkkddkkddkdkkdkdkdkkdkkdkkkkkdjjdjdjdjkdkkdkddddkdkdkkdkkdkdkdkdkkddkkddkdkkdkdkdkkdkkdkkkkkdjjdjdjdjkdkkdkddddkdkdkkdkkdkdkdkdkkddkkddkdkkdkdkdkkdkkdkkkkkdjjdjdjdjkdkkdkddddkdkdkkdkkdkdkdkdkkddkkddkdkkdkdkdkkdkkdkkkkkdjjdjdjdjkdkkdkddddkdkdkkdkkdkdkdkdkkddkkddkdkkdkdkdkkdkkdkkkkkdjjdjdjdjkdkkdkddddkdkdkkdkkdkdkdkdkkddkkddkdkkdkdkdkkdkkdkkkkkdjjdjdjdjkdkkdkddddkdkdkkdkkdkdkdkdkkddkkddkdkkdkdkdkkdkkdkkkkk",
        reference = "nmadurde",
        onlineBookUrl = "",
        save = false
    )

    val list = ArrayList<BookData>()

    list.add(bookData)
    list.add(bookData)
    list.add(bookData)
    list.add(bookData)
    list.add(bookData)
    list.add(bookData)
    list.add(bookData)

    PlayMarketBookAppTheme {
        Surface() {
            AllBooksItem(bookData)
        }
    }

}

@Composable
fun AllBooksItem(book: BookData, onClick: ((book: BookData) -> Unit)? = null) {

    val context = LocalContext.current
    val placeHolder = getPlaceHolder()
    val error = getError()
    val color = getColor()

    Card(
        modifier = Modifier
            .padding(10.dp)
            .height(200.dp),
        border = BorderStroke(1.dp, Color.Gray),
        colors = CardDefaults.cardColors(Color(context.getColor(R.color.white))),
        elevation = CardDefaults.outlinedCardElevation()
    ) {
        Row(
            modifier = Modifier
                .clickable { onClick?.invoke(book) }
                .padding(10.dp)
        ) {
            Card(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(120.dp)
                    .padding(10.dp),
                colors = CardDefaults.cardColors(color)
            ) {
                AsyncImage(
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(20.dp))
                        .padding(4.dp),
                    model = ImageRequest.Builder(LocalContext.current).data(book.coverUrl)
                        .crossfade(true).build(),
                    placeholder = painterResource(id = placeHolder),
                    error = painterResource(id = error),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp)
            ) {

                Text(
                    text = book.name.uppercase(),
                    color = Color(context.getColor(R.color.save_color)),
                    fontSize = 16.sp,
                    maxLines = 1,
                    fontWeight = FontWeight(900),
                    modifier = Modifier
                        .padding(top = 20.dp)
                )

                Text(
                    text = book.owner,
                    color = Color.DarkGray,
                    maxLines = 1,
                    fontSize = 8.sp,
                    fontWeight = FontWeight(700),
                    modifier = Modifier.padding(top = 8.dp)
                )

                Text(
                    text = book.description,
                    color = Color.DarkGray,
                    fontSize = 7.sp,
                    fontWeight = FontWeight(700),
                    modifier = Modifier.padding(top = 8.dp, end = 25.dp)
                )

            }

        }
    }
}





