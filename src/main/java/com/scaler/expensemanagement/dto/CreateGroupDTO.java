package com.scaler.expensemanagement.dto;

import com.scaler.expensemanagement.models.User;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Builder
public class CreateGroupDTO {
    private String name;
    private List<Integer> members = new ArrayList<>();
    private int createdBy;

}
