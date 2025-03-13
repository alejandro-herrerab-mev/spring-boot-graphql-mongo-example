package com.aherrera.spring.graphql.model;

import java.util.List;

import com.aherrera.spring.graphql.model.Common.MetaData;
import com.aherrera.spring.graphql.model.Common.Translations;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Round {
    private Boolean active;
    @JsonProperty("benchGKCount")
    private Long benchGkcount;
    private Long benchPlayersCount;
    private Long benchStaffCount;
    private Double coefficientWinnerBonus;
    private String competitionId;
    private String dateFrom;
    private String dateTo;
    private Long fieldPlayersCount;
    private Long groupCount;
    private String id;
    private MetaData metaData;
    private String mode;
    private String modeDetail;
    private Long orderInCompetition;
    private String phase;
    private String seasonYear;
    private String secondaryType;
    private String stadiumNameType;
    private String status;
    private Long substitutionCount;
    private Long teamCount;
    private List<String> teams;
    private Translations translations;
}