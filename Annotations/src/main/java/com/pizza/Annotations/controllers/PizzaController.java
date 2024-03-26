package com.pizza.Annotations.controllers;

import com.pizza.Annotations.controllers.entities.Pizza;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

// @Component

// @RequiredArgsConstructor
public class PizzaController {

    // @Resource
    public Pizza pizza;

    // public PizzaController(@Qualifier("vegPizza") Pizza pizza) {
    // this.pizza = pizza;
    // }

    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getPizza() {
        return pizza.getPizza();
    }

    public void init() {
        System.out.println("PizzaController Initilized");
    }
    public void destroy() {
        System.out.println("PizzaController Destroyed");
    }
}
