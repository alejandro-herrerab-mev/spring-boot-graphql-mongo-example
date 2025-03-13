package com.aherrera.spring.graphql.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aherrera.spring.graphql.model.Standings;

public interface FSPStandingsRepository extends CrudRepository<Standings, String> {
    final String URI = "https://standings.uefa.com/v1/standings";

    public Iterable<Standings> findAll(Integer competitionId, Integer seasonYear, List<Integer> groupIds, Integer roundId );

    // Standings
    // https://standings.uefa.com/v1/standings?roundId=' + roundId;
     
    // last matches
    // https://match.uefa.com/v5/matches?order=DESC&phase=ALL&status=FINISHED&offset=0&limit=200
     
    // https://comp'.uefa.com/v2/rounds/?competitionId=' + competitionId + '&phase=' + mPhase + '&seasonYear=' + seasonYear
    
}



