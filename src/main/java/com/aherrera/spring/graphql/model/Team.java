package com.aherrera.spring.graphql.model;

import com.aherrera.spring.graphql.model.Common.Translations;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Team {

    private String associationId;
    private String associationLogoUrl;
    private String bigLogoUrl;
    private String confederationType;
    private String countryCode;
    private String id;
    private String idProvider;
    private String internationalName;
    private Boolean isPlaceHolder;
    private String logoUrl;
    private String mediumLogoUrl;
    private String organizationId;
    private String teamCode;
    private String teamTypeDetail;
    private Translations translations;
    private Boolean typeIsNational;
    private String typeTeam;
}
