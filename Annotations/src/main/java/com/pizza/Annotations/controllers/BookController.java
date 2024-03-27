package com.pizza.Annotations.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pizza.Annotations.controllers.entities.Book;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/api")
public class BookController {
    
    @RequestMapping(value = {"/book","/java","/core"}, method=RequestMethod.GET)
    public Book getBook(HttpServletRequest request) {
        String url =  request.getRequestURL().toString();
        System.out.println("URL: "+ url);
        return new Book(1, "Java-Core", "Tasawar");
    }
    
}
