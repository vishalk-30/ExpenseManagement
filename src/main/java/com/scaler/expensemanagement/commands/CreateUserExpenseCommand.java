package com.scaler.expensemanagement.commands;

import com.scaler.expensemanagement.constant.Commands;
import com.scaler.expensemanagement.controller.UserExpenseController;
import com.scaler.expensemanagement.dto.CreateUserExpenseDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CreateUserExpenseCommand implements Command{
    private UserExpenseController userExpenseController;
    @Override
    public boolean matches(String input) { return getCommand(input).equals(Commands.CREATE_USER_EXPENSE_COMMAND);}

    @Override
    public void execute(String input) {
        List<String> tokens = getTokens(input);
        CreateUserExpenseDTO createUserExpenseDTO = CreateUserExpenseDTO.builder()
                .userId(Integer.parseInt(tokens.get(1)))
                .expenseId(Integer.parseInt(tokens.get(2)))
                .amount(Double.parseDouble(tokens.get(3)))
                .note(tokens.get(4))
                .expenseType(tokens.get(5))
                .build();
        userExpenseController.createUserExpense(createUserExpenseDTO);

    }
}
