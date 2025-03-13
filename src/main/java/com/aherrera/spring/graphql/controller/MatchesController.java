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
    public Iterable<Matches> findAllMatches(@Argument String order,  @Argument String phase, @Argument String status, @Argument Integer offset, @Argument Integer limit) {
        // order=DESC&phase=ALL&status=FINISHED&offset=0&limit=2
        return fspMatchRepository.findAll(order, phase, status, offset, limit);
    }

}
