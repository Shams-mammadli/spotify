package org.example.az.hamburg.it.dto;

import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Table
public class SongRequest {
    private String title;
    private String artistId;
    private String genre;
}
