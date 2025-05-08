package org.example.az.hamburg.it.service;

import jdk.internal.foreign.LayoutPath;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PlaylistServiceImpl implements PlaylistService {

    @Override
    public PlaylistResponse save(PlaylistRequest request) {
        User user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("User tapılmadı"));
        Playlist playlist = new Playlist();
        playlist.setName(request.getName());
        playlist.setUser(user);
        playlistRepository.save(playlist);
        return new PlaylistResponse(playlist.getId(), playlist.getName(), user.getUsername());
    }

    @Override
    public List<PlaylistResponse> getAll() {
        return playlistRepository.findAll().stream()
                .map(playlist -> new PlaylistResponse(
                        playlist.getId(),
                        playlist.getName(),
                        playlist.getUser().getUsername()).collect(Collectors.toList());
    }

    @Override
    public PlaylistResponse getById(Long id) {
        Playlist playlist = playlistRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Playlist tapılmadı"));

        return new PlaylistResponse(playlist.getId(), playlist.getName(),
                playlist.getUser().getUsername());

    }

    @Override
    public PlaylistResponse update(Long id, PlaylistRequest request) {
        Playlist playlist = playlistRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Playlist tapılmadı"));

        playlist.setName(request.getName());
        playlistRepository.save(playlist);

        return new PlaylistResponse(playlist.getId(),
                playlist.getName(), playlist.getUser().getUsername());
    }

    @Override
    public void delete(Long id) {
        playlistRepository.deleteById(id);

    }
}

