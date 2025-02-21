package com.dactylofighterz.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dactylofighterz.domain.Player;
import com.dactylofighterz.repository.PlayerRepository;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player createPlayer(String username) {
        Player player = new Player();
        player.setUsername(username);
        player.setHealth(100);
        return playerRepository.save(player);
    }

    public Optional<Player> getPlayerByUsername(String username) {
        return playerRepository.findByUsername(username);
    }
}
