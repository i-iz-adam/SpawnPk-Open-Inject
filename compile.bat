@echo off
setlocal
call "%~dp0gradlew.bat" compileJava
if errorlevel 1 exit /b %errorlevel%
echo Compilation completed: build\classes\java\main
endlocal
