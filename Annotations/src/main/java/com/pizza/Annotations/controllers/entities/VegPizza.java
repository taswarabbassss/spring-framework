package com.pizza.Annotations.controllers.entities;

import org.springframework.stereotype.Component;

@Component
public class VegPizza implements Pizza{
    @Override
    public String getPizza() {
        return "VegPizza";
    }
}
