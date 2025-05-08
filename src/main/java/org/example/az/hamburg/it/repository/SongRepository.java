package org.example.az.hamburg.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.web.server.authentication.ott.ServerOneTimeTokenGenerationSuccessHandler;

import java.util.List;

public interface SongRepository extends JpaRepository<SongRepository ,Long> {
    List<SongRepository> findbyArtisttId(Long artistId);
}
