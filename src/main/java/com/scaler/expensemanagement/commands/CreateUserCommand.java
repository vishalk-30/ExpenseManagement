package com.scaler.expensemanagement.commands;

import com.scaler.expensemanagement.constant.Commands;
import com.scaler.expensemanagement.controller.UserController;
import com.scaler.expensemanagement.dto.CreateUserDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
@AllArgsConstructor
public class CreateUserCommand implements Command{
    private UserController userController;
    @Override
    public boolean matches(String input) {
        return getCommand(input).equals(Commands.REGISTER_USER_COMMAND);
    }

    @Override
    public void execute(String input) {
        List<String> token = getTokens(input);
        CreateUserDTO createUserDTO = CreateUserDTO.builder()
                                         .name(token.get(1))
                                         .email(token.get(2))
                                         .password(token.get(3))
                                         .phoneNumber(token.get(4))
                                         .build();
        userController.createUser(createUserDTO);

    }
}
