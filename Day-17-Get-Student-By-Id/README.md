# Day 17 - Get Student By ID

## 📌 Objective

Learn how to fetch a student record by ID using JpaRepository.findById().

## 📚 Topics Covered

- GET API
- @PathVariable
- JpaRepository.findById()
- Optional

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL

## 🌐 API

### Method

GET

### URL

http://localhost:8080/student/1

### Response

```json
{
  "id": 1,
  "name": "Ritesh",
  "city": "Akola"
}
```

## ✅ Outcome

Successfully fetched a student by ID from the database.
