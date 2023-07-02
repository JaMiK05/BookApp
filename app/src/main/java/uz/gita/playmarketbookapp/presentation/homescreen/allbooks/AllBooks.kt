package uz.gita.playmarketbookapp.presentation.homescreen.allbooks


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.*
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import cafe.adriel.voyager.hilt.getViewModel
import cafe.adriel.voyager.navigator.tab.*
import coil.compose.rememberAsyncImagePainter
import kotlinx.coroutines.flow.MutableStateFlow
import uz.gita.playmarketbookapp.R
import uz.gita.playmarketbookapp.data.model.BookData
import uz.gita.playmarketbookapp.ui.components.*
import uz.gita.playmarketbookapp.ui.theme.PlayMarketBookAppTheme

/**
 *   Created by Jamik on 6/25/2023 ot 8:33 AM
 **/
class AllBooks : Tab {
    override val options: TabOptions
        @Composable get() {
            val title = "Books"
            val icon = rememberVectorPainter(image = Icons.Default.Search)
            return remember {
                TabOptions(index = 1u, title, icon = icon)
            }
        }

    @Composable
    override fun Content() {
        val viewModel: AllBooksContract.ViewModel = getViewModel<AllBooksViewModel>()
        val uiState = viewModel.uiState.collectAsState()
        AllContent(uiState = uiState, onEvenDispatcher = viewModel::onEventDispatcher)
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun AllContent(
        uiState: State<AllBooksContract.UiState>,
        onEvenDispatcher: (AllBooksContract.Intent) -> Unit,
    ) {
        val context = LocalContext.current
        var sliderview by remember { mutableStateOf(true) }
        Column(modifier = Modifier.fillMaxSize()) {
            TopAppBar(
                colors = TopAppBarDefaults.mediumTopAppBarColors(Color(context.getColor(R.color.toolbar))),
                title = {
                    Text(
                        modifier = Modifier
                            .padding(start = 20.dp),
                        text = "Kitoblar",
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        fontWeight = FontWeight(700),
                        fontStyle = FontStyle.Italic,
                        fontFamily = FontFamily.Serif,
                        color = Color.White,
                    )
                },
                actions = {}
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 10.dp)
            ) {
                Search() { name ->
                    onEvenDispatcher(AllBooksContract.Intent.GetBooks(name.trim()))
                    sliderview = name.isEmpty()
                }
            }

            LazyColumn(content = {
                if (sliderview) {
                    item {
                        if (uiState.value.slideList.size >= 5) {
                            val col = ArrayList<BookData>(uiState.value.slideList)
                            col.shuffle()
                            DataSliderView(
                                booklist = col.subList(0, 5),
                                onClick = { book ->
                                    onEvenDispatcher(AllBooksContract.Intent.ReadBook(book))
                                })
                        }
                    }
                }
                item {
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Barcha Kitoblar",
                            color = Color.Black,
                            fontSize = 15.sp,
                            fontWeight = FontWeight(900),
                            modifier = Modifier.padding(start = 25.dp, top = 20.dp, bottom = 20.dp)
                        )

                        Spacer(modifier = Modifier.weight(1f))

                        Text(
                            text = uiState.value.allList.size.toString() + " book",
                            color = Color.Black,
                            fontSize = 10.sp,
                            fontWeight = FontWeight(900),
                            fontStyle = FontStyle.Italic,
                            fontFamily = FontFamily.SansSerif,
                            modifier = Modifier.padding(end = 25.dp, top = 20.dp, bottom = 20.dp)
                        )

                    }

                }
                items(uiState.value.allList) { book ->
                    AllBooksItem(book = book) { readBook ->
                        onEvenDispatcher(AllBooksContract.Intent.ReadBook(readBook))
                    }
                }

            })

        }

    }


    @Preview
    @Composable
    private fun AllContentPrev() {
        val uiState = MutableStateFlow(AllBooksContract.UiState()).collectAsState()
        PlayMarketBookAppTheme {
            Surface(
                modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
            ) {
                AllContent(uiState) {}
            }
        }

    }

}