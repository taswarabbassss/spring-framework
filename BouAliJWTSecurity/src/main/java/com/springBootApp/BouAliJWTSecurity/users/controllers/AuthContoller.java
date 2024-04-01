package com.springBootApp.BouAliJWTSecurity.users.controllers;

import com.springBootApp.BouAliJWTSecurity.users.entities.AuthenticationRequest;
import com.springBootApp.BouAliJWTSecurity.users.entities.AuthenticationResponse;
import com.springBootApp.BouAliJWTSecurity.users.entities.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthContoller {

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ){
        //
        return  null;
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
        @RequestBody AuthenticationRequest request
    ){
        return  null;

    }
}
