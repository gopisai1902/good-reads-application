package com.example.goodreads;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

public class BookService implements BookRepository {
    private HashMap<Integer,Book>hmap = new HashMap<Integer, Book>();
    int newBookId = 3;
    public  BookService(){
        Book b1 = new Book(1,"HarryPotter", "harry.jpeg");
        Book b2 = new Book(2, "Spiderman", "spiderman.png");
        hmap.put(b1.getId(), b1);
        hmap.put(b2.getId(), b2);
    }
    @Override
    public ArrayList<Book> getBooks() {
        Collection<Book> bookCollection = hmap.values();
        ArrayList<Book> books = new ArrayList<Book>(bookCollection);
        return books;
    }
    @Override
    public Book getBookById(int bookId){
        Book book = hmap.get(bookId);

        if(book == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return book;
    }
    @Override
    public Book addBook(Book book){
        book.setId(newBookId);
        hmap.put(newBookId, book);
        newBookId += 1;

        return book;
    }
}
