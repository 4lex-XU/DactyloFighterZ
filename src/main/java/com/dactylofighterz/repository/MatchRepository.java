package com.dactylofighterz.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dactylofighterz.domain.Match;

@Repository
public interface MatchRepository extends MongoRepository<Match, String> {
    List<Match> findByStatus(String status);
}
