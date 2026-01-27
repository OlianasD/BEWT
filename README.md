E2E Web Testing benchmark
=========================

This repository contains a collection of 28 end-to-end (E2E) test suites for Web applications. All the test suites:

* are written in Java language
* use the Selenium WebDriver framework to interact with the Web application
* use JUnit as testing framework
* contain one test per class

We developed the test suites for 8 target applications, namely Bludit, Claroline, Expresscart, Joomla, Kanboard, MantisBT, Mediawiki and Prestashop. All the applications can be deployed in Docker containers: the installation instructions for each application are contained in its folder.

For each web application, at least three test suites are available:

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


If you use this repository in your research work, please cite the following paper:

Dario Olianas, Maurizio Leotta, Filippo Ricca.
**BEWT: A Benchmark for End-to-End Web Testing.**
*Proceedings of 51st Euromicro Conference Series on Software Engineering and Advanced Applications* (**SEAA 2025**), 10-12 September 2025, Salerno, Italy, LNCS, Springer, 2025.

https://doi.org/10.1007/978-3-032-04207-1_20