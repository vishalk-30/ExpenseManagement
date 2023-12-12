package com.scaler.expensemanagement.models;

import com.scaler.expensemanagement.constant.ExpenseType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserExpense extends BaseModel{
    @ManyToOne
    private User user;
    @ManyToOne
    @JoinColumn(name = "expense_id")
    private Expense expense;
    private Double amount;
    private String note;
    @Enumerated
    private ExpenseType expenseType;

}
