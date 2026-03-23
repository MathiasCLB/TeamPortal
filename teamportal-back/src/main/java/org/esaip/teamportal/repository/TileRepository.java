package org.esaip.teamportal.repository;

import org.esaip.teamportal.model.Tile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface TileRepository extends JpaRepository<Tile, UUID> {
}