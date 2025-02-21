package com.dactylofighterz.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "characters")
public class Character {
    @Id
    private String id;
    private String name;
    private int health;
    private List<Attack> attacks;
    private int energy; // Énergie pour les attaques spéciales
}
