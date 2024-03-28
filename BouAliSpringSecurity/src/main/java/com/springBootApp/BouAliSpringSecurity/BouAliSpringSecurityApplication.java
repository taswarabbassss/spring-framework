package com.springBootApp.BouAliSpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class BouAliSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(BouAliSpringSecurityApplication.class, args);
		System.out.println("Spring Security App is running....");
	}

}
