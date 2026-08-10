# Day 24 - Global Exception Handling

## 📌 Objective

Learn how to handle exceptions globally in a Spring Boot application.

## 📚 Topics Covered

- @RestControllerAdvice
- @ExceptionHandler
- MethodArgumentNotValidException
- Custom Error Response
- Global Exception Handling

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL

## 🌐 API

### Method

POST

### URL

http://localhost:8080/student

### Invalid Request

```json
{
  "name": "",
  "city": ""
}
```

### Response

```json
{
  "message": "Validation failed",
  "errors": [
    "Name is required",
    "City is required"
  ]
}
```

## ✅ Outcome

Learned how to handle validation errors globally using @RestControllerAdvice.
