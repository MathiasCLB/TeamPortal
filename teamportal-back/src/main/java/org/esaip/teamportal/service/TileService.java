package org.esaip.teamportal.service;

import lombok.RequiredArgsConstructor;
import org.esaip.teamportal.dto.TileDto;
import org.esaip.teamportal.mapper.TileMapper;
import org.esaip.teamportal.model.Tile;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TileService {
    private final TileMapper tileMapper;

    public TileDto getTile() {
        return tileMapper.toDto(
                new Tile(                        UUID.randomUUID(),
                        "200", "200", "red", Boolean.TRUE
                )
        );
    }
}