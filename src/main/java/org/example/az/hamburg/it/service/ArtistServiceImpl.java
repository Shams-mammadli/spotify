package org.example.az.hamburg.it.service;

import jdk.internal.foreign.LayoutPath;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArtistServiceImpl implements ArtistService {


    @Override
    public ArtistResponse save(ArtistRequest request) {
        Artist artist = new Artist();
        artist.setName(request.getName());
        artistRepository.save(artist);
        return new ArtistResponse(artist.getId(), artist.getName());
    }

    @Override
    public List<ArtistResponse> getAll() {
        return  artistRepository.findAll().stream()
                .map(artist -> new ArtistResponse(artist.getId(), artist.getName())).
                collect(Collectors.toList());
    }

    @Override
    public ArtistResponse getById(Long id) {
        Artist artist = artistRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Artist tapılmadı"));
        return new ArtistResponse(artist.getId(), artist.getName());
    }

    @Override
    public ArtistResponse update(Long id, ArtistRequest request) {
        Artist artist = artistRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Artist tapılmadı"));
        artist.setName(request.getName());
        artistRepository.save(artist);
        return new ArtistResponse(artist.getId(), artist.getName());
    }

    @Override
    public void delete(Long id) {
        artistRepository.deleteById(id);

    }
}


