# Setter Injection in Spring

## 📌 Definition

Setter Injection is a type of Dependency Injection where values are injected into a class using setter methods.

---

## 📌 Example Explanation

In this example, the Student class contains properties like id, name, and rollno.

Spring container creates the object and injects values using setter methods:

* setId()
* setName()
* setRollno()

---

## 📌 XML Configuration

Uses `<property>` tag to inject values into the bean.

---

## 📌 Java Classes

* Student → Contains variables and setter/getter methods
* Driver → Runs the application
* Config.xml → Defines bean and values

---

## 📌 Output

1 | kula | 25

---

## 📌 Key Points

* Uses setter methods
* Values are injected after object creation
* Suitable for optional dependencies

---

## 📌 Interview Question

**Q: Difference between Setter Injection and Constructor Injection?**

**Answer:**
Setter Injection is used for optional values, while Constructor Injection is used for mandatory values.
