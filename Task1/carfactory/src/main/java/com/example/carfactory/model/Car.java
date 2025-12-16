package com.example.carfactory.model;

import java.util.Date;

public class Car {
    private String name;
    private String number;
    private String dateOfManufacture;
    private Date dateOfBuying;


    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }
    public void setDateOfBuying(Date dateOfBuying) {
        this.dateOfBuying = dateOfBuying;
    }

    @Override
    public String toString() {

        return "Car [name=" + name +
                ", number=" + number +
                ", dateOfManufacture=" + dateOfManufacture +
                ", dateOfBuying=" + dateOfBuying + "]";
    }
}
