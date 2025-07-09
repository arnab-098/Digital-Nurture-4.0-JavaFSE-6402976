package com.cognizant.spring_learn.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Date;

@RestController
public class AuthController {

    private final SecretKey secretKey = Keys.hmacShaKeyFor("supersecretkeysupersecretkeysupersecretkey".getBytes());

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestHeader("Authorization") String authHeader) {
        if (authHeader == null || !authHeader.startsWith("Basic")) {
            return ResponseEntity.status(401).body("Missing or Invalid authorization header");
        }

        String base64Credentials = authHeader.substring("Basic ".length()).trim();
        String credentials = new String(Base64.getDecoder().decode(base64Credentials));
        String[] userPass = credentials.split(":", 2);

        String username = userPass[0];
        String password = userPass[1];

        if (!("user".equals(username) && "pwd".equals(password))) {
            return ResponseEntity.status(403).body("Invalid credentials");
        }

        String token = Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 1000))
                .signWith(secretKey, SignatureAlgorithm.HS256)
                .compact();

        return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
    }
}
