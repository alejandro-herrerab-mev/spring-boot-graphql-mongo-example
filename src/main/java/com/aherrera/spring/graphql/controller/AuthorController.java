package com.aherrera.spring.graphql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.aherrera.spring.graphql.model.Author;
import com.aherrera.spring.graphql.repository.AuthorRepository;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @QueryMapping
    public Optional<Author> author(@Argument String id) {
        return authorRepository.findById(id);
    }

    @QueryMapping
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    @QueryMapping
    public Integer countAuthors() {
        return (int) authorRepository.count();
    }

    @MutationMapping
    public Author createAuthor(@Argument String name, @Argument Integer age) {
        return authorRepository.save(new Author(name, age));
    }
}
