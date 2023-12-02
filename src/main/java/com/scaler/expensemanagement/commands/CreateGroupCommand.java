package com.scaler.expensemanagement.commands;

import com.scaler.expensemanagement.constant.Commands;
import com.scaler.expensemanagement.controller.GroupController;
import com.scaler.expensemanagement.dto.CreateGroupDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

@Component
@AllArgsConstructor
public class CreateGroupCommand implements Command{
    private GroupController groupController;
    @Override
    public boolean matches(String input) { return getCommand(input).equals(Commands.CREATE_GROUP_COMMAND);}

    @Override
    public void execute(String input) {
        List<String> token = getTokens(input);
        List<Integer> memberId = Arrays.stream(token.get(3).split(","))
                .map(Integer::valueOf)
                .toList();
        CreateGroupDTO createGroupDTO = CreateGroupDTO.builder()
                                        .name(token.get(1))
                                        .createdBy(Integer.parseInt(token.get(2)))
                                         .members(memberId)
                                         .build();
        //System.out.println("DTO Created");
        //System.out.println(memberId);
        groupController.createGroup(createGroupDTO);


    }
}
