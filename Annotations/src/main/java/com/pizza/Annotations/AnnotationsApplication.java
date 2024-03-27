package com.pizza.Annotations;

import com.pizza.Annotations.Lazy.LazyLoader;
import com.pizza.Annotations.PropertySource.EnvironmentClassReader;
import com.pizza.Annotations.PropertySource.PropertySourceReader;
import com.pizza.Annotations.Scope.Prototype;
import com.pizza.Annotations.Scope.Singleton;
import com.pizza.Annotations.Value.ValueAnnotation;
import com.pizza.Annotations.controllers.PizzaController;

import lombok.Value;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AnnotationsApplication {

    public  static PizzaController pizzaController;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AnnotationsApplication.class, args);
        // testPizzaController( context);
        // testLazy(context);
        // testScope(context);
        // testValueDefaultValueAssignment(context);
        // testValueToReadValuesFromApplicationDotPropertiesFile(context);
        // testValueToReadValuesOfSystemEnvironementVariables(context);
        // testPropertySourceReader(context);
        testEnvironmentClassReaderToReadCustomPropertiesValues(context);
        


        
    }
    public static void testEnvironmentClassReaderToReadCustomPropertiesValues(ConfigurableApplicationContext context) {
        EnvironmentClassReader environmentClassReader = context.getBean(EnvironmentClassReader.class);
    
        System.out.println("_______MAIL.PROPERTIES VALUES______________");
        System.out.println("HOST: "+ environmentClassReader.getHost());
        System.out.println("EMAIL: "+ environmentClassReader.getEmail());
        System.out.println("PASS: "+ environmentClassReader.getPassword());
        System.out.println("_______MESSAGE.PROPERTIES VALUES______________");
        System.out.println("APP NAME: "+ environmentClassReader.getAppName());
        System.out.println("APP DESC: "+ environmentClassReader.getAppDescription());}
    public static void testPropertySourceReader(ConfigurableApplicationContext context) {
        PropertySourceReader PropertySourceReader = context.getBean(PropertySourceReader.class);

        System.out.println("_______MAIL.PROPERTIES VALUES______________");
        System.out.println("HOST: "+ PropertySourceReader.getHost());
        System.out.println("EMAIL: "+ PropertySourceReader.getEmail());
        System.out.println("PASS: "+ PropertySourceReader.getPassword());
        System.out.println("_______MESSAGE.PROPERTIES VALUES______________");
        System.out.println("APP NAME: "+ PropertySourceReader.getAppName());
        System.out.println("APP DESC: "+ PropertySourceReader.getAppDescription());
    }

    public static void testValueToReadValuesOfSystemEnvironementVariables(ConfigurableApplicationContext context) {
        ValueAnnotation valueAnnotation = context.getBean(ValueAnnotation.class);
        // TO GET ENVIRONMENT VARIABLES WITH SYSTEM CLASS
        String myEnv = System.getenv("TEMP");
        System.out.println("MY ENV: "+ myEnv);
        // TO GET ENVIRONMENT VARIABLES WITH @Value Annotation

        System.out.println("TMP :"+valueAnnotation.getTMP());
        System.out.println("TEMP :"+valueAnnotation.getTEMP());
    }
    public static void testValueToReadValuesFromApplicationDotPropertiesFile(ConfigurableApplicationContext context) {
        ValueAnnotation valueAnnotation = context.getBean(ValueAnnotation.class);
        System.out.println("APP NAME:"+valueAnnotation.getApplicationName());
        System.out.println("APP PORT:"+valueAnnotation.getPort());
        System.out.println("HOST:"+valueAnnotation.getHost());
        System.out.println("USER:"+valueAnnotation.getUser());
        System.out.println("EMAIL:"+valueAnnotation.getEmail());
        System.out.println("PASSWORD:"+valueAnnotation.getPassword());
        
    }
    public static void testValueDefaultValueAssignment(ConfigurableApplicationContext context) {
        ValueAnnotation valueAnnotation = context.getBean(ValueAnnotation.class);
        System.out.println(valueAnnotation.getFullName());
        
    }

    public static void testScope(ConfigurableApplicationContext context){
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
    public static void testLazy( ConfigurableApplicationContext context){

      LazyLoader lazyLoader =   context.getBean(LazyLoader.class);
    }
    public static void testPizzaController(ConfigurableApplicationContext context) {
                
        PizzaController pizzaController = (PizzaController) app.getBean("pizzaController");

        System.out.println("PIZZA: " + pizzaController.getPizza());
    }

}
