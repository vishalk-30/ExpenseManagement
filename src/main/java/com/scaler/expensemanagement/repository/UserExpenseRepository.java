package com.scaler.expensemanagement.repository;

import com.scaler.expensemanagement.models.UserExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserExpenseRepository extends JpaRepository<UserExpense, Integer> {
}
