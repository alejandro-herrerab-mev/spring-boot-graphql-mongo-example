package com.aherrera.spring.graphql.utils;

import java.util.Map;

import org.springframework.web.util.UriComponentsBuilder;

public class Utils {
    
    public static String calculateURI(String uri, Map<String, Object> queryParameters) {
        UriComponentsBuilder ucb = UriComponentsBuilder.fromHttpUrl(uri);
        for (String key : queryParameters.keySet()) {
            ucb.queryParam(key, queryParameters.get(key));
        }
        return ucb.encode().toUriString();
    }

}
