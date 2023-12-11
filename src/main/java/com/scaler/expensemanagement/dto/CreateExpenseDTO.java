package com.scaler.expensemanagement.dto;

import com.scaler.expensemanagement.models.Expense;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class CreateExpenseDTO {
    private String description;
    private Double amount;
    private List<Integer> userId;
}
