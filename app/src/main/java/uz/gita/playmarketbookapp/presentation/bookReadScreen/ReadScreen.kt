package uz.gita.playmarketbookapp.presentation.bookReadScreen

import android.os.Build.VERSION.SDK_INT
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.*
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.hilt.getViewModel
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import coil.decode.*
import coil.request.ImageRequest
import uz.gita.playmarketbookapp.R
import uz.gita.playmarketbookapp.data.model.BookData
import uz.gita.playmarketbookapp.util.loadpdf.*

/**
 *   Created by Jamik on 6/27/2023 ot 6:25 PM
 **/
class ReadScreen constructor(val book: BookData) : AndroidScreen() {

    @Composable
    override fun Content() {
        val viewModel: ReadBookContract.ViewModel = getViewModel<ReadScreenViewModel>()
        val context = LocalContext.current
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
                            .size(70.dp)
                            .padding(15.dp)
                            .clickable {
                                viewModel.onEventDispatcher(ReadBookContract.Intent.BackToScreen)
                            }
                            .clip(CircleShape),
                        painter = painterResource(id = R.drawable.back_ios_24),
                        contentDescription = null
                    )
                    Text(
                        modifier = Modifier.animateContentSize(),
                        text = book.name,
                        color = Color(context.getColor(R.color.save_color)),
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(900),
                        fontSize = 18.sp,
                        fontStyle = FontStyle.Italic,
                        maxLines = 1,
                    )
                }
            }
            ReadContent()
        }
    }

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    private fun ReadContent() {
        val context = LocalContext.current
        var isLoading by remember {
            mutableStateOf(false)
        }
        var currentLoadingPage by remember {
            mutableStateOf<Int?>(null)
        }
        var pageCount by remember {
            mutableStateOf<Int?>(null)
        }
        val myPdf = getInputStream(context, "${book.reference}.pdf")
        Box {
            PdfViewer(
                modifier = Modifier.fillMaxWidth(),
                pdfStream = myPdf,
                listDirection = PdfListDirection.VERTICAL,
                loadingListener = { loading, currentPage, maxPage ->
                    isLoading = loading
                    if (currentPage != null) currentLoadingPage = currentPage
                    if (maxPage != null) pageCount = maxPage
                }
            )
            if (isLoading) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center
                ) {
                    GifImage(size = 100)
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(vertical = 5.dp, horizontal = 30.dp),
                        text = "Kitob yuklangunicha kutib turing iltimos!!!"
                    )
                    LinearProgressIndicator(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 30.dp),
                        progress = if (currentLoadingPage == null || pageCount == null) 0f
                        else currentLoadingPage!!.toFloat() / pageCount!!.toFloat()
                    )
                    Text(
                        modifier = Modifier
                            .align(Alignment.End)
                            .padding(top = 5.dp)
                            .padding(horizontal = 30.dp),
                        text = "${currentLoadingPage ?: "-"} pages loaded/${pageCount ?: "-"} total pages"
                    )
                }
            }
        }

    }

    @Composable
    fun GifImage(
        modifier: Modifier = Modifier,
        size: Int = 50,
    ) {
        val context = LocalContext.current
        val imageLoader = ImageLoader.Builder(context)
            .components {
                if (SDK_INT >= 28) {
                    add(ImageDecoderDecoder.Factory())
                } else {
                    add(GifDecoder.Factory())
                }
            }
            .build()
        Image(
            painter = rememberAsyncImagePainter(
                ImageRequest.Builder(context).data(data = R.drawable.run_mario).apply(block = {
                    size(size)
                }).build(), imageLoader = imageLoader
            ),
            contentDescription = null,
            modifier = modifier.fillMaxWidth(),
        )
    }

}