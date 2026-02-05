🛒 eCommerce Backend Application

A Spring Boot–based eCommerce backend application that provides RESTful APIs for managing products and categories.
The application supports CRUD operations, pagination, sorting, input validation, and global exception handling.

🚀 Features

RESTful APIs for Products and Categories

Full CRUD operations

Pagination and Sorting support

Request validation using Jakarta Bean Validation

Global exception handling for consistent error responses

Database integration using Spring Data JPA

Clean layered architecture

🧱 Tech Stack

Java

Spring Boot

Spring Web

Spring Data JPA

Hibernate

Jakarta Validation

Maven

H2 / MySQL

📁 Project Structure
src/main/java
├── controller
├── service
├── repository
├── model
├── dto
├── exception
└── EcommerceApplication.java

📌 API Endpoints
🔹 Category APIs

POST /api/categories – Create category

GET /api/categories – Get all categories (pagination & sorting)

GET /api/categories/{id} – Get category by ID

PUT /api/categories/{id} – Update category

DELETE /api/categories/{id} – Delete category

🔹 Product APIs

POST /api/products – Create product

GET /api/products – Get all products (pagination & sorting)

GET /api/products/{id} – Get product by ID

PUT /api/products/{id} – Update product

DELETE /api/products/{id} – Delete product

📄 Pagination & Sorting Example
GET /api/products?page=0&size=5&sortBy=price&sortDir=asc

🛡️ Validation & Exception Handling

Uses Jakarta Bean Validation annotations for input validation

Centralized exception handling using @ControllerAdvice

Returns meaningful and structured error responses

▶️ Running the Application
Prerequisites

Java 17+

Maven

Steps

Clone the repository:

git clone https://github.com/roshnkarthick-eng/E-Commerce-Backend


Navigate to the project directory:

cd your-repo-name


Run the application:

mvn spring-boot:run


Application will be available at:

http://localhost:8080

🧪 Testing the APIs

Use Postman or any REST client

Test CRUD operations, pagination, sorting, and validation scenarios

🔮 Future Enhancements

Authentication & Authorization (Spring Security, JWT)

Swagger/OpenAPI documentation

Cart and Order management

Docker support

👨‍💻 Author

Roshan
Java Backend Developer | Spring Boot
