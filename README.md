# Java Console Logic Suite

A collection of Java-based command-line tools designed to implement core algorithmic logic for distinct domains: logistics optimization, physics calculations, and financial transaction simulation. 

## 📋 Table of Contents
- [Overview](#overview)
- [Modules](#modules)
  - [Logistics Calculator (Eggs)](#1-logistics-calculator-eggsjava)
  - [Physics Engine (WorkDone)](#2-physics-engine-workdonejava)
  - [ATM Simulator (ATM.java)](#3-atm-simulator-atmjava)
- [Technologies](#technologies)
- [Installation & Usage](#installation--usage)
- [Future Improvements](#future-improvements)

## 📖 Overview
This repository hosts a suite of procedural Java programs that demonstrate data processing, conditional logic, and mathematical computations. The suite is designed to handle user inputs dynamically and provide optimized outputs for inventory packing, vector physics, and currency denomination splitting.

## 📦 Modules

### 1. Logistics Calculator (`Eggs.java`)
A resource management tool designed to calculate packaging distribution for inventory.
* **Functionality:** Takes a total inventory count and calculates how many distinct packages can be filled across multiple size tiers (30-unit, 24-unit, 18-unit, 12-unit, and 6-unit packs) simultaneously.
* [cite_start]**Key Logic:** Implements modular arithmetic to determine fill rates and remaining stock for every packaging tier[cite: 26, 27].
* **Use Case:** Inventory management and supply chain logistics planning.

### 2. Physics Engine (`WorkDone.java`)
A scientific calculator focused on mechanical work computations using vector principles.
* **Functionality:** Calculates Work Done ($W$) by computing the dot product of Force ($F$) and Displacement ($d$) relative to the angle ($\theta$) of application.
* **Formula:** $W = |F| \cdot |d| [cite_start]\cdot \cos(\theta)$[cite: 43].
* [cite_start]**Key Logic:** Utilizes the `Math` class for trigonometric operations, handling conversions between vector inputs and scalar energy outputs[cite: 55].

### 3. ATM Simulator (`ATM.java`)
A fintech simulation script that models the logic of an Automated Teller Machine.
* **Functionality:** Processes withdrawal requests, validating against transaction limits and denomination constraints.
* [cite_start]**Key Logic:** * Enforces a daily withdrawal limit (Cap: 50,000)[cite: 64, 65].
    * [cite_start]Validates that amounts are multiples of the base unit (500)[cite: 66].
    * [cite_start]Calculates the distribution of currency notes (5000, 1000, 500) required to fulfill the request[cite: 59, 60].

##  Technologies
* **Language:** Java (JDK 8+)
* **Input Handling:** `java.util.Scanner`
* **Math Operations:** `java.lang.Math`

## 🚀 Installation & Usage

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/your-username/java-console-logic-suite.git](https://github.com/your-username/java-console-logic-suite.git)
    ```
2.  **Navigate to the directory:**
    ```bash
    cd java-console-logic-suite
    ```
3.  **Compile the modules:**
    ```bash
    javac *.java
    ```
4.  **Run a specific module:**
    
    *For the Logistics Calculator:*
    ```bash
    java Eggs
    ```
    
    *For the Physics Engine:*
    ```bash
    java WorkDone
    ```

    *For the ATM Simulator:*
    ```bash
    java ATM
    ```

## 🔮 Future Improvements
* **Input Validation:** Implement `try-catch` blocks to handle non-numeric inputs gracefully.
* **GUI Integration:** Port the logic to a JavaFX or Swing interface for better user experience.
* **Unit Testing:** Add JUnit tests to verify calculations against edge cases.

---
*Developed by [Your Name]*
