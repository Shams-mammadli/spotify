package org.example.az.hamburg.it.controller;
import lombok.RequiredArgsConstructor;
import org.example.musicapp.dto.PlaylistDto;
import org.example.musicapp.service.PlaylistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/playlists")
@RequiredArgsConstructor
public class PlaylistController {

    private final PlaylistService playlistService;
    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @PostMapping
    public PlaylistResponse save(@RequestBody PlaylistRequest request) {
        return playlistService.save(request);
    }

    @GetMapping
    public List<PlaylistResponse> getAll() {
        return playlistService.getAll();
    }

    @GetMapping("/{id}")
    public PlaylistResponse getById(@PathVariable Long id) {
        return playlistService.getById(id);
    }

    @PutMapping("/{id}")
    public PlaylistResponse update(@PathVariable Long id, @RequestBody PlaylistRequest request) {
        return playlistService.update(id, request);
    }
}

