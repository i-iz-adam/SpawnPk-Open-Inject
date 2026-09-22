@echo off
echo Creating build directory...
if not exist build mkdir build

echo Generating source list...
dir /s /b src\*.java > sources.txt

echo Compiling Java sources...
javac --release 11 -cp "deps.jar;build" -d build @sources.txt

if %ERRORLEVEL% NEQ 0 (
    echo Compilation failed with error code %ERRORLEVEL%.
) else (
    echo Compilation completed successfully!
)

if exist sources.txt del sources.txt
pause
