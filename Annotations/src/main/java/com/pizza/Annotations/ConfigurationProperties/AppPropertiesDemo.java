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
    }

}
