package org.esaip.teamportal.service;

import org.esaip.teamportal.dto.TileDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TileService {
    public TileDto getTile() {
        return new TileDto(
                UUID.randomUUID(),
                "200", "200", "red", Boolean.FALSE
        );
    }
}