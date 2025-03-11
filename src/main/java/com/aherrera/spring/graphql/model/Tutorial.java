package com.aherrera.spring.graphql.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Tutorial {

	@Id
	private String id;

	@Field(name = "title")
	private String title;

	@Field(name = "description")
	private String description;

	@Field
	private Author author;

	public Tutorial() {
	}

	public Tutorial(String title, String description, Author author) {
		this.title = title;
		this.description = description;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", author=" + author + "]";
	}

}
