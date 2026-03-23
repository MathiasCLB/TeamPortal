package org.esaip.teamportal.mapper;

import org.esaip.teamportal.dto.TileDto;
import org.esaip.teamportal.model.Tile;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TileMapper {
    TileDto toDto(Tile tile);
    List<TileDto> toDtoList(List<Tile> tiles);
}