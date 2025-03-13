package com.aherrera.spring.graphql.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.aherrera.spring.graphql.model.RoundParticipants;
import com.aherrera.spring.graphql.utils.Utils;

@Component
public class FSPRoundParticipantsRepositoryImpl implements FSPRoundParticipantsRepository {

    private RestTemplate restTemplate;

    public FSPRoundParticipantsRepositoryImpl(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @Override
    public <S extends RoundParticipants> S save(S entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public <S extends RoundParticipants> Iterable<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public Optional<RoundParticipants> findById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public boolean existsById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public Iterable<RoundParticipants> findAll() {
        return restTemplate.getForEntity(this.URI, List.class).getBody();
    }

    @Override
    public Iterable<RoundParticipants> findAll(Integer competitionId, Integer seasonYear) {
        Map map = new HashMap<>();
        map.put("competitionId", competitionId);
        map.put("seasonYear", seasonYear);
        return restTemplate.getForEntity(Utils.calculateURI(this.URI, map), List.class).getBody();
    }

    @Override
    public Iterable<RoundParticipants> findAllById(Iterable<String> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public void deleteById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public void delete(RoundParticipants entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void deleteAllById(Iterable<? extends String> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends RoundParticipants> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }
}
