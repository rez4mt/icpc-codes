@ECHO OFF

set MP=E:\Project\java\judges\

if "%~1"=="" (
    goto start
) else (
    set command=%1
    goto check
)

:start
echo Enter the command (open/new/exit)
set /p command=
goto :check

:notfound
echo Command not found
goto start

:check
IF /i "%command%"=="open" goto name
IF /i "%command%"=="new" goto name
IF /i "%command%"=="exit" goto exit
goto notfound

:name
if "%~2"=="" (
  echo Enter UVA Number
  set /p name=
) else (
    set name=%2
)
IF /i "%command%"=="open" goto open
IF /i "%command%"=="new" goto create

:open
START /B CMD /C CALL "E:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\bin\idea.bat" %MP%/%dir%/U%name%.java >NUL 2>&1
goto exit

:create
set dir=./src/com/Judges/UVA/
powershell -Command "(gc Data/UVTemplate) -replace '_C2NAME', 'U%name%' | Out-File -encoding ASCII %dir%/U%name%.java"
START /B CMD /C CALL "E:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\bin\idea.bat" %MP%/%dir%/U%name%.java >NUL 2>&1
goto exit

:exit
cls
