package com.scaler.expensemanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Expense extends BaseModel{
    private String description;
    private Double amount;
    @ManyToMany
    private List<UserExpense> paidBy;
    @ManyToMany
    private List<UserExpense> owedBy;

}
