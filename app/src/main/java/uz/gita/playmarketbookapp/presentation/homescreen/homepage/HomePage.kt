package uz.gita.playmarketbookapp.presentation.homescreen.homepage

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
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
import kotlinx.coroutines.flow.MutableStateFlow
import uz.gita.playmarketbookapp.R
import uz.gita.playmarketbookapp.ui.components.HomeItem
import uz.gita.playmarketbookapp.ui.theme.PlayMarketBookAppTheme

/**
 *   Created by Jamik on 6/25/2023 ot 8:28 AM
 **/
class HomePage : Tab {
    override val options: TabOptions
        @Composable get() {

            val title = "Home"
            val icon = rememberVectorPainter(image = Icons.Default.Home)
            return remember {
                TabOptions(
                    index = 0u, title, icon
                )
            }

        }

    @Composable
    override fun Content() {
        val viewModel: HomeContract.ViewModel = getViewModel<HomeViewModel>()
        val uiState = viewModel.uiState.collectAsState()
        HomeContent(uiState = uiState, onEvenDispatcher = viewModel::onEventDispatcher)
    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun HomeContent(
        uiState: State<HomeContract.UiState>,
        onEvenDispatcher: (HomeContract.Intent) -> Unit,
    ) {
        val context = LocalContext.current
        var showMenu by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier
                .fillMaxSize()
            //      .background(Brush.verticalGradient(arrayListOf(Color.Green, Color.Blue))),
        ) {
            TopAppBar(
                colors = TopAppBarDefaults.mediumTopAppBarColors(Color(context.getColor(R.color.toolbar))),
                title = {
                    Text(
                        modifier = Modifier
                            .padding(start = 20.dp),
                        text = "Kutubxona",
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        fontWeight = FontWeight(700),
                        fontStyle = FontStyle.Italic,
                        fontFamily = FontFamily.Serif,
                        color = Color.White,
                    )
                },
                actions = {

                    /*   IconButton(onClick = { showMenu = !showMenu }) {
                           Icon(
                               painter = painterResource(id = R.drawable.more1),
                               "",
                               modifier = Modifier.size(30.dp)
                           )
                       }

                       DropdownMenu(
                           expanded = showMenu,
                           onDismissRequest = { showMenu = false }
                       ) {

                           DropdownMenuItem(
                               text = {
                                   Text(text = "Setings")
                               },
                               onClick = {
                                   Toast.makeText(context, "Settings", Toast.LENGTH_SHORT).show()
                               })
                           DropdownMenuItem(
                               text = {
                                   Text(text = "Log out")
                               },
                               onClick = {
                                   Toast.makeText(context, "Settings", Toast.LENGTH_SHORT).show()
                               })

                       }
   */
                }
            )

            LazyColumn(content = {

                item {
                    HomeItem(
                        data = uiState.value.allBooks
                    ) { book ->
                        onEvenDispatcher(HomeContract.Intent.ReadBook(book))
                    }
                }
                items(uiState.value.allList) {
                    HomeItem(data = it) { book ->
                        onEvenDispatcher(HomeContract.Intent.ReadBook(book))
                    }
                }

            })

        }

    }

    @Preview
    @Composable
    private fun PrewHomeContent() {

        val uiState = MutableStateFlow(HomeContract.UiState()).collectAsState()

        PlayMarketBookAppTheme() {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                HomeContent(uiState = uiState, onEvenDispatcher = {})
            }
        }

    }

}













