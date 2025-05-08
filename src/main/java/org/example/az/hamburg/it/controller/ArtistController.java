package org.example.az.hamburg.it.controller;
import lombok.RequiredArgsConstructor;
import org.example.musicapp.dto.ArtistDto;
import org.example.musicapp.service.ArtistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artists")
@RequiredArgsConstructor
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @PostMapping
    public ArtistResponse save(@RequestBody ArtistRequest request) {
        return artistService.save(request);
    }

    @GetMapping
    public List<ArtistResponse> getAll() {
        return artistService.getAll();
    }

    @GetMapping("/{id}")
    public ArtistResponse getById(@PathVariable Long id) {
        return artistService.getById(id);
    }

    @PutMapping("/{id}")
    public ArtistResponse update(@PathVariable Long id, @RequestBody ArtistRequest request) {
        return artistService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

    }
}
