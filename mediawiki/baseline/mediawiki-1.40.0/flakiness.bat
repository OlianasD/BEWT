@echo off
setlocal enabledelayedexpansion

REM ======= CONFIGURA QUI IL NUMERO DI ESECUZIONI ==========
set n=50

REM ======= PERCORSO BASE PER I RISULTATI ===================

for /L %%i in (46,1,%n%) do (
    echo.
    echo [ESECUZIONE %%i DI %n%]

    REM echo Avvio container browser...
    REM docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" --name=browser selenium/standalone-chrome:127.0-chromedriver-127.0

    REM timeout /t 5 /nobreak >nul

    echo Avvio containers Mediawiki...
    docker compose up -d

    timeout /t 15 /nobreak >nul

    echo Installazione Mediawiki...
    mvn -Dtest=Installer test

    echo Copio LocalSettings.php...
    docker cp LocalSettings.php mediawiki-1400-mediawiki-1:/var/www/html

    timeout /t 5 /nobreak >nul

    echo Esecuzione test con Maven...
    mvn -Dtest=TestSuite test
    timeout /t 5 /nobreak >nul
    echo Salvataggio risultati...
    mkdir "..\..\..\..\..\..\ASE SI flakiness\executions\per_app\mediawiki-1.40.0\conf3\%%i"
    xcopy /E /Y "target\surefire-reports\*" "..\..\..\..\..\..\ASE SI flakiness\executions\per_app\mediawiki-1.40.0\conf3\%%i\"

    echo Arresto e rimozione container Docker...
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
echo ======= COMPLETATO =======
pause
