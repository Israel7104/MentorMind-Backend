    package com.mentormind.mentormind.entities;

    import jakarta.persistence.*;
    import lombok.*;


    @Entity
    @Getter @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Table(name = "users")
    @Builder
    public class UserEntity{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String username;
        private String email;
        private String password_hash;
        private Integer score;
        private Integer medal;
        private Boolean admin;
        //Is STUDENT or TEACHER

        @Enumerated(EnumType.STRING)
        private Teacher rol;

        @Enumerated (EnumType.STRING)
        private State state;


    }