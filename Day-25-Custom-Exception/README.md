# Day 25 - Custom Exception

## 📌 Objective

Learn how to create and handle custom exceptions in Spring Boot.

## 📚 Topics Covered

- Custom Exception
- RuntimeException
- ErrorResponse
- @ExceptionHandler
- @RestControllerAdvice
- Student Not Found handling

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL

## 🌐 API

### Method

GET

### URL

http://localhost:8080/student/100

### Response

```json
{
  "status": 404,
  "message": "Student not found with id: 100"
}
```

## ✅ Outcome

Learned how to create custom exceptions and return a proper error response.
