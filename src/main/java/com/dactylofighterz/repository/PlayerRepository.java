package com.dactylofighterz.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dactylofighterz.domain.Player;

@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {
    Optional<Player> findByUsername(String username);
}
