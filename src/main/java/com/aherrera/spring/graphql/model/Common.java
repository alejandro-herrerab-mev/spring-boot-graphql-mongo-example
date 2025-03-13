package com.aherrera.spring.graphql.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Common {
    
       public class Abbreviation {
        @JsonProperty("EN")
        public String eN;
        @JsonProperty("FR")
        public String fR;
        @JsonProperty("DE")
        public String dE;
        @JsonProperty("ES")
        public String eS;
        @JsonProperty("PT")
        public String pT;
        @JsonProperty("IT")
        public String iT;
        @JsonProperty("RU")
        public String rU;
        @JsonProperty("ZH")
        public String zH;
        @JsonProperty("TR")
        public String tR;
        @JsonProperty("HU")
        public String hU;
        @JsonProperty("CS")
        public String cS;
        @JsonProperty("NL")
        public String nL;
    }

    public class CountryName {
        @JsonProperty("EN")
        public String eN;
        @JsonProperty("FR")
        public String fR;
        @JsonProperty("DE")
        public String dE;
        @JsonProperty("ES")
        public String eS;
        @JsonProperty("PT")
        public String pT;
        @JsonProperty("IT")
        public String iT;
        @JsonProperty("RU")
        public String rU;
        @JsonProperty("ZH")
        public String zH;
        @JsonProperty("TR")
        public String tR;
        @JsonProperty("HU")
        public String hU;
        @JsonProperty("CS")
        public String cS;
        @JsonProperty("NL")
        public String nL;
    }

    public class DisplayName {
        @JsonProperty("EN")
        public String eN;
        @JsonProperty("FR")
        public String fR;
        @JsonProperty("DE")
        public String dE;
        @JsonProperty("ES")
        public String eS;
        @JsonProperty("PT")
        public String pT;
        @JsonProperty("IT")
        public String iT;
        @JsonProperty("RU")
        public String rU;
        @JsonProperty("ZH")
        public String zH;
        @JsonProperty("TR")
        public String tR;
        @JsonProperty("HU")
        public String hU;
        @JsonProperty("CS")
        public String cS;
        @JsonProperty("NL")
        public String nL;
    }

    public class DisplayOfficialName {
        @JsonProperty("EN")
        public String eN;
        @JsonProperty("FR")
        public String fR;
        @JsonProperty("DE")
        public String dE;
        @JsonProperty("ES")
        public String eS;
        @JsonProperty("PT")
        public String pT;
        @JsonProperty("IT")
        public String iT;
        @JsonProperty("RU")
        public String rU;
        @JsonProperty("ZH")
        public String zH;
        @JsonProperty("TR")
        public String tR;
        @JsonProperty("HU")
        public String hU;
        @JsonProperty("CS")
        public String cS;
        @JsonProperty("NL")
        public String nL;
    }

    public class DisplayTeamCode {
        @JsonProperty("EN")
        public String eN;
        @JsonProperty("FR")
        public String fR;
        @JsonProperty("DE")
        public String dE;
        @JsonProperty("ES")
        public String eS;
        @JsonProperty("PT")
        public String pT;
        @JsonProperty("IT")
        public String iT;
        @JsonProperty("RU")
        public String rU;
        @JsonProperty("ZH")
        public String zH;
        @JsonProperty("TR")
        public String tR;
        @JsonProperty("HU")
        public String hU;
        @JsonProperty("CS")
        public String cS;
        @JsonProperty("NL")
        public String nL;
    }

    public class MetaData {
        public String name;
        public String type;
    }

    public class Name {
        @JsonProperty("EN")
        public String eN;
        @JsonProperty("FR")
        public String fR;
        @JsonProperty("DE")
        public String dE;
        @JsonProperty("ES")
        public String eS;
        @JsonProperty("PT")
        public String pT;
        @JsonProperty("IT")
        public String iT;
        @JsonProperty("RU")
        public String rU;
        @JsonProperty("ZH")
        public String zH;
        @JsonProperty("TR")
        public String tR;
        @JsonProperty("HU")
        public String hU;
        @JsonProperty("CS")
        public String cS;
        @JsonProperty("NL")
        public String nL;
    }

    public class ShortName {
        @JsonProperty("EN")
        public String eN;
        @JsonProperty("FR")
        public String fR;
        @JsonProperty("DE")
        public String dE;
        @JsonProperty("ES")
        public String eS;
        @JsonProperty("PT")
        public String pT;
        @JsonProperty("IT")
        public String iT;
        @JsonProperty("RU")
        public String rU;
        @JsonProperty("ZH")
        public String zH;
        @JsonProperty("TR")
        public String tR;
        @JsonProperty("HU")
        public String hU;
        @JsonProperty("CS")
        public String cS;
        @JsonProperty("NL")
        public String nL;
    }

    public class Translations {
        public Abbreviation abbreviation;
        public Name name;
        public ShortName shortName;
        public CountryName countryName;
        public DisplayName displayName;
        public DisplayOfficialName displayOfficialName;
        public DisplayTeamCode displayTeamCode;
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

}
