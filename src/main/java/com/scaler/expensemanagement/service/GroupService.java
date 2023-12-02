package com.scaler.expensemanagement.service;

import com.scaler.expensemanagement.dto.CreateGroupDTO;
import com.scaler.expensemanagement.models.Group;
import com.scaler.expensemanagement.models.User;
import com.scaler.expensemanagement.repository.GroupRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class GroupService {
    private GroupRepository groupRepository;
    private UserService userService;
    public Group createGroup(CreateGroupDTO createGroupDTO) {
        User createdBy = userService.getUserInternal(createGroupDTO.getCreatedBy());
        List<User> members = new ArrayList<>();
        for(int id: createGroupDTO.getMembers()){
            members.add(userService.getUserInternal(id));
        }
        List<User> admins = new ArrayList<>();
        admins.add(createdBy);
        Group group = Group.builder()
                .name(createGroupDTO.getName())
                .createdBy(createdBy)
                .members(members)
                .admins(admins)
                .build();
        return groupRepository.save(group);

    }
}
