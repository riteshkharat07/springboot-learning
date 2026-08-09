# Day 23 - Validation

## 📌 Objective

Learn how to validate incoming API request data using Bean Validation annotations.

## 📚 Topics Covered

- @Valid
- @NotBlank
- @Size
- @Email
- Validation
- Validation dependency

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

### Valid Request

```json
{
  "name": "Ritesh",
  "city": "Akola"
}
```

### Invalid Request

```json
{
  "name": "",
  "city": ""
}
```

### Validation Response

```text
Validation failed
```

## ✅ Outcome

Learned how to validate API request data before saving it into the database.
