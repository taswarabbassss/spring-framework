package com.springBootApp.BouAliJWTSecurity.users.authenticators;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Base64;

@Service
public class JwtService {
    // Code to generate JSON Web Token Random key
    //node -e "console.log(require('crypto').randomBytes(32).toString('hex'))"node -e "console.log(require('crypto').randomBytes(32).toString('hex'))"
    private static final String SECRET_KEY = "3ccc9dcd5a13eb36e53395cb7f62fa389a892acc42a365a209c5c8b20196bf99";
    public String extractUsername(String token) {
        return null;
    }

    private Claims extractAllClaims(String token){

        return Jwts
                .parserBuilder()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJwt(token)
                .getBody();
    }

    private Key getSignInKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
