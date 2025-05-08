package org.example.az.hamburg.it.dto;

import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
@EqualsAndHashCode
public class UserResponse {
    private Long id;
    private String username;

}
