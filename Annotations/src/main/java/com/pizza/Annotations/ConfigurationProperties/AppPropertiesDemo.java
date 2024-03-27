package com.pizza.Annotations.ConfigurationProperties;

import org.springframework.stereotype.Component;

@Component
public class AppPropertiesDemo {
    private AppProperties appProperties;

    public AppPropertiesDemo(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    public void display() {
        System.out.println(appProperties.getName());
        System.out.println(appProperties.getDescription());
        System.out.println(appProperties.getUploadDir());
        System.out.println("_________NESTED PROPERTIES______");
        System.out.println(appProperties.getSecurity().getUsername());
        System.out.println(appProperties.getSecurity().getPassword());
        System.out.println(appProperties.getSecurity().getRoles());
        System.out.println(appProperties.getSecurity().isEnabled());
        System.out.println("_________MAP PROPERTIES______");
    }

}
