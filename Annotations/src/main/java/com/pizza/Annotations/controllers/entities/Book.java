package com.pizza.Annotations.controllers.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Book {
    private int id;
    private String title;
    private String author;
}
