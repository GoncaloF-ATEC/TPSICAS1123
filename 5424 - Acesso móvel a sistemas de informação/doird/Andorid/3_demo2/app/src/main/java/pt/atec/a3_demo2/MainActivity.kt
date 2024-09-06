package pt.atec.a3_demo2

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
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.atec.a3_demo2.ui.theme._3_demo2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                var nome2 = remember {
                    mutableStateOf("Gonçalo")
                }

                var tf_txt = remember {
                    mutableStateOf("")
                }

                Spacer(modifier = Modifier.height(25.dp))

                myTextField(tf_txt)

                Spacer(modifier = Modifier.height(25.dp))

                Text(tf_txt.value, modifier = Modifier.padding(20.dp))

                Spacer(modifier = Modifier.height(25.dp))

                btn(nome2, tf_txt)

                Spacer(modifier = Modifier.height(20.dp))

                Text(nome2.value)


            }//Column
        }
    }
}
@Composable
fun myTextField(txt: MutableState<String>){

    TextField(
        value = txt.value,
        onValueChange = { txt.value = it },
        label =  { myText("nome: ") },
        maxLines = 1,
        textStyle = TextStyle(color = Color.Red, fontWeight= FontWeight.Bold, fontSize = 20.sp),
        modifier = Modifier
            .padding(10.dp)
            .blur(900.dp)
    )


}


@Composable
fun myText(txt: String){
    Text(txt)
}

@Composable
fun btn(nome: MutableState<String>,  newText: MutableState<String>) {
    Row {

        Text(nome.value,
            modifier =
            Modifier
                .background(color = Color.Gray)
                .padding(10.dp),
            fontWeight = FontWeight.ExtraBold,
        )
        Spacer(modifier = Modifier.width(60.dp))

        Button(onClick = {
            nome.value = newText.value

        }) {
            Text("ok")
        }
    }// row Btn 2
}