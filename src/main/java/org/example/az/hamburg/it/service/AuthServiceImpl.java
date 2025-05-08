package org.example.az.hamburg.it.service;

import org.apache.catalina.User;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AuthServiceImpl implements AuthService{
    private  final Authentication authentication;
    public  AuthServiceImpl(Authentication authentication) {
        this.authentication=authentication;
    }
    @Override
    public String login(String username, String password) {
        Authentication authentication1=new UsernamePasswordAuthenticationToken(username,password);
        if (authentication1.isAuthenticated()){
            return authentication1.getName();
        }
        else {
            throw new RuntimeException("Authentication Failed");
        }

    }
}
