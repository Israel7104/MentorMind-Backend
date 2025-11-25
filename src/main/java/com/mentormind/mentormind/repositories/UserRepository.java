package com.mentormind.mentormind.repositories;

import com.mentormind.mentormind.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
