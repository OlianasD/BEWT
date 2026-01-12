@echo off
setlocal enabledelayedexpansion

REM ======= NUMBER OF EXECUTIONS ==========
set n=50

for /L %%i in (1,1,%n%) do (
    echo.
    echo [ESECUZIONE %%i DI %n%]

    echo STarting browser container...
    docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" --name=browser selenium/standalone-chrome:127.0-chromedriver-127.0

    timeout /t 5 /nobreak >nul

    echo Starting Bludit container...
    docker run --name bludit -p 8080:80 -d bludit/docker:3.13.1

    timeout /t 10 /nobreak >nul

    echo Running tests with Maven...
    mvn -Dtest=TestSuite test

    echo Saving results...
    mkdir "..\..\..\..\flakycheck\bludit-3.13.1\conf15-pfp\%%i"
    xcopy /E /Y "target\surefire-reports\*" "..\..\..\..\flakycheck\bludit-3.13.1\conf15-pfp\%%i\"

    echo Stopping and removing Docker containers...
    docker stop browser >nul
    docker rm browser >nul
    docker stop bludit >nul
    docker rm bludit >nul

    timeout /t 5 /nobreak >nul
)

echo.
echo ======= COMPLETED =======
pause
