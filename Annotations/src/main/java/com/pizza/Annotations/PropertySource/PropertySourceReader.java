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

    @Value("${app.name}")
    private String appName;
    @Value("${app.description}")
    private String appDescription;

    public String getAppName() {
        return appName;
    }
    public String getAppDescription() {
        return appDescription;
    }
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
