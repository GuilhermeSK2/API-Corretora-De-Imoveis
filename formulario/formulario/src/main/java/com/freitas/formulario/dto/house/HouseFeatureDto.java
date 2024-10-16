package com.freitas.formulario.dto.house;

public class HouseFeatureDto {
    private GarageDto garage;
    private GardenDto garden;
    private SwimmingPoolDto swimmingPool;
    private boolean furnished;
    private boolean fireplace;
    private boolean airConditioning;
    private boolean securitySystem;

    public GarageDto getGarage() {
        return garage;
    }

    public void setGarage(GarageDto garage) {
        this.garage = garage;
    }

    public GardenDto getGarden() {
        return garden;
    }

    public void setGarden(GardenDto garden) {
        this.garden = garden;
    }

    public SwimmingPoolDto getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(SwimmingPoolDto swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public boolean isFurnished() {
        return furnished;
    }

    public void setFurnished(boolean furnished) {
        this.furnished = furnished;
    }

    public boolean isFireplace() {
        return fireplace;
    }

    public void setFireplace(boolean fireplace) {
        this.fireplace = fireplace;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public boolean isSecuritySystem() {
        return securitySystem;
    }

    public void setSecuritySystem(boolean securitySystem) {
        this.securitySystem = securitySystem;
    }
}
