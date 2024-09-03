package pt.atec.demo_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.atec.demo_1.ui.theme.Demo_1Theme

class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var nome by remember {
                mutableStateOf("Gonçalo")
            }

            var nome2 = remember {
                mutableStateOf("Gonçalo")
            }

            Column {
                Spacer(modifier = Modifier.height(20.dp))
                Text("Ola Mundo",
                    color = Color.Blue,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 17.sp
                )

                Text("Novo txt",
                    letterSpacing = 10.sp)

                Text("nome",
                    modifier =
                    Modifier
                        .background(color = Color.Gray)
                        .padding(10.dp),

                    fontWeight = FontWeight.ExtraBold,
                )
                Spacer(modifier = Modifier.height(20.dp))
                Row {
                    Text("novo",
                        letterSpacing = 10.sp)
                    Spacer(modifier = Modifier.width(60.dp))
                    Text("txt",
                        letterSpacing = 10.sp)
                }
                Spacer(modifier = Modifier.height(25.dp))

                Row {
                    Text(nome,
                        modifier =
                        Modifier
                            .background(color = Color.Gray)
                            .padding(10.dp),

                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.width(60.dp))

                    Button(onClick = {
                        nome = "Novo nome"

                    }) {
                        Text("ok")

                    }
                }// row Btn 1

                Spacer(modifier = Modifier.height(25.dp))

                Row {
                    Text(nome2.value,
                        modifier =
                        Modifier
                            .background(color = Color.Gray)
                            .padding(10.dp),

                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.width(60.dp))

                    Button(onClick = {
                        nome2.value = "Novo nome"

                    }) {
                        Text("ok")

                    }
                }// row Btn 2

            }//Column


        }// setContent
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}