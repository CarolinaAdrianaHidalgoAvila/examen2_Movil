package com.example.examen_hidalgo

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface IBookDao {

    @Query("SELECT * FROM book_table")
    fun getList(): List<BookT>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(book:BookT)

    @Query("DELETE FROM book_table")
    suspend fun deleteAll()
}
