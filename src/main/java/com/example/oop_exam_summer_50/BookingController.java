package com.example.oop_exam_summer_50;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
public class BookingController {
    private BookService BookService;
    public BookingController(BookService bookService) {
    }

    @PutMapping
    public ResponseEntity addBooking(@Validated @RequestBody Book book) {
        return ResponseEntity.ok().build();
    }
     @PutMapping
    public ResponseEntity updateBooking(@Validated @RequestBody Book book) {
        return ResponseEntity.ok().build();
    }

}
