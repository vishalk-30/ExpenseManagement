package com.scaler.expensemanagement.controller;

import com.scaler.expensemanagement.dto.CreateGroupDTO;
import com.scaler.expensemanagement.models.Group;
import com.scaler.expensemanagement.service.GroupService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class GroupController {
    private GroupService groupService;
    public Group createGroup(CreateGroupDTO createGroupDTO){
        //System.out.println(createGroupDTO.getName());
        return groupService.createGroup(createGroupDTO);
    }
}
