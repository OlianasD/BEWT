@echo off
setlocal enabledelayedexpansion

REM ======= CONFIGURA QUI IL NUMERO DI ESECUZIONI ==========
set n=50

REM ======= PERCORSO BASE PER I RISULTATI ===================

for /L %%i in (1,1,%n%) do (
    echo.
    echo [ESECUZIONE %%i DI %n%]

    REM echo Avvio container browser...
    REM docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" --name=browser selenium/standalone-chrome:138.0-chromedriver-138.0

    REM timeout /t 5 /nobreak >nul

    echo Avvio container MantisBT...
    docker run -it --workdir=/home --name=mantisbt --expose 80 --expose 3306 -p 3000:80 -p 3306:3306 -d --entrypoint ./run-services-docker.sh olianasd/mantisbt-strongpsw:1.2.0 bash

    timeout /t 10 /nobreak >nul

    echo Esecuzione test con Maven...
    mvn -Dtest=TestSuite test

    echo Salvataggio risultati...
    mkdir "..\..\..\..\flakycheck\mantisbt-1.2.0\conf1\%%i"
    xcopy /E /Y "target\surefire-reports\*" "..\..\..\..\flakycheck\mantisbt-1.2.0\conf1\%%i\"

    echo Arresto e rimozione container Docker...
    REM docker stop browser >nul
    REM docker rm browser >nul
    docker stop mantisbt >nul
    docker rm mantisbt >nul

    timeout /t 5 /nobreak >nul
)

echo.
echo ======= COMPLETATO =======
pause
