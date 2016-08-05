package com.everis.ideaton.repository;

import com.everis.ideaton.domain.Image;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface MongoImageRepository extends MongoRepository<Image, BigInteger> {}
