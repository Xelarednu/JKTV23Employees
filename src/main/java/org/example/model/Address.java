package org.example.model;

import java.util.UUID;

public class Address {
    private UUID id;
    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;

    public Address() {
        this.id = UUID.randomUUID();
    }

    public Address(String city, String street, String houseNumber, String apartmentNumber) {
        this.id = UUID.randomUUID();
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }


}