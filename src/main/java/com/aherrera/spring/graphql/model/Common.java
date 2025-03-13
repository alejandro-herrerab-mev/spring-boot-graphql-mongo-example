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
}
