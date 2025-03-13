package com.aherrera.spring.graphql.repository;

import org.springframework.data.repository.CrudRepository;

import com.aherrera.spring.graphql.model.RoundParticipants;

public interface FSPRoundParticipantsRepository extends CrudRepository<RoundParticipants, String> {
    // final String URI = "https://comp.uefa.com/v2/round-participants?competitionId=1&seasonYear=2025";
    final String URI = "https://comp.uefa.com/v2/round-participants";

    public Iterable<RoundParticipants> findAll(Integer competitionId, Integer seasonYear);

    // Standings
    // https://standings.uefa.com/v1/standings?roundId=' + roundId;
     
    // last matches
    // https://match.uefa.com/v5/matches?order=DESC&phase=ALL&status=FINISHED&offset=0&limit=200
     
    // https://comp'.uefa.com/v2/rounds/?competitionId=' + competitionId + '&phase=' + mPhase + '&seasonYear=' + seasonYear
    
}



