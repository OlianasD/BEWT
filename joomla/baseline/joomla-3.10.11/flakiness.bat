@echo off
setlocal enabledelayedexpansion

REM ======= CONFIGURA QUI IL NUMERO DI ESECUZIONI ==========
set n=50

REM ======= PERCORSO BASE PER I RISULTATI ===================

for /L %%i in (1,1,%n%) do (
    echo.
    echo [ESECUZIONE %%i DI %n%]

    echo Avvio containers Joomla...
    docker compose up -d

    timeout /t 10 /nobreak >nul

    echo Installazione Joomla...
    mvn -Dtest=Installer test

    echo Eliminazione messaggi post-installazione...
    mvn -Dtest=RemoveMessages test

    timeout /t 5 /nobreak >nul

    echo Esecuzione test con Maven...
    mvn -Dtest=TestSuite test
    timeout /t 5 /nobreak >nul
    echo Salvataggio risultati...
    mkdir "..\..\..\..\flakycheck\joomla-3.10.11\conf1\%%i"
    xcopy /E /Y "target\surefire-reports\*" "..\..\..\..\flakycheck\joomla-3.10.11\conf1\%%i\"

    echo Arresto e rimozione container Docker...
    docker stop joomla-31011-joomla-1 >nul
    docker rm joomla-31011-joomla-1 >nul
    docker stop joomla-31011-joomladb-1 >nul
    docker rm joomla-31011-joomladb-1 >nul

    timeout /t 5 /nobreak >nul
)

echo.
echo ======= COMPLETATO =======
pause
