E2E Web Testing benchmark
=========================

Test suites for Bludit
----------------------

This directory contains test suites and Gherkin speficiations for Bludit.

# Deployment instructions
The Docker container for the application under test can be created using the following commands:

```bash
#for version 3.13.1
docker run --name bludit -p 8989:80 -d bludit/docker:3.13.1
```

The web application will be exposed on `localhost:8989`. 

# Installation instructions

Once the container is deployed, the user must connect to `/install.php` and follow the installation wizard. The required language is English, the required password is `password`.

