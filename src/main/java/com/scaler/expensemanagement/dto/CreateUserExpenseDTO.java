package com.scaler.expensemanagement.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserExpenseDTO {
    private Integer userId;
    private Integer expenseId;
    private Double amount;
    private String note;
    private String expenseType;
}
