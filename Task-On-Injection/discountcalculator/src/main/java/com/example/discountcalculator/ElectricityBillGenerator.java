package com.example.discountcalculator;

public class ElectricityBillGenerator {

    private int unitsConsumed;
    private double ratePerUnit; 

    // setter for unitsConsumed
    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    // setter for ratePerUnit — must match exactly the XML property
    public void setRatePerUnit(double ratePerUnit) {
        this.ratePerUnit = ratePerUnit;
    }

    public double generateBill() {
        return unitsConsumed * ratePerUnit;
    }
}
