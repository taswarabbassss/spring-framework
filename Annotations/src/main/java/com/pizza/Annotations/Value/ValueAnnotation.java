package com.pizza.Annotations.Value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotation {

    @Value("Tasawar Abbas")
    private String fullName;
    
    public ValueAnnotation(){
        System.out.println("..ValueAnnotation...");
    }

    public String getFullName() {
        return fullName;
    }
}
