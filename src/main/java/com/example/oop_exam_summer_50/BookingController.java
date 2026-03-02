package com.example.oop_exam_summer_50;

import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
public class BookingController {
    private BookService BookService;
    public BookingController(BookService bookService) {
        this.BookService = BookService;
    }

    @PutMapping
    public RequestEntity<BookService> bookservice(@RequestBody BookService bookService) {
        return
    }

}
