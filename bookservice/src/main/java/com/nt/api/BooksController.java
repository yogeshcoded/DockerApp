package com.nt.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

    @GetMapping("/home")
    public String home() {
        return "welcome to my home";
    }

    @GetMapping("/all")
    public String getAllBooks() {
        return "Book List are Found";
    }
}
