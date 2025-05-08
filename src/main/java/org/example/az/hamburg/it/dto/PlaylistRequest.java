package org.example.az.hamburg.it.dto;

import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
@EqualsAndHashCode
public class PlaylistRequest {
    private Long playlistId;
    @NotBlank(message = "Playlist adi bos qala bilmez")
    private String name;
}
