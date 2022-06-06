
# UI testing using selenium cucumber BDD	
This project is a plan project with Cucumber framework to automate Web application.

- Automation of ABN amro web application with selenium BDD

- This also includes the cucumber reporting.


## Project Setup
- Install [Java](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

- Install [Maven](https://maven.apache.org/install.html)


## Execute Scripts

```
1. Download the project from github https://github.com/ssshivangi/abn-assignment
2. Open command prompt from downloaded project folder 
3. To execute automation scripts, run command 'mvn clean test'
4. To generate the cucumber report 'mvn verify -DskipTests'
5. Refresh the project folder, in order to view cucumber report. Go to target -> cucumber-report-html -> cucumber-html-reports -> feature-overview.html

```


## Test Reports

folder target -> cucumber-report-html -> cucumber-html-reports -> feature-overview.html

![TestReport](.\screenshot\Test_Report.jpg)

## Test Cases

- Added test for login functionality. 
- Added test to verify content on Home Page
- Added scenarios to verify expected functionality of Products page. (As of now, development has not been done)
- Added scenarios to verify expected functionality of Contacts page. (As of now, development has not been done)
- Added scenarios to verify error message for incorrect credentials. (As of now, development has not been done)




