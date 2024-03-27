package com.pizza.Annotations.controllers;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pizza.Annotations.controllers.entities.Book;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class BookController {
    
    @RequestMapping(value = {"/book","/java","/core"}, method=RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes  = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Book getBook(HttpServletRequest request) {

        return new Book(1, "Java-Core", "Tasawar");
    }

    @GetMapping(value = {"/person", "/employee"})
    public Map<String,String> getPerson(@RequestParam("name") String param) {
        Map<String,String> result = new LinkedHashMap<>();
        result.put("name", param);
        result.put("id", "1");
        return result;
    }
    
    
}
