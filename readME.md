# Banking System

A simple Spring Boot project demonstrating database table structure for a banking system using H2 in-memory database and JPA entities.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Database Design](#database-design)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Features](#features)
- [Technologies Used](#technologies-used)

## Prerequisites

- Java JDK 17
- Maven 3.8+
- Your favorite IDE (VSCode, IntelliJ IDEA, or Eclipse)

## Project Structure

```bash
Bank-Project/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       ├── BankApplication.java    # Main application class
│       │       └── model/
│       │           ├── Account.java        # Account entity
│       │           ├── AccountType.java    # Account type enum
│       │           ├── Branch.java         # Branch entity
│       │           ├── Customer.java       # Customer entity
│       │           ├── Transaction.java    # Transaction entity
│       │           └── TransactionType.java# Transaction type enum
│       └── resources/
│           └── application.properties      # Application configuration
└── pom.xml                                # Maven configuration
```

## Database Design

The system includes the following entities:

### Customer
- Personal information (name, ID, contact details)
- Links to multiple accounts
- Registration date

### Account
- Account number
- Account type (SAVINGS, CHECKING, FIXED_DEPOSIT, LOAN)
- Balance
- Currency
- Status
- Links to customer and transactions

### Transaction
- Transaction reference
- Type (DEPOSIT, WITHDRAWAL, TRANSFER, etc.)
- Amount
- Date
- Description
- Balance after transaction

### Branch
- Branch details (name, code, address)
- Manager information

## Installation

1. Clone the repository:
```bash
git clone <repository-url>
cd Bank-Project
```

2. Install dependencies:
```bash
mvn clean install
```

## Running the Application

1. Start the application:
```bash
mvn spring-boot:run
```

2. Access H2 Console:
- Open a web browser
- Go to: http://localhost:8080/h2-bank
- Use these settings:
  * JDBC URL: jdbc:h2:mem:bankdb
  * Username: sa
  * Password: (leave empty)
  * Click "Connect"

## Features

- Entity relationship management with JPA/Hibernate
- In-memory H2 database
- Lombok for reducing boilerplate code
- Spring Boot configuration

## Technologies Used

- Spring Boot 2.7.5
- Spring Data JPA
- H2 Database
- Lombok
- Maven
- Java 17