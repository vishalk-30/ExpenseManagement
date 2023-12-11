package com.scaler.expensemanagement.commands;

import com.scaler.expensemanagement.constant.Commands;
import com.scaler.expensemanagement.controller.ExpenseController;
import com.scaler.expensemanagement.dto.CreateExpenseDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@AllArgsConstructor
public class CreateExpenseCommand implements Command {
    private ExpenseController expenseController;
    @Override
    public boolean matches(String input) {return getCommand(input).equals(Commands.CREATE_EXPENSE_COMMAND);}

    @Override
    public void execute(String input) {
        List<String> token = getTokens(input);
        List<Integer> userId =  Arrays.stream(token.get(3).split(","))
                .map(Integer::valueOf)
                .toList();
        CreateExpenseDTO createExpenseDTO = CreateExpenseDTO.builder()
                                            .description(token.get(1))
                                            .amount(Double.parseDouble(token.get(2)))
                                             .userId(userId)
                                             .build();
        expenseController.createExpense(createExpenseDTO);


    }
}
