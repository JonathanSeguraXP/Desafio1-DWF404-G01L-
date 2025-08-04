# Desafio1-DWF404-G01L-

# 📚 API Letras Vivas

A Spring Boot API for managing books with CRUD operations, exception handling, and Swagger documentation.

#Features
CRUD Operations for Books (Create, Read, Update, Delete).

Swagger UI for API documentation.

Global Exception Handling (e.g., BookNotFoundException).

Postman Collection for easy testing.

H2 Database (or configure your own in application.properties).

Unit Tests (Controller & Service layers).

# 🛠️ Technologies
Backend: Spring Boot 3.5.4
Database: H2 
API Docs: Swagger/OpenAPI/Postman.
Testing: JUnit 5, Mockito, Postman.


# 🚀 Quick Start
Prerequisites
Java 17+
Maven
Postman

# API Endpoints
Book Management
Method	Endpoint	Description
POST	/api/books	Create a new book
GET	/api/books	Get all books
GET	/api/books/{id}	Get a specific book
PUT	/api/books/{id}	Update a book
DELETE	/api/books/{id}	Delete a book

# Example POST request:

{
        "title": "El Alquimista",
        "author": "Paulo Coelho",
        "publicationYear": 1988
    }
GET	/api/books/{id}	Get a specific book
PUT	/api/books/{id}	Update a book
DELETE	/api/books/{id}	Delete a book
