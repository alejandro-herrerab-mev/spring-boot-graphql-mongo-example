package com.aherrera.spring.graphql.controller;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    public Page<Author> findAllAuthors(@Argument Integer limit) {
        Pageable page = PageRequest.of(0, limit != null ? limit : 1000);
        return authorRepository.findAll(page);
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
