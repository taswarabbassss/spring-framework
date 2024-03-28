package com.springBootApp.BouAliSpringSecurity.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @GetMapping
    public ResponseEntity<String> getGreetings() {
        return ResponseEntity.ok("Helo from app");
    }

    @GetMapping("/bye")
    public ResponseEntity<String> getEndingMessage() {
        return ResponseEntity.ok("Good Bye See you next time");
    }


}
