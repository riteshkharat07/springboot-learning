# Day 21 - DTO (Data Transfer Object)

## 📌 Objective

Learn how to use DTO (Data Transfer Object) to transfer only the required data between the client and the server.

## 📚 Topics Covered

- DTO
- Entity vs DTO
- Request DTO
- Response DTO

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA

## 🌐 API

### Method

POST

### URL

http://localhost:8080/student

### Request

```json
{
  "name":"Ritesh",
  "city":"Akola"
}
```

### Response

```json
{
  "id":1,
  "name":"Ritesh",
  "city":"Akola"
}
```

## ✅ Outcome

Learned how to use DTO instead of exposing Entity directly.
