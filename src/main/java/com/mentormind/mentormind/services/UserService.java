package com.mentormind.mentormind.services;

import com.mentormind.mentormind.entities.UserEntity;
import com.mentormind.mentormind.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService  {

    @Autowired
    private IUserRepository repo;

    //Mostrar todos
    public List<UserEntity> getAll(){
        return repo.findAll();
    }

}
