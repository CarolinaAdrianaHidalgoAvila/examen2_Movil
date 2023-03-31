package com.example.examen_hidalgo

class BookRepository(private val bookDao: IBookDao) {

    suspend fun insert(book: BookT) {
        bookDao.insert(book)
    }

    fun getListBooks(): List<BookT> {
        return bookDao.getList()
    }
}
