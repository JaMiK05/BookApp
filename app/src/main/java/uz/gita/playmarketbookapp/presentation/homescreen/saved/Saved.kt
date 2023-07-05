package uz.gita.playmarketbookapp.presentation.homescreen.saved

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.hilt.getViewModel
import cafe.adriel.voyager.navigator.tab.*
import coil.compose.rememberAsyncImagePainter
import kotlinx.coroutines.flow.MutableStateFlow
import uz.gita.playmarketbookapp.R
import uz.gita.playmarketbookapp.ui.components.AllBooksItem
import uz.gita.playmarketbookapp.ui.components.BookItem
import uz.gita.playmarketbookapp.ui.components.Search
import uz.gita.playmarketbookapp.ui.theme.PlayMarketBookAppTheme

/**
 *   Created by Jamik on 6/25/2023 ot 8:41 AM
 **/
class Saved : Tab {
    override val options: TabOptions
        @Composable get() {
            val title = "Saved"
            val icon = rememberVectorPainter(image = Icons.Filled.Favorite)
            return remember {
                TabOptions(index = 2u, title, icon)
            }
        }

    @Composable
    override fun Content() {
        val viewModel: SavedContract.ViewModel = getViewModel<SavedViewModel>()
        val uiState = viewModel.uiState.collectAsState()
        SavedContent(uiState = uiState, onEvenDispatcher = viewModel::onEventDispatcher)
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun SavedContent(
        uiState: State<SavedContract.UiState>,
        onEvenDispatcher: (SavedContract.Intent) -> Unit,
    ) {

        val context = LocalContext.current

        Column(modifier = Modifier.fillMaxSize()) {


            TopAppBar(
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    actionIconContentColor = Color.White
                ),
                title = {
                    Text(
                        modifier = Modifier,
                        text = stringResource(id = R.string.saved_books),
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                    )
                },
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp, end = 12.dp, top = 16.dp)
            ) {
                Search(modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)) { name ->
                    onEvenDispatcher(SavedContract.Intent.GetSearchBooks(name))
                }
            }
            if (uiState.value.progresbar) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            } else if (uiState.value.savedList.isEmpty() && !uiState.value.progresbar) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            modifier = Modifier
                                .size(200.dp)
                                .padding(bottom = 4.dp),
                            painter = painterResource(id = R.drawable.empty_book),
                            contentDescription = "Saqlangan kitoblar yoq"
                        )
                        Text(
                            text = stringResource(id = R.string.not_found),
                            color = MaterialTheme.colorScheme.primary,
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                }
            } else {

                LazyColumn(content = {

                    items(uiState.value.savedList) { book ->
//                        AllBooksItem(book = book) { readBook ->
//                            onEvenDispatcher(SavedContract.Intent.ReadScreenTo(readBook))
//                        }
                        BookItem(book = book) {
                            onEvenDispatcher(SavedContract.Intent.ReadScreenTo(book))
                        }
                    }

                })

            }

        }
    }

    @Preview
    @Composable
    private fun SavedContentPrev() {
        LocalContext.current
        val uiState = MutableStateFlow(SavedContract.UiState()).collectAsState()
        PlayMarketBookAppTheme {
            Surface(
                modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
            ) {
                SavedContent(uiState) {}
            }
        }

    }

}