package com.scaler.expensemanagement.service;

public interface PasswordEncoder {
    String encode(String password);
    boolean matches(String plainPassword, String hashedPassword);
}
