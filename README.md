# JavaPlayGround

> **Note**
>
> This repository is **not about "vibe coding" or blindly generating code with AI**.
>
> I use AI as a **learning assistant** to understand concepts, review ideas, get feedback, and improve my problem-solving skills — not to skip the learning process.
>
> The goal of this playground is to **learn Java deeply**, build real programming discipline, and grow step by step toward becoming a strong **back-end developer**.
>
> If you are learning too, use AI as a tool to understand better, not as a replacement for thinking.

---

## What This Project Is

**JavaPlayGround** is my personal Java learning repository.

It does not have one single product purpose, one final application, or one fixed business idea. Instead, it is a place where I collect my Java practice while learning the language and preparing myself for real back-end development.

This repository is used to:

* Practice Java fundamentals
* Experiment with different Java features
* Understand object-oriented programming better
* Learn how to organize code
* Build small console-based examples
* Practice problem solving
* Try generics, lambdas, streams, concurrency, and other Java concepts
* Prepare myself for Spring Boot and real backend projects

The project will probably look messy sometimes, and that is okay. It is a learning playground, not a polished production application.

---

## Main Goal

The main goal of this repository is simple:

**To learn Java properly and become good enough to build real back-end applications using Spring Boot.**

I am using this project as a long-term learning space where I can improve step by step.

My path is:

1. Build strong Java fundamentals
2. Understand object-oriented programming deeply
3. Practice clean and readable code
4. Learn important Java APIs and features
5. Get comfortable with Maven and project structure
6. Learn testing and debugging
7. Move into databases and REST APIs
8. Learn Spring Boot
9. Build real backend projects
10. Become job-ready as a Java back-end developer, inshallah

---

## What I Am Learning Here

This playground currently focuses on several Java learning areas.

### Java Fundamentals

I use this project to strengthen the basics before jumping too fast into frameworks.

Topics include:

* Variables
* Data types
* Operators
* Conditionals
* Loops
* Methods
* Classes
* Objects
* Constructors
* Access modifiers
* Static members
* Packages
* Basic input and output

---

### Object-Oriented Programming

A big part of this repository is learning how to think in objects and structure code in a better way.

Topics include:

* Encapsulation
* Abstraction
* Inheritance
* Polymorphism
* Interfaces
* Class responsibilities
* Reducing coupling
* Improving code organization
* Writing code that is easier to change later

---

### Generics and Collections

This area is for understanding how Java handles reusable and type-safe code.

Topics include:

* Generic classes
* Type parameters
* Iteration
* Custom iterable objects
* Collection-like behavior
* Preparing for deeper use of Java Collections Framework

---

### Functional Programming in Java

This part helps me understand modern Java style and how to write cleaner operations on data.

Topics include:

* Lambda expressions
* Method references
* Functional interfaces
* `Consumer`
* `Supplier`
* `Function`
* `Predicate`
* Stream basics
* Declarative programming

---

### Streams

Streams are an important part of modern Java, so this project includes experiments with:

* Creating streams
* Filtering data
* Mapping data
* Sorting data
* Counting results
* Summing numeric values
* Grouping data
* Partitioning data
* Collecting stream results
* Generating streams
* Iterating streams
* Working with simple model classes
* Understanding declarative code

---

### Concurrency and Threads

This area is for learning how Java handles multiple tasks running at the same time.

Topics include:

* Creating and running threads
* Implementing `Runnable`
* Starting multiple worker threads
* Using `Thread.currentThread()`
* Naming threads
* Joining threads
* Interrupting threads
* Simulating download tasks
* Sharing status between tasks
* Using `AtomicInteger`
* Practicing basic synchronization
* Using `wait()` and `notifyAll()`
* Understanding thread-safe collections
* Preparing for deeper concurrency concepts

---

### Small Console Applications

Some parts of this repository are small console-based programs.

These are not meant to be huge apps. They are practice projects that help me apply concepts in a simple way.

Examples include:

* Taking user input
* Validating values
* Performing calculations
* Formatting output
* Separating logic into classes
* Practicing simple program flow

---
## Current Project Structure

```text
JavaPlayGround/
├─ pom.xml
├─ README.md
├─ src/
│  └─ main/
│     ├─ java/
│     │  └─ com/
│     │     └─ medhat/
│     │        ├─ Main.java
│     │        ├─ concurrency/
│     │        │  ├─ DownloadStatus.java
│     │        │  ├─ DownloadTaskFile.java
│     │        │  └─ ThreadDemo.java
│     │        ├─ fundementals/
│     │        │  ├─ Mortgage.java
│     │        │  ├─ Point.java
│     │        │  ├─ Reader.java
│     │        │  ├─ TaxCalculator.java
│     │        │  ├─ TaxCalculator2018.java
│     │        │  ├─ TaxCalculator2019.java
│     │        │  └─ TaxReport.java
│     │        ├─ generics/
│     │        │  └─ Listo.java
│     │        ├─ lambda/
│     │        │  ├─ ConsolePrinter.java
│     │        │  ├─ Demo.java
│     │        │  └─ Printer.java
│     │        └─ stream/
│     │           ├─ Genre.java
│     │           └─ Movie.java
│     └─ resources/
│        └─ META-INF/
│           └─ MANIFEST.MF
└─ out/
```

---

## Folder Overview

### `src/main/java/com/medhat`

The main Java package for the project.

This contains the entry point and different learning packages.

---

### `concurrency`

This package contains practice code for Java concurrency and thread basics.

It includes examples related to:

* Running multiple threads
* Simulating download tasks
* Tracking shared download status
* Counting downloaded bytes safely
* Practicing synchronization
* Waiting for thread completion
* Preparing for more advanced concurrency topics later

---

### `fundementals`

This package contains practice code for core Java and object-oriented programming.

It includes examples related to:

* Basic classes
* Input reading
* Validation
* Calculations
* Interfaces
* Polymorphism
* Separating responsibilities

---

### `generics`

This package contains experiments with Java generics.

The goal is to understand how generic types work and how Java allows reusable type-safe code.

---

### `lambda`

This package contains practice with lambda expressions and functional interfaces.

The goal is to become comfortable with modern Java syntax and functional-style programming.

It includes examples related to:

* Functional interfaces
* Lambda expressions
* Method references
* `Consumer`
* `Supplier`
* `Function`
* `Predicate`
* Passing behavior as an argument

---

### `stream`

This package contains practice with Java Streams.

The goal is to understand how to process data in a cleaner and more declarative way.

It includes examples related to:

* Filtering movies
* Sorting by likes
* Counting results
* Calculating totals
* Grouping movies by genre
* Partitioning movies by conditions
* Using collectors
* Practicing with simple model classes and enums

---

### `resources`

This folder is for project resources and metadata.

---

## What This Repository Is Not

This repository is not:

* A finished application
* A production-ready backend system
* A tutorial project copied without understanding
* A place for blindly generated AI code
* A single-purpose app

It is a personal learning space where the purpose is growth, practice, and consistency.

---

## Learning Roadmap

### Current Stage: Java Core

Right now, the focus is on Java itself.

I am working on:

* Java syntax
* OOP
* Interfaces
* Generics
* Lambdas
* Streams
* Basic concurrency
* Threads
* Synchronization basics
* Code organization
* Small practice projects

---

### Next Stage: Better Java Development

After becoming more comfortable with core Java, I plan to focus on:

* Exception handling
* Java Collections Framework
* File handling
* Maven
* Unit testing
* Debugging
* Cleaner project structure
* Refactoring
* More advanced concurrency concepts

---

### Backend Stage

After building stronger Java foundations, I plan to move into backend development topics:

* HTTP basics
* REST APIs
* JSON
* Databases
* SQL
* JDBC
* Authentication basics
* Backend architecture concepts

---

### Spring Boot Stage

The bigger goal is to reach Spring Boot and use it to build real backend applications.

Topics I want to learn include:

* Spring Boot project structure
* Controllers
* Services
* Repositories
* Dependency injection
* REST API development
* Validation
* Error handling
* Spring Data JPA
* Database integration
* Testing Spring Boot applications
* Building complete backend projects

---

## Long-Term Goal

My long-term goal is to become a strong Java back-end developer.

This repository is part of that journey. It is where I practice the basics, build discipline, and slowly move toward more serious backend development.

I want to become comfortable enough to:

* Understand Java deeply
* Write clean and maintainable code
* Build REST APIs
* Work with databases
* Use Spring Boot professionally
* Understand backend architecture
* Build real-world projects
* Become ready for a backend developer job, inshallah

---

## Final Purpose

This project exists because I want to improve.

It is my coding gym for Java.

Every file, mistake, refactor, and experiment is part of the process of becoming better.

**The mission is to learn Java, unlock my maximum potential, reach Spring Boot, and become a capable Java back-end developer, inshallah <3.**