# Spring Boot - Task on Dependency Injection

[![Java](https://img.shields.io/badge/Java-17-blue?logo=java)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/SpringBoot-4.0.0-green?logo=spring)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.9.2-red?logo=apache-maven)](https://maven.apache.org/)

---

## 🔹 Project Overview

This repository contains a **Spring Boot assignment** focused on demonstrating **Dependency Injection (DI)** using **Setter Injection**.  
It is designed to showcase how Spring’s **IoC (Inversion of Control) container** manages objects and injects dependencies at runtime.

The main use case implemented is an **Electricity Bill Generator**, which calculates the total bill based on:

- Units consumed  
- Rate per unit  

---

## 🔹 Key Features

- Demonstrates **Setter Injection** in Spring Boot  
- Modular, loosely-coupled code using Spring IoC  
- XML-based configuration for injecting property values  
- Easy-to-understand example of real-world application  

---

Task-On-Injection/

├── src/

│ ├── main/

│ │ ├── java/

│ │ │ └── com/example/discountcalculator/ ← Java classes (beans & main app)

│ │ └── resources/

│ │ └── applicationContext.xml ← Spring XML configuration

├── pom.xml ← Maven build file

└── README.md ← Project documentation


🔹 How to Run

## Clone the repository:

git clone https://github.com/guptaprity/Spring-Boot-Assignment.git


# Navigate to the project directory:

cd Spring-Boot-Assignment/Task-On-Injection


# Build the project using Maven:

mvn clean install


# Run the Spring Boot application:

mvn spring-boot:run


#  Expected Output:

Total Electricity Bill: 1625.0

🔹 Learning Outcomes

Understanding Spring IoC container and its role in dependency management

Difference between Setter Injection and Constructor Injection

Practical implementation of dependency injection using XML configuration

Writing loosely-coupled, maintainable code

🔹 References

Spring Boot Official Documentation

Dependency Injection in Spring – Setter & Constructor


