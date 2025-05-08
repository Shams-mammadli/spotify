package org.example.az.hamburg.it.service;

import java.awt.print.Pageable;
import java.util.List;

public interface SongService {
    SongResponse save(SongRequest request);
    List<SongResponse> getAll();
    SongResponse getById(Long id);
    SongResponse update(Long id, SongRequest request);
    void delete(Long id);

}
