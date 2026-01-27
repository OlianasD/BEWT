@echo off
setlocal enabledelayedexpansion

REM ======= CONFIGURA QUI IL NUMERO DI ESECUZIONI ==========
set n=11

REM ======= PERCORSO BASE PER I RISULTATI ===================

for /L %%i in (1,1,%n%) do (
    echo.
    echo [ESECUZIONE %%i DI %n%]

    REM echo Avvio container browser...
    REM docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" --name=browser selenium/standalone-chrome:127.0-chromedriver-127.0

    REM timeout /t 5 /nobreak >nul

    echo Avvio container Joomla...
    docker run -i -t  --name=joomla -p "3000:80" -d olianasd/joomla4stile

    timeout /t 10 /nobreak >nul

    echo Esecuzione test con Maven...
    mvn -Dtest=TestSuite test

    echo Salvataggio risultati...
    mkdir "..\..\..\..\..\..\ASE SI flakiness\executions\per_app\joomla-4.2.0\conf3\%%i"
    xcopy /E /Y "target\surefire-reports\*" "..\..\..\..\..\..\ASE SI flakiness\executions\per_app\joomla-4.2.0\conf3\%%i\"

    echo Arresto e rimozione container Docker...
    REM docker stop browser >nul
    REM docker rm browser >nul
    docker stop joomla >nul
    docker rm joomla >nul

    timeout /t 5 /nobreak >nul
)

echo.
echo ======= COMPLETATO =======
pause
