package com.mentormind.mentormind.services;

import com.mentormind.mentormind.dto.UserDTO;
import com.mentormind.mentormind.entities.State;
import com.mentormind.mentormind.entities.Teacher;
import com.mentormind.mentormind.entities.UserEntity;
import com.mentormind.mentormind.exceptions.NotFoundException;
import com.mentormind.mentormind.mappers.Mappers;
import com.mentormind.mentormind.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repo;


    @Override
    public List<UserDTO> mostrarUsuarios() {
        return repo.findAll().stream().map(Mappers::toDTO).toList();
    }

    @Override
    public UserDTO crearUsuario(UserDTO userDTO) {
        var user = UserEntity.builder().
                username(userDTO.getUsername())
                .admin(false)
                .rol(Teacher.STUDENT)
                .score(0)
                .state(State.ACTIVATED)
                .medal(0)
                .email(userDTO.getEmail())
                .password_hash(userDTO.getPassword_hash())
                .id(userDTO.getId())
                .build();
        return Mappers.toDTO(repo.save(user));
    }

    @Override
    public UserDTO actualizarUsuario(Long id, UserDTO userDTO) {
        UserEntity user = repo.findById(id)
                .orElseThrow(() -> new NotFoundException("Usuario no encontrado"));
        user.setUsername(userDTO.getUsername());
        user.setPassword_hash(userDTO.getPassword_hash());

        return Mappers.toDTO(repo.save(user));
    }


}
