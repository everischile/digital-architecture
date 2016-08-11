package com.everis.ideaton.repository;

import com.everis.ideaton.domain.Like;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoLikeRepository extends MongoRepository<Like, String> {
}
