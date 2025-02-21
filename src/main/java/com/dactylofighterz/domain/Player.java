package com.dactylofighterz.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * A player.
 */
@EqualsAndHashCode(callSuper = false)
@Data
@org.springframework.data.mongodb.core.mapping.Document(collection = "player")
public class Player extends AbstractAuditingEntity<String> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("characters")
    private List<Character> characters;
}
