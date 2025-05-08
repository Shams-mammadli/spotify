package org.example.az.hamburg.it.controller;
import lombok.RequiredArgsConstructor;
import org.example.musicapp.dto.SongDto;
import org.example.musicapp.service.SongService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/songs")
@RequiredArgsConstructor
public class SongController {

    private final SongService songService;
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @PostMapping
    public SongResponse save(@RequestBody SongRequest request) {
        return songService.save(request);
    }

    @GetMapping
    public List<SongResponse> getAll() {
        return songService.getAll();
    }

    @GetMapping("/{id}")
    public SongResponse getById(@PathVariable Long id) {
        return songService.getById(id);
    }

    @PutMapping("/{id}")
    public SongResponse update(@PathVariable Long id, @RequestBody SongRequest request) {
        return songService.update(id, request);
    }
}
