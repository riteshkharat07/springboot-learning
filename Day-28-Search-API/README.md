# Day 28 - Search API

## 📌 Objective

Learn how to create a Search API using Spring Data JPA.

## 📚 Topics Covered

- Search API
- findByNameContaining()
- @RequestParam
- Custom Finder Methods
- Partial Text Search

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL

## 🌐 API

### Search by Name

GET

http://localhost:8080/student/search?name=rit

### Response

```json
[
  {
    "id": 1,
    "name": "Ritesh",
    "city": "Akola"
  }
]
