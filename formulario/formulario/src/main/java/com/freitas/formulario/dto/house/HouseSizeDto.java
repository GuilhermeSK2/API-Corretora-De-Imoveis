package com.freitas.formulario.dto.house;

public class HouseSizeDto {
    private int squareFeet;
    private int bedrooms;
    private BathroomsDto bathrooms;
    private int stories;
    private boolean basement;

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public BathroomsDto getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(BathroomsDto bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getStories() {
        return stories;
    }

    public void setStories(int stories) {
        this.stories = stories;
    }

    public boolean isBasement() {
        return basement;
    }

    public void setBasement(boolean basement) {
        this.basement = basement;
    }
}
