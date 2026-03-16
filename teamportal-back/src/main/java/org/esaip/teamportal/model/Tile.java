package org.esaip.teamportal.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tile {
    private UUID id;
    private String title;
    private String description;
    private Boolean done;
}
