package org.esaip.teamportal.service;

import lombok.RequiredArgsConstructor;
import org.esaip.teamportal.dto.TileDto;
import org.esaip.teamportal.mapper.TileMapper;
import org.esaip.teamportal.model.Tile;
import org.esaip.teamportal.repository.TileRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TileService {
    private final TileRepository tileRepository;
    private final TileMapper tileMapper;

    public TileDto getTile(UUID id) {
        return tileRepository.findById(id)
                .map(tileMapper::toDto)
                .orElse(null);
    }

    public List<TileDto> getAllTile() {
        return tileMapper.toDtoList(tileRepository.findAll());
    }
}