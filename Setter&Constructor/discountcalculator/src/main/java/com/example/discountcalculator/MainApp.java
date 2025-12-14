package com.example.discountcalculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        //Load Spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Get bean
        DiscountCalculator calculator = (DiscountCalculator) context.getBean("discountCalculator");

        //Calculate discount
        double discountedPrice = calculator.calculateDiscount();
        System.out.println("Current discount value is: " + discountedPrice);
    }
}
