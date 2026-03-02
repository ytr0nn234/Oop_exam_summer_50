package com.example.oop_exam_summer_50;

import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Setter
@Service
public class BookService {
        public BookService(@PathVariable int id, @PathVariable String Tag) {


        }

        public BookService(@Validated @RequestBody  BookService bookService) {

        }
}
