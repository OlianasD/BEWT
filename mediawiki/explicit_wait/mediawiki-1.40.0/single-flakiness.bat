@echo off
setlocal enabledelayedexpansion

REM ======= CONFIGURA QUI IL NUMERO DI ESECUZIONI ==========
set n=10

REM ======= PERCORSO BASE PER I RISULTATI ===================

for /L %%i in (1,1,%n%) do (
    echo.
    echo [ESECUZIONE %%i DI %n%]
    
    echo Avvio container browser...
    docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" --name=browser selenium/standalone-chrome:139.0-chromedriver-139.0

    echo Creazione volumi Mediawiki...
    .\docker-clone.bat
    echo Avvio containers Mediawiki...
    docker compose up -d

    timeout /t 15 /nobreak >nul

    timeout /t 5 /nobreak >nul

    echo Esecuzione test con Maven...
    mvn -Dtest=EditProtectedPage_ForbiddenTest test
    timeout /t 5 /nobreak >nul
    echo Salvataggio risultati...
    mkdir "..\..\..\..\flakycheck\mediawiki\editprotectedpage_forbidden\%%i"
    xcopy /E /Y "target\surefire-reports\*" "..\..\..\..\flakycheck\mediawiki\editprotectedpage_forbidden\%%i\"

    echo Arresto e rimozione container Docker...
    docker stop browser >nul
    docker rm browser >nul
    docker stop mediawiki-1400-mediawiki-1 >nul
    docker rm mediawiki-1400-mediawiki-1 >nul
    docker stop mediawiki-1400-database-1 >nul
    docker rm mediawiki-1400-database-1 >nul
    docker volume rm mediawiki-1400_images-modifiable >nul
    docker volume rm mediawiki-1400_db-modifiable >nul

    timeout /t 5 /nobreak >nul
)

echo.
echo ======= COMPLETATO =======
pause
