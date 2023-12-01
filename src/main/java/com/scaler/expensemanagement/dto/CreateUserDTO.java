package com.scaler.expensemanagement.dto;

import com.scaler.expensemanagement.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class CreateUserDTO {
    private String name;
    private String phoneNumber;
    private String password;
    private String email;

    public User toUser(){
        return User.builder()
                .email(email)
                .password(password)
                .phoneNumber(phoneNumber)
                .name(name)
                .build();
    }
}
