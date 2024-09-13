package pt.atec.a3_nav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import pt.atec.a3_nav.ui.theme._3_NavTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            var navCtrl = rememberNavController()

            NavHost(navController = navCtrl,
                startDestination = "home",

                builder = {

                    composable("home"){
                        mainActivity(navCtrl)
                    }

                    composable("info/{idade}/{nome}",
                        arguments = listOf(
                            navArgument("idade"){type = NavType.IntType},
                            navArgument("nome"){type = NavType.StringType}
                        )
                    ) {

                        val nome = it.arguments?.getString("nome") ?: "Sem nome"

                        val idade = it.arguments?.getInt("idade") ?: -1

                        infoActivity(nome, idade)
                    }

                })





        }
    }
}



