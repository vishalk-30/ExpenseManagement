package com.scaler.expensemanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
@Entity
public class GroupExpense extends BaseModel{
    @ManyToOne
    private Group group;
    @OneToOne
    private Expense expense;
}
