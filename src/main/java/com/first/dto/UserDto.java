package com.first.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {
    private long id;

    private String firstName;

    private String lastName;

    private String email;

    private String userId;

    private String password;
}
