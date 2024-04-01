package com.springBootApp.BouAliJWTSecurity.users.services.Impl;

import com.springBootApp.BouAliJWTSecurity.users.entities.AuthenticationRequest;
import com.springBootApp.BouAliJWTSecurity.users.entities.AuthenticationResponse;
import com.springBootApp.BouAliJWTSecurity.users.entities.RegisterRequest;
import com.springBootApp.BouAliJWTSecurity.users.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    @Override
    public AuthenticationResponse registerUser(RegisterRequest request) {
        return null;
    }

    @Override
    public AuthenticationResponse authenticateUser(AuthenticationRequest request) {
        return null;
    }
}
