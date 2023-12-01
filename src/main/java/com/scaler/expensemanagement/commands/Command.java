package com.scaler.expensemanagement.commands;

import java.util.Arrays;
import java.util.List;

public interface Command {
    boolean matches(String input); // register Vishal vishal@email.com
    void execute(String input);

    default String getCommand(String input){
        return getTokens(input).get(0);
    }

    default List<String> getTokens(String input){
        return Arrays.stream(input.split(" ")).toList();

    }
}
