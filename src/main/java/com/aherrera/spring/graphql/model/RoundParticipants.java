package com.aherrera.spring.graphql.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RoundParticipants {

    @Id
	private String id;
    public Round round;
    public ArrayList<Team> teams;
}
