# GUI Testing

## 📌 Overview  
The objective is to design and execute automated test cases for two versions of a GUI-based web application using Selenium.

## 🖥️ Application Details  
The application is a **Quiz Web Application** with multiple pages, featuring text boxes, images, radio buttons, checkboxes, and navigation buttons.  

- **Version 1:**  
  - Standard layout with images, textboxes, checkboxes, and navigation flow: Page1 → Page2 → Page3 → Page4 → Page6.  
- **Version 2:**  
  - GUI modifications: changes in element size, position, and orientation.  
  - Flow between pages is changed (e.g., Medium questions page now appears before Easy questions).  

Screenshots and detailed descriptions of changes are documented in the [Project Report (PDF)](GUI Testing Report.pdf).

---

## ⚙️ Technology Stack
- **Language:** Java  
- **Test Framework:** JUnit 5  
- **Automation Tool:** Selenium WebDriver  
- **Browser:** Google Chrome  

---

## 🧪 Test Case Details  
The test suite includes **95 test cases** validating:

1. **Existence of GUI elements:** Images, textboxes, buttons, radio buttons, checkboxes.  
2. **Location & Size:** X, Y coordinates and dimensions of elements.  
3. **Content:** Correct labels, text, `alt` attributes, and values.  
4. **Navigation:** Flow between pages is validated using URL checks.  

### Examples:
- `testImageExists1()`: Verifies image presence on Page1.  
- `testTextboxContent1()`: Validates placeholder text of the username field.  
- `testPage1ToPage2Navigation()`: Validates correct navigation after user actions.  

---

## 🚀 Execution Instructions  

### Prerequisites
1. Install **Java JDK 8+**
2. Install **Chrome** browser
3. Download matching **chromedriver.exe** and place it in the project root  
   [Download here](https://chromedriver.chromium.org/downloads)
4. Install dependencies (JUnit 5 and Selenium)

### Run Tests
Navigate to the project folder with pom.xml
mvn test

## 📊 Test Results  

### **Version 1:**
- ✅ **95/95 test cases passed.**  
- All GUI elements were found in the correct locations and sizes.  
- Navigation between pages was smooth and followed the expected flow.  

### **Version 2:**
- ✅ **65/95 test cases passed.**  
- ❌ **30/95 test cases failed** due to intentional GUI changes:  
  - Elements had **different X/Y locations**.  
  - Changes in **element sizes**.  
  - **Navigation flow** was altered (e.g., Medium questions appearing before Easy).  

**Summary:**  
- The failures in Version 2 highlight how GUI changes can break test cases that depend on fixed coordinates, labels, or flow.  
- The reusable test suite provided a clear regression analysis.

---

## 🔍 Tool Assessment: Selenium  

1. **Strengths:**
   - Cross-platform and supports multiple browsers.
   - Easily integrates with **JUnit 5**, Maven, and CI/CD pipelines.
   - Flexible for functional, regression, and cross-browser testing.
   - Allowed reusing the **same test suite** for multiple GUI versions.

2. **Weaknesses:**
   - **Sensitive to UI changes:** Hardcoded element locations and text checks can fail if the GUI is updated.
   - Limited **native reporting** (requires third-party tools like TestNG or Allure for advanced reporting).
   - Requires maintaining **browser drivers** (e.g., chromedriver).

3. **Overall:**  
   - Selenium is a powerful choice for **functional GUI testing**, especially when tests can be reused across versions.
   - Future improvements can include **dynamic locators** (using XPath/CSS) and integrating a reporting framework.
