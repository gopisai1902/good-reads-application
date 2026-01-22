package com.example.goodreads;

import java.util.ArrayList;

public interface BookRepository {
    public ArrayList<Book>getBooks();
    public Book getBookById(int bookId);
    public Book addBook(Book book);
}
