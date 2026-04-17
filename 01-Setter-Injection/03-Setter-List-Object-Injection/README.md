# Setter Injection with List of Objects

## 📌 Definition

This example demonstrates injecting a list of objects into another object using setter methods in Spring.

---

## 📌 Concept

* Student HAS-A List of Subject objects
* Multiple objects are injected using List

---

## 📌 XML Configuration

* `<list>` is used for collection injection
* `<ref>` is used to inject object references

---

## 📌 Java Classes

* Student → contains List of Subject
* Subject → contains id and name
* Driver → runs the application
* config.xml → defines beans

---

## 📌 Output

2
kulasekhar
1
Physics

---

## 📌 Key Points

* Demonstrates collection injection
* Uses List with objects
* Supports multiple values

---

## 📌 Interview Question

**Q: How do you inject a list of objects in Spring?**

**Answer:**
Using `<list>` tag with `<ref>` elements inside it.
