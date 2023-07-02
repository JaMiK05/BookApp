package uz.gita.playmarketbookapp.presentation.homescreen.saved

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
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
import uz.gita.playmarketbookapp.ui.components.Search
import uz.gita.playmarketbookapp.ui.theme.PlayMarketBookAppTheme

/**
 *   Created by Jamik on 6/25/2023 ot 8:41 AM
 **/
class Saved : Tab {
    override val options: TabOptions
        @Composable get() {
            val title = "Saved"
            val icon = rememberVectorPainter(image = Icons.Default.FavoriteBorder)
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
                colors = TopAppBarDefaults.mediumTopAppBarColors(Color(context.getColor(R.color.toolbar))),
                title = {
                    Text(
                        modifier = Modifier
                            .padding(start = 20.dp),
                        text = "Saqlangan kitoblar",
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        fontWeight = FontWeight(700),
                        fontStyle = FontStyle.Italic,
                        fontFamily = FontFamily.Serif,
                        color = Color.White,
                    )
                },
                actions = {
                    Image(
                        modifier = Modifier
                            .size(40.dp)
                            .padding(end = 10.dp)
                            .clickable {
                                onEvenDispatcher(SavedContract.Intent.UpdateData)
                            },
                        painter = painterResource(id = R.drawable.reload),
                        contentDescription = null
                    )
                }
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 10.dp)
            ) {
                Search() { name ->
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
                    Image(
                        painter = painterResource(id = R.drawable.empty_list),
                        contentDescription = "Saqlangan kitoblar yoq"
                    )
                }
            } else {

                LazyColumn(content = {

                    items(uiState.value.savedList) { book ->
                        AllBooksItem(book = book) { readBook ->
                            onEvenDispatcher(SavedContract.Intent.ReadScreenTo(readBook))
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