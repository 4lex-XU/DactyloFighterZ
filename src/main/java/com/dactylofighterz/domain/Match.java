package com.dactylofighterz.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serial;
import java.io.Serializable;

/**
 * A match.
 */
@EqualsAndHashCode(callSuper = false)
@Data
@org.springframework.data.mongodb.core.mapping.Document(collection = "match")
public class Match extends AbstractAuditingEntity<String> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("player_1")
    private Player player1;

    @Field("player_2")
    private Player player2;

    @Field("status")
    private String status;

    @Field("winner")
    private Player winner;
}
