package com.aherrera.spring.graphql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aherrera.spring.graphql.model.RoundParticipants;


public interface RoundRepository extends MongoRepository<RoundParticipants, String> {

}
