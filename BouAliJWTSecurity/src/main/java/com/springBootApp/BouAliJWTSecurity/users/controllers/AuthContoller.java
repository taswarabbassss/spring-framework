package com.springBootApp.BouAliJWTSecurity.users.controllers;

import com.springBootApp.BouAliJWTSecurity.users.entities.AuthenticationRequest;
import com.springBootApp.BouAliJWTSecurity.users.entities.AuthenticationResponse;
import com.springBootApp.BouAliJWTSecurity.users.entities.RegisterRequest;
import com.springBootApp.BouAliJWTSecurity.users.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthContoller {
    private  final AuthenticationService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ){

        return  ResponseEntity.ok(authService.registerUser(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
        @RequestBody AuthenticationRequest request
    ){
        return  ResponseEntity.ok(authService.authenticateUser(request));

    }
}
