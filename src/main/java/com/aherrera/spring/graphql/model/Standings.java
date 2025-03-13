package com.aherrera.spring.graphql.model;

import java.util.ArrayList;

import com.aherrera.spring.graphql.model.RoundParticipants.Round;
import com.aherrera.spring.graphql.model.RoundParticipants.Team;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Standings {

    // import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
    // import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
    /*
     * ObjectMapper om = new ObjectMapper();
     * Root[] root = om.readValue(myJsonString, Root[].class);
     * 
     */

    @JsonProperty("group")
    public Group getGroup() {
        return this.group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    Group group;

    @JsonProperty("items")
    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    ArrayList<Item> items;

    @JsonProperty("qualificationLabels")
    public ArrayList<QualificationLabel> getQualificationLabels() {
        return this.qualificationLabels;
    }

    public void setQualificationLabels(ArrayList<QualificationLabel> qualificationLabels) {
        this.qualificationLabels = qualificationLabels;
    }

    ArrayList<QualificationLabel> qualificationLabels;

    @JsonProperty("round")
    public Round getRound() {
        return this.round;
    }

    public void setRound(Round round) {
        this.round = round;
    }

    Round round;

    @JsonProperty("status")
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    String status;

    public class Abbreviation {
        @JsonProperty("EN")
        public String getEN() {
            return this.eN;
        }

        public void setEN(String eN) {
            this.eN = eN;
        }

        String eN;

        @JsonProperty("FR")
        public String getFR() {
            return this.fR;
        }

        public void setFR(String fR) {
            this.fR = fR;
        }

        String fR;

        @JsonProperty("DE")
        public String getDE() {
            return this.dE;
        }

        public void setDE(String dE) {
            this.dE = dE;
        }

        String dE;

        @JsonProperty("ES")
        public String getES() {
            return this.eS;
        }

        public void setES(String eS) {
            this.eS = eS;
        }

        String eS;

        @JsonProperty("PT")
        public String getPT() {
            return this.pT;
        }

        public void setPT(String pT) {
            this.pT = pT;
        }

        String pT;

        @JsonProperty("IT")
        public String getIT() {
            return this.iT;
        }

        public void setIT(String iT) {
            this.iT = iT;
        }

        String iT;

        @JsonProperty("RU")
        public String getRU() {
            return this.rU;
        }

        public void setRU(String rU) {
            this.rU = rU;
        }

        String rU;

        @JsonProperty("ZH")
        public String getZH() {
            return this.zH;
        }

        public void setZH(String zH) {
            this.zH = zH;
        }

        String zH;

        @JsonProperty("TR")
        public String getTR() {
            return this.tR;
        }

        public void setTR(String tR) {
            this.tR = tR;
        }

        String tR;

        @JsonProperty("HU")
        public String getHU() {
            return this.hU;
        }

        public void setHU(String hU) {
            this.hU = hU;
        }

        String hU;

        @JsonProperty("CS")
        public String getCS() {
            return this.cS;
        }

        public void setCS(String cS) {
            this.cS = cS;
        }

        String cS;

        @JsonProperty("NL")
        public String getNL() {
            return this.nL;
        }

        public void setNL(String nL) {
            this.nL = nL;
        }

        String nL;
    }

    public class CountryName {
        @JsonProperty("EN")
        public String getEN() {
            return this.eN;
        }

        public void setEN(String eN) {
            this.eN = eN;
        }

        String eN;

        @JsonProperty("FR")
        public String getFR() {
            return this.fR;
        }

        public void setFR(String fR) {
            this.fR = fR;
        }

        String fR;

        @JsonProperty("DE")
        public String getDE() {
            return this.dE;
        }

        public void setDE(String dE) {
            this.dE = dE;
        }

        String dE;

        @JsonProperty("ES")
        public String getES() {
            return this.eS;
        }

        public void setES(String eS) {
            this.eS = eS;
        }

        String eS;

        @JsonProperty("PT")
        public String getPT() {
            return this.pT;
        }

        public void setPT(String pT) {
            this.pT = pT;
        }

        String pT;

        @JsonProperty("IT")
        public String getIT() {
            return this.iT;
        }

        public void setIT(String iT) {
            this.iT = iT;
        }

        String iT;

        @JsonProperty("RU")
        public String getRU() {
            return this.rU;
        }

        public void setRU(String rU) {
            this.rU = rU;
        }

        String rU;

        @JsonProperty("ZH")
        public String getZH() {
            return this.zH;
        }

        public void setZH(String zH) {
            this.zH = zH;
        }

        String zH;

        @JsonProperty("TR")
        public String getTR() {
            return this.tR;
        }

        public void setTR(String tR) {
            this.tR = tR;
        }

        String tR;

        @JsonProperty("HU")
        public String getHU() {
            return this.hU;
        }

        public void setHU(String hU) {
            this.hU = hU;
        }

        String hU;

        @JsonProperty("CS")
        public String getCS() {
            return this.cS;
        }

        public void setCS(String cS) {
            this.cS = cS;
        }

        String cS;

        @JsonProperty("NL")
        public String getNL() {
            return this.nL;
        }

        public void setNL(String nL) {
            this.nL = nL;
        }

        String nL;
    }

    public class DisplayName {
        @JsonProperty("EN")
        public String getEN() {
            return this.eN;
        }

        public void setEN(String eN) {
            this.eN = eN;
        }

        String eN;

        @JsonProperty("FR")
        public String getFR() {
            return this.fR;
        }

        public void setFR(String fR) {
            this.fR = fR;
        }

        String fR;

        @JsonProperty("DE")
        public String getDE() {
            return this.dE;
        }

        public void setDE(String dE) {
            this.dE = dE;
        }

        String dE;

        @JsonProperty("ES")
        public String getES() {
            return this.eS;
        }

        public void setES(String eS) {
            this.eS = eS;
        }

        String eS;

        @JsonProperty("PT")
        public String getPT() {
            return this.pT;
        }

        public void setPT(String pT) {
            this.pT = pT;
        }

        String pT;

        @JsonProperty("IT")
        public String getIT() {
            return this.iT;
        }

        public void setIT(String iT) {
            this.iT = iT;
        }

        String iT;

        @JsonProperty("RU")
        public String getRU() {
            return this.rU;
        }

        public void setRU(String rU) {
            this.rU = rU;
        }

        String rU;

        @JsonProperty("ZH")
        public String getZH() {
            return this.zH;
        }

        public void setZH(String zH) {
            this.zH = zH;
        }

        String zH;

        @JsonProperty("TR")
        public String getTR() {
            return this.tR;
        }

        public void setTR(String tR) {
            this.tR = tR;
        }

        String tR;

        @JsonProperty("HU")
        public String getHU() {
            return this.hU;
        }

        public void setHU(String hU) {
            this.hU = hU;
        }

        String hU;

        @JsonProperty("CS")
        public String getCS() {
            return this.cS;
        }

        public void setCS(String cS) {
            this.cS = cS;
        }

        String cS;

        @JsonProperty("NL")
        public String getNL() {
            return this.nL;
        }

        public void setNL(String nL) {
            this.nL = nL;
        }

        String nL;
    }

    public class DisplayOfficialName {
        @JsonProperty("EN")
        public String getEN() {
            return this.eN;
        }

        public void setEN(String eN) {
            this.eN = eN;
        }

        String eN;

        @JsonProperty("FR")
        public String getFR() {
            return this.fR;
        }

        public void setFR(String fR) {
            this.fR = fR;
        }

        String fR;

        @JsonProperty("DE")
        public String getDE() {
            return this.dE;
        }

        public void setDE(String dE) {
            this.dE = dE;
        }

        String dE;

        @JsonProperty("ES")
        public String getES() {
            return this.eS;
        }

        public void setES(String eS) {
            this.eS = eS;
        }

        String eS;

        @JsonProperty("PT")
        public String getPT() {
            return this.pT;
        }

        public void setPT(String pT) {
            this.pT = pT;
        }

        String pT;

        @JsonProperty("IT")
        public String getIT() {
            return this.iT;
        }

        public void setIT(String iT) {
            this.iT = iT;
        }

        String iT;

        @JsonProperty("RU")
        public String getRU() {
            return this.rU;
        }

        public void setRU(String rU) {
            this.rU = rU;
        }

        String rU;

        @JsonProperty("ZH")
        public String getZH() {
            return this.zH;
        }

        public void setZH(String zH) {
            this.zH = zH;
        }

        String zH;

        @JsonProperty("TR")
        public String getTR() {
            return this.tR;
        }

        public void setTR(String tR) {
            this.tR = tR;
        }

        String tR;

        @JsonProperty("HU")
        public String getHU() {
            return this.hU;
        }

        public void setHU(String hU) {
            this.hU = hU;
        }

        String hU;

        @JsonProperty("CS")
        public String getCS() {
            return this.cS;
        }

        public void setCS(String cS) {
            this.cS = cS;
        }

        String cS;

        @JsonProperty("NL")
        public String getNL() {
            return this.nL;
        }

        public void setNL(String nL) {
            this.nL = nL;
        }

        String nL;
    }

    public class DisplayTeamCode {
        @JsonProperty("EN")
        public String getEN() {
            return this.eN;
        }

        public void setEN(String eN) {
            this.eN = eN;
        }

        String eN;

        @JsonProperty("FR")
        public String getFR() {
            return this.fR;
        }

        public void setFR(String fR) {
            this.fR = fR;
        }

        String fR;

        @JsonProperty("DE")
        public String getDE() {
            return this.dE;
        }

        public void setDE(String dE) {
            this.dE = dE;
        }

        String dE;

        @JsonProperty("ES")
        public String getES() {
            return this.eS;
        }

        public void setES(String eS) {
            this.eS = eS;
        }

        String eS;

        @JsonProperty("PT")
        public String getPT() {
            return this.pT;
        }

        public void setPT(String pT) {
            this.pT = pT;
        }

        String pT;

        @JsonProperty("IT")
        public String getIT() {
            return this.iT;
        }

        public void setIT(String iT) {
            this.iT = iT;
        }

        String iT;

        @JsonProperty("RU")
        public String getRU() {
            return this.rU;
        }

        public void setRU(String rU) {
            this.rU = rU;
        }

        String rU;

        @JsonProperty("ZH")
        public String getZH() {
            return this.zH;
        }

        public void setZH(String zH) {
            this.zH = zH;
        }

        String zH;

        @JsonProperty("TR")
        public String getTR() {
            return this.tR;
        }

        public void setTR(String tR) {
            this.tR = tR;
        }

        String tR;

        @JsonProperty("HU")
        public String getHU() {
            return this.hU;
        }

        public void setHU(String hU) {
            this.hU = hU;
        }

        String hU;

        @JsonProperty("CS")
        public String getCS() {
            return this.cS;
        }

        public void setCS(String cS) {
            this.cS = cS;
        }

        String cS;

        @JsonProperty("NL")
        public String getNL() {
            return this.nL;
        }

        public void setNL(String nL) {
            this.nL = nL;
        }

        String nL;
    }

    public class Group {
        @JsonProperty("competitionId")
        public String getCompetitionId() {
            return this.competitionId;
        }

        public void setCompetitionId(String competitionId) {
            this.competitionId = competitionId;
        }

        String competitionId;

        @JsonProperty("id")
        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        String id;

        @JsonProperty("metaData")
        public MetaData getMetaData() {
            return this.metaData;
        }

        public void setMetaData(MetaData metaData) {
            this.metaData = metaData;
        }

        MetaData metaData;

        @JsonProperty("order")
        public int getOrder() {
            return this.order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        int order;

        @JsonProperty("phase")
        public String getPhase() {
            return this.phase;
        }

        public void setPhase(String phase) {
            this.phase = phase;
        }

        String phase;

        @JsonProperty("roundId")
        public String getRoundId() {
            return this.roundId;
        }

        public void setRoundId(String roundId) {
            this.roundId = roundId;
        }

        String roundId;

        @JsonProperty("seasonYear")
        public String getSeasonYear() {
            return this.seasonYear;
        }

        public void setSeasonYear(String seasonYear) {
            this.seasonYear = seasonYear;
        }

        String seasonYear;

        @JsonProperty("teams")
        public ArrayList<String> getTeams() {
            return this.teams;
        }

        public void setTeams(ArrayList<String> teams) {
            this.teams = teams;
        }

        ArrayList<String> teams;

        @JsonProperty("teamsQualifiedNumber")
        public int getTeamsQualifiedNumber() {
            return this.teamsQualifiedNumber;
        }

        public void setTeamsQualifiedNumber(int teamsQualifiedNumber) {
            this.teamsQualifiedNumber = teamsQualifiedNumber;
        }

        int teamsQualifiedNumber;

        @JsonProperty("translations")
        public Translations getTranslations() {
            return this.translations;
        }

        public void setTranslations(Translations translations) {
            this.translations = translations;
        }

        Translations translations;

        @JsonProperty("type")
        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        String type;
    }

    public class Item {
        @JsonProperty("drawn")
        public int getDrawn() {
            return this.drawn;
        }

        public void setDrawn(int drawn) {
            this.drawn = drawn;
        }

        int drawn;

        @JsonProperty("goalDifference")
        public int getGoalDifference() {
            return this.goalDifference;
        }

        public void setGoalDifference(int goalDifference) {
            this.goalDifference = goalDifference;
        }

        int goalDifference;

        @JsonProperty("goalsAgainst")
        public int getGoalsAgainst() {
            return this.goalsAgainst;
        }

        public void setGoalsAgainst(int goalsAgainst) {
            this.goalsAgainst = goalsAgainst;
        }

        int goalsAgainst;

        @JsonProperty("goalsFor")
        public int getGoalsFor() {
            return this.goalsFor;
        }

        public void setGoalsFor(int goalsFor) {
            this.goalsFor = goalsFor;
        }

        int goalsFor;

        @JsonProperty("goalsForAway")
        public int getGoalsForAway() {
            return this.goalsForAway;
        }

        public void setGoalsForAway(int goalsForAway) {
            this.goalsForAway = goalsForAway;
        }

        int goalsForAway;

        @JsonProperty("goalsForHome")
        public int getGoalsForHome() {
            return this.goalsForHome;
        }

        public void setGoalsForHome(int goalsForHome) {
            this.goalsForHome = goalsForHome;
        }

        int goalsForHome;

        @JsonProperty("isLive")
        public boolean getIsLive() {
            return this.isLive;
        }

        public void setIsLive(boolean isLive) {
            this.isLive = isLive;
        }

        boolean isLive;

        @JsonProperty("isOverridden")
        public boolean getIsOverridden() {
            return this.isOverridden;
        }

        public void setIsOverridden(boolean isOverridden) {
            this.isOverridden = isOverridden;
        }

        boolean isOverridden;

        @JsonProperty("lost")
        public int getLost() {
            return this.lost;
        }

        public void setLost(int lost) {
            this.lost = lost;
        }

        int lost;

        @JsonProperty("lostAway")
        public int getLostAway() {
            return this.lostAway;
        }

        public void setLostAway(int lostAway) {
            this.lostAway = lostAway;
        }

        int lostAway;

        @JsonProperty("lostHome")
        public int getLostHome() {
            return this.lostHome;
        }

        public void setLostHome(int lostHome) {
            this.lostHome = lostHome;
        }

        int lostHome;

        @JsonProperty("played")
        public int getPlayed() {
            return this.played;
        }

        public void setPlayed(int played) {
            this.played = played;
        }

        int played;

        @JsonProperty("points")
        public int getPoints() {
            return this.points;
        }

        public void setPoints(int points) {
            this.points = points;
        }

        int points;

        @JsonProperty("qualified")
        public boolean getQualified() {
            return this.qualified;
        }

        public void setQualified(boolean qualified) {
            this.qualified = qualified;
        }

        boolean qualified;

        @JsonProperty("rank")
        public int getRank() {
            return this.rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        int rank;

        @JsonProperty("rankTrend")
        public String getRankTrend() {
            return this.rankTrend;
        }

        public void setRankTrend(String rankTrend) {
            this.rankTrend = rankTrend;
        }

        String rankTrend;

        @JsonProperty("team")
        public Team getTeam() {
            return this.team;
        }

        public void setTeam(Team team) {
            this.team = team;
        }

        Team team;

        @JsonProperty("teamId")
        public String getTeamId() {
            return this.teamId;
        }

        public void setTeamId(String teamId) {
            this.teamId = teamId;
        }

        String teamId;

        @JsonProperty("won")
        public int getWon() {
            return this.won;
        }

        public void setWon(int won) {
            this.won = won;
        }

        int won;

        @JsonProperty("wonAway")
        public int getWonAway() {
            return this.wonAway;
        }

        public void setWonAway(int wonAway) {
            this.wonAway = wonAway;
        }

        int wonAway;

        @JsonProperty("wonHome")
        public int getWonHome() {
            return this.wonHome;
        }

        public void setWonHome(int wonHome) {
            this.wonHome = wonHome;
        }

        int wonHome;
    }

    public class LabelName {
        @JsonProperty("EN")
        public String getEN() {
            return this.eN;
        }

        public void setEN(String eN) {
            this.eN = eN;
        }

        String eN;

        @JsonProperty("FR")
        public String getFR() {
            return this.fR;
        }

        public void setFR(String fR) {
            this.fR = fR;
        }

        String fR;

        @JsonProperty("DE")
        public String getDE() {
            return this.dE;
        }

        public void setDE(String dE) {
            this.dE = dE;
        }

        String dE;

        @JsonProperty("ES")
        public String getES() {
            return this.eS;
        }

        public void setES(String eS) {
            this.eS = eS;
        }

        String eS;

        @JsonProperty("PT")
        public String getPT() {
            return this.pT;
        }

        public void setPT(String pT) {
            this.pT = pT;
        }

        String pT;

        @JsonProperty("IT")
        public String getIT() {
            return this.iT;
        }

        public void setIT(String iT) {
            this.iT = iT;
        }

        String iT;

        @JsonProperty("RU")
        public String getRU() {
            return this.rU;
        }

        public void setRU(String rU) {
            this.rU = rU;
        }

        String rU;

        @JsonProperty("ZH")
        public String getZH() {
            return this.zH;
        }

        public void setZH(String zH) {
            this.zH = zH;
        }

        String zH;

        @JsonProperty("TR")
        public String getTR() {
            return this.tR;
        }

        public void setTR(String tR) {
            this.tR = tR;
        }

        String tR;

        @JsonProperty("HU")
        public String getHU() {
            return this.hU;
        }

        public void setHU(String hU) {
            this.hU = hU;
        }

        String hU;

        @JsonProperty("CS")
        public String getCS() {
            return this.cS;
        }

        public void setCS(String cS) {
            this.cS = cS;
        }

        String cS;

        @JsonProperty("NL")
        public String getNL() {
            return this.nL;
        }

        public void setNL(String nL) {
            this.nL = nL;
        }

        String nL;
    }

    public class MetaData {
        @JsonProperty("groupName")
        public String getGroupName() {
            return this.groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        String groupName;

        @JsonProperty("groupShortName")
        public String getGroupShortName() {
            return this.groupShortName;
        }

        public void setGroupShortName(String groupShortName) {
            this.groupShortName = groupShortName;
        }

        String groupShortName;

        @JsonProperty("name")
        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        String name;

        @JsonProperty("type")
        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        String type;
    }

    public class Name {
        @JsonProperty("EN")
        public String getEN() {
            return this.eN;
        }

        public void setEN(String eN) {
            this.eN = eN;
        }

        String eN;

        @JsonProperty("FR")
        public String getFR() {
            return this.fR;
        }

        public void setFR(String fR) {
            this.fR = fR;
        }

        String fR;

        @JsonProperty("DE")
        public String getDE() {
            return this.dE;
        }

        public void setDE(String dE) {
            this.dE = dE;
        }

        String dE;

        @JsonProperty("ES")
        public String getES() {
            return this.eS;
        }

        public void setES(String eS) {
            this.eS = eS;
        }

        String eS;

        @JsonProperty("PT")
        public String getPT() {
            return this.pT;
        }

        public void setPT(String pT) {
            this.pT = pT;
        }

        String pT;

        @JsonProperty("IT")
        public String getIT() {
            return this.iT;
        }

        public void setIT(String iT) {
            this.iT = iT;
        }

        String iT;

        @JsonProperty("RU")
        public String getRU() {
            return this.rU;
        }

        public void setRU(String rU) {
            this.rU = rU;
        }

        String rU;

        @JsonProperty("ZH")
        public String getZH() {
            return this.zH;
        }

        public void setZH(String zH) {
            this.zH = zH;
        }

        String zH;

        @JsonProperty("TR")
        public String getTR() {
            return this.tR;
        }

        public void setTR(String tR) {
            this.tR = tR;
        }

        String tR;

        @JsonProperty("HU")
        public String getHU() {
            return this.hU;
        }

        public void setHU(String hU) {
            this.hU = hU;
        }

        String hU;

        @JsonProperty("CS")
        public String getCS() {
            return this.cS;
        }

        public void setCS(String cS) {
            this.cS = cS;
        }

        String cS;

        @JsonProperty("NL")
        public String getNL() {
            return this.nL;
        }

        public void setNL(String nL) {
            this.nL = nL;
        }

        String nL;
    }

    public class QualificationLabel {
        @JsonProperty("labelId")
        public String getLabelId() {
            return this.labelId;
        }

        public void setLabelId(String labelId) {
            this.labelId = labelId;
        }

        String labelId;

        @JsonProperty("translations")
        public Translations getTranslations() {
            return this.translations;
        }

        public void setTranslations(Translations translations) {
            this.translations = translations;
        }

        Translations translations;
    }

    public class ShortName {
        @JsonProperty("EN")
        public String getEN() {
            return this.eN;
        }

        public void setEN(String eN) {
            this.eN = eN;
        }

        String eN;

        @JsonProperty("FR")
        public String getFR() {
            return this.fR;
        }

        public void setFR(String fR) {
            this.fR = fR;
        }

        String fR;

        @JsonProperty("DE")
        public String getDE() {
            return this.dE;
        }

        public void setDE(String dE) {
            this.dE = dE;
        }

        String dE;

        @JsonProperty("ES")
        public String getES() {
            return this.eS;
        }

        public void setES(String eS) {
            this.eS = eS;
        }

        String eS;

        @JsonProperty("PT")
        public String getPT() {
            return this.pT;
        }

        public void setPT(String pT) {
            this.pT = pT;
        }

        String pT;

        @JsonProperty("IT")
        public String getIT() {
            return this.iT;
        }

        public void setIT(String iT) {
            this.iT = iT;
        }

        String iT;

        @JsonProperty("RU")
        public String getRU() {
            return this.rU;
        }

        public void setRU(String rU) {
            this.rU = rU;
        }

        String rU;

        @JsonProperty("ZH")
        public String getZH() {
            return this.zH;
        }

        public void setZH(String zH) {
            this.zH = zH;
        }

        String zH;

        @JsonProperty("TR")
        public String getTR() {
            return this.tR;
        }

        public void setTR(String tR) {
            this.tR = tR;
        }

        String tR;

        @JsonProperty("HU")
        public String getHU() {
            return this.hU;
        }

        public void setHU(String hU) {
            this.hU = hU;
        }

        String hU;

        @JsonProperty("CS")
        public String getCS() {
            return this.cS;
        }

        public void setCS(String cS) {
            this.cS = cS;
        }

        String cS;

        @JsonProperty("NL")
        public String getNL() {
            return this.nL;
        }

        public void setNL(String nL) {
            this.nL = nL;
        }

        String nL;
    }

    public class Translations {
        @JsonProperty("name")
        public Name getName() {
            return this.name;
        }

        public void setName(Name name) {
            this.name = name;
        }

        Name name;

        @JsonProperty("shortName")
        public ShortName getShortName() {
            return this.shortName;
        }

        public void setShortName(ShortName shortName) {
            this.shortName = shortName;
        }

        ShortName shortName;

        @JsonProperty("countryName")
        public CountryName getCountryName() {
            return this.countryName;
        }

        public void setCountryName(CountryName countryName) {
            this.countryName = countryName;
        }

        CountryName countryName;

        @JsonProperty("displayName")
        public DisplayName getDisplayName() {
            return this.displayName;
        }

        public void setDisplayName(DisplayName displayName) {
            this.displayName = displayName;
        }

        DisplayName displayName;

        @JsonProperty("displayOfficialName")
        public DisplayOfficialName getDisplayOfficialName() {
            return this.displayOfficialName;
        }

        public void setDisplayOfficialName(DisplayOfficialName displayOfficialName) {
            this.displayOfficialName = displayOfficialName;
        }

        DisplayOfficialName displayOfficialName;

        @JsonProperty("displayTeamCode")
        public DisplayTeamCode getDisplayTeamCode() {
            return this.displayTeamCode;
        }

        public void setDisplayTeamCode(DisplayTeamCode displayTeamCode) {
            this.displayTeamCode = displayTeamCode;
        }

        DisplayTeamCode displayTeamCode;

        @JsonProperty("labelName")
        public LabelName getLabelName() {
            return this.labelName;
        }

        public void setLabelName(LabelName labelName) {
            this.labelName = labelName;
        }

        LabelName labelName;

        @JsonProperty("abbreviation")
        public Abbreviation getAbbreviation() {
            return this.abbreviation;
        }

        public void setAbbreviation(Abbreviation abbreviation) {
            this.abbreviation = abbreviation;
        }

        Abbreviation abbreviation;
    }

}
