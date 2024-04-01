package com.springBootApp.BouAliJWTSecurity.users.services;

import com.springBootApp.BouAliJWTSecurity.users.entities.AuthenticationRequest;
import com.springBootApp.BouAliJWTSecurity.users.entities.AuthenticationResponse;
import com.springBootApp.BouAliJWTSecurity.users.entities.RegisterRequest;

public interface AuthenticationService {

    AuthenticationResponse registerUser(RegisterRequest request);

    AuthenticationResponse authenticateUser(AuthenticationRequest request);
}
