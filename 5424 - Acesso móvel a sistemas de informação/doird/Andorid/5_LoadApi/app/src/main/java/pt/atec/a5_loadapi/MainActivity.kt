package pt.atec.a5_loadapi

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : ComponentActivity() {

    var api = Retrofit.Builder()
        .baseUrl("http://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(APIHandler::class.java)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "")

                Spacer(modifier = Modifier.height(16.dp))

                Button(onClick = {
                    Log.i("teste", "Inicio - All ")
                    getAllComments()
                }) {
                    Text(text = "get All 2")
                }

                Button(onClick = {
                    Log.i("teste", "Inicio - 1")
                    getComment(6)
                }) {
                    Text(text = "get one 2")
                }

            }
        }
    } //onCreate


    fun getAllComments(){

        Log.i("teste", "Inicio - Fn All")

        this.api.getCommnets().enqueue(object: Callback<List<Comment>>{
            override fun onResponse(call: Call<List<Comment>>, response: Response<List<Comment>>) {

                if(response.isSuccessful){
                    response.body()?.let {
                        for (cmt in it){
                            Log.i("teste", cmt.body)
                        }
                    }
                }else{
                    Log.i("teste", "Algo correu mal")
                }
            }

            override fun onFailure(call: Call<List<Comment>>, t: Throwable) {
                Log.i("teste", "Erro: ${t.message}")
            }

        }

        )


    }


    fun getComment(id:Int ){

        Log.i("teste", "Inicio - Fn All")

        this.api.getCommnet(id).enqueue(object: Callback<Comment> {
            override fun onResponse(call: Call<Comment>, response: Response<Comment>) {
                if(response.isSuccessful){
                    response.body()?.let {
                        Log.i("teste", it.body)
                    }
                }
            }

            override fun onFailure(call: Call<Comment>, t: Throwable) {
                Log.i("teste", "Erro: ${t.message}")
            }


        })


    }



}