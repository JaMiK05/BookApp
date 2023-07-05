package uz.gita.playmarketbookapp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.*
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import coil.compose.AsyncImage
import coil.request.ImageRequest
import uz.gita.playmarketbookapp.R
import uz.gita.playmarketbookapp.data.model.*
import uz.gita.playmarketbookapp.ui.theme.PlayMarketBookAppTheme

/**
 *   Created by Jamik on 6/25/2023 ot 1:19 AM
 **/

private val listPlaceHolder = ArrayList<Int>()
private val listError = ArrayList<Int>()
private val listColor = ArrayList<Color>()

fun getColor(): Color {

    if (listColor.isEmpty()) {
        listColor.add(Color.Blue)
        listColor.add(Color.Yellow)
        listColor.add(Color.Green)
        listColor.add(Color.Gray)
        listColor.add(Color.Magenta)
    }
    listColor.shuffle()
    return listColor[0]
}

@Preview
@Composable
private fun HmPrev() {

    val bookData = BookData(
        name = "Alpomish ddkdkdkkkdkkkkddkdkkdkkk",
        bookUrl = "",
        coverUrl = "",
        owner = "I. M. Jamshidbek",
        description = "djjdjdjdjjdjdjjdjdddddddddddddddddjjdjjjdjdjdj",
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

    val category = CategoryData(
        name = "Books", list = arrayListOf()
    )

    val data = HomeItemData(
        category, list
    )

    PlayMarketBookAppTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            HomeItem(data) {}
        }
    }

}

@Composable
fun HomeItem(data: HomeItemData, onClick: ((book: BookData) -> Unit)? = null) {

    val myColor = Color.Black

    Column(modifier = Modifier.clickable {}) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = data.category.name,
                color = myColor,
                fontSize = 15.sp,
                fontWeight = FontWeight(900),
                modifier = Modifier.padding(start = 25.dp, top = 20.dp, bottom = 20.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = data.list.size.toString() + " book",
                color = myColor,
                fontSize = 10.sp,
                fontWeight = FontWeight(900),
                fontStyle = FontStyle.Italic,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.padding(end = 25.dp, top = 20.dp, bottom = 20.dp)
            )

        }
        LazyRow(content = {
            items(data.list) {
                Item(book = it, onClick = onClick)
            }

        })

    }
}

@Composable
fun Item(book: BookData, onClick: ((book: BookData) -> Unit)? = null) {
    val cn = LocalContext.current
    val placeHolder = getPlaceHolder()
    val error = getError()
    val color = getColor()

    Card(
        modifier = Modifier
            .padding(start = 10.dp),
        border = BorderStroke(1.dp, Color.Gray),
        elevation = CardDefaults.outlinedCardElevation(),
        colors = CardDefaults.cardColors(Color(cn.getColor(R.color.white)))
    ) {
        Column(
            modifier = Modifier
                .padding(start = 5.dp)
                .width(150.dp)
                .height(250.dp)
                .clickable { onClick?.invoke(book) },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(10.dp),
                colors = CardDefaults.cardColors(color)
            ) {
                AsyncImage(
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(20.dp))
                        .padding(2.dp),
                    model = ImageRequest.Builder(LocalContext.current).data(book.coverUrl)
                        .crossfade(true).build(),
                    placeholder = painterResource(id = placeHolder),
                    error = painterResource(id = error),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                )
            }
            Text(
                text = book.name.uppercase(),
                color = Color.Black,
                fontSize = 10.sp,
                maxLines = 2,
                letterSpacing = TextUnit(2f, TextUnitType.Sp),
                lineHeight = TextUnit(15f, TextUnitType.Sp),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight(900),
                modifier = Modifier.padding(top = 8.dp)
            )

            Text(
                text = book.owner,
                color = Color.DarkGray,
                maxLines = 2,
                fontSize = 8.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight(700),
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }
    }
}

