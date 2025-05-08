package org.example.az.hamburg.it.dto;

import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@Table
@NoArgsConstructor
public class SongResponse {
    private String title;
    private Long id;
    private String genre;
    private String username;
}
