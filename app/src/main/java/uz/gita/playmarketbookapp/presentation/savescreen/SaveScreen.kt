package uz.gita.playmarketbookapp.presentation.savescreen

import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.*
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.hilt.getViewModel
import coil.compose.AsyncImage
import coil.request.ImageRequest
import uz.gita.playmarketbookapp.R
import uz.gita.playmarketbookapp.data.model.BookData
import uz.gita.playmarketbookapp.ui.components.*
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.gita.playmarketbookapp.util.getCurrentActivity

/**
 *   Created by Jamik on 6/25/2023 ot 9:10 PM
 **/
class SaveScreen constructor(private val book: BookData) : AndroidScreen() {

//    val book = BookData(
//        "kamalov samandar boltayevning sarguzashtalri va ajdarlar bilan jangi munosabati bilan itob yozdik biz kelila",
//        "",
//        "",
//        "Xumora abdullajonov",
//        "bkjvbrjfbufbbvvbcjbdhjdhcbdjbjbbcjbdjbdjbjcdjbdjbjdbbufbudfh",
//        "",
//        false
//    )

    @Composable
    override fun Content() {
        val viewModel: SaveScreenContract.ViewModel = getViewModel<SaveScreenViewModel>()
        val uiState = viewModel.uiState.collectAsState()
        SaveContent(viewModel::onEvenDispatcher, uiState)
    }

    @OptIn(ExperimentalMaterialApi::class)
    @Composable
    fun SaveContent(
        onEvenDispatcher: (SaveScreenContract.Intent) -> Unit,
        uiState: State<SaveScreenContract.UiState>,
    ) {
        val context = LocalContext.current
        val placeHolder = getPlaceHolder()
        val error = getError()
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp),
                elevation = 50.dp,
                border = BorderStroke(2.dp, Color.Black),
                shape = ShapeDefaults.Large
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Spacer(modifier = Modifier.size(20.dp))
                    Image(
                        modifier = Modifier
                            .clip(RoundedCornerShape(70f))
                            .size(70.dp)
                            .padding(15.dp)
                            .clickable {
                                onEvenDispatcher(SaveScreenContract.Intent.BackToScreen)
                            },
                        painter = painterResource(id = R.drawable.back_ios_24),
                        contentDescription = null
                    )
                    Text(
                        modifier = Modifier.animateContentSize(),
                        text = "Kitob xaqida qisqacha malumot",
                        color = Color(context.getColor(R.color.save_color)),
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(900),
                        fontSize = 18.sp,
                        fontStyle = FontStyle.Italic,
                        maxLines = 1,
                        style = MaterialTheme.typography.body1
                    )
                }
            }

            LazyColumn(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .padding(horizontal = 15.dp)
                .weight(1f), content = {
                item {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp)
                            .padding(horizontal = 100.dp)
                            .padding(top = 20.dp),
                        shape = CardDefaults.elevatedShape,
                        elevation = 12.dp
                    ) {
                        AsyncImage(
                            modifier = Modifier
                                .clip(RoundedCornerShape(20.dp))
                                .fillMaxSize(),
                            model = ImageRequest.Builder(context = context).data(book.coverUrl)
                                .crossfade(true).build(),
                            placeholder = painterResource(id = placeHolder),
                            error = painterResource(id = error),
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                        )
                    }
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 25.dp, vertical = 10.dp)
                            .align(Alignment.CenterHorizontally),
                        text = book.name,
                        color = Color.Black,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(900),
                        fontSize = 26.sp,
                        fontStyle = FontStyle.Italic,
                        maxLines = 3,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.body1
                    )

                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 25.dp, vertical = 10.dp)
                            .align(Alignment.CenterHorizontally),
                        text = book.owner,
                        color = Color.Gray,
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight(900),
                        fontSize = 22.sp,
                        fontStyle = FontStyle.Italic,
                        maxLines = 3,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.body1
                    )

                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 5.dp)
                            .align(Alignment.CenterHorizontally),
                        text = book.description,
                        color = Color.DarkGray,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(900),
                        fontSize = 14.sp,
                        fontStyle = FontStyle.Normal,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.body1
                    )
                }
            })

            if (uiState.value.showOrHide) {
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Spacer(modifier = Modifier.weight(1f))
                    Text(text = uiState.value.progress.toInt().toString() + " %")
                    LinearProgressIndicator(
                        modifier = Modifier
                            .width(150.dp)
                            .padding(10.dp),
                        progress = uiState.value.progress / 100f,
                        color = Color.Green
                    )
                    Text(text = 100.toString() + " %")
                    Spacer(modifier = Modifier.weight(1f))
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 25.dp),
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Card(
                    modifier = Modifier
                        .weight(3f)
                        .height(50.dp), onClick = {
                        Toast.makeText(
                            context,
                            "Bu funksiyadan xozirda foydalanish mumkin emas",
                            Toast.LENGTH_SHORT
                        ).show()
                    }, shape = CardDefaults.elevatedShape, border = BorderStroke(0.5.dp, Color.Gray)
                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(top = 10.dp),
                        text = "Online o'qish",
                        color = Color(context.getColor(R.color.save_color)),
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(900),
                        fontSize = 18.sp,
                        fontStyle = FontStyle.Italic,
                        maxLines = 1,
                        textAlign = TextAlign.Center
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Card(
                    modifier = Modifier
                        .weight(3f)
                        .height(50.dp), onClick = {
                        if (uiState.value.progress == -1f || uiState.value.progress >= 100) {
                            if (book.save) {
                                onEvenDispatcher(SaveScreenContract.Intent.ReadScreenTo(book))
                            } else {
                                onEvenDispatcher(SaveScreenContract.Intent.SaveToBook(book))
                            }
                        }
                    }, shape = CardDefaults.elevatedShape, border = BorderStroke(0.5.dp, Color.Gray)
                ) {
                    if (book.save) {
                        Text(
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(top = 10.dp),
                            text = "Kitobni o'qish",
                            color = Color(context.getColor(R.color.save_color)),
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight(900),
                            fontSize = 18.sp,
                            fontStyle = FontStyle.Italic,
                            maxLines = 1,
                            textAlign = TextAlign.Center
                        )
                    } else {
                        Text(
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(top = 10.dp),
                            text = "Yuklab olish",
                            color = Color(context.getColor(R.color.save_color)),
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight(900),
                            fontSize = 18.sp,
                            fontStyle = FontStyle.Italic,
                            maxLines = 1,
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
            }
        }
    }


//    @Preview
//    @Composable
//    fun See() {
//        MaterialTheme() {
//            Surface(modifier = Modifier.fillMaxSize()) {
//                SaveContent({})
//            }
//        }
//    }
}
