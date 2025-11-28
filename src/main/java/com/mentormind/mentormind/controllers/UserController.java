package com.mentormind.mentormind.controllers;


import com.mentormind.mentormind.dto.UserDTO;
import com.mentormind.mentormind.entities.UserEntity;
import com.mentormind.mentormind.services.IUserService;
import com.mentormind.mentormind.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    /// Obtener todos los usuarios
    @GetMapping
    public ResponseEntity<List<UserDTO>> getUserEntity(){
        return ResponseEntity.ok(userService.mostrarUsuarios());
    }

    /// Crear usuario
    @PostMapping
    public ResponseEntity<UserDTO> crearUsuario(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok(userService.crearUsuario(userDTO));
    }

    /// Actualizar usuario
    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> actualizarUsuario(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(userService.actualizarUsuario(id, userDTO));
    }

}
