package com.scaler.expensemanagement.controller;

import com.scaler.expensemanagement.dto.CreateUserExpenseDTO;
import com.scaler.expensemanagement.models.UserExpense;
import com.scaler.expensemanagement.service.UserExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class UserExpenseController {
    private UserExpenseService userExpenseService;
    public UserExpense createUserExpense(CreateUserExpenseDTO createUserExpenseDTO) {
        return userExpenseService.createUserExpense(createUserExpenseDTO);

    }
}
