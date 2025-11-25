package com.mentormind.mentormind.services;

import com.mentormind.mentormind.dto.UserDTO;
import com.mentormind.mentormind.entities.UserEntity;
import com.mentormind.mentormind.mappers.Mappers;
import com.mentormind.mentormind.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository repo;


    @Override
    public List<UserDTO> mostrarUsuarios() {
        return repo.findAll().stream().map(Mappers::toDTO).toList();
    }

    @Override
    public UserDTO crearUsuario(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO actualizarUsuario(Long id, UserDTO userDTO) {
        return null;
    }


}
