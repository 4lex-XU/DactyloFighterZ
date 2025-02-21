package com.dactylofighterz.domain;

import jakarta.validation.constraints.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * A Authority.
 */
@Data
@Document(collection = "jhi_authority")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Authority implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @NotNull
    @Size(max = 50)
    @Id
    private String name;
}
