package com.aherrera.spring.graphql.configuration;

import java.time.Duration;
import java.util.Collections;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableScheduling
@Slf4j
@EnableCaching
class RedisStandaloneConfig {

    // @Bean
    // public RedisConnectionFactory lettuceConnectionFactory() {
    // return new LettuceConnectionFactory(new
    // RedisStandaloneConfiguration("localhost", 6379));
    // }

    @Bean
    RedisTemplate<String, String> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, String> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        return template;
    }

    @Bean
    public RedisCacheManager cacheManager(RedisConnectionFactory connectionFactory) {
        return RedisCacheManager.builder(connectionFactory)
                .cacheDefaults(RedisCacheConfiguration.defaultCacheConfig())
                .transactionAware()
                .enableCreateOnMissingCache()
                .withInitialCacheConfigurations(Collections.singletonMap("predefined",
                        RedisCacheConfiguration.defaultCacheConfig().disableCachingNullValues()))
                .withCacheConfiguration("standingsCache",
                        RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofMinutes(5)))
                .withCacheConfiguration("matchesCache",
                        RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofMinutes(5)))
                .build();
    }

}