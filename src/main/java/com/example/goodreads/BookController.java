package com.example.goodreads;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BookController {
    BookService bookService = new BookService();

    @GetMapping("/books")
    public ArrayList<Book> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/books/{bookId}")
    public Book getBookById(@PathVariable("bookId") int bookId){
        return bookService.getBookById(bookId);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }
}
