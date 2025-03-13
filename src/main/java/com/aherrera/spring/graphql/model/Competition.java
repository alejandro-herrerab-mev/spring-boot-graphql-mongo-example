package com.aherrera.spring.graphql.model;

import com.aherrera.spring.graphql.model.Common.Images;
import com.aherrera.spring.graphql.model.Common.MetaData;
import com.aherrera.spring.graphql.model.Common.Translations;

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
