package org.example.az.hamburg.it.dto;

import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table
@EqualsAndHashCode
public class UserRequest {
    @NotBlank(message = "Username bos ola bilmez")
    private String username;
    @NotBlank(message = "Password bos ola bilmez")
    private String password;

}
