package com.dactylofighterz.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serial;
import java.io.Serializable;

/**
 * A risk.
 */
@EqualsAndHashCode(callSuper = false)
@Data
@org.springframework.data.mongodb.core.mapping.Document(collection = "risk")
public class Risk extends AbstractAuditingEntity<String> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("time")
    private int time;

    @Field("value")
    private int value;
}
