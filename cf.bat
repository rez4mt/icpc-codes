@echo off

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
echo Unknown command
goto start

:check
IF /i "%command%"=="open" goto name
IF /i "%command%"=="new" goto name
IF /i "%command%"=="exit" goto exit
goto notfound

:name
if "%~2"=="" (
  echo Enter Contest Number
  set /p name=
) else (
    set name=%2
)
IF /i "%command%"=="open" goto open
IF /i "%command%"=="new" goto create

:open
if exist "%dir%/A.java" START /B CMD /C CALL "E:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\bin\idea.bat" %MP%/%dir2%/A.java >NUL 2>&1
if exist "%dir%/B.java" START /B CMD /C CALL "E:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\bin\idea.bat" %MP%/%dir2%/B.java >NUL 2>&1
if exist "%dir%/C.java" START /B CMD /C CALL "E:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\bin\idea.bat" %MP%/%dir2%/C.java >NUL 2>&1
if exist "%dir%/D.java" START /B CMD /C CALL "E:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\bin\idea.bat" %MP%/%dir2%/D.java >NUL 2>&1
if exist "%dir%/E.java" START /B CMD /C CALL "E:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\bin\idea.bat" %MP%/%dir2%/E.java >NUL 2>&1
if exist "%dir%/F.java" START /B CMD /C CALL "E:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\bin\idea.bat" %MP%/%dir2%/F.java >NUL 2>&1
if exist "%dir%/G.java" START /B CMD /C CALL "E:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\bin\idea.bat" %MP%/%dir2%/G.java >NUL 2>&1
goto done

:create
if not exist "./src/com/Judges/CodeForce/CF%name%" mkdir "./src/com/Judges/CodeForce/CF%name%"
set dir=./src/com/Judges/CodeForce/CF%name%
set dir2=src/com/Judges/CodeForce/CF%name%
set cfname= "CF%name%"
if not exist "%dir%/A.java" (
    powershell -Command "(gc Data/Template) -replace '_CNAME', 'package com.Judges.CodeForce.%cfname%' | Out-File -encoding ASCII %dir%/A.java"
    powershell -Command "(gc %dir%/A.java) -replace '_C2NAME', 'A' | Out-File -encoding ASCII %dir%/A.java"
    START /B CMD /C CALL "E:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\bin\idea.bat" %MP%/%dir2%/A.java >NUL 2>&1
) else (
    powershell -Command "(gc Data/Template) -replace '_CNAME', 'package com.Judges.CodeForce.%cfname%' | Out-File -encoding ASCII %dir%/D.java"
    powershell -Command "(gc %dir%/D.java) -replace '_C2NAME', 'D' | Out-File -encoding ASCII %dir%/D.java"
    START /B CMD /C CALL "E:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\bin\idea.bat" %MP%/%dir2%/D.java >NUL 2>&1
)
if not exist "%dir%/B.java" (
   powershell -Command "(gc Data/Template) -replace '_CNAME', 'package com.Judges.CodeForce.%cfname%' | Out-File -encoding ASCII %dir%/B.java"
   powershell -Command "(gc %dir%/B.java) -replace '_C2NAME', 'B' | Out-File -encoding ASCII %dir%/B.java"
   START /B CMD /C CALL "E:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\bin\idea.bat" %MP%/%dir2%/B.java >NUL 2>&1
) else (
    powershell -Command "(gc Data/Template) -replace '_CNAME', 'package com.Judges.CodeForce.%cfname%' | Out-File -encoding ASCII %dir%/E.java"
    powershell -Command "(gc %dir%/E.java) -replace '_C2NAME', 'E' | Out-File -encoding ASCII %dir%/E.java"
    START /B CMD /C CALL "E:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\bin\idea.bat" %MP%/%dir2%/E.java >NUL 2>&1
)
if not exist "%dir%/C.java" (
    powershell -Command "(gc Data/Template) -replace '_CNAME', 'package com.Judges.CodeForce.%cfname%' | Out-File -encoding ASCII %dir%/C.java"
    powershell -Command "(gc %dir%/C.java) -replace '_C2NAME', 'C' | Out-File -encoding ASCII %dir%/C.java"
    START /B CMD /C CALL "E:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\bin\idea.bat" %MP%/%dir2%/C.java >NUL 2>&1
) else (
    powershell -Command "(gc Data/Template) -replace '_CNAME', 'package com.Judges.CodeForce.%cfname%' | Out-File -encoding ASCII %dir%/F.java"
    powershell -Command "(gc %dir%/F.java) -replace '_C2NAME', 'F' | Out-File -encoding ASCII %dir%/F.java"
    START /B CMD /C CALL "E:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\bin\idea.bat" %MP%/%dir2%/F.java >NUL 2>&1
)
echo Created.
goto done

:exit
cls

:done
cls
