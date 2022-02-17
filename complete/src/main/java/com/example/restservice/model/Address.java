package com.example.restservice.model;

public class Address{
    private int number;
    private String streetName;
    private String postalCode;

    public Address(int number, String streetName, String postalCode) {
        this.number = number;
        this.streetName = streetName;
        this.postalCode = postalCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
            "number=" + number +
            ", streetName='" + streetName + '\'' +
            ", postalCode='" + postalCode + '\'' +
            '}';
    }
}