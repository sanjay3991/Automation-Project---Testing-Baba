Automation Project - Testing Baba

Overview
This automation project, named Testing Baba, is designed to provide comprehensive test automation for Java-based applications. The project is structured with a focus on Java, utilizing a base library, and includes utility modules for Excel and property file handling. It also encompasses testing pages and test scripts to facilitate efficient and effective automation.

Project Structure
The project is organized into the following main components:

main:

This module serves as the main entry point for the automation project, providing configurations and orchestrating the overall testing process.
java:

The core Java module contains essential functionalities and utilities used across the entire project.
baselibrary:

The base library module includes foundational functions and classes essential for building test scripts.
excelutility:

This module focuses on handling Excel-related operations, providing utility functions for reading and writing Excel files.
propertyutility:

The property utility module is dedicated to managing property files, enabling efficient handling of configuration data.
testingbaba_pages:

This module encapsulates page objects, representing different pages or components of the application under test. Page objects are designed to enhance test script readability and maintenance.
test/testingbaba_test:

The test module contains actual test scripts leveraging the testing pages and base library to perform end-to-end automation testing.
How to Use
Setting up Environment:

Ensure Java is installed on your system.
Set up the necessary dependencies and libraries as specified in the project configuration.
Configurations:

Adjust configurations in the 'main' module to match your testing environment, including URLs, browser configurations, and other settings.
Building and Running Tests:

Execute the test scripts located in the 'test' module using your preferred testing framework (e.g., JUnit, TestNG).
Ensure that the necessary testing tools (e.g., Selenium WebDriver) are correctly configured.
Expanding the Project:

To add new test cases, consider creating additional test scripts in the 'test' module.
For new application features, update or create corresponding page objects in the 'testingbaba_pages' module.
Dependencies
The project relies on the following key dependencies:

Selenium WebDriver: Used for browser automation.
TestNG (or JUnit): Employed as the testing framework for organizing and executing test cases.
Ensure that these dependencies are included in your project or update the project configuration accordingly.
