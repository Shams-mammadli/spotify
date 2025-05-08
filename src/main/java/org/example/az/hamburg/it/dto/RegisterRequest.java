package org.example.az.hamburg.it.dto;

import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class RegisterRequest {
    @NotBlank(message = "Username bos qala bilmez")
    private String username;
    @NotBlank(message = "password bos qala bilmez")
    private String password;
}
