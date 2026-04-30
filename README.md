# 🧮 BMI Calculator (Java Swing)

A simple desktop **Body Mass Index (BMI) Calculator** built using **Java Swing**.
This application allows users to calculate their BMI using either **Metric** or **Imperial** units and displays the corresponding health category with color-coded feedback.

---

## 📌 Features

* ✅ Supports **Metric (kg, meters)** and **Imperial (lbs, inches)** units
* ✅ Calculates BMI instantly
* ✅ Displays BMI value (2 decimal places)
* ✅ Shows BMI category:

  * Underweight
  * Normal weight
  * Overweight
  * Obese
* ✅ Color-coded results:

  * 🔵 Underweight
  * 🟢 Normal
  * 🟠 Overweight
  * 🔴 Obese
* ✅ Input validation (prevents invalid or negative values)
* ✅ Clear button to reset inputs

---

## 🖥️ User Interface

The GUI includes:

* Unit selection dropdown
* Input fields for weight and height
* "Calculate" and "Clear" buttons
* BMI result display
* Category label with color indication

---

## ⚙️ Technologies Used

* **Java**
* **Swing (GUI framework)**
* **AWT (layout and styling)**

---

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/your-username/bmi-calculator.git
```

### 2. Navigate into the folder

```bash
cd bmi-calculator
```

### 3. Compile the program

```bash
javac BMIGUI.java
```

### 4. Run the application

```bash
java BMIGUI
```

---

## 📊 BMI Formula

### Metric System

```
BMI = weight (kg) / (height in meters)²
```

### Imperial System

```
BMI = (703 × weight in pounds) / (height in inches)²
```

---

## 📁 Project Structure

```
BMIGUI.java
│
├── BMIGUI          # Handles the graphical user interface
└── BMICalculator   # Contains BMI calculation logic and categories
```

---

## ⚠️ Input Requirements

* Weight and height must be **positive numbers**
* Use:

  * **meters** for Metric height
  * **inches** for Imperial height

---

## 💡 Future Improvements

* Add unit labels dynamically (kg/m or lbs/in)
* Improve UI design (JavaFX version)
* Add BMI history tracking
* Include visual BMI chart/scale
* Save user inputs

---

## 📄 License

This project is open-source and available under the **MIT License**.

---

## 👨‍💻 Author [Betty Silubane]

Your Name
GitHub: [https://github.com/Bettysilubane](https://github.com/Bettysilubane/BMI-Calculator-App)

---
