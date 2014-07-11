@echo off
set JAVA=c:\java64\jdk1.7.0_55\bin\java.exe
set classpath="jars\*.jar;classes;."
%JAVA% -classpath %CLASSPATH% fuzzj.FuzzJ
