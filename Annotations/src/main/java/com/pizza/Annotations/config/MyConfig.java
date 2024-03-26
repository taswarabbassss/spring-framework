package com.pizza.Annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pizza.Annotations.controllers.PizzaController;
import com.pizza.Annotations.controllers.entities.ChickenPizza;
import com.pizza.Annotations.controllers.entities.Pizza;
import com.pizza.Annotations.controllers.entities.VegPizza;

@Configuration
public class MyConfig {
    
    @Bean
    public Pizza vegPizzaa(){
        return new VegPizza();
    }

    @Bean
    public Pizza chickennPizza(){
        return new ChickenPizza();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController(){
        return new PizzaController(vegPizzaa());
    }
}
