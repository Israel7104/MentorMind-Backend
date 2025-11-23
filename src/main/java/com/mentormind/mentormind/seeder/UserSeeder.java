package com.mentormind.mentormind.seeder;

import com.mentormind.mentormind.entities.Teacher;
import com.mentormind.mentormind.entities.UserEntity;
import com.mentormind.mentormind.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserSeeder implements CommandLineRunner {

    @Autowired
    private IUserRepository repo;

    @Override
    public void run(String... args) {

        if (repo.count() == 0) {

            UserEntity user1 = new UserEntity(
                    null,
                    "pepe",
                    "pepe@example.com",
                    "hash123",
                    1,
                    10,
                    false,
                    Teacher.STUDENT
            );

            UserEntity user2 = new UserEntity(
                    null,
                    "ana",
                    "ana@example.com",
                    "hash222",
                    2,
                    20,
                    false,
                    Teacher.TEACHER
            );

            repo.save(user1);
            repo.save(user2);

            System.out.println(">> Usuarios insertados.");
        }
    }
}
