package org.example.az.hamburg.it.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Getter
@Setter
@Service
public class SongServiceImpl implements SongService {
    @Override
    public SongResponse save(SongRequest request) {
        Artist artist = artistRepository.findById(request.getArtistId())
                .orElseThrow(() -> new RuntimeException("Artist tapılmadı"));
        Song song = new Song();
        song.setTitle(request.getTitle());
        song.setGenre(request.getGenre());
        song.setArtist(artist);
        songRepository.save(song);
        return new SongResponse(song.getId(), song.getTitle(), song.getGenre(), artist.getName());
    }

    @Override
    public List<SongResponse> getAll() {
        return songRepository.findAll().stream()
                .map(song -> new SongResponse(
                        song.getId(),
                        song.getTitle(),
                        song.getGenre(),
                        song.getArtist().getName()))
                .collect(Collectors.toList());
    }

    @Override
    public SongResponse getById(Long id) {
        Song song = songRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mahnı tapılmadı"));
        return new SongResponse(song.getId(),
                song.getTitle(), song.getGenre(), song.getArtist().getName());
    }

    @Override
    public SongResponse update(Long id, SongRequest request) {
        Song song = songRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mahnı tapılmadı"));
        Artist artist = artistRepository.findById(request.getArtistId())
                .orElseThrow(() -> new RuntimeException("Artist tapılmadı"));
        song.setTitle(request.getTitle());
        song.setGenre(request.getGenre());
        song.setArtist(artist);
        songRepository.save(song);
        return new SongResponse(song.getId(), song.getTitle(), song.getGenre(), artist.getName());
    }

    @Override
    public void delete(Long id) {
        songRepository.deleteById(id);
    }
}
