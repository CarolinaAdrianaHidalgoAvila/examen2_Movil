package com.example.examen_hidalgo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class BookActivity : AppCompatActivity() {
    lateinit var title: TextView
    lateinit var description: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        title = findViewById(R.id.title)
        description = findViewById(R.id.description)


        val restApiAdapter = RestApiAdapter()
        val endPoint = restApiAdapter.connectionApi()
        val book = Post(title,description)

        endPoint.createPost(book).enqueue(object : Callback<Post> {
            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                val posts = response?.body()
                Log.d("RESP POST", Gson().toJson(posts))
            }

            override fun onFailure(call: Call<Post>, t: Throwable) {
                t?.printStackTrace()
            }
        })

    }
}