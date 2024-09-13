package pt.atec.a3_nav

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun mainActivity(navCtrl: NavController){

    var idade by remember {
        mutableStateOf("")
    }

    var nome by remember {
        mutableStateOf("")
    }



    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {






        Row {
            TextField(
                label ={
                    Text(text = "Nome ")
                },
                value = nome , onValueChange ={
                    nome = it
                },
                modifier = Modifier.weight(3f)
            )


            Spacer(modifier = Modifier.width(2.dp))

            TextField(
                label ={
                Text(text = "idade")
                       },
                value = idade , onValueChange ={
                    idade = it
                },
                modifier = Modifier.weight(1f)
            )
        }


        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = {
            navCtrl.navigate("info/$idade/$nome")
        }) {
            Text("Registar")
        }

    }




}