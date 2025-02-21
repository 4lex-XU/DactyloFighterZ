package com.dactylofighterz.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * A character.
 */
@EqualsAndHashCode(callSuper = false)
@Data
@org.springframework.data.mongodb.core.mapping.Document(collection = "character")
public class Character extends AbstractAuditingEntity<String> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("cost")
    private int cost;

    @Field("skills")
    private List<Skill> skills;

    @Field("ki")
    private int ki;
}
