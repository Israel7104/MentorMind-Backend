package com.mentormind.mentormind.mappers;

import com.mentormind.mentormind.dto.UserDTO;
import com.mentormind.mentormind.entities.UserEntity;

public class Mappers {


    //Mapeo de UserEntity a UserService
    public static UserDTO toDTO(UserEntity userEntity) {
        if (userEntity == null) return null;

        return UserDTO.builder()
                .id(userEntity.getId())
                .username(userEntity.getUsername())
                .email(userEntity.getEmail())
                .password_hash(userEntity.getPassword_hash())
                .build();
    }
}

