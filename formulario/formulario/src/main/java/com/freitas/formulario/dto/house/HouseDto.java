package com.freitas.formulario.dto.house;

public class HouseDto {
    private int id;
    private AddressDto address;
    private HouseSizeDto size;
    private HouseFeatureDto features;
    private int yearBuilt;
    private double price;
    private HoaFeeDto hoaFee;
    private EnergyEfficiencyDto energyEfficiency;
    private ListingDetailsDto listingDetails;


    public HouseDto(int id, AddressDto address, HouseSizeDto size, HouseFeatureDto features, int yearBuilt, double price, HoaFeeDto hoaFee, EnergyEfficiencyDto energyEfficiency, ListingDetailsDto listingDetails) {
        this.id = id;
        this.address = address;
        this.size = size;
        this.features = features;
        this.yearBuilt = yearBuilt;
        this.price = price;
        this.hoaFee = hoaFee;
        this.energyEfficiency = energyEfficiency;
        this.listingDetails = listingDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AddressDto getAddress(){
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public HouseSizeDto getSize() {
        return size;
    }

    public void setSize(HouseSizeDto size) {
        this.size = size;
    }

    public HouseFeatureDto getFeatures() {
        return features;
    }

    public void setFeatures(HouseFeatureDto features) {
        this.features = features;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public HoaFeeDto getHoaFee() {
        return hoaFee;
    }

    public void setHoaFee(HoaFeeDto hoaFee) {
        this.hoaFee = hoaFee;
    }

    public EnergyEfficiencyDto getEnergyEfficiency() {
        return energyEfficiency;
    }

    public void setEnergyEfficiency(EnergyEfficiencyDto energyEfficiency) {
        this.energyEfficiency = energyEfficiency;
    }

    public ListingDetailsDto getListingDetails() {
        return listingDetails;
    }

    public void setListingDetails(ListingDetailsDto listingDetails) {
        this.listingDetails = listingDetails;
    }
}
