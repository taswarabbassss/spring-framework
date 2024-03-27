package com.pizza.Annotations.Value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotation {

    @Value("Tasawar Abbas")
    private String fullName;
    // spring.application.name=Annotations
    @Value("${spring.application.name}")
    private String applicationName;
    // server.port=9090
    @Value("${server.port}")
    private Integer port;
    
    // mail.host=gmail.com
    @Value("${mail.host}")
    private String host;
    // mail.user=tasawar
    @Value("${mail.user}")
    private String user;
    // mail.email=taswar@volmatica.com
    @Value("${mail.email}")
    private String email;
    // mail.password=secret
    @Value("${mail.password}")
    private String password;


    
    public ValueAnnotation(){
        System.out.println("..ValueAnnotation...");
    }



    public String getFullName() {
        return fullName;
    }



    public String getApplicationName() {
        return applicationName;
    }



    public Integer getPort() {
        return port;
    }



    public String getHost() {
        return host;
    }



    public String getUser() {
        return user;
    }



    public String getEmail() {
        return email;
    }



    public String getPassword() {
        return password;
    }


}
