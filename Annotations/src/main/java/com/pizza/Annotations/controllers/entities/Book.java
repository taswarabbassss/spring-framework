package com.pizza.Annotations.controllers.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class Book {
    private int id;
    private String title;
    private String author;
}
