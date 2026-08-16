# Day 27 - Sorting

## 📌 Objective

Learn how to sort database records using Spring Data JPA.

## 📚 Topics Covered

- Sort
- Ascending Order
- Descending Order
- findAll(Sort)
- @RequestParam

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL

## 🌐 API

### Sort by Name - Ascending

GET

http://localhost:8080/student/sort?field=name&direction=asc

### Sort by Name - Descending

GET

http://localhost:8080/student/sort?field=name&direction=desc

### Response

```json
[
  {
    "id": 2,
    "name": "Amit",
    "city": "Pune"
  },
  {
    "id": 1,
    "name": "Ritesh",
    "city": "Akola"
  }
]
