package com.springBootApp.BouAliJWTSecurity.users.services.Impl;

import com.springBootApp.BouAliJWTSecurity.users.Role;
import com.springBootApp.BouAliJWTSecurity.users.User;
import com.springBootApp.BouAliJWTSecurity.users.UserRepository;
import com.springBootApp.BouAliJWTSecurity.users.config.JwtService;
import com.springBootApp.BouAliJWTSecurity.users.entities.AuthenticationRequest;
import com.springBootApp.BouAliJWTSecurity.users.entities.AuthenticationResponse;
import com.springBootApp.BouAliJWTSecurity.users.entities.RegisterRequest;
import com.springBootApp.BouAliJWTSecurity.users.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final JwtService jwtService;
    @Override
    public AuthenticationResponse registerUser(RegisterRequest request) {
        var user = User.builder()
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();
        userRepository.save(user);
        String jwtToken = jwtService.generateToken(new HashMap<>(), user);
        return AuthenticationResponse.builder().token(jwtToken).build();

    }

    @Override
    public AuthenticationResponse authenticateUser(AuthenticationRequest request) {
        return null;
    }
}
