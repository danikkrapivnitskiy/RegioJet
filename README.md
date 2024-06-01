### Maven Demo Project: A Journey Through Best Practices

---

    This project showcases a robust Maven demo, built with a focus on best practices and a commitment to clean, maintainable code.

---

### Core Principles

#### This project embodies the following principles:
1. OOP
2. SOLID
3. DRY
4. KISS
5. Framework Development Patterns and etc

### Project Structure
#### The project is organized into distinct modules:
1. __RegioJet:__ UI and API projects for the RegioJet service.
2. __Idos:__ UI project for the Idos service.
3. __MockServer:__ Project for testing the database with created mock server.
4. __OpenLibriary:__ UI and API tests with Cucumber for the Open Library service.

### Technology Stack
#### I utilize a powerful set of technologies:
1. __Java:__ The core programming language.
2. __Selenium:__ Used for UI automation testing.
3. __Rest Assured:__ Used for API testing.
4. __Cucumber:__ A framework for behavior-driven development.
5. Additional technologies as: JUnit5, TestNG, SL4J and etc.

### Getting Started:
#### 1. Clone repository to your directory and navigate to project folder
- Write to your command line this command
    ```bash
    git clone https://github.com/danikkrapivnitskiy/RegioJet.git && cd RegioJet
    ```
#### 2. Prerequisites:
- Java 17+: Ensure you have Java 17 or later installed. Update java version in properties pom.xml if needed
    ```bash
    java --version
    ```
- Maven v3.6.3 or higher: Make sure you have Maven 3.6.3 or later installed.
    ```bash
    mvn --version
    ```
- Allure 
  - if you want to generate allure report, you need installed Node.js
      ```bash
      node -v
      ```
  - install allure command line
    ```bash
    npm install -g -allure-command line
    ```

#### 3. Database Connection: Verify your IDE have a connection to the SQL database.
- You can check it by this unit test
    ```bash
    mvn test -Dtest=UnitDbTest
    ```
#### 4. Download Dependencies:
- Run the following command to prepare the project
    ```bash
    mvn clean install -DskipTests
    ```
#### 5. Run Tests:
- You are ready to run tests.
    ```bash
    mvn test
    ```
#### 6. Take a look at your first test report!
- Generate allure report
    ```bash
    allure serve target/allure-results
    ```
### Project Structure:
1. __mockServer:__ Contains the Mock tests.
2. __regiojet:__ Contains the RegioJet tests.
3. __cucumber:__ Contains the Open Library tests, runner, and step definitions.
4. __idos:__ Contains the Idos tests.