package com.aherrera.spring.graphql.repository;

import org.springframework.data.repository.CrudRepository;

import com.aherrera.spring.graphql.model.Matches;

public interface FSPMatchRepository extends CrudRepository<Matches, String> {
    // final String URI = "https://match.uefa.com/v5/matches?order=DESC&phase=ALL&status=FINISHED&offset=0&limit=2";

    final String URI = "https://match.uefa.com/v5/matches";

    public Iterable<Matches> findAll(String order, String phase, String status, Integer offset, Integer limit);



    // Standings
    // https://standings.uefa.com/v1/standings?roundId=' + roundId;
     
    // last matches
    // https://match.uefa.com/v5/matches?order=DESC&phase=ALL&status=FINISHED&offset=0&limit=200
     
    // https://comp'.uefa.com/v2/rounds/?competitionId=' + competitionId + '&phase=' + mPhase + '&seasonYear=' + seasonYear
    
}



