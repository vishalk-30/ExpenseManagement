package com.scaler.expensemanagement.models;

import jakarta.persistence.Entity;
import lombok.*;

@Entity(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class User extends BaseModel{
    private String name;
    private String phoneNumber;
    private String password;
    private String email;
}
