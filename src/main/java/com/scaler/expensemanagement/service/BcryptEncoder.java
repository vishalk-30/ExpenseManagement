package com.scaler.expensemanagement.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BcryptEncoder implements PasswordEncoder{
    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    @Override
    public String encode(String password) {
        return bCryptPasswordEncoder.encode(password);
    }

    @Override
    public boolean matches(String plainPassword, String hashedPassword) {
        return bCryptPasswordEncoder.matches(plainPassword,hashedPassword);
    }
}
