package by.kavalchuk.aliaksandr.videoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import by.kavalchuk.aliaksandr.videoapp.navigation.SetupNavHost
import by.kavalchuk.aliaksandr.videoapp.screens.MainScreen
import by.kavalchuk.aliaksandr.videoapp.ui.theme.VideoAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VideoAppTheme {
                val navController = rememberNavController()
                SetupNavHost(navController = navController)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    VideoAppTheme {
        MainScreen()
    }
}