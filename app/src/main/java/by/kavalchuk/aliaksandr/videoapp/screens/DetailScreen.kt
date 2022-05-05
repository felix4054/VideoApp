package by.kavalchuk.aliaksandr.videoapp.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import by.kavalchuk.aliaksandr.videoapp.MainViewModel

@Composable
fun DetailScreen(navController: NavController, viewModel: MainViewModel, itemId: String) {
    Text(text = "Details screen: item id: ${itemId}")
}
