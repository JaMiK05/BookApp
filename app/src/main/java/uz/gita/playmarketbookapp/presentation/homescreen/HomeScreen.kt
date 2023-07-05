package uz.gita.playmarketbookapp.presentation.homescreen

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.navigator.tab.*
import uz.gita.playmarketbookapp.R
import uz.gita.playmarketbookapp.presentation.allbooks.AllBooks
import uz.gita.playmarketbookapp.presentation.homescreen.homepage.HomePage
import uz.gita.playmarketbookapp.presentation.homescreen.saved.Saved

/**
 *   Created by Jamik on 6/25/2023 ot 2:08 AM
 **/
class HomeScreen : AndroidScreen() {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {

        TabNavigator(tab = HomePage()) {
            Scaffold(
                content = {
                    Box(
                        Modifier
                            .fillMaxSize()
                            .padding(it)
                    ) {
                        CurrentTab()
                    }
                },
                bottomBar = {
                    NavigationBar(
                        modifier = Modifier.height(70.dp),
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = Color.White
                    ) {
                        TabNavigationItem(tab = HomePage())
                        //TabNavigationItem(tab = AllBooks())
                        TabNavigationItem(tab = Saved())
                    }
                }
            )

        }

    }


    @Composable
    private fun RowScope.TabNavigationItem(tab: Tab) {

        val tabNavigator = LocalTabNavigator.current

        NavigationBarItem(
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.White,
                unselectedIconColor = MaterialTheme.colorScheme.onPrimary,
                indicatorColor = MaterialTheme.colorScheme.primary.copy(0.4F)
            ),
            selected = tabNavigator.current == tab,
            onClick = { tabNavigator.current = tab },
            icon = { Icon(painter = tab.options.icon!!, contentDescription = tab.options.title) }
        )

    }

}