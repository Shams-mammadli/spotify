package org.example.az.hamburg.it.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@EqualsAndHashCode
@ToString
@Getter
@Setter
@Table
@NoArgsConstructor
@AllArgsConstructor
public class SongEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    @ManyToMany
    private ArtistEntity artist;

}
