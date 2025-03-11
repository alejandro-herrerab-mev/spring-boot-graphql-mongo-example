package com.aherrera.spring.graphql.resolver;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.aherrera.spring.graphql.model.Author;
import com.aherrera.spring.graphql.model.Tutorial;
import com.aherrera.spring.graphql.repository.AuthorRepository;
import com.aherrera.spring.graphql.repository.TutorialRepository;

@Component
public class Mutation {
  private AuthorRepository authorRepository;
  private TutorialRepository tutorialRepository;

  public Mutation(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
    this.authorRepository = authorRepository;
    this.tutorialRepository = tutorialRepository;
  }

  public Author createAuthor(String name, Integer age) {
    Author author = new Author();
    author.setName(name);
    author.setAge(age);

    authorRepository.save(author);

    return author;
  }

  public Tutorial createTutorial(String title, String description, String authorId) {
    Tutorial book = new Tutorial();
    book.setAuthor(new Author(authorId));
    book.setTitle(title);
    book.setDescription(description);

    tutorialRepository.save(book);

    return book;
  }

  public boolean deleteTutorial(String id) {
    tutorialRepository.deleteById(id);
    return true;
  }

  public Tutorial updateTutorial(String id, String title, String description) {
    Optional<Tutorial> optTutorial = tutorialRepository.findById(id);

    if (optTutorial.isPresent()) {
      Tutorial tutorial = optTutorial.get();

      if (title != null)
        tutorial.setTitle(title);
      if (description != null)
        tutorial.setDescription(description);

      tutorialRepository.save(tutorial);
      return tutorial;
    }

    return null;
  }
}
