package com.scaler.expensemanagement.controller;

import com.scaler.expensemanagement.dto.CreateExpenseDTO;
import com.scaler.expensemanagement.models.Expense;
import com.scaler.expensemanagement.service.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class ExpenseController {
    private ExpenseService expenseService;
    public Expense createExpense(CreateExpenseDTO createExpenseDTO) {
        return expenseService.createExpense(createExpenseDTO);

    }
}
