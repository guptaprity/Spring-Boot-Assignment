package com.example.discountcalculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ElectricityBillGenerator bill = (ElectricityBillGenerator) context.getBean("billGenerator");

        System.out.println("Total Electricity Bill: " + bill.generateBill());

    }
}
