package com.aherrera.spring.graphql.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.aherrera.spring.graphql.model.Standings;
import com.aherrera.spring.graphql.utils.Utils;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class FSPStandingsRepositoryImpl implements FSPStandingsRepository {

    private RestTemplate restTemplate;

    @Autowired
    private CacheManager cacheManager;

    public FSPStandingsRepositoryImpl(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @Override
    public <S extends Standings> S save(S entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public <S extends Standings> Iterable<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public Optional<Standings> findById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public boolean existsById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public Iterable<Standings> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Iterable<Standings> findAllById(Iterable<String> ids) {
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
    public void delete(Standings entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void deleteAllById(Iterable<? extends String> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends Standings> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    @Cacheable(value = "standingsCache", key = "'standings__competitionId__'+#competitionId+'__seasonYear__'+#seasonYear")
    public Iterable<Standings> findAll(Integer competitionId, Integer seasonYear, List<Integer> groupIds,
            Integer roundId) {
        Map map = new HashMap<>();
        map.put("competitionId", competitionId);
        map.put("seasonYear", seasonYear);
        return restTemplate.getForEntity(Utils.calculateURI(this.URI, map), List.class).getBody();
    }

      @Scheduled(fixedDelay = 5000)
    public void printCache(){
        cacheManager.getCacheNames().stream().forEach(x -> {
            log.debug(x);
            Cache jCache = cacheManager.getCache(x);
        });
    }
}
