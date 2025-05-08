package org.example.az.hamburg.it.service;

import java.util.List;

public interface PlaylistService {
    PlaylistResponse save(PlaylistRequest request);
    List<PlaylistResponse> getAll();
    PlaylistResponse getById(Long id);
    PlaylistResponse update(Long id, PlaylistRequest request);
    void delete(Long id);
}
