@echo off
set "JAVA_EXE=C:\Users\naxos\AppData\Local\SpawnPK\jre\bin\java.exe"

if not exist "%JAVA_EXE%" (
    echo Error: Java runtime not found at %JAVA_EXE%
    pause
    exit /b 1
)

echo Running rs.gui.Launcher...
"%JAVA_EXE%" -cp "deps.jar;build" rs.gui.Launcher %*

if %ERRORLEVEL% NEQ 0 (
    echo Application exited with code %ERRORLEVEL%.
    pause
)
