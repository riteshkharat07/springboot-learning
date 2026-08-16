# Day 26 - Pagination

## 📌 Objective

Learn how to fetch database records page by page using Spring Data JPA Pagination.

## 📚 Topics Covered

- Pageable
- Page<T>
- PageRequest
- Pagination
- Page Number
- Page Size

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL

## 🌐 API

### Method

GET

### URL

http://localhost:8080/student?page=0&size=5

### Response

```json
{
  "content": [
    {
      "id": 1,
      "name": "Ritesh",
      "city": "Akola"
    }
  ],
  "totalElements": 10,
  "totalPages": 2,
  "size": 5,
  "number": 0
}
