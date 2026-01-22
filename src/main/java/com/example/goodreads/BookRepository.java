package com.example.goodreads;

import java.util.ArrayList;

public interface BookRepository {
    public ArrayList<Book>getBooks();
    public Book getBookById(int bookId);
    public Book addBook(Book book);
    public Book updateBook(Book book, int bookId);
    public void deleteBook(int bookId);
}
