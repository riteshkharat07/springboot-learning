# Day 18 - Update Student

## 📌 Objective

Learn how to update an existing student record using JpaRepository.save().

## 📚 Topics Covered

- PUT API
- @RequestBody
- @PathVariable
- JpaRepository.save()

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL

## 🌐 API

### Method

PUT

### URL

http://localhost:8080/student/1

### Request

```json
{
  "name":"Ritesh Kharat",
  "city":"Pune"
}
```

### Response

```json
{
  "id":1,
  "name":"Ritesh Kharat",
  "city":"Pune"
}
```

## ✅ Outcome

Successfully updated an existing student record.
