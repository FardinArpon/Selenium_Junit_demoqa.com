# Selenium_Junit_Java_demoqa.com
Web-automation test project. In this project work with Selenium Web-Driver, Juint test runner on java language.

the website link is https://demoqa.com/

## Technology:
- Tool: selenium
- IDE: IntelIJ
- Build tool: Gradle
- Language: Java
- Test_Runner: Junit

## Prerequisite:
1. Need to install jdk 1.8
2. Need good internet connectivity

## Run the automation script:
1. Open cmd to the project folder
2. Type this command:

```sh
gradle clean test
```
3. Selenium will open the browser and start automation.
4. To view report, type this command:
```sh
allure generate allure-results --clean -o allure-report
allure serve allure-results
```
## Report View


