package com.freitas.formulario.dto.house;

public class ListingDetailsDto {
    private ListingAgentDto listingAgent;
    private String listingDate;
    private String status;


    public ListingAgentDto getListingAgent() {
        return listingAgent;
    }

    public void setListingAgent(ListingAgentDto listingAgent) {
        this.listingAgent = listingAgent;
    }

    public String getListingDate() {
        return listingDate;
    }

    public void setListingDate(String listingDate) {
        this.listingDate = listingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
