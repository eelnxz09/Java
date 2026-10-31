# Java Practical Experiments

This repository contains beginner-friendly, clean, and thoroughly tested Java practical programs for college examination preparation (MIT-WPU syllabus).

## Prerequisites
- **Java Development Kit (JDK):** Version 8 or higher
- **Compiler & Runtime:** `javac` and `java` available on PATH

## Repository Organization

```text
Java-Practical/
├── Experiment-07/
│   ├── ThreadPrintControl.java
│   ├── OddEvenThreads.java
│   ├── ThreadSleepControl.java
│   └── README.md
├── Experiment-08/
│   ├── DivideByZeroDemo.java
│   ├── ArrayIndexOutOfBoundsDemo.java
│   └── README.md
├── Experiment-09/
│   ├── PasswordAuthDemo.java
│   ├── EvenNumberCheckDemo.java
│   └── README.md
├── Experiment-11/
│   ├── LambdaDemo.java
│   └── README.md
├── Experiment-12/
│   ├── FunctionalInterfaceDemo.java
│   ├── PredefinedFunctionalInterfaces.java
│   └── README.md
├── Experiment-13/
│   ├── AgeCalculatorDemo.java
│   └── README.md
├── Experiment-14/
│   ├── ArrayListExample.java
│   ├── LinkedListExampleDemo.java
│   └── README.md
├── Experiment-15/
│   ├── HashSetExample.java
│   └── README.md
├── Extra Codes by Mam/
│   ├── Code01_ArrayListOperations.java
│   ├── Code02_LinkedListOperations.java
│   ├── Code03_CustomExceptionDemo.java
│   ├── Code04_ThreadPriorityDemo.java
│   └── README.md
└── README.md
```

## List of Official Experiments

| Exp No. | Topic | Key Concepts | Files Included |
|---|---|---|---|
| **07** | Multithreading Operations | `Thread`, `sleep()`, `yield()`, lifecycle | `ThreadPrintControl.java`, `OddEvenThreads.java`, `ThreadSleepControl.java` |
| **08** | Exception Handling | `try`, `catch`, `finally` | `DivideByZeroDemo.java`, `ArrayIndexOutOfBoundsDemo.java` |
| **09** | Throw & Throws | `throw`, `throws`, custom message | `PasswordAuthDemo.java`, `EvenNumberCheckDemo.java` |
| **11** | Lambda Expressions | 0, 1, and multiple parameters | `LambdaDemo.java` |
| **12** | Functional Interfaces | `Consumer`, `Predicate`, `Function`, `Supplier` | `FunctionalInterfaceDemo.java`, `PredefinedFunctionalInterfaces.java` |
| **13** | Time & Date API | `LocalDate`, `Period` (Age Calculator) | `AgeCalculatorDemo.java` |
| **14** | List Interface | `ArrayList`, `LinkedList` operations | `ArrayListExample.java`, `LinkedListExampleDemo.java` |
| **15** | Set Interface | `HashSet` (Duplicate rejection) | `HashSetExample.java` |

> **Note on Extra Codes by Mam:**
> Additional reference practice codes provided by Mam are preserved separately inside [`Extra Codes by Mam/`](./Extra%20Codes%20by%20Mam/) and are not part of the official numbered experiments.

## General Compilation & Execution

To compile and run any experiment:
```bash
# Example for Experiment 07
cd "Experiment-07"
javac ThreadPrintControl.java
java ThreadPrintControl
```
