package com.first.servicesImpl;

import com.first.dto.UserDto;
import com.first.entities.UserEntity;
import com.first.repositories.UserRepo;
import com.first.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo ur;


    @Override
    public UserDto createUser(UserDto userDto) {
        UserEntity ue = toUserEntity(userDto);
        UserEntity savedUser = ur.save(ue);
        UserDto ud = toUserDto(savedUser);
        return ud;
    }

    private UserEntity toUserEntity(UserDto userDto) {
        UserEntity ue = new UserEntity();
        ue.setFirstName(userDto.getFirstName());
        return ue;
    }
    private UserDto toUserDto(UserEntity userEntity) {
        UserDto ud = new UserDto();
        ud.setFirstName(userEntity.getFirstName());
        ud.setId(userEntity.getId());
        return ud;
    }


}
