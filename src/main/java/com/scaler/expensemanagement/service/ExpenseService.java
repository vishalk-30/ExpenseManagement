package com.scaler.expensemanagement.service;

import com.scaler.expensemanagement.dto.CreateExpenseDTO;
import com.scaler.expensemanagement.models.Expense;
import com.scaler.expensemanagement.models.User;
import com.scaler.expensemanagement.repository.ExpenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ExpenseService {
    private ExpenseRepository expenseRepository;
    private UserService userService;
    public Expense createExpense(CreateExpenseDTO createExpenseDTO) {
        List<User> users = new ArrayList<>();
        for(int id: createExpenseDTO.getUserId()){
            users.add(userService.getUserInternal(id));
        }
        Expense expense = Expense.builder()
                .amount(createExpenseDTO.getAmount())
                .description(createExpenseDTO.getDescription())
                .users(users)
                .build();
        return expenseRepository.save(expense);
    }
}
