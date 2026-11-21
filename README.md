# B1 Print Job Calculator

A simple Java and Spring Boot project for validating and calculating offset print jobs (B1 sheet format).

## What It Does
The `PrintJob` class checks if the print job parameters are valid for a B1 printing press:
* **Minimum sheet size:** `500 x 350 mm`
* **Maximum sheet size:** `1050 x 750 mm`
* **Net quantity:** must be greater than `0`

If the sheet size or quantity is wrong, the program throws an `IllegalArgumentException` to stop invalid jobs early.

## Technologies Used
* Java
* Spring Boot
* Maven
* JUnit 5 *(coming soon)*

## How to Run Tests
```bash
./mvnw test
```
