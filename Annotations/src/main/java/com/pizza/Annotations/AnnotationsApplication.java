package com.pizza.Annotations;

import com.pizza.Annotations.Lazy.LazyLoader;
import com.pizza.Annotations.Scope.Prototype;
import com.pizza.Annotations.Scope.Singleton;
import com.pizza.Annotations.controllers.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AnnotationsApplication {

    public  static PizzaController pizzaController;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AnnotationsApplication.class, args);
        Singleton singleton1 =  context.getBean(Singleton.class);
        System.out.println(singleton1.hashCode());
        Singleton singleton2 =  context.getBean(Singleton.class);
        System.out.println(singleton2.hashCode());
        Singleton singleton3 =  context.getBean(Singleton.class);
        System.out.println(singleton3.hashCode());

        Prototype prototype1   = context.getBean(Prototype.class);
        System.out.println(prototype1.hashCode());
        Prototype prototype2   = context.getBean(Prototype.class);
        System.out.println(prototype2.hashCode());
        Prototype prototype3   = context.getBean(Prototype.class);
        System.out.println(prototype3.hashCode());
        
    }

}
