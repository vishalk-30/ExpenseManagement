package com.scaler.expensemanagement.controller;

import com.scaler.expensemanagement.dto.CreateUserDTO;
import com.scaler.expensemanagement.models.User;
import com.scaler.expensemanagement.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class UserController {

    private UserService userService;

    public User createUser(CreateUserDTO createUserDTO){
        return userService.createUser(createUserDTO.toUser());

    }
}
