    package com.mentormind.mentormind.entities;

    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;
    import org.springframework.stereotype.Service;


    @Entity
    @Getter @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class UserEntity{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String username;
        private String email;
        private String password_hash;
        private Integer rank;
        private Integer medal;
        private Boolean admin;
        //Is STUDENT or TEACHER
        @Enumerated(EnumType.STRING)
        private Teacher rol;
    }