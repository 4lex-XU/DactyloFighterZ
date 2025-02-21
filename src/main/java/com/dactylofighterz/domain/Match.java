package com.dactylofighterz.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "matches")
public class Match {
    @Id
    private String id;
    private Player player1;
    private Player player2;
    private String status; // "waiting", "in_progress", "finished"
    private String winnerId;
}
