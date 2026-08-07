# Day 20 - Custom Finder Methods

## 📌 Objective

Learn how to create custom finder methods using Spring Data JPA.

## 📚 Topics Covered

- findByName()
- findByCity()
- findByNameAndCity()

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL

## 🌐 APIs

### GET /student/name/Ritesh

### Response

```json
[
  {
    "id": 1,
    "name": "Ritesh",
    "city": "Akola"
  }
]
```

### GET /student/city/Pune

### Response

```json
[
  {
    "id": 2,
    "name": "Rahul",
    "city": "Pune"
  }
]
```

### GET /student/Ritesh/Akola

### Response

```json
[
  {
    "id": 1,
    "name": "Ritesh",
    "city": "Akola"
  }
]
```

## ✅ Outcome

Learned how to fetch records using custom finder methods without writing SQL queries.
