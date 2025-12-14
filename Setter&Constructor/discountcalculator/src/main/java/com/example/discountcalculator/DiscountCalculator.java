package com.example.discountcalculator;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiscountCalculator {
    private LocalDate currentDate;
    private double price;

    public void setCurrentDate(String currentDate) {
        this.currentDate = LocalDate.parse(currentDate);
    }

    public void setPrice(double price) {
        this.price=price;
    }

    public double calculateDiscount() {
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            return price - (price * 0.20);
        } else  {
            return price - (price * 0.10);
        }

    }

}
