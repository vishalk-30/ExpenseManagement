package com.scaler.expensemanagement.commands;

import com.scaler.expensemanagement.constant.Commands;

public class SettleUpCommand implements Command{
    @Override
    public boolean matches(String input) {
        return getCommand(input).equals(Commands.SETTLE_UP_COMMAND);
    }

    @Override
    public void execute(String input) {

    }
}
