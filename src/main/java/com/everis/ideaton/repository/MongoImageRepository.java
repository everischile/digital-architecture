package com.everis.ideaton.repository;

import com.everis.ideaton.domain.Image;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoImageRepository extends MongoRepository<Image, String> {}
