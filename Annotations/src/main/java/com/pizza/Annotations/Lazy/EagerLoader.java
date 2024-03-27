package com.pizza.Annotations.Lazy;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {
    public EagerLoader(){
        System.out.println("EagerLoader");
    }
}
