package com.pizza.Annotations.PropertySource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mail.properties")
@PropertySource("classpath:message.properties")
public class SpringConfig {
    
}
