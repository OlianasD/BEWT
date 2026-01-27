@echo off
setlocal enabledelayedexpansion

REM ======= NUMBER OF RUNS ==========
set n=50

for /L %%i in (1,1,%n%) do (
    echo.
    echo [RUN %%i OF %n%]

    REM echo Starting browser container...
    REM docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" --name=browser selenium/standalone-chrome:127.0-chromedriver-127.0

    REM timeout /t 5 /nobreak >nul

    echo Starting Mediawiki containers...
    docker compose up -d

    timeout /t 15 /nobreak >nul

    echo Installing Mediawiki...
    mvn -Dtest=Installer test

    echo Copying LocalSettings.php...
    docker cp LocalSettings.php mediawiki-1400-mediawiki-1:/var/www/html

    timeout /t 5 /nobreak >nul

    echo Running tests with Maven...
    mvn -Dtest=TestSuite test
    timeout /t 5 /nobreak >nul

    echo Saving results...
    mkdir "..\..\..\..\..\..\ASE SI flakiness\executions\per_app\mediawiki-1.40.0\conf11\%%i"
    xcopy /E /Y "target\surefire-reports\*" "..\..\..\..\..\..\ASE SI flakiness\executions\per_app\mediawiki-1.40.0\conf11\%%i\"

    echo Stopping and removing Docker containers...
    REM docker stop browser >nul
    REM docker rm browser >nul
    docker stop mediawiki-1400-mediawiki-1 >nul
    docker rm mediawiki-1400-mediawiki-1 >nul
    docker stop mediawiki-1400-database-1 >nul
    docker rm mediawiki-1400-database-1 >nul
    docker volume rm mediawiki-1400_images >nul
    docker volume rm mediawiki-1400_db >nul

    timeout /t 5 /nobreak >nul
)

echo.
echo ======= DONE =======
pause
