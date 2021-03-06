package com.everis.ideaton.repository;

import com.everis.ideaton.domain.Idea;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoIdeaRepository extends MongoRepository<Idea, String> {
}
