@echo off
setlocal
call "%~dp0gradlew.bat" run --console=plain
set EXITCODE=%ERRORLEVEL%
endlocal & exit /b %EXITCODE%
