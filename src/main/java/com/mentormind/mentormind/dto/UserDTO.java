package com.mentormind.mentormind.dto;


import lombok.*;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private String password_hash;
}
