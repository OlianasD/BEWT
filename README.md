E2E Web Testing benchmark
=========================

If you use this repository in your research work, please cite the following paper:

Dario Olianas, Maurizio Leotta, Filippo Ricca.
**BEWT: Extended Benchmarking for End-to-End Web Testing.**
Journal of Systems and Software, 2026, ISSN 0164-1212.

https://doi.org/10.1016/j.jss.2026.112849

------------------------------------------

This repository contains a collection of 36 end-to-end (E2E) test suites for Web applications. All the test suites:

* are written in Java language
* use the Selenium WebDriver framework to interact with the Web application
* use JUnit as testing framework
* contain one test per class

We developed the test suites for 8 target applications, namely Bludit, Claroline, Expresscart, Joomla, Kanboard, MantisBT, Mediawiki and Prestashop. All the applications can be deployed in Docker containers: the installation instructions for each application are contained in its folder.

For each web application, at least four test suites are available:

1. the main test suite: a Java test suite designed using the Page Object pattern and using Selenium WebDriver's implicit waits to handle interactions with the page
	* includes a Gherkin specification for each test case
  
2. a version of the test suite that uses Selenium WebDriver's explicit waits to handle interactions with the page, instead of the implicit waits
 
3. a version of the test suite that does not employ the Page Object pattern

4. a version of the test suite that uses only absolute XPaths as locators and does not employ the page object pattern


Moreover, for 4 applications out of 8 (namely Bludit, Joomla, MantisBT and Prestashop) we included another test suite for a further version of the application, in order to support studies about evolution of the test suites. 

This repository is organized as follows: at the top level there is a directory for each application. The directory of each application contains 4 subdirectories:

1. `baseline/`: contains the main test suite for the application
	* for Bludit, Joomla, MantisBT and Prestashop the directory also contains the test suite for the second version of the application. The version of both applications is specified in the directory's name.

2. `explicit_wait/`: contains a version of the test suite using explicit waits instead of implicit waits. For the applications with two baseline test suites for two different versions of the application, the most recent version of the application has been used.

3. `no_pageobjects/`: contains a version of the test suite that does not employ the Page Object design pattern. For the applications with two baseline test suites for two different versions of the application, the most recent version of the application has been used.

3. `full_xpath/`: contains a version of the test suite that uses only absolute XPaths as locators and does not employ the Page Object design pattern.

5. `gherkin/`: contains the Gherkin specification for each test case of the test suite. For the applications with two baseline test suites for two different versions of the application, the older version has been used.

## How to run

All the test suites are configured to run with Selenium 4.35.0 and Google Chrome 127, and they use Maven as build tool.  To execute the test suite in the command line, follow this procedure:

1. In the test suite directory, compile the project with `mvn clean compile test-compile`
2. Deploy the SUT container, following the instructions provided in the application directory of this repository.
3. Run the test suite with `mvn -Dtest=TestSuite test`

After each execution, whether complete or partial, the SUT container must be destroyed and re-created before running the test suite again. Follow the instructions provided in the application directory of this repository: for some applications, Docker volumes must also be destroyed.

### Execution order
All the test suites are organized with one test script per class. All the test suites contain test dependencies, therefore, a predefined execution order must be followed. The execution order is defined in the file `TestSuite.java`. If you run the test suite using and IDE (e.g. Eclipse, IntelliJ IDEA), you must run `TestSuite.java` to ensure that the correct execution order is followed.

### Containerized browsers
If you want to run the test suites on a containerized browser, you can use the `BaseTest.setupRemoteWebdriver()` method. Replace the invocation of `setupNativeBrowser` in the `BaseTest` method annotated with `@Before` with a call to `BaseTest.setupRemoteWebdriver()`. Then, before running the test suite, you must deploy the browser container. The recommended version is `selenium/standalone-chrome:127.0-chromedriver-127.0`, which can be deployed with the following command:

```bash
docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" --name=browser selenium/standalone-chrome:127.0-chromedriver-127.0
```
