package com.pizza.Annotations.controllers.entities;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChickenPizza implements Pizza{
    @Override
    public String getPizza() {
        return "ChickenPizza";
    }
}
