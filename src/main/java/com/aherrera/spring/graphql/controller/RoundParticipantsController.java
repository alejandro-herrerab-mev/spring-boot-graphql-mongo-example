package com.aherrera.spring.graphql.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.aherrera.spring.graphql.model.RoundParticipants;
import com.aherrera.spring.graphql.repository.FSPRoundParticipantsRepository;
import com.aherrera.spring.graphql.repository.RoundRepository;

@Controller
public class RoundParticipantsController {

    // @Autowired
    private final FSPRoundParticipantsRepository fspRoundParticipantsRepository;

    // @Autowired
    private final RoundRepository roundRepository;

    // private final DeviceRepository deviceRepository;

    RoundParticipantsController(@Qualifier("FSPRoundParticipantsRepository") FSPRoundParticipantsRepository fspRoundParticipantsRepository,
            RoundRepository roundRepository) {
        this.roundRepository = roundRepository;
        this.fspRoundParticipantsRepository = fspRoundParticipantsRepository;
    }

    @QueryMapping
    public Iterable<RoundParticipants> findAllRounds(@Argument Integer competitionId,  @Argument Integer seasonYear) {
        // ?competitionId=1&seasonYear=2025
        // Pageable page = PageRequest.of(0, limit != null ? limit : 1000);
        // return roundRepository.saveAll(fspRoundParticipantsRepository.findAll());
        return fspRoundParticipantsRepository.findAll(competitionId, seasonYear);
    }

    @QueryMapping
    public Integer countRounds() {
        return (int) fspRoundParticipantsRepository.count();
    }

    // @MutationMapping
    // public Author createAuthor(@Argument String name, @Argument Integer age) {
    // return fSPRoundRepository.save(new Author(name, age));
    // }
}
