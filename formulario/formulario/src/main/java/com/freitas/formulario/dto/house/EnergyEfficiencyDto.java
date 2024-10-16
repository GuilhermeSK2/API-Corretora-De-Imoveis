package com.freitas.formulario.dto.house;

public class EnergyEfficiencyDto {
    private String rating;
    private boolean solarPanels;
    private String insulation;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public boolean isSolarPanels() {
        return solarPanels;
    }

    public void setSolarPanels(boolean solarPanels) {
        this.solarPanels = solarPanels;
    }

    public String getInsulation() {
        return insulation;
    }

    public void setInsulation(String insulation) {
        this.insulation = insulation;
    }
}
