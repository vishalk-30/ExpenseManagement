package com.scaler.expensemanagement.service;

import com.scaler.expensemanagement.models.User;
import com.scaler.expensemanagement.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    public User createUser(User userRequest) {
        String password = passwordEncoder.encode(userRequest.getPassword());
        User user = userRequest.toBuilder()
                   .password(password)
                   .build();
        return userRepository.save(user);
    }
}
