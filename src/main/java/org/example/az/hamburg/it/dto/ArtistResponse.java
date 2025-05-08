package org.example.az.hamburg.it.dto;

import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
@EqualsAndHashCode
public class ArtistResponse {
    private String name;
    private Long id;
}
