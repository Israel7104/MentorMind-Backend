package com.mentormind.mentormind.services;

import com.mentormind.mentormind.dto.UserDTO;

import java.util.List;

public interface IUserService {

    List<UserDTO> mostrarUsuarios();
    UserDTO crearUsuario(UserDTO userDTO);
    UserDTO actualizarUsuario(Long id,UserDTO userDTO);

}
