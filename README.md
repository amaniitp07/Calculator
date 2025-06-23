# Java Calculator (Modular with Packages)

This is a simple command-line calculator written in Java using a modular package structure. It supports basic arithmetic operations: addition, subtraction, multiplication, and division. Each operation is implemented in a separate class inside a package named `operations`.

---

## 📁 Project Structure

calculator/
├── Main.java
└── src/operations/
├── Add.java
├── Subtract.java
├── Multiply.java
└── Divide.java

---

## 🚀 Features

- Modular design using Java packages
- Switch-case based operator selection
- Graceful handling of division by zero
- Clean and maintainable code

---

## 🔧 How to Run

### 1. Compile
```bash
javac operations/*.java Main.java
java Main
Enter first number: 10
Enter operator (+, -, *, /): *
Enter second number: 5
Result: 50.0

| Package    | Class    | Method Signature                                    |
| ---------- | -------- | --------------------------------------------------- |
| operations | Add      | `public static double add(double a, double b)`      |
| operations | Subtract | `public static double subtract(double a, double b)` |
| operations | Multiply | `public static double multiply(double a, double b)` |
| operations | Divide   | `public static double divide(double a, double b)`   |


