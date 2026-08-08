# Day 22 - ModelMapper

## 📌 Objective

Learn how to map Entity objects to DTOs and DTOs to Entity objects using ModelMapper.

## 📚 Topics Covered

- ModelMapper
- Entity to DTO
- DTO to Entity
- Automatic Object Mapping
- Dependency Injection

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- ModelMapper

## 🌐 API

### Method

POST

### URL

http://localhost:8080/student

### Request

```json
{
  "name": "Ritesh",
  "city": "Akola"
}
```

### Response

```json
{
  "id": 1,
  "name": "Ritesh",
  "city": "Akola"
}
```

## ✅ Outcome

Learned how to perform Entity and DTO mapping automatically using ModelMapper.
