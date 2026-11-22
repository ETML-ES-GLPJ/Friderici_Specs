# BDD Training – Person & Vehicle Management

## Project Overview

This project is a practical exercise designed to refresh and
strengthen the development team's knowledge of Java, Object-Oriented Programming (OOP), and Behavior-Driven Development (BDD).

The objective is to progressively develop a small object-oriented system using two main concepts:

Person: A generic person who can be specialized into different types of employees.

Vehicle: A generic vehicle that can be specialized into different vehicle types, such as trucks and ambulances.

The project will evolve iteration by iteration, introducing new concepts, relationships, interactions and business rules.

There is deliberately no application entry point (main method).

The project is driven and executed exclusively through automated test classes.

## Structure

```
Friderici/
│
├── pom.xml
├── README.md
│
└── src/
    ├── main/
    │   └── java/
    │       └── ch/etml/es/library/
    │           │
    │           └── vehicle/
    │               └── Vehicle.java
    │
    └── test/
        └── java/
            └── ch/etml/es/library/
                │
                └── vehicle/
                    └── VehicleTest.java
```

## Development Approach

The exercise follows the BDD approach, supported by the TDD development cycle.

Each requirement should first be expressed through a test describing the expected behaviour.

Tests should follow the Given / When / Then structure:

|Phase|Description|
|:--|:--|
|Given|Define the initial context and required data.|
|When|Execute the action being tested.|
|Then|Verify the expected result.|

# Red – Green – Refactor

Each development task should follow these three steps:

Red: Write a test describing the expected behaviour. Run it and verify that it fails.

Green: Implement the minimum amount of code necessary to make the test pass.

Refactor: Improve the implementation without changing its expected behaviour. All tests must remain successful.

The objective is to let the tests progressively drive the design of the application.

# Bibliography

* [Class LocalDate](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/LocalDate.html)
* [Overriding System Time for Testing in Java](https://www.baeldung.com/java-override-system-time)