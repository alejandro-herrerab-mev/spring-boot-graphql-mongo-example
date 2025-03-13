package com.aherrera.spring.graphql.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.aherrera.spring.graphql.model.Common.MetaData;
import com.aherrera.spring.graphql.model.Common.Translations;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document
public class RoundParticipants {

    @Id
	private String id;
    public Round round;
    public ArrayList<Team> teams;

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
}
