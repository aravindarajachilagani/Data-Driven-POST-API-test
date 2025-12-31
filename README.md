# Data-Driven API Automation using REST Assured

This project demonstrates data-driven API testing using **REST Assured**, **Java**, and **TestNG**.  
It focuses on building scalable and reusable API tests instead of hardcoded requests.

---

## What this project covers

- Data-driven POST API testing using TestNG `@DataProvider`
- Dynamic JSON request body creation
- REST API validation using REST Assured
- Parameterization techniques for DELETE API testing
- Clean test structure following automation best practices

---

## Tech Stack

- Java  
- REST Assured  
- TestNG  
- JSON (org.json.simple)  
- Maven  

---

## API Details

- Base URL: `http://localhost:3000/`
- Endpoints used:
  - `POST /users` – Create users
  - `DELETE /users/{userId}` – Delete users

This project assumes a local REST API server is running.

---

## Test Scenarios Implemented

### 1. Data-Driven POST Request

- Multiple user records are passed using TestNG `@DataProvider`
- Each dataset creates a new user dynamically
- Request body includes:
  - firstName
  - lastName
  - SubjectId
- Response validation:
  - HTTP Status Code `201 (Created)`
  - Full response logging for visibility

### 2. DELETE Request with Parameterization

- DELETE API structure implemented using:
  - TestNG `@Parameters`
- Allows passing userId at runtime
- Validates successful deletion with status code `200`

---

## Why this project

The goal is to practice **real-world API automation concepts** such as:
- Avoiding hardcoded test data
- Writing reusable and maintainable tests
- Understanding request/response validation
- Using TestNG features effectively

This is a learning-focused automation project, built with hands-on practice.

---

## How to Run

1. Start the local API server on port 3000
2. Import the project as a Maven project
3. Run the TestNG test class

---

## Future Enhancements

- Add GET and PUT API tests
- Schema validation
- Response body assertions
- External test data using JSON or Excel
- CI integration

---

## Author

QA Automation Enthusiast  
Focused on API Testing, Automation Frameworks, and Continuous Learning
