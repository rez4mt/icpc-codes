@echo off
if "%~1"=="" (
	echo "no name entered"
	goto exit
	
) else (
	if not exist "./src/com/Judges/CodeForce/CF%1" mkdir "./src/com/Judges/CodeForce/CF%1"
	goto done
)

:exit
pause
:done