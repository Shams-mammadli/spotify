package org.example.az.hamburg.it.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table
@Entity
@Data
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class ArtistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,nullable = false)
    private String name;
    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
    private List<SongEntity> songs;

}
