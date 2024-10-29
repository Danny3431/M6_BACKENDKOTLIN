package cl.bootcamp.m6_backendkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import cl.bootcamp.m6_backendkotlin.navegation.AppNav
import cl.bootcamp.m6_backendkotlin.ui.theme.M6_BACKENDKOTLINTheme
import cl.bootcamp.m6_backendkotlin.viewmodel.ContactViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: ContactViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainContent(viewModel)
        }
    }
}

@Composable
fun MainContent(viewModel: ContactViewModel) {
    val navController = rememberNavController()

    M6_BACKENDKOTLINTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            AppNav(
                modifier = Modifier.padding(innerPadding),
                navController = navController,
                viewModel = viewModel
            )
        }
    }
}