package com.aherrera.spring.graphql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aherrera.spring.graphql.model.Author;


public interface AuthorRepository extends MongoRepository<Author, String> {
}