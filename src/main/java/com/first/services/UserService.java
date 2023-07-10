package com.first.services;

import com.first.dto.UserDto;
import com.first.entities.UserEntity;


public interface UserService {
    public UserDto createUser(UserDto userDto);
}
