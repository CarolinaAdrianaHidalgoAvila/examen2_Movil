package com.example.examen_hidalgo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookListAdapter(val books: ArrayList<Post>, val recyclerViewActivity: RecyclerViewActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val view= LayoutInflater.from(parent.context).inflate(R.layout.book_row,parent,false)
        return BookListViewHolder(view)
    }

    class BookListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = books.get(position)
        holder.itemView.findViewById<TextView>(R.id.tv_title).text=item.title
        holder.itemView.findViewById<TextView>(R.id.tv_body).text=item.body

    }

}
