package com.aherrera.spring.graphql.model;

import java.util.List;

import com.aherrera.spring.graphql.model.Common.Translations;
import com.aherrera.spring.graphql.model.Matches.HomeTeam.KickOffTime;
import com.aherrera.spring.graphql.model.Matches.HomeTeam.Leg;
import com.aherrera.spring.graphql.model.Matches.HomeTeam.Matchday;
import com.aherrera.spring.graphql.model.Matches.HomeTeam.PlayerEvents;
import com.aherrera.spring.graphql.model.Matches.HomeTeam.PlayerOfTheMatch;
import com.aherrera.spring.graphql.model.Matches.HomeTeam.Referee;
import com.aherrera.spring.graphql.model.Matches.HomeTeam.RelatedMatch;
import com.aherrera.spring.graphql.model.Matches.HomeTeam.Score;
import com.aherrera.spring.graphql.model.Matches.HomeTeam.Stadium;
import com.aherrera.spring.graphql.model.Matches.HomeTeam.Winner;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Matches {

    private AwayTeam awayTeam;
	private Competition competition;
	private String fullTimeAt;
	private HomeTeam homeTeam;
	private String id;
	private KickOffTime kickOffTime;
	private Leg leg;
	private String lineupStatus;
	private Long matchAttendance;
	private Matchday matchday;
	private PlayerEvents playerEvents;
	private PlayerOfTheMatch playerOfTheMatch;
	private List<Referee> referees;
	private List<RelatedMatch> relatedMatches;
	private Round round;
	private Score score;
	private String seasonYear;
	private Long sessionNumber;
	private Stadium stadium;
	private String status;
	private String type;
	private Winner winner;

	public AwayTeam getAwayTeam() {
		return this.awayTeam;
	}

	public Competition getCompetition() {
		return this.competition;
	}

	public String getFullTimeAt() {
		return this.fullTimeAt;
	}

	public HomeTeam getHomeTeam() {
		return this.homeTeam;
	}

	public String getId() {
		return this.id;
	}

	public KickOffTime getKickOffTime() {
		return this.kickOffTime;
	}

	public Leg getLeg() {
		return this.leg;
	}

	public String getLineupStatus() {
		return this.lineupStatus;
	}

	public Long getMatchAttendance() {
		return this.matchAttendance;
	}

	public Matchday getMatchday() {
		return this.matchday;
	}

	public PlayerEvents getPlayerEvents() {
		return this.playerEvents;
	}

	public PlayerOfTheMatch getPlayerOfTheMatch() {
		return this.playerOfTheMatch;
	}

	public List<Referee> getReferees() {
		return this.referees;
	}

	public List<RelatedMatch> getRelatedMatches() {
		return this.relatedMatches;
	}

	public Round getRound() {
		return this.round;
	}

	public Score getScore() {
		return this.score;
	}

	public String getSeasonYear() {
		return this.seasonYear;
	}

	public Long getSessionNumber() {
		return this.sessionNumber;
	}

	public Stadium getStadium() {
		return this.stadium;
	}

	public String getStatus() {
		return this.status;
	}

	public String getType() {
		return this.type;
	}

	public Winner getWinner() {
		return this.winner;
	}

	public void setAwayTeam(AwayTeam awayTeam) {
		this.awayTeam = awayTeam;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	public void setFullTimeAt(String fullTimeAt) {
		this.fullTimeAt = fullTimeAt;
	}

	public void setHomeTeam(HomeTeam homeTeam) {
		this.homeTeam = homeTeam;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setKickOffTime(KickOffTime kickOffTime) {
		this.kickOffTime = kickOffTime;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public void setLineupStatus(String lineupStatus) {
		this.lineupStatus = lineupStatus;
	}

	public void setMatchAttendance(Long matchAttendance) {
		this.matchAttendance = matchAttendance;
	}

	public void setMatchday(Matchday matchday) {
		this.matchday = matchday;
	}

	public void setPlayerEvents(PlayerEvents playerEvents) {
		this.playerEvents = playerEvents;
	}

	public void setPlayerOfTheMatch(PlayerOfTheMatch playerOfTheMatch) {
		this.playerOfTheMatch = playerOfTheMatch;
	}

	public void setReferees(List<Referee> referees) {
		this.referees = referees;
	}

	public void setRelatedMatches(List<RelatedMatch> relatedMatches) {
		this.relatedMatches = relatedMatches;
	}

	public void setRound(Round round) {
		this.round = round;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public void setSeasonYear(String seasonYear) {
		this.seasonYear = seasonYear;
	}

	public void setSessionNumber(Long sessionNumber) {
		this.sessionNumber = sessionNumber;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setWinner(Winner winner) {
		this.winner = winner;
	}

	public class AwayTeam {
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

		public AwayTeam(String associationId, String associationLogoUrl, String bigLogoUrl, String confederationType,
				String countryCode, String id, String idProvider, String internationalName, Boolean isPlaceHolder,
				String logoUrl, String mediumLogoUrl, String organizationId, String teamCode, String teamTypeDetail,
				Translations translations, Boolean typeIsNational, String typeTeam) {
			this.associationId = associationId;
			this.associationLogoUrl = associationLogoUrl;
			this.bigLogoUrl = bigLogoUrl;
			this.confederationType = confederationType;
			this.countryCode = countryCode;
			this.id = id;
			this.idProvider = idProvider;
			this.internationalName = internationalName;
			this.isPlaceHolder = isPlaceHolder;
			this.logoUrl = logoUrl;
			this.mediumLogoUrl = mediumLogoUrl;
			this.organizationId = organizationId;
			this.teamCode = teamCode;
			this.teamTypeDetail = teamTypeDetail;
			this.translations = translations;
			this.typeIsNational = typeIsNational;
			this.typeTeam = typeTeam;
		}

		public String getAssociationId() {
			return this.associationId;
		}

		public String getAssociationLogoUrl() {
			return this.associationLogoUrl;
		}

		public String getBigLogoUrl() {
			return this.bigLogoUrl;
		}

		public String getConfederationType() {
			return this.confederationType;
		}

		public String getCountryCode() {
			return this.countryCode;
		}

		public String getId() {
			return this.id;
		}

		public String getIdProvider() {
			return this.idProvider;
		}

		public String getInternationalName() {
			return this.internationalName;
		}

		public Boolean getIsPlaceHolder() {
			return this.isPlaceHolder;
		}

		public String getLogoUrl() {
			return this.logoUrl;
		}

		public String getMediumLogoUrl() {
			return this.mediumLogoUrl;
		}

		public String getOrganizationId() {
			return this.organizationId;
		}

		public String getTeamCode() {
			return this.teamCode;
		}

		public String getTeamTypeDetail() {
			return this.teamTypeDetail;
		}

		public Translations getTranslations() {
			return this.translations;
		}

		public Boolean getTypeIsNational() {
			return this.typeIsNational;
		}

		public String getTypeTeam() {
			return this.typeTeam;
		}

		public void setAssociationId(String associationId) {
			this.associationId = associationId;
		}

		public void setAssociationLogoUrl(String associationLogoUrl) {
			this.associationLogoUrl = associationLogoUrl;
		}

		public void setBigLogoUrl(String bigLogoUrl) {
			this.bigLogoUrl = bigLogoUrl;
		}

		public void setConfederationType(String confederationType) {
			this.confederationType = confederationType;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setIdProvider(String idProvider) {
			this.idProvider = idProvider;
		}

		public void setInternationalName(String internationalName) {
			this.internationalName = internationalName;
		}

		public void setIsPlaceHolder(Boolean isPlaceHolder) {
			this.isPlaceHolder = isPlaceHolder;
		}

		public void setLogoUrl(String logoUrl) {
			this.logoUrl = logoUrl;
		}

		public void setMediumLogoUrl(String mediumLogoUrl) {
			this.mediumLogoUrl = mediumLogoUrl;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public void setTeamCode(String teamCode) {
			this.teamCode = teamCode;
		}

		public void setTeamTypeDetail(String teamTypeDetail) {
			this.teamTypeDetail = teamTypeDetail;
		}

		public void setTranslations(Translations translations) {
			this.translations = translations;
		}

		public void setTypeIsNational(Boolean typeIsNational) {
			this.typeIsNational = typeIsNational;
		}

		public void setTypeTeam(String typeTeam) {
			this.typeTeam = typeTeam;
		}
	}

	public class Competition {
		private String age;
		private String code;
		private String id;
		private Images images;
		private MetaData metaData;
		private String region;
		private String sex;
		private String sportsType;
		private String teamCategory;
		private Translations translations;
		private String type;

		public Competition(String age, String code, String id, Images images, MetaData metaData, String region,
				String sex, String sportsType, String teamCategory, Translations translations, String type) {
			this.age = age;
			this.code = code;
			this.id = id;
			this.images = images;
			this.metaData = metaData;
			this.region = region;
			this.sex = sex;
			this.sportsType = sportsType;
			this.teamCategory = teamCategory;
			this.translations = translations;
			this.type = type;
		}

		public String getAge() {
			return this.age;
		}

		public String getCode() {
			return this.code;
		}

		public String getId() {
			return this.id;
		}

		public Images getImages() {
			return this.images;
		}

		public MetaData getMetaData() {
			return this.metaData;
		}

		public String getRegion() {
			return this.region;
		}

		public String getSex() {
			return this.sex;
		}

		public String getSportsType() {
			return this.sportsType;
		}

		public String getTeamCategory() {
			return this.teamCategory;
		}

		public Translations getTranslations() {
			return this.translations;
		}

		public String getType() {
			return this.type;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setImages(Images images) {
			this.images = images;
		}

		public void setMetaData(MetaData metaData) {
			this.metaData = metaData;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public void setSportsType(String sportsType) {
			this.sportsType = sportsType;
		}

		public void setTeamCategory(String teamCategory) {
			this.teamCategory = teamCategory;
		}

		public void setTranslations(Translations translations) {
			this.translations = translations;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public class Images {
		@JsonProperty("FULL_LOGO")
		private String fullLogo;

		public Images(String fullLogo) {
			this.fullLogo = fullLogo;
		}

		public String getFullLogo() {
			return this.fullLogo;
		}

		public void setFullLogo(String fullLogo) {
			this.fullLogo = fullLogo;
		}
	}

	public class MetaData {
		private String name;

		public MetaData(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}


	public class Name {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public Name(String en, String fr, String de, String es, String pt, String it, String ru, String zh, String tr,
				String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class PrequalifyingName {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public PrequalifyingName(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class QualifyingName {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public QualifyingName(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class TournamentName {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public TournamentName(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class HomeTeam {
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

		public HomeTeam(String associationId, String associationLogoUrl, String bigLogoUrl, String confederationType,
				String countryCode, String id, String idProvider, String internationalName, Boolean isPlaceHolder,
				String logoUrl, String mediumLogoUrl, String organizationId, String teamCode, String teamTypeDetail,
				Translations translations, Boolean typeIsNational, String typeTeam) {
			this.associationId = associationId;
			this.associationLogoUrl = associationLogoUrl;
			this.bigLogoUrl = bigLogoUrl;
			this.confederationType = confederationType;
			this.countryCode = countryCode;
			this.id = id;
			this.idProvider = idProvider;
			this.internationalName = internationalName;
			this.isPlaceHolder = isPlaceHolder;
			this.logoUrl = logoUrl;
			this.mediumLogoUrl = mediumLogoUrl;
			this.organizationId = organizationId;
			this.teamCode = teamCode;
			this.teamTypeDetail = teamTypeDetail;
			this.translations = translations;
			this.typeIsNational = typeIsNational;
			this.typeTeam = typeTeam;
		}

		public String getAssociationId() {
			return this.associationId;
		}

		public String getAssociationLogoUrl() {
			return this.associationLogoUrl;
		}

		public String getBigLogoUrl() {
			return this.bigLogoUrl;
		}

		public String getConfederationType() {
			return this.confederationType;
		}

		public String getCountryCode() {
			return this.countryCode;
		}

		public String getId() {
			return this.id;
		}

		public String getIdProvider() {
			return this.idProvider;
		}

		public String getInternationalName() {
			return this.internationalName;
		}

		public Boolean getIsPlaceHolder() {
			return this.isPlaceHolder;
		}

		public String getLogoUrl() {
			return this.logoUrl;
		}

		public String getMediumLogoUrl() {
			return this.mediumLogoUrl;
		}

		public String getOrganizationId() {
			return this.organizationId;
		}

		public String getTeamCode() {
			return this.teamCode;
		}

		public String getTeamTypeDetail() {
			return this.teamTypeDetail;
		}

		public Translations getTranslations() {
			return this.translations;
		}

		public Boolean getTypeIsNational() {
			return this.typeIsNational;
		}

		public String getTypeTeam() {
			return this.typeTeam;
		}

		public void setAssociationId(String associationId) {
			this.associationId = associationId;
		}

		public void setAssociationLogoUrl(String associationLogoUrl) {
			this.associationLogoUrl = associationLogoUrl;
		}

		public void setBigLogoUrl(String bigLogoUrl) {
			this.bigLogoUrl = bigLogoUrl;
		}

		public void setConfederationType(String confederationType) {
			this.confederationType = confederationType;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setIdProvider(String idProvider) {
			this.idProvider = idProvider;
		}

		public void setInternationalName(String internationalName) {
			this.internationalName = internationalName;
		}

		public void setIsPlaceHolder(Boolean isPlaceHolder) {
			this.isPlaceHolder = isPlaceHolder;
		}

		public void setLogoUrl(String logoUrl) {
			this.logoUrl = logoUrl;
		}

		public void setMediumLogoUrl(String mediumLogoUrl) {
			this.mediumLogoUrl = mediumLogoUrl;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public void setTeamCode(String teamCode) {
			this.teamCode = teamCode;
		}

		public void setTeamTypeDetail(String teamTypeDetail) {
			this.teamTypeDetail = teamTypeDetail;
		}

		public void setTranslations(Translations translations) {
			this.translations = translations;
		}

		public void setTypeIsNational(Boolean typeIsNational) {
			this.typeIsNational = typeIsNational;
		}

		public void setTypeTeam(String typeTeam) {
			this.typeTeam = typeTeam;
		}


	public class KickOffTime {
		private String date;
		private String dateTime;
		private Long utcOffsetInHours;

		public KickOffTime(String date, String dateTime, Long utcOffsetInHours) {
			this.date = date;
			this.dateTime = dateTime;
			this.utcOffsetInHours = utcOffsetInHours;
		}

		public String getDate() {
			return this.date;
		}

		public String getDateTime() {
			return this.dateTime;
		}

		public Long getUtcOffsetInHours() {
			return this.utcOffsetInHours;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public void setDateTime(String dateTime) {
			this.dateTime = dateTime;
		}

		public void setUtcOffsetInHours(Long utcOffsetInHours) {
			this.utcOffsetInHours = utcOffsetInHours;
		}
	}

	public class Leg {
		private String dateTimeFrom;
		private String dateTimeTo;
		private Long number;
		private Translations translations;

		public Leg(String dateTimeFrom, String dateTimeTo, Long number, Translations translations) {
			this.dateTimeFrom = dateTimeFrom;
			this.dateTimeTo = dateTimeTo;
			this.number = number;
			this.translations = translations;
		}

		public String getDateTimeFrom() {
			return this.dateTimeFrom;
		}

		public String getDateTimeTo() {
			return this.dateTimeTo;
		}

		public Long getNumber() {
			return this.number;
		}

		public Translations getTranslations() {
			return this.translations;
		}

		public void setDateTimeFrom(String dateTimeFrom) {
			this.dateTimeFrom = dateTimeFrom;
		}

		public void setDateTimeTo(String dateTimeTo) {
			this.dateTimeTo = dateTimeTo;
		}

		public void setNumber(Long number) {
			this.number = number;
		}

		public void setTranslations(Translations translations) {
			this.translations = translations;
		}
	}

	public class Name2 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public Name2(String en, String fr, String de, String es, String pt, String it, String ru, String zh, String tr,
				String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class Matchday {
		private String competitionId;
		private String dateFrom;
		private String dateTo;
		private String format;
		private String id;
		private String longName;
		private String name;
		private String roundId;
		private String seasonYear;
		private String sequenceNumber;
		private Translations translations;
		private String type;

		public Matchday(String competitionId, String dateFrom, String dateTo, String format, String id, String longName,
				String name, String roundId, String seasonYear, String sequenceNumber, Translations translations,
				String type) {
			this.competitionId = competitionId;
			this.dateFrom = dateFrom;
			this.dateTo = dateTo;
			this.format = format;
			this.id = id;
			this.longName = longName;
			this.name = name;
			this.roundId = roundId;
			this.seasonYear = seasonYear;
			this.sequenceNumber = sequenceNumber;
			this.translations = translations;
			this.type = type;
		}

		public String getCompetitionId() {
			return this.competitionId;
		}

		public String getDateFrom() {
			return this.dateFrom;
		}

		public String getDateTo() {
			return this.dateTo;
		}

		public String getFormat() {
			return this.format;
		}

		public String getId() {
			return this.id;
		}

		public String getLongName() {
			return this.longName;
		}

		public String getName() {
			return this.name;
		}

		public String getRoundId() {
			return this.roundId;
		}

		public String getSeasonYear() {
			return this.seasonYear;
		}

		public String getSequenceNumber() {
			return this.sequenceNumber;
		}

		public Translations getTranslations() {
			return this.translations;
		}

		public String getType() {
			return this.type;
		}

		public void setCompetitionId(String competitionId) {
			this.competitionId = competitionId;
		}

		public void setDateFrom(String dateFrom) {
			this.dateFrom = dateFrom;
		}

		public void setDateTo(String dateTo) {
			this.dateTo = dateTo;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setLongName(String longName) {
			this.longName = longName;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setRoundId(String roundId) {
			this.roundId = roundId;
		}

		public void setSeasonYear(String seasonYear) {
			this.seasonYear = seasonYear;
		}

		public void setSequenceNumber(String sequenceNumber) {
			this.sequenceNumber = sequenceNumber;
		}

		public void setTranslations(Translations translations) {
			this.translations = translations;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	
	public class LongName {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public LongName(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class Name3 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public Name3(String en, String fr, String de, String es, String pt, String it, String ru, String zh, String tr,
				String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class PlayerEvents {
		private List<Scorer> scorers;

		public PlayerEvents(List<Scorer> scorers) {
			this.scorers = scorers;
		}

		public List<Scorer> getScorers() {
			return this.scorers;
		}

		public void setScorers(List<Scorer> scorers) {
			this.scorers = scorers;
		}
	}

	public class Scorer {
		private String goalType;
		private String id;
		private String phase;
		private Player player;
		private String teamId;
		private String teamIdProvider;
		private Time time;

		public Scorer(String goalType, String id, String phase, Player player, String teamId, String teamIdProvider,
				Time time) {
			this.goalType = goalType;
			this.id = id;
			this.phase = phase;
			this.player = player;
			this.teamId = teamId;
			this.teamIdProvider = teamIdProvider;
			this.time = time;
		}

		public String getGoalType() {
			return this.goalType;
		}

		public String getId() {
			return this.id;
		}

		public String getPhase() {
			return this.phase;
		}

		public Player getPlayer() {
			return this.player;
		}

		public String getTeamId() {
			return this.teamId;
		}

		public String getTeamIdProvider() {
			return this.teamIdProvider;
		}

		public Time getTime() {
			return this.time;
		}

		public void setGoalType(String goalType) {
			this.goalType = goalType;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setPhase(String phase) {
			this.phase = phase;
		}

		public void setPlayer(Player player) {
			this.player = player;
		}

		public void setTeamId(String teamId) {
			this.teamId = teamId;
		}

		public void setTeamIdProvider(String teamIdProvider) {
			this.teamIdProvider = teamIdProvider;
		}

		public void setTime(Time time) {
			this.time = time;
		}
	}

	public class Player {
		private String age;
		private String birthDate;
		private String clubId;
		private String clubJerseyNumber;
		private String clubShirtName;
		private String countryCode;
		private String countryOfBirthCode;
		private String detailedFieldPosition;
		private String fieldPosition;
		private String gender;
		private Long height;
		private String id;
		private String imageUrl;
		private String internationalName;
		private String nationalFieldPosition;
		private String nationalJerseyNumber;
		private String nationalShirtName;
		private String nationalTeamId;
		private Translations translations;
		private Long weight;

		public Player(String age, String birthDate, String clubId, String clubJerseyNumber, String clubShirtName,
				String countryCode, String countryOfBirthCode, String detailedFieldPosition, String fieldPosition,
				String gender, Long height, String id, String imageUrl, String internationalName,
				String nationalFieldPosition, String nationalJerseyNumber, String nationalShirtName,
				String nationalTeamId, Translations translations, Long weight) {
			this.age = age;
			this.birthDate = birthDate;
			this.clubId = clubId;
			this.clubJerseyNumber = clubJerseyNumber;
			this.clubShirtName = clubShirtName;
			this.countryCode = countryCode;
			this.countryOfBirthCode = countryOfBirthCode;
			this.detailedFieldPosition = detailedFieldPosition;
			this.fieldPosition = fieldPosition;
			this.gender = gender;
			this.height = height;
			this.id = id;
			this.imageUrl = imageUrl;
			this.internationalName = internationalName;
			this.nationalFieldPosition = nationalFieldPosition;
			this.nationalJerseyNumber = nationalJerseyNumber;
			this.nationalShirtName = nationalShirtName;
			this.nationalTeamId = nationalTeamId;
			this.translations = translations;
			this.weight = weight;
		}

		public String getAge() {
			return this.age;
		}

		public String getBirthDate() {
			return this.birthDate;
		}

		public String getClubId() {
			return this.clubId;
		}

		public String getClubJerseyNumber() {
			return this.clubJerseyNumber;
		}

		public String getClubShirtName() {
			return this.clubShirtName;
		}

		public String getCountryCode() {
			return this.countryCode;
		}

		public String getCountryOfBirthCode() {
			return this.countryOfBirthCode;
		}

		public String getDetailedFieldPosition() {
			return this.detailedFieldPosition;
		}

		public String getFieldPosition() {
			return this.fieldPosition;
		}

		public String getGender() {
			return this.gender;
		}

		public Long getHeight() {
			return this.height;
		}

		public String getId() {
			return this.id;
		}

		public String getImageUrl() {
			return this.imageUrl;
		}

		public String getInternationalName() {
			return this.internationalName;
		}

		public String getNationalFieldPosition() {
			return this.nationalFieldPosition;
		}

		public String getNationalJerseyNumber() {
			return this.nationalJerseyNumber;
		}

		public String getNationalShirtName() {
			return this.nationalShirtName;
		}

		public String getNationalTeamId() {
			return this.nationalTeamId;
		}

		public Translations getTranslations() {
			return this.translations;
		}

		public Long getWeight() {
			return this.weight;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}

		public void setClubId(String clubId) {
			this.clubId = clubId;
		}

		public void setClubJerseyNumber(String clubJerseyNumber) {
			this.clubJerseyNumber = clubJerseyNumber;
		}

		public void setClubShirtName(String clubShirtName) {
			this.clubShirtName = clubShirtName;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public void setCountryOfBirthCode(String countryOfBirthCode) {
			this.countryOfBirthCode = countryOfBirthCode;
		}

		public void setDetailedFieldPosition(String detailedFieldPosition) {
			this.detailedFieldPosition = detailedFieldPosition;
		}

		public void setFieldPosition(String fieldPosition) {
			this.fieldPosition = fieldPosition;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public void setHeight(Long height) {
			this.height = height;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public void setInternationalName(String internationalName) {
			this.internationalName = internationalName;
		}

		public void setNationalFieldPosition(String nationalFieldPosition) {
			this.nationalFieldPosition = nationalFieldPosition;
		}

		public void setNationalJerseyNumber(String nationalJerseyNumber) {
			this.nationalJerseyNumber = nationalJerseyNumber;
		}

		public void setNationalShirtName(String nationalShirtName) {
			this.nationalShirtName = nationalShirtName;
		}

		public void setNationalTeamId(String nationalTeamId) {
			this.nationalTeamId = nationalTeamId;
		}

		public void setTranslations(Translations translations) {
			this.translations = translations;
		}

		public void setWeight(Long weight) {
			this.weight = weight;
		}
	}

	public class CountryOfBirthName {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public CountryOfBirthName(String en, String fr, String de, String es, String pt, String it, String ru,
				String zh, String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class FieldPosition {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public FieldPosition(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class FirstName {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public FirstName(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class LastName {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public LastName(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class Name4 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public Name4(String en, String fr, String de, String es, String pt, String it, String ru, String zh, String tr,
				String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class NationalFieldPosition {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public NationalFieldPosition(String en, String fr, String de, String es, String pt, String it, String ru,
				String zh, String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class ShortName {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public ShortName(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class Time {
		private Long minute;
		private Long second;

		public Time(Long minute, Long second) {
			this.minute = minute;
			this.second = second;
		}

		public Long getMinute() {
			return this.minute;
		}

		public Long getSecond() {
			return this.second;
		}

		public void setMinute(Long minute) {
			this.minute = minute;
		}

		public void setSecond(Long second) {
			this.second = second;
		}
	}

	public class PlayerOfTheMatch {
		private Player2 player;
		private String teamId;

		public PlayerOfTheMatch(Player2 player, String teamId) {
			this.player = player;
			this.teamId = teamId;
		}

		public Player2 getPlayer() {
			return this.player;
		}

		public String getTeamId() {
			return this.teamId;
		}

		public void setPlayer(Player2 player) {
			this.player = player;
		}

		public void setTeamId(String teamId) {
			this.teamId = teamId;
		}
	}

	public class Player2 {
		private String age;
		private String birthDate;
		private String clubId;
		private String clubJerseyNumber;
		private String clubShirtName;
		private String countryCode;
		private String detailedFieldPosition;
		private String fieldPosition;
		private String gender;
		private Long height;
		private String id;
		private String imageUrl;
		private String internationalName;
		private String nationalFieldPosition;
		private String nationalJerseyNumber;
		private String nationalShirtName;
		private String nationalTeamId;
		private Translations translations;
		private Long weight;

		public Player2(String age, String birthDate, String clubId, String clubJerseyNumber, String clubShirtName,
				String countryCode, String detailedFieldPosition, String fieldPosition, String gender, Long height,
				String id, String imageUrl, String internationalName, String nationalFieldPosition,
				String nationalJerseyNumber, String nationalShirtName, String nationalTeamId,
				Translations translations, Long weight) {
			this.age = age;
			this.birthDate = birthDate;
			this.clubId = clubId;
			this.clubJerseyNumber = clubJerseyNumber;
			this.clubShirtName = clubShirtName;
			this.countryCode = countryCode;
			this.detailedFieldPosition = detailedFieldPosition;
			this.fieldPosition = fieldPosition;
			this.gender = gender;
			this.height = height;
			this.id = id;
			this.imageUrl = imageUrl;
			this.internationalName = internationalName;
			this.nationalFieldPosition = nationalFieldPosition;
			this.nationalJerseyNumber = nationalJerseyNumber;
			this.nationalShirtName = nationalShirtName;
			this.nationalTeamId = nationalTeamId;
			this.translations = translations;
			this.weight = weight;
		}

		public String getAge() {
			return this.age;
		}

		public String getBirthDate() {
			return this.birthDate;
		}

		public String getClubId() {
			return this.clubId;
		}

		public String getClubJerseyNumber() {
			return this.clubJerseyNumber;
		}

		public String getClubShirtName() {
			return this.clubShirtName;
		}

		public String getCountryCode() {
			return this.countryCode;
		}

		public String getDetailedFieldPosition() {
			return this.detailedFieldPosition;
		}

		public String getFieldPosition() {
			return this.fieldPosition;
		}

		public String getGender() {
			return this.gender;
		}

		public Long getHeight() {
			return this.height;
		}

		public String getId() {
			return this.id;
		}

		public String getImageUrl() {
			return this.imageUrl;
		}

		public String getInternationalName() {
			return this.internationalName;
		}

		public String getNationalFieldPosition() {
			return this.nationalFieldPosition;
		}

		public String getNationalJerseyNumber() {
			return this.nationalJerseyNumber;
		}

		public String getNationalShirtName() {
			return this.nationalShirtName;
		}

		public String getNationalTeamId() {
			return this.nationalTeamId;
		}

		public Translations getTranslations() {
			return this.translations;
		}

		public Long getWeight() {
			return this.weight;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}

		public void setClubId(String clubId) {
			this.clubId = clubId;
		}

		public void setClubJerseyNumber(String clubJerseyNumber) {
			this.clubJerseyNumber = clubJerseyNumber;
		}

		public void setClubShirtName(String clubShirtName) {
			this.clubShirtName = clubShirtName;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public void setDetailedFieldPosition(String detailedFieldPosition) {
			this.detailedFieldPosition = detailedFieldPosition;
		}

		public void setFieldPosition(String fieldPosition) {
			this.fieldPosition = fieldPosition;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public void setHeight(Long height) {
			this.height = height;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public void setInternationalName(String internationalName) {
			this.internationalName = internationalName;
		}

		public void setNationalFieldPosition(String nationalFieldPosition) {
			this.nationalFieldPosition = nationalFieldPosition;
		}

		public void setNationalJerseyNumber(String nationalJerseyNumber) {
			this.nationalJerseyNumber = nationalJerseyNumber;
		}

		public void setNationalShirtName(String nationalShirtName) {
			this.nationalShirtName = nationalShirtName;
		}

		public void setNationalTeamId(String nationalTeamId) {
			this.nationalTeamId = nationalTeamId;
		}

		public void setTranslations(Translations translations) {
			this.translations = translations;
		}

		public void setWeight(Long weight) {
			this.weight = weight;
		}
	}

	

	public class FieldPosition2 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public FieldPosition2(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class FirstName2 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public FirstName2(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class LastName2 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public LastName2(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class Name5 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public Name5(String en, String fr, String de, String es, String pt, String it, String ru, String zh, String tr,
				String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class NationalFieldPosition2 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public NationalFieldPosition2(String en, String fr, String de, String es, String pt, String it, String ru,
				String zh, String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class ShortName2 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public ShortName2(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class Referee {
		private Images2 images;
		private Person person;
		private String role;
		private Translations translations;

		public Referee(Images2 images, Person person, String role, Translations translations) {
			this.images = images;
			this.person = person;
			this.role = role;
			this.translations = translations;
		}

		public Images2 getImages() {
			return this.images;
		}

		public Person getPerson() {
			return this.person;
		}

		public String getRole() {
			return this.role;
		}

		public Translations getTranslations() {
			return this.translations;
		}

		public void setImages(Images2 images) {
			this.images = images;
		}

		public void setPerson(Person person) {
			this.person = person;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public void setTranslations(Translations translations) {
			this.translations = translations;
		}
	}

	public class Images2 {
		@JsonProperty("SMALL_SQUARE")
		private String smallSquare;

		public Images2(String smallSquare) {
			this.smallSquare = smallSquare;
		}

		public String getSmallSquare() {
			return this.smallSquare;
		}

		public void setSmallSquare(String smallSquare) {
			this.smallSquare = smallSquare;
		}
	}

	public class Person {
		private String countryCode;
		private String gender;
		private String id;
		private Translations translations;

		public Person(String countryCode, String gender, String id, Translations translations) {
			this.countryCode = countryCode;
			this.gender = gender;
			this.id = id;
			this.translations = translations;
		}

		public String getCountryCode() {
			return this.countryCode;
		}

		public String getGender() {
			return this.gender;
		}

		public String getId() {
			return this.id;
		}

		public Translations getTranslations() {
			return this.translations;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setTranslations(Translations translations) {
			this.translations = translations;
		}
	}


	public class FirstName3 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public FirstName3(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class LastName3 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public LastName3(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class Name6 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public Name6(String en, String fr, String de, String es, String pt, String it, String ru, String zh, String tr,
				String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class ShortName3 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public ShortName3(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}


	public class RoleName {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public RoleName(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class RelatedMatch {
		private AwayTeam2 awayTeam;
		private HomeTeam2 homeTeam;
		private String id;
		private KickOffTime2 kickOffTime;
		private Score score;
		private String status;
		private String type;
		private Winner winner;

		public RelatedMatch(AwayTeam2 awayTeam, HomeTeam2 homeTeam, String id, KickOffTime2 kickOffTime, Score score,
				String status, String type, Winner winner) {
			this.awayTeam = awayTeam;
			this.homeTeam = homeTeam;
			this.id = id;
			this.kickOffTime = kickOffTime;
			this.score = score;
			this.status = status;
			this.type = type;
			this.winner = winner;
		}

		public AwayTeam2 getAwayTeam() {
			return this.awayTeam;
		}

		public HomeTeam2 getHomeTeam() {
			return this.homeTeam;
		}

		public String getId() {
			return this.id;
		}

		public KickOffTime2 getKickOffTime() {
			return this.kickOffTime;
		}

		public Score getScore() {
			return this.score;
		}

		public String getStatus() {
			return this.status;
		}

		public String getType() {
			return this.type;
		}

		public Winner getWinner() {
			return this.winner;
		}

		public void setAwayTeam(AwayTeam2 awayTeam) {
			this.awayTeam = awayTeam;
		}

		public void setHomeTeam(HomeTeam2 homeTeam) {
			this.homeTeam = homeTeam;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setKickOffTime(KickOffTime2 kickOffTime) {
			this.kickOffTime = kickOffTime;
		}

		public void setScore(Score score) {
			this.score = score;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public void setType(String type) {
			this.type = type;
		}

		public void setWinner(Winner winner) {
			this.winner = winner;
		}
	}

	public class AwayTeam2 {
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

		public AwayTeam2(String associationId, String associationLogoUrl, String bigLogoUrl, String confederationType,
				String countryCode, String id, String idProvider, String internationalName, Boolean isPlaceHolder,
				String logoUrl, String mediumLogoUrl, String organizationId, String teamCode, String teamTypeDetail,
				Translations translations, Boolean typeIsNational, String typeTeam) {
			this.associationId = associationId;
			this.associationLogoUrl = associationLogoUrl;
			this.bigLogoUrl = bigLogoUrl;
			this.confederationType = confederationType;
			this.countryCode = countryCode;
			this.id = id;
			this.idProvider = idProvider;
			this.internationalName = internationalName;
			this.isPlaceHolder = isPlaceHolder;
			this.logoUrl = logoUrl;
			this.mediumLogoUrl = mediumLogoUrl;
			this.organizationId = organizationId;
			this.teamCode = teamCode;
			this.teamTypeDetail = teamTypeDetail;
			this.translations = translations;
			this.typeIsNational = typeIsNational;
			this.typeTeam = typeTeam;
		}

		public String getAssociationId() {
			return this.associationId;
		}

		public String getAssociationLogoUrl() {
			return this.associationLogoUrl;
		}

		public String getBigLogoUrl() {
			return this.bigLogoUrl;
		}

		public String getConfederationType() {
			return this.confederationType;
		}

		public String getCountryCode() {
			return this.countryCode;
		}

		public String getId() {
			return this.id;
		}

		public String getIdProvider() {
			return this.idProvider;
		}

		public String getInternationalName() {
			return this.internationalName;
		}

		public Boolean getIsPlaceHolder() {
			return this.isPlaceHolder;
		}

		public String getLogoUrl() {
			return this.logoUrl;
		}

		public String getMediumLogoUrl() {
			return this.mediumLogoUrl;
		}

		public String getOrganizationId() {
			return this.organizationId;
		}

		public String getTeamCode() {
			return this.teamCode;
		}

		public String getTeamTypeDetail() {
			return this.teamTypeDetail;
		}

		public Translations getTranslations() {
			return this.translations;
		}

		public Boolean getTypeIsNational() {
			return this.typeIsNational;
		}

		public String getTypeTeam() {
			return this.typeTeam;
		}

		public void setAssociationId(String associationId) {
			this.associationId = associationId;
		}

		public void setAssociationLogoUrl(String associationLogoUrl) {
			this.associationLogoUrl = associationLogoUrl;
		}

		public void setBigLogoUrl(String bigLogoUrl) {
			this.bigLogoUrl = bigLogoUrl;
		}

		public void setConfederationType(String confederationType) {
			this.confederationType = confederationType;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setIdProvider(String idProvider) {
			this.idProvider = idProvider;
		}

		public void setInternationalName(String internationalName) {
			this.internationalName = internationalName;
		}

		public void setIsPlaceHolder(Boolean isPlaceHolder) {
			this.isPlaceHolder = isPlaceHolder;
		}

		public void setLogoUrl(String logoUrl) {
			this.logoUrl = logoUrl;
		}

		public void setMediumLogoUrl(String mediumLogoUrl) {
			this.mediumLogoUrl = mediumLogoUrl;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public void setTeamCode(String teamCode) {
			this.teamCode = teamCode;
		}

		public void setTeamTypeDetail(String teamTypeDetail) {
			this.teamTypeDetail = teamTypeDetail;
		}

		public void setTranslations(Translations translations) {
			this.translations = translations;
		}

		public void setTypeIsNational(Boolean typeIsNational) {
			this.typeIsNational = typeIsNational;
		}

		public void setTypeTeam(String typeTeam) {
			this.typeTeam = typeTeam;
		}
	}

	public class HomeTeam2 {
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

		public HomeTeam2(String associationId, String associationLogoUrl, String bigLogoUrl, String confederationType,
				String countryCode, String id, String idProvider, String internationalName, Boolean isPlaceHolder,
				String logoUrl, String mediumLogoUrl, String organizationId, String teamCode, String teamTypeDetail,
				Translations translations, Boolean typeIsNational, String typeTeam) {
			this.associationId = associationId;
			this.associationLogoUrl = associationLogoUrl;
			this.bigLogoUrl = bigLogoUrl;
			this.confederationType = confederationType;
			this.countryCode = countryCode;
			this.id = id;
			this.idProvider = idProvider;
			this.internationalName = internationalName;
			this.isPlaceHolder = isPlaceHolder;
			this.logoUrl = logoUrl;
			this.mediumLogoUrl = mediumLogoUrl;
			this.organizationId = organizationId;
			this.teamCode = teamCode;
			this.teamTypeDetail = teamTypeDetail;
			this.translations = translations;
			this.typeIsNational = typeIsNational;
			this.typeTeam = typeTeam;
		}

		public String getAssociationId() {
			return this.associationId;
		}

		public String getAssociationLogoUrl() {
			return this.associationLogoUrl;
		}

		public String getBigLogoUrl() {
			return this.bigLogoUrl;
		}

		public String getConfederationType() {
			return this.confederationType;
		}

		public String getCountryCode() {
			return this.countryCode;
		}

		public String getId() {
			return this.id;
		}

		public String getIdProvider() {
			return this.idProvider;
		}

		public String getInternationalName() {
			return this.internationalName;
		}

		public Boolean getIsPlaceHolder() {
			return this.isPlaceHolder;
		}

		public String getLogoUrl() {
			return this.logoUrl;
		}

		public String getMediumLogoUrl() {
			return this.mediumLogoUrl;
		}

		public String getOrganizationId() {
			return this.organizationId;
		}

		public String getTeamCode() {
			return this.teamCode;
		}

		public String getTeamTypeDetail() {
			return this.teamTypeDetail;
		}

		public Translations getTranslations() {
			return this.translations;
		}

		public Boolean getTypeIsNational() {
			return this.typeIsNational;
		}

		public String getTypeTeam() {
			return this.typeTeam;
		}

		public void setAssociationId(String associationId) {
			this.associationId = associationId;
		}

		public void setAssociationLogoUrl(String associationLogoUrl) {
			this.associationLogoUrl = associationLogoUrl;
		}

		public void setBigLogoUrl(String bigLogoUrl) {
			this.bigLogoUrl = bigLogoUrl;
		}

		public void setConfederationType(String confederationType) {
			this.confederationType = confederationType;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setIdProvider(String idProvider) {
			this.idProvider = idProvider;
		}

		public void setInternationalName(String internationalName) {
			this.internationalName = internationalName;
		}

		public void setIsPlaceHolder(Boolean isPlaceHolder) {
			this.isPlaceHolder = isPlaceHolder;
		}

		public void setLogoUrl(String logoUrl) {
			this.logoUrl = logoUrl;
		}

		public void setMediumLogoUrl(String mediumLogoUrl) {
			this.mediumLogoUrl = mediumLogoUrl;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public void setTeamCode(String teamCode) {
			this.teamCode = teamCode;
		}

		public void setTeamTypeDetail(String teamTypeDetail) {
			this.teamTypeDetail = teamTypeDetail;
		}

		public void setTranslations(Translations translations) {
			this.translations = translations;
		}

		public void setTypeIsNational(Boolean typeIsNational) {
			this.typeIsNational = typeIsNational;
		}

		public void setTypeTeam(String typeTeam) {
			this.typeTeam = typeTeam;
		}
	}



	public class KickOffTime2 {
		private String date;
		private String dateTime;
		private Long utcOffsetInHours;

		public KickOffTime2(String date, String dateTime, Long utcOffsetInHours) {
			this.date = date;
			this.dateTime = dateTime;
			this.utcOffsetInHours = utcOffsetInHours;
		}

		public String getDate() {
			return this.date;
		}

		public String getDateTime() {
			return this.dateTime;
		}

		public Long getUtcOffsetInHours() {
			return this.utcOffsetInHours;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public void setDateTime(String dateTime) {
			this.dateTime = dateTime;
		}

		public void setUtcOffsetInHours(Long utcOffsetInHours) {
			this.utcOffsetInHours = utcOffsetInHours;
		}
	}

	public class Score {
		private Aggregate aggregate;
		private Regular regular;
		private Total total;

		public Score(Aggregate aggregate, Regular regular, Total total) {
			this.aggregate = aggregate;
			this.regular = regular;
			this.total = total;
		}

		public Aggregate getAggregate() {
			return this.aggregate;
		}

		public Regular getRegular() {
			return this.regular;
		}

		public Total getTotal() {
			return this.total;
		}

		public void setAggregate(Aggregate aggregate) {
			this.aggregate = aggregate;
		}

		public void setRegular(Regular regular) {
			this.regular = regular;
		}

		public void setTotal(Total total) {
			this.total = total;
		}
	}

	public class Aggregate {
		private Long away;
		private Long home;

		public Aggregate(Long away, Long home) {
			this.away = away;
			this.home = home;
		}

		public Long getAway() {
			return this.away;
		}

		public Long getHome() {
			return this.home;
		}

		public void setAway(Long away) {
			this.away = away;
		}

		public void setHome(Long home) {
			this.home = home;
		}
	}

	public class Regular {
		private Long away;
		private Long home;

		public Regular(Long away, Long home) {
			this.away = away;
			this.home = home;
		}

		public Long getAway() {
			return this.away;
		}

		public Long getHome() {
			return this.home;
		}

		public void setAway(Long away) {
			this.away = away;
		}

		public void setHome(Long home) {
			this.home = home;
		}
	}

	public class Total {
		private Long away;
		private Long home;

		public Total(Long away, Long home) {
			this.away = away;
			this.home = home;
		}

		public Long getAway() {
			return this.away;
		}

		public Long getHome() {
			return this.home;
		}

		public void setAway(Long away) {
			this.away = away;
		}

		public void setHome(Long home) {
			this.home = home;
		}
	}

	public class Winner {
		private Aggregate2 aggregate;
		private Match match;

		public Winner(Aggregate2 aggregate, Match match) {
			this.aggregate = aggregate;
			this.match = match;
		}

		public Aggregate2 getAggregate() {
			return this.aggregate;
		}

		public Match getMatch() {
			return this.match;
		}

		public void setAggregate(Aggregate2 aggregate) {
			this.aggregate = aggregate;
		}

		public void setMatch(Match match) {
			this.match = match;
		}
	}

	public class Aggregate2 {
		private String reason;
		private Team team;
		private Translations translations;

		public Aggregate2(String reason, Team team, Translations translations) {
			this.reason = reason;
			this.team = team;
			this.translations = translations;
		}

		public String getReason() {
			return this.reason;
		}

		public Team getTeam() {
			return this.team;
		}

		public Translations getTranslations() {
			return this.translations;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public void setTeam(Team team) {
			this.team = team;
		}

		public void setTranslations(Translations translations) {
			this.translations = translations;
		}
	}

	public class ReasonTextAbbr {
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("EN")
		private String en;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("NL")
		private String nl;

		public ReasonTextAbbr(String hu, String cs, String en, String tr, String fr, String ru, String pt, String it,
				String es, String de, String zh, String nl) {
			this.hu = hu;
			this.cs = cs;
			this.en = en;
			this.tr = tr;
			this.fr = fr;
			this.ru = ru;
			this.pt = pt;
			this.it = it;
			this.es = es;
			this.de = de;
			this.zh = zh;
			this.nl = nl;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getEn() {
			return this.en;
		}

		public String getTr() {
			return this.tr;
		}

		public String getFr() {
			return this.fr;
		}

		public String getRu() {
			return this.ru;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getEs() {
			return this.es;
		}

		public String getDe() {
			return this.de;
		}

		public String getZh() {
			return this.zh;
		}

		public String getNl() {
			return this.nl;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class Match {
		private String reason;
		private Team team;
		private Translations translations;

		public Match(String reason, Team team, Translations translations) {
			this.reason = reason;
			this.team = team;
			this.translations = translations;
		}

		public String getReason() {
			return this.reason;
		}

		public Team getTeam() {
			return this.team;
		}

		public Translations getTranslations() {
			return this.translations;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public void setTeam(Team team) {
			this.team = team;
		}

		public void setTranslations(Translations translations) {
			this.translations = translations;
		}
	}

	public class ReasonText {
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("EN")
		private String en;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("NL")
		private String nl;

		public ReasonText(String hu, String cs, String en, String tr, String fr, String ru, String pt, String it,
				String es, String de, String zh, String nl) {
			this.hu = hu;
			this.cs = cs;
			this.en = en;
			this.tr = tr;
			this.fr = fr;
			this.ru = ru;
			this.pt = pt;
			this.it = it;
			this.es = es;
			this.de = de;
			this.zh = zh;
			this.nl = nl;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getEn() {
			return this.en;
		}

		public String getTr() {
			return this.tr;
		}

		public String getFr() {
			return this.fr;
		}

		public String getRu() {
			return this.ru;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getEs() {
			return this.es;
		}

		public String getDe() {
			return this.de;
		}

		public String getZh() {
			return this.zh;
		}

		public String getNl() {
			return this.nl;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class ReasonTextAbbr2 {
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("EN")
		private String en;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("NL")
		private String nl;

		public ReasonTextAbbr2(String hu, String cs, String en, String tr, String fr, String ru, String pt, String it,
				String es, String de, String zh, String nl) {
			this.hu = hu;
			this.cs = cs;
			this.en = en;
			this.tr = tr;
			this.fr = fr;
			this.ru = ru;
			this.pt = pt;
			this.it = it;
			this.es = es;
			this.de = de;
			this.zh = zh;
			this.nl = nl;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getEn() {
			return this.en;
		}

		public String getTr() {
			return this.tr;
		}

		public String getFr() {
			return this.fr;
		}

		public String getRu() {
			return this.ru;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getEs() {
			return this.es;
		}

		public String getDe() {
			return this.de;
		}

		public String getZh() {
			return this.zh;
		}

		public String getNl() {
			return this.nl;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class MetaData2 {
		private String name;
		private String type;

		public MetaData2(String name, String type) {
			this.name = name;
			this.type = type;
		}

		public String getName() {
			return this.name;
		}

		public String getType() {
			return this.type;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public class Translations16 {
		private Abbreviation abbreviation;
		private Name7 name;
		private ShortName4 shortName;

		public Translations16(Abbreviation abbreviation, Name7 name, ShortName4 shortName) {
			this.abbreviation = abbreviation;
			this.name = name;
			this.shortName = shortName;
		}

		public Abbreviation getAbbreviation() {
			return this.abbreviation;
		}

		public Name7 getName() {
			return this.name;
		}

		public ShortName4 getShortName() {
			return this.shortName;
		}

		public void setAbbreviation(Abbreviation abbreviation) {
			this.abbreviation = abbreviation;
		}

		public void setName(Name7 name) {
			this.name = name;
		}

		public void setShortName(ShortName4 shortName) {
			this.shortName = shortName;
		}
	}

	public class Abbreviation {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public Abbreviation(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class Name7 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public Name7(String en, String fr, String de, String es, String pt, String it, String ru, String zh, String tr,
				String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class ShortName4 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public ShortName4(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class Aggregate3 {
		private Long away;
		private Long home;

		public Aggregate3(Long away, Long home) {
			this.away = away;
			this.home = home;
		}

		public Long getAway() {
			return this.away;
		}

		public Long getHome() {
			return this.home;
		}

		public void setAway(Long away) {
			this.away = away;
		}

		public void setHome(Long home) {
			this.home = home;
		}
	}

	public class Regular2 {
		private Long away;
		private Long home;

		public Regular2(Long away, Long home) {
			this.away = away;
			this.home = home;
		}

		public Long getAway() {
			return this.away;
		}

		public Long getHome() {
			return this.home;
		}

		public void setAway(Long away) {
			this.away = away;
		}

		public void setHome(Long home) {
			this.home = home;
		}
	}

	public class Total2 {
		private Long away;
		private Long home;

		public Total2(Long away, Long home) {
			this.away = away;
			this.home = home;
		}

		public Long getAway() {
			return this.away;
		}

		public Long getHome() {
			return this.home;
		}

		public void setAway(Long away) {
			this.away = away;
		}

		public void setHome(Long home) {
			this.home = home;
		}
	}

	public class Stadium {
		private String address;
		private Long capacity;
		private City city;
		private String countryCode;
		private Geolocation geolocation;
		private String id;
		private Images3 images;
		private String openingDate;
		private Pitch pitch;
		private Translations18 translations;

		public Stadium(String address, Long capacity, City city, String countryCode, Geolocation geolocation, String id,
				Images3 images, String openingDate, Pitch pitch, Translations18 translations) {
			this.address = address;
			this.capacity = capacity;
			this.city = city;
			this.countryCode = countryCode;
			this.geolocation = geolocation;
			this.id = id;
			this.images = images;
			this.openingDate = openingDate;
			this.pitch = pitch;
			this.translations = translations;
		}

		public String getAddress() {
			return this.address;
		}

		public Long getCapacity() {
			return this.capacity;
		}

		public City getCity() {
			return this.city;
		}

		public String getCountryCode() {
			return this.countryCode;
		}

		public Geolocation getGeolocation() {
			return this.geolocation;
		}

		public String getId() {
			return this.id;
		}

		public Images3 getImages() {
			return this.images;
		}

		public String getOpeningDate() {
			return this.openingDate;
		}

		public Pitch getPitch() {
			return this.pitch;
		}

		public Translations18 getTranslations() {
			return this.translations;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public void setCapacity(Long capacity) {
			this.capacity = capacity;
		}

		public void setCity(City city) {
			this.city = city;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public void setGeolocation(Geolocation geolocation) {
			this.geolocation = geolocation;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setImages(Images3 images) {
			this.images = images;
		}

		public void setOpeningDate(String openingDate) {
			this.openingDate = openingDate;
		}

		public void setPitch(Pitch pitch) {
			this.pitch = pitch;
		}

		public void setTranslations(Translations18 translations) {
			this.translations = translations;
		}
	}

	public class City {
		private String countryCode;
		private String id;
		private Translations17 translations;

		public City(String countryCode, String id, Translations17 translations) {
			this.countryCode = countryCode;
			this.id = id;
			this.translations = translations;
		}

		public String getCountryCode() {
			return this.countryCode;
		}

		public String getId() {
			return this.id;
		}

		public Translations17 getTranslations() {
			return this.translations;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setTranslations(Translations17 translations) {
			this.translations = translations;
		}
	}

	public class Translations17 {
		private Name8 name;

		public Translations17(Name8 name) {
			this.name = name;
		}

		public Name8 getName() {
			return this.name;
		}

		public void setName(Name8 name) {
			this.name = name;
		}
	}

	public class Name8 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public Name8(String en, String fr, String de, String es, String pt, String it, String ru, String zh, String tr,
				String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class Geolocation {
		private Double latitude;
		private Double longitude;

		public Geolocation(Double latitude, Double longitude) {
			this.latitude = latitude;
			this.longitude = longitude;
		}

		public Double getLatitude() {
			return this.latitude;
		}

		public Double getLongitude() {
			return this.longitude;
		}

		public void setLatitude(Double latitude) {
			this.latitude = latitude;
		}

		public void setLongitude(Double longitude) {
			this.longitude = longitude;
		}
	}

	public class Images3 {
		@JsonProperty("MEDIUM_WIDE")
		private String mediumWide;
		@JsonProperty("LARGE_ULTRA_WIDE")
		private String largeUltraWide;

		public Images3(String mediumWide, String largeUltraWide) {
			this.mediumWide = mediumWide;
			this.largeUltraWide = largeUltraWide;
		}

		public String getMediumWide() {
			return this.mediumWide;
		}

		public String getLargeUltraWide() {
			return this.largeUltraWide;
		}

		public void setMediumWide(String mediumWide) {
			this.mediumWide = mediumWide;
		}

		public void setLargeUltraWide(String largeUltraWide) {
			this.largeUltraWide = largeUltraWide;
		}
	}

	public class Pitch {
		private Long length;
		private Long width;

		public Pitch(Long length, Long width) {
			this.length = length;
			this.width = width;
		}

		public Long getLength() {
			return this.length;
		}

		public Long getWidth() {
			return this.width;
		}

		public void setLength(Long length) {
			this.length = length;
		}

		public void setWidth(Long width) {
			this.width = width;
		}
	}

	public class Translations18 {
		private MediaName mediaName;
		private Name9 name;
		private OfficialName officialName;
		private SpecialEventsName specialEventsName;
		private SponsorName sponsorName;

		public Translations18(MediaName mediaName, Name9 name, OfficialName officialName,
				SpecialEventsName specialEventsName, SponsorName sponsorName) {
			this.mediaName = mediaName;
			this.name = name;
			this.officialName = officialName;
			this.specialEventsName = specialEventsName;
			this.sponsorName = sponsorName;
		}

		public MediaName getMediaName() {
			return this.mediaName;
		}

		public Name9 getName() {
			return this.name;
		}

		public OfficialName getOfficialName() {
			return this.officialName;
		}

		public SpecialEventsName getSpecialEventsName() {
			return this.specialEventsName;
		}

		public SponsorName getSponsorName() {
			return this.sponsorName;
		}

		public void setMediaName(MediaName mediaName) {
			this.mediaName = mediaName;
		}

		public void setName(Name9 name) {
			this.name = name;
		}

		public void setOfficialName(OfficialName officialName) {
			this.officialName = officialName;
		}

		public void setSpecialEventsName(SpecialEventsName specialEventsName) {
			this.specialEventsName = specialEventsName;
		}

		public void setSponsorName(SponsorName sponsorName) {
			this.sponsorName = sponsorName;
		}
	}

	public class MediaName {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public MediaName(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class Name9 {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public Name9(String en, String fr, String de, String es, String pt, String it, String ru, String zh, String tr,
				String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class OfficialName {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public OfficialName(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class SpecialEventsName {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public SpecialEventsName(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class SponsorName {
		@JsonProperty("EN")
		private String en;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("NL")
		private String nl;

		public SponsorName(String en, String fr, String de, String es, String pt, String it, String ru, String zh,
				String tr, String hu, String cs, String nl) {
			this.en = en;
			this.fr = fr;
			this.de = de;
			this.es = es;
			this.pt = pt;
			this.it = it;
			this.ru = ru;
			this.zh = zh;
			this.tr = tr;
			this.hu = hu;
			this.cs = cs;
			this.nl = nl;
		}

		public String getEn() {
			return this.en;
		}

		public String getFr() {
			return this.fr;
		}

		public String getDe() {
			return this.de;
		}

		public String getEs() {
			return this.es;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getRu() {
			return this.ru;
		}

		public String getZh() {
			return this.zh;
		}

		public String getTr() {
			return this.tr;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getNl() {
			return this.nl;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class Aggregate4 {
		private String reason;
		private Team team;
		private Translations translations;

		public Aggregate4(String reason, Team team, Translations translations) {
			this.reason = reason;
			this.team = team;
			this.translations = translations;
		}

		public String getReason() {
			return this.reason;
		}

		public Team getTeam() {
			return this.team;
		}

		public Translations getTranslations() {
			return this.translations;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public void setTeam(Team team) {
			this.team = team;
		}

		public void setTranslations(Translations translations) {
			this.translations = translations;
		}
	}


	public class ReasonTextAbbr3 {
		@JsonProperty("HU")
		private String hu;
		@JsonProperty("CS")
		private String cs;
		@JsonProperty("EN")
		private String en;
		@JsonProperty("TR")
		private String tr;
		@JsonProperty("FR")
		private String fr;
		@JsonProperty("RU")
		private String ru;
		@JsonProperty("PT")
		private String pt;
		@JsonProperty("IT")
		private String it;
		@JsonProperty("ES")
		private String es;
		@JsonProperty("DE")
		private String de;
		@JsonProperty("ZH")
		private String zh;
		@JsonProperty("NL")
		private String nl;

		public ReasonTextAbbr3(String hu, String cs, String en, String tr, String fr, String ru, String pt, String it,
				String es, String de, String zh, String nl) {
			this.hu = hu;
			this.cs = cs;
			this.en = en;
			this.tr = tr;
			this.fr = fr;
			this.ru = ru;
			this.pt = pt;
			this.it = it;
			this.es = es;
			this.de = de;
			this.zh = zh;
			this.nl = nl;
		}

		public String getHu() {
			return this.hu;
		}

		public String getCs() {
			return this.cs;
		}

		public String getEn() {
			return this.en;
		}

		public String getTr() {
			return this.tr;
		}

		public String getFr() {
			return this.fr;
		}

		public String getRu() {
			return this.ru;
		}

		public String getPt() {
			return this.pt;
		}

		public String getIt() {
			return this.it;
		}

		public String getEs() {
			return this.es;
		}

		public String getDe() {
			return this.de;
		}

		public String getZh() {
			return this.zh;
		}

		public String getNl() {
			return this.nl;
		}

		public void setHu(String hu) {
			this.hu = hu;
		}

		public void setCs(String cs) {
			this.cs = cs;
		}

		public void setEn(String en) {
			this.en = en;
		}

		public void setTr(String tr) {
			this.tr = tr;
		}

		public void setFr(String fr) {
			this.fr = fr;
		}

		public void setRu(String ru) {
			this.ru = ru;
		}

		public void setPt(String pt) {
			this.pt = pt;
		}

		public void setIt(String it) {
			this.it = it;
		}

		public void setEs(String es) {
			this.es = es;
		}

		public void setDe(String de) {
			this.de = de;
		}

		public void setZh(String zh) {
			this.zh = zh;
		}

		public void setNl(String nl) {
			this.nl = nl;
		}
	}

	public class Match2 {
		private String reason;
	
		public Match2(String reason) {
			this.reason = reason;
		}
	
		public String getReason() {
			return this.reason;
		}
	
		public void setReason(String reason) {
			this.reason = reason;
		}
    }

}}
