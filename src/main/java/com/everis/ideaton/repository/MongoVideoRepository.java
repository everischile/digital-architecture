package com.everis.ideaton.repository;

import com.everis.ideaton.domain.Video;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoVideoRepository extends MongoRepository<Video, String> {
}
