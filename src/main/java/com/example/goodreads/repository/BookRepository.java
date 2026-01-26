package com.example.goodreads.repository;

import com.example.goodreads.model.Book;

import java.util.ArrayList;

public interface BookRepository {
    public ArrayList<Book>getBooks();
    public Book getBookById(int bookId);
    public Book addBook(Book book);
    public Book updateBook(Book book, int bookId);
    public void deleteBook(int bookId);
}
