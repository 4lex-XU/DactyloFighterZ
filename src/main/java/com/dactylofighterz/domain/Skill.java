package com.dactylofighterz.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serial;
import java.io.Serializable;

/**
 * A skill.
 */
@EqualsAndHashCode(callSuper = false)
@Data
@org.springframework.data.mongodb.core.mapping.Document(collection = "skill")
public class Skill extends AbstractAuditingEntity<String> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("type")
    private String type;

    @Field("value")
    private int value;

    @Field("risk")
    private Risk risk;

    @Field("ki_cost")
    private int kiCost;
}
