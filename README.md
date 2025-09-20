# Spring Boot Journal App

A simple **backend journal application** built with **Spring Boot** and **H2 in-memory database**.  
This project allows users to **create, read, update, and delete journal entries**, filter by date, and manage personal notes efficiently.

---

## Features

- Create a new journal entry  
- View all journal entries  
- View a specific entry by ID  
- Update an existing entry  
- Delete an entry  
- Filter entries by date  
- Stores data in an **H2 in-memory database**  

---

## Technologies Used

- Java 17  
- Spring Boot  
- Spring Data JPA  
- H2 Database  
- RESTful API design  

---

## Project Structure
com.example.journal
├── model/ → JournalEntry.java
├── repository/ → JournalRepository.java
├── service/ → JournalService.java
├── controller/ → JournalController.java
└── JournalAppApplication.java


---

## Setup & Run

1. **Clone the repo**
```bash
git clone https://github.com/<your-username>/springboot-journal-app.git
cd springboot-journal-app
```
2. **Build and run the project**
```bash
mvn clean install
mvn spring-boot:run
```
3. **Test API Endpoints using Postman**
Base URL: http://localhost:8080/entries

---

## Future Improvements
- Add frontend (React / Angular) for interactive UI
- Add user authentication and authorization
- Add tags filtering & sorting
- Persist data in a MySQL/PostgreSQL database instead of H2
- Add search functionality for title/content
