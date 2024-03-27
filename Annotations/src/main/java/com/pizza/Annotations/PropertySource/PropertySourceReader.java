package com.pizza.Annotations.PropertySource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceReader {
    
    @Value("${gmail.host}")
    private String host;
    @Value("${gmail.email}")
    private String email;
    @Value("${gmail.password}")
    private String password;
    public String getHost() {
        return host;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
}
