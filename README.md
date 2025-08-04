# 📚 Letras Vivas API - Book Management System

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.4-green)
![H2 Database](https://img.shields.io/badge/H2-Database-teal)
![Swagger](https://img.shields.io/badge/Swagger-UI-orange)

A RESTful API for book management built with Spring Boot, H2 database, and documented with Swagger/OpenAPI.

## 🚀 Features

- CRUD operations for books
- Persistent H2 database
- Auto-generated API documentation
- JUnit 5 integration
- Postman collection ready

## ⚙️ Tech Stack

- **Backend**: Spring Boot 3.1.0
- **Database**: H2 (file-based persistence)
- **API Docs**: SpringDoc OpenAPI 2.5.0
- **Testing**: JUnit 5, Mockito

## 🔧 Setup

1. **Requirements**:
   - Java 17+
   - Maven 3.8+
   - Postman

## Installation
  On your local machine:
```
git clone https://https:/github.com/JonathanSeguraXP/Desafio1-DWF404-G01L-.git

```

## Running the Application
Build and start the Spring Boot application 

Run the main class: `ApiRestLetrasVivasApplication.java`

## Initialize database:

H2 console: ``` http://localhost:8080/h2-console```

JDBC ```jdbc:h2:file:./data/letrasvivasdb```

- Credentials: sa
- Password: None
+ Username: `sa`  
+ Password: *(leave blank)*

## 🚀 API Testing with Postman Web

You can test the API using Postman Web or the desktop version.

### 📥 How to Access the Collection

1. Open [Postman Web](https://web.postman.co/) in your browser or launch the desktop app.
2. Click the **Import** button in the top left.
3. Choose the **Raw Text** or **Link** option.
4. Paste the following base URL (for manual requests):
`http://localhost:8080/api/books`
5. Create and send requests using GET, POST, PUT, or DELETE to test the API endpoints.
