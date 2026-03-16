package org.esaip.teamportal.controller;

import lombok.RequiredArgsConstructor;
import org.esaip.teamportal.dto.TileDto;
import org.esaip.teamportal.service.TileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class TileController {
    private final TileService tileService;

    @GetMapping("/tile")
    public TileDto getTile() {
        return tileService.getTile();
    }
}