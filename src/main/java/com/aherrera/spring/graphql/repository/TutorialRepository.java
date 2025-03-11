package com.aherrera.spring.graphql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aherrera.spring.graphql.model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {

}
