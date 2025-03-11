package com.aherrera.spring.graphql.resolver;

import org.springframework.stereotype.Component;

import com.aherrera.spring.graphql.model.Author;
import com.aherrera.spring.graphql.model.Tutorial;
import com.aherrera.spring.graphql.repository.AuthorRepository;
import com.aherrera.spring.graphql.repository.TutorialRepository;

@Component
public class Query {
	private AuthorRepository authorRepository;
	private TutorialRepository tutorialRepository;
	
	// GraphQLScalarType longScalar =
    //   ExtendedScalars.newAliasedScalar("Long")
    //       .aliasedScalar(ExtendedScalars.GraphQLLong)
    //       .build();

	public Query(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
		this.authorRepository = authorRepository;
		this.tutorialRepository = tutorialRepository;
	}

	public Iterable<Author> findAllAuthors() {
		return authorRepository.findAll();
	}

	public Iterable<Tutorial> findAllTutorials() {
		return tutorialRepository.findAll();
	}

	public Long countAuthors() {
		return authorRepository.count();
	}

	public Long countTutorials() {
		return tutorialRepository.count();
	}

}
