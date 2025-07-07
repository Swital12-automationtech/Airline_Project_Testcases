# Airline Booking End-to-End Test Automation Framework

This project is an end-to-end test automation framework developed to simulate real-time airline booking workflows. It validates major user interactions such as account registration, login, and searching for flights (one-way, round-trip, and multi-city) using Selenium WebDriver with Java. The framework follows the Page Object Model and includes Excel-based test data handling, reporting, and CI integration with Jenkins.

## Tech Stack

- Language: Java  
- Automation Tool: Selenium WebDriver  
- Testing Framework: TestNG  
- Build Tool: Maven  
- Design Pattern: Page Object Model (POM)  
- Test Data Handling: Data-Driven Testing (Excel)  
- Reporting: ExtentReports (auto-generated)  
- Screenshots: Captured on failure  
- CI Tool: Jenkins  
- Version Control: GitHub  

## Project Structure

AirlineTestAutomation/
├── ExcelSheet/ # Test data in Excel format
├── Screenshot/ # Captured screenshots
├── airlineproject/ # Base structure (main classes/utilities)
├── src/
│ ├── main/java/pages/ # Page classes (LoginPage, SearchPage, etc.)
│ └── test/java/tests/ # TestNG test cases
├── test-output/ # TestNG output reports
├── pom.xml # Maven dependencies and build configuration
├── testng.xml # TestNG suite
└── parallel.xml # Parallel test execution config


## Test Scenarios Covered

1. Verify that users can successfully register for a new account  
2. Validate the login functionality with valid credentials  
3. Test login with invalid credentials and ensure proper error messages are displayed  
4. Test the search functionality for one-way flights  
5. Test the search functionality for round-trip flights  
6. Validate search results for different classes (economy, business, first class)  
7. Test for multi-city flight search  

