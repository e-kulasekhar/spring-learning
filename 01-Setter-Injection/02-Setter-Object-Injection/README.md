# Setter Injection with Object (HAS-A Relationship)

## 📌 Definition

Setter Injection with Object is a type of Dependency Injection where one object is injected into another using setter methods.

---

## 📌 Concept

In this example:

* Student HAS-A Mobile
* Mobile object is injected into Student using setter method

---

## 📌 Example Explanation

Spring creates the Mobile object first and then injects it into the Student object using:

* setM()

---

## 📌 XML Configuration

* `<property>` is used for simple values
* `<ref>` is used to inject object reference

---

## 📌 Java Classes

* Student → contains Mobile object (HAS-A relationship)
* Mobile → contains id and name
* Driver → runs the application
* config.xml → defines beans and injection

---

## 📌 Output

2
IPHONE
1
kula

---

## 📌 Key Points

* Demonstrates HAS-A relationship
* Uses setter injection
* Object is injected using reference

---

## 📌 Interview Question

**Q: What is HAS-A relationship in Spring?**

**Answer:**
HAS-A relationship means one class contains another class object, and Spring injects that object using dependency injection.
