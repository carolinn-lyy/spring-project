package com.example.restservice.model;

public class Employee {
    private int id;
    private String fName;
    private String lName;
    Address address;

    public Employee(int id, String fName, String lName, Address address) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", fName='" + fName + '\'' +
            ", lName='" + lName + '\'' +
            ", address=" + address +
            '}';
    }
}