package com.aherrera.spring.graphql.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.aherrera.spring.graphql.model.Standings;
import com.aherrera.spring.graphql.repository.FSPStandingsRepository;

@Controller
public class StandingsController {

    // @Autowired
    private final FSPStandingsRepository fspStandingsRepository;


    StandingsController(@Qualifier("FSPStandingsRepository") FSPStandingsRepository fspStandingsRepository) {
        this.fspStandingsRepository = fspStandingsRepository;
    }

    @QueryMapping
    public Iterable<Standings> findAllStandings(@Argument Integer competitionId,  @Argument Integer seasonYear) {
        // ?competitionId=1&seasonYear=2025
        // Pageable page = PageRequest.of(0, limit != null ? limit : 1000);
        // return roundRepository.saveAll(fspRoundParticipantsRepository.findAll());
        return fspStandingsRepository.findAll(competitionId, seasonYear, null, null);
    }

    @QueryMapping
    public Integer countStandings() {
        return (int) fspStandingsRepository.count();
    }

    // @MutationMapping
    // public Author createAuthor(@Argument String name, @Argument Integer age) {
    // return fSPRoundRepository.save(new Author(name, age));
    // }
}
