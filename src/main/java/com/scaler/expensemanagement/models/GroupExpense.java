package com.scaler.expensemanagement.models;

import jakarta.persistence.ManyToMany;

public class GroupExpense extends BaseModel{
    @ManyToMany
    private Group group;
    @ManyToMany
    private Expense expense;
}
