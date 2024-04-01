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
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

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
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                request.getEmail(),
                request.getPassword())
        );
        var user = userRepository.findByEmail(request.getEmail()).orElseThrow();
        String jwtToken = jwtService.generateToken(new HashMap<>(), user);
        return AuthenticationResponse.builder().token(jwtToken).build();
    }
}
