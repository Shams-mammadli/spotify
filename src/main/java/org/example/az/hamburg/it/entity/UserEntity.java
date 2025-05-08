package org.example.az.hamburg.it.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import static jakarta.persistence.CascadeType.MERGE;
import static jakarta.persistence.CascadeType.PERSIST;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users")
@EqualsAndHashCode(of = "id")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "user", cascade = {PERSIST, MERGE})
    private List<PlaylistEntity> playlists;
}

// static import,
// import lombok.*; duzeldersiniz zehmet olmasa
// role un data type ini enum edin  (evvelki proyektdeki kimi)
// private ler ucun FieldDefaults istifade ede bilersiniz