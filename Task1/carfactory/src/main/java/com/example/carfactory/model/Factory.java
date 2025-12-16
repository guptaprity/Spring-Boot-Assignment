package com.example.carfactory.model;

public class Factory {

    private String address;
    private Car car;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Factory [address=" + address + ", car=" + car + "]";
    }
}
