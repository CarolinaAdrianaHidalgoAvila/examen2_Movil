package com.example.examen_hidalgo
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface EndPointApi {
    @GET(ConstantsRestApi.POSTS)
    fun getAllPost(): Call<List<Post>>
    @POST(ConstantsRestApi.POSTS)
    fun createPost(@Body post: Post): Call<Post>
}
