# Train-Consist-Management-App


## 📌 Overview

The **Train Consist Management App** is a console-based Java application that simulates how a railway system manages a train’s consist — the sequence of bogies attached to an engine.

This project demonstrates the **practical application of Core Java and Data Structures** in solving real-world railway problems such as:

* Maintaining correct bogie order
* Preventing duplicate bogies
* Managing capacity and constraints
* Supporting dynamic train operations

The system is developed incrementally through structured use cases, each introducing a new concept.

---

## 🎯 Objectives

* Apply **Data Structures in real-world scenarios**
* Understand **why and when to use specific collections**
* Build a **modular and scalable system**
* Learn **clean coding and design principles**

---

## 🧠 Key Concepts Covered

* Java Collections Framework (List, Set, Map, LinkedList, HashSet, LinkedHashSet)
* Object-Oriented Programming (Classes, Objects)
* Comparator & Sorting
* Stream API (Functional Programming)
* Data Modeling & Relationships

---

## ⚙️ Features by Use Cases

### 🔹 UC1 – Train Initialization

* Initialize train consist using ArrayList
* Display initial bogie count

### 🔹 UC2 – Add Passenger Bogies

* Add, remove, and check bogies
* CRUD operations using ArrayList

### 🔹 UC3 – Unique Bogie IDs

* Prevent duplicate bogies using HashSet

### 🔹 UC4 – Ordered Train Consist

* Maintain sequence using LinkedList
* Insert and remove bogies efficiently

### 🔹 UC5 – Ordered + Unique Formation

* Use LinkedHashSet to preserve order and uniqueness

### 🔹 UC6 – Bogie Capacity Mapping

* Map bogie to capacity using HashMap

### 🔹 UC7 – Sorting Bogies

* Sort bogies based on capacity using Comparator

### 🔹 UC8 – Filtering Bogies

* Use Stream API to filter high-capacity bogies

---

## 🏗️ Project Structure

```text id="trainstruct1"
Train_Consist_App/
│── src/
│   ├── UC1TrainInitialization.java
│   ├── UC2AddPassengerBogies.java
│   ├── UC3UniqueBogieIDs.java
│   ├── UC4TrainLinkedList.java
│   ├── UC5LinkedHashSetTrain.java
│   ├── UC6BogieCapacityMap.java
│   ├── UC7SortBogiesByCapacity.java
│   ├── UC8FilterBogiesStream.java
│   └── ...
```

---

## ▶️ How to Run

### 🔧 Compile

```bash id="trainrun1"
javac UC1TrainInitialization.java
```

### ▶️ Run

```bash id="trainrun2"
java UC1TrainInitialization
```

👉 Replace file name for other use cases.

---

## 🌿 Git Workflow

Each use case is developed in a separate branch:

```bash id="traingit1"
git checkout -b uc1-train-initialization
git add .
git commit -m "Added UC1: Train Initialization"
git push origin uc1-train-initialization
```

---

## 💡 Key Learnings

* Choosing the right data structure:

  * List → dynamic storage
  * Set → uniqueness
  * LinkedList → order manipulation
  * HashMap → key–value mapping
* Applying **real-world constraints in code**
* Writing **clean and maintainable Java programs**

---

## 🚀 Future Enhancements

* Add Passenger vs Goods bogie classes (Inheritance)
* Safety validation rules
* GUI interface (JavaFX)
* Database integration
* Real-time train simulation

---

## 👨‍💻 Author

**Devanath Sugavasi**

---

## 📄 License

This project is for educational purposes.
