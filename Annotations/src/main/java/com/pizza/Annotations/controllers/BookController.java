package com.pizza.Annotations.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pizza.Annotations.controllers.entities.Book;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/api")
public class BookController {
    
    @RequestMapping(value = {"/book","/java","/core"}, method=RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes  = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Book getBook(HttpServletRequest request) {

        return new Book(1, "Java-Core", "Tasawar");
    }
    
}
