package org.esaip.teamportal.dto;

import java.util.UUID;

public record TileDto(
        UUID id,
        String width,
        String height,
        String color,
        Boolean active
){}