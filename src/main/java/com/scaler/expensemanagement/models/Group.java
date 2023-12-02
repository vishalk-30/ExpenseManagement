package com.scaler.expensemanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity(name = "user_group")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Group extends BaseModel{
    private String name;
    @ManyToMany
    private List<User> members = new ArrayList<>();
    @ManyToOne
    private User createdBy;
    @ManyToMany
    private List<User> admins = new ArrayList<>();
}
