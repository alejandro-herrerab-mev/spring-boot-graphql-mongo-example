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
import com.aherrera.spring.graphql.model.Tutorial;
import com.aherrera.spring.graphql.repository.AuthorRepository;
import com.aherrera.spring.graphql.repository.TutorialRepository;

@Controller
public class TutorialController {

    private final AuthorRepository authorRepository;
    private final TutorialRepository tutorialRepository;

    TutorialController(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
        this.authorRepository = authorRepository;
        this.tutorialRepository = tutorialRepository;
    }

    @QueryMapping
    public Optional<Tutorial> tutorial(@Argument String id) {
        return tutorialRepository.findById(id);
    }

    @QueryMapping
    public Page<Tutorial> findAllTutorials(@Argument Integer limit) {
        Pageable page = PageRequest.of(0, limit != null ? limit : 1000);
        return tutorialRepository.findAll(page);
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

}
