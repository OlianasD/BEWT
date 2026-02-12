E2E Web Testing benchmark
=========================

Test suites for Mediawiki
----------------------

This directory contains test suites and Gherkin speficiations for Mediawiki.

# Deployment instructions
The Docker containers for Mediawiki can be created using the `docker-compose.yml` file contained in `mediawiki-1.40.0/docker-compose.yml`. Just move into the directory using a terminal and type:

```bash
docker compose up
```

The web application will be exposed on `localhost:8080`. An installation wizard must be followed after deploying the container.

### Container removal
At the end of test suite execution, you must remove the application container (`mediawiki-1400-mediawiki-1`), the database container (`mediawiki-1400-database-1`) and two volumes (`mediawiki-1400_images` and `mediawiki-1400_db`).

> **Note:** For containers created with Docker Compose, the name of the containers and volumes depends on the name of the directory.  
> If you rename the directory, you must also rename the containers and volumes in flakiness.bat, otherwitse the script will not work.

# Installation instructions

The installation wizard can be executed automatically by running `mediawiki.Installer` as a JUnit test. If, for any reason, the automatic installation fails, these are the parameters that you should set in the installation wizard:

* Languages: **English**
* Database host:  **database**
* Database username: **wikiuser**
* Database password: **example**
* Wiki name: **E2E Web Testing wiki**
* Your username: **admin**
* Password: **e2eW3Bt3s71nGB3nchM4rK**
* E-mail address: **admin@wiki.example**
* User rights profile: **Authorized editors only**
* Uncheck **Enable outbound email**
* Check **all special pages**
* Check **all editors**
* Disable caching (select **No caching** in **Settings for object caching**)

After the installation (either manual or automatic), a PHP file named `LocalSettings.php` will be downloaded. Copy this file into the container under `/var/www/html` with the command `docker cp LocalSettings.php mediawiki-1400-mediawiki-1:/var/www/html` and the application will be ready for testing.

# Running instructions

Compile the test suite with 

```bash
mvn clean compile test-compile
```
and run with
```bash
mvn -Dtest=TestSuite test
```