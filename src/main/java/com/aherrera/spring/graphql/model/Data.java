package com.aherrera.spring.graphql.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Data {

    public Data() {
    }

    public Data(String generation, int capacityGB, String capacity, String color, String description, String colour,
            String caseSize, float screenSize, int year, float price, String cPUModel, String hardDiskSize) {
        this.generation = generation;
        this.capacityGB = capacityGB;
        this.capacity = capacity;
        this.color = color;
        this.description = description;
        this.colour = colour;
        this.caseSize = caseSize;
        this.screenSize = screenSize;
        this.year = year;
        this.price = price;
        CPUModel = cPUModel;
        this.hardDiskSize = hardDiskSize;
    }



    String generation;
    @JsonProperty("capacity GB")
    int capacityGB;
    String capacity;
    String color;
    String description;
    String colour;
    @JsonProperty("Case size")
    String caseSize;
    @JsonProperty("Screen size")
    float screenSize;
    int year;
    float price;
    @JsonProperty("CPU model")
    String CPUModel;
    @JsonProperty("Hard disk size")
    String hardDiskSize;

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCaseSize() {
        return caseSize;
    }

    public void setCaseSize(String caseSize) {
        this.caseSize = caseSize;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCPUModel() {
        return CPUModel;
    }

    public void setCPUModel(String cPUModel) {
        CPUModel = cPUModel;
    }

    public String getHardDiskSize() {
        return hardDiskSize;
    }

    public void setHardDiskSize(String hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    public int getCapacityGB() {
        return capacityGB;
    }

    public void setCapacityGB(int capacityGB) {
        this.capacityGB = capacityGB;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    

}
