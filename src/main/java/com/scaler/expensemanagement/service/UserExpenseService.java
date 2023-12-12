package com.scaler.expensemanagement.service;

import com.scaler.expensemanagement.constant.ExpenseType;
import com.scaler.expensemanagement.dto.CreateUserExpenseDTO;
import com.scaler.expensemanagement.models.User;
import com.scaler.expensemanagement.models.UserExpense;
import com.scaler.expensemanagement.repository.UserExpenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserExpenseService {
    private ExpenseService expenseService;
    private UserService userService;
    private UserExpenseRepository userExpenseRepository;

    public UserExpense createUserExpense(CreateUserExpenseDTO createUserExpenseDTO) {
        ExpenseType expenseType ;
        if(createUserExpenseDTO.getExpenseType().equals("PAID")){
            expenseType = ExpenseType.PAID;
        }else{
            expenseType = ExpenseType.OWES;
        }
        UserExpense userExpense = UserExpense.builder()
                .user(userService.getUserInternal(createUserExpenseDTO.getUserId()))
                .expense(expenseService.getExpenseInternal(createUserExpenseDTO.getExpenseId()))
                .note(createUserExpenseDTO.getNote())
                .amount(createUserExpenseDTO.getAmount())
                .expenseType(expenseType)
                .build();
        return userExpenseRepository.save(userExpense);



    }
}
