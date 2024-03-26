package com.pizza.Annotations;

import com.pizza.Annotations.controllers.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AnnotationsApplication {

    public  static PizzaController pizzaController;

    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(AnnotationsApplication.class, args);

        PizzaController pizzaController = (PizzaController) app.getBean("pizzaController");

        System.out.println("PIZZA: " + pizzaController.getPizza());

        System.out.println("Annotation app is running....");
    }

}
