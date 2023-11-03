package com.scaler.expensemanagement.models;

import com.scaler.expensemanagement.constant.ExpenseStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Expense extends BaseModel{
    private String description;
    private Double amount;

    @Enumerated
    private ExpenseStatus expenseStatus;
    @ManyToOne
    private Group group;
    @ManyToMany
    private List<User> users;
    @OneToMany(mappedBy = "expense")
    private List<UserExpense> paidBy;
    @OneToMany(mappedBy = "expense")
    private List<UserExpense> owedBy;

}
