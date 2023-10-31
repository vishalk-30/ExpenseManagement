package com.scaler.expensemanagement.models;

import com.scaler.expensemanagement.constant.ExpenseType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserExpense extends BaseModel{
    @ManyToOne
    private User user;
    private Double amount;
    private String note;
    @Enumerated
    private ExpenseType expenseType;

}
