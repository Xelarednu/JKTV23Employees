package org.example.model;

import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (!Objects.equals(id, address.id)) return false;
        if (!Objects.equals(city, address.city)) return false;
        if (!Objects.equals(street, address.street)) return false;
        if (!Objects.equals(houseNumber, address.houseNumber)) return false;
        return Objects.equals(apartmentNumber, address.apartmentNumber);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (houseNumber != null ? houseNumber.hashCode() : 0);
        result = 31 * result + (apartmentNumber != null ? apartmentNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                '}';
    }
}