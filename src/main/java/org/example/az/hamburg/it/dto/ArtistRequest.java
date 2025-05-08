package org.example.az.hamburg.it.dto;

import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Table
public class ArtistRequest {
    @NotBlank(message = "Artist adi bos qala bilmez")
    private String name;
}
