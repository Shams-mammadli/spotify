package org.example.az.hamburg.it.service;

import java.util.List;

public interface ArtistService {
    ArtistResponse save(ArtistRequest request);
    List<ArtistResponse> getAll();
    ArtistResponse getById(Long id);
    ArtistResponse update(Long id,ArtistRequest request);
    void  delete(Long id);
}
