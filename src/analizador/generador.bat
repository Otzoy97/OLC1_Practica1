SET JFLEX_HOME= C:\jflex-1.7.0
cd D:\NETBEANS\OLC1_Practica1\src\analizador\ 
java -jar %JFLEX_HOME%\lib\jflex-full-1.7.0.jar --encoding utf-8 scanner.flex 
pause 

SET JFLEX_HOME= C:\cup
cd D:\NETBEANS\OLC1_Practica1\src\analizador\ 
java -jar %JFLEX_HOME%\java-cup-11b.jar -parser parser parser.cup 
pause