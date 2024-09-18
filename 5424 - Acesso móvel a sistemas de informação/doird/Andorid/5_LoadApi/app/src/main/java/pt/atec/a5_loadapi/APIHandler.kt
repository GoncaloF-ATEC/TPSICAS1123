package pt.atec.a5_loadapi

import retrofit2.Call
import retrofit2.http.GET
import  retrofit2.http.Path



interface APIHandler {
    // https://jsonplaceholder.typicode.com/comments
    @GET("comments")
    fun getCommnets(): Call<List<Comment>>

    // https://jsonplaceholder.typicode.com/comments/{id}
    @GET("comments/{id}")
    fun getCommnet(@Path("id") id: Int): Call<Comment>
}