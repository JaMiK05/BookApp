package uz.gita.playmarketbookapp.ui.components

import android.R
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import uz.gita.playmarketbookapp.data.model.BookData
import uz.gita.playmarketbookapp.ui.theme.OnBackgroundColor
import uz.gita.playmarketbookapp.ui.theme.OnPrimaryColor
import uz.gita.playmarketbookapp.ui.theme.PrimaryColor


@Composable
fun BookItem(
    modifier: Modifier = Modifier,
    book: BookData,
    onClick: () -> Unit
) {

    val context = LocalContext.current
    val placeHolder = getPlaceHolder()
    val error = getError()
    val color = getColor()

    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(160.dp)
            .padding(horizontal = 12.dp, vertical = 8.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = OnBackgroundColor,
            contentColor = MaterialTheme.colorScheme.onPrimary
        ),

    ) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Row(modifier = Modifier
                .wrapContentSize()
                .padding(12.dp),
                verticalAlignment = Alignment.Top
            ) {
                AsyncImage(
                    modifier = Modifier
                        .size(100.dp)
                        .clip(RoundedCornerShape(12.dp)),
                    model = ImageRequest.Builder(LocalContext.current).data(book.coverUrl)
                        .crossfade(true).build(),
                    placeholder = painterResource(id = placeHolder),
                    error = painterResource(id = error),
                    contentDescription = null,
                    contentScale = ContentScale.Inside,
                )
                Spacer(modifier = Modifier.weight(1f))
                Column(
                    modifier = Modifier.padding(start = 8.dp),
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        text = book.name,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.SemiBold,
                    )
                    Text(
                        text = book.owner,
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = book.description,
                        style = MaterialTheme.typography.bodySmall,
                        color = PrimaryColor,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }

}

@Preview
@Composable
fun BookItemPreview() {
    val bookData = BookData(
        name = "Alpomish",
        bookUrl = "",
        coverUrl = "",
        owner = "I. M. Jamshidbek",
        description = "This book referes how is good written ith same text and other things such as driving some skills like a bright effect",
        reference = "nmadurde",
        onlineBookUrl = "",
        save = false
    )

    BookItem(book = bookData) {

    }
}