package com.aherrera.spring.graphql.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.aherrera.spring.graphql.model.Matches;
import com.aherrera.spring.graphql.repository.FSPMatchRepository;

@Controller
public class MatchesController {

    // @Autowired
    private final FSPMatchRepository fspMatchRepository;


    MatchesController(@Qualifier("FSPMatchRepository") FSPMatchRepository fspMatchRepository) {
        this.fspMatchRepository = fspMatchRepository;
    }

    @QueryMapping
    public Iterable<Matches> findAllMatches(@Argument Integer competitionId,  @Argument Integer seasonYear) {
        // ?competitionId=1&seasonYear=2025
        // Pageable page = PageRequest.of(0, limit != null ? limit : 1000);
        // return roundRepository.saveAll(fspRoundParticipantsRepository.findAll());
        return fspMatchRepository.findAll(competitionId, seasonYear, null, null);
    }

}
