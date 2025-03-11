package com.aherrera.spring.graphql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.aherrera.spring.graphql.model.Author;
import com.aherrera.spring.graphql.model.Tutorial;
import com.aherrera.spring.graphql.repository.AuthorRepository;
import com.aherrera.spring.graphql.repository.TutorialRepository;

@Controller
public class GraphQLController {

    private final AuthorRepository authorRepository;
    private final TutorialRepository tutorialRepository;

    GraphQLController(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
        this.authorRepository = authorRepository;
        this.tutorialRepository = tutorialRepository;
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

    @QueryMapping
    public Optional<Tutorial> tutorial(@Argument String id) {
        return tutorialRepository.findById(id);
    }

    @QueryMapping
    public List<Tutorial> findAllTutorials() {
        return tutorialRepository.findAll();
    }

    @QueryMapping
    public Integer countTutorials() {
        return (int) tutorialRepository.count();
    }

    @MutationMapping
    public Tutorial createTutorial(@Argument String title, @Argument String description, @Argument String author) {
        Tutorial tutorialResult = null;
        Optional<Author> authorOpt = authorRepository.findById(author);
        if (authorOpt.isPresent()) {
            Tutorial tutorial = new Tutorial(title, description, authorOpt.get());
            tutorialResult = tutorialRepository.save(tutorial);
        }
        return tutorialResult;
    }

    // @MutationMapping
    // public Book addBook(@Argument BookInput bookInput) {
    // return Book.addBook(bookInput);
    // }

    // @SchemaMapping
    // public Tutorial tutorial(Author author) {
    // return Author.getById(book.authorId());
    // }

}
