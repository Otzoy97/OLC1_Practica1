                                                                                                                                                                                                                                                                                                                                                                                                                package analizador;
import java_cup.runtime.Symbol;

%%

%{
    public static String Err ="";
%}

//directivas

%cupsym sym
%class Scanner
%cup
%public
%unicode
%line
%column
%char
%ignorecase

//regex

Comentario = "//" [^\r\n]* [^\r\n]
ComentarioMulti = ("/*" [^/] ~"*/") |("/*" "/"+ "*/")
Entero = [0-9]+
Cadena = [\"][^\"\n]*[\"\n]
Letra = [A-Za-z]+
Identificador = {Letra}({Letra}|{Entero}|"_")*
Espacio = \t\f|" "|\r|\n

%%

"+" 
{
    return new Symbol(sym.MAS, yycolumn,yyline,yytext());
}
"-" 
{
    return new Symbol(sym.MENOS, yycolumn,yyline,yytext());
}
"*" 
{
    return new Symbol(sym.PRODUCTO, yycolumn,yyline,yytext());
}
"/" 
{
    return new Symbol(sym.DIVISION, yycolumn,yyline,yytext());
}
"(" 
{
    return new Symbol(sym.ABRIR_PARENTESIS, yycolumn,yyline,yytext());
}
")" 
{
    return new Symbol(sym.CERRAR_PARENTESIS, yycolumn,yyline,yytext());
}
"=" 
{
    return new Symbol(sym.IGUAL, yycolumn,yyline,yytext());
}
";" 
{
    return new Symbol(sym.SEMICOLON, yycolumn, yyline,yytext());
}
":"
{
    return new Symbol(sym.COLON, yycolumn, yyline,yytext());
}
","
{
    return new Symbol(sym.COMA, yycolumn, yyline,yytext());
}
"¿" 
{
    return new Symbol(sym.ABRIR_INTERROGACION,yycolumn,yyline,yytext());
}
"?" 
{
    return new Symbol(sym.CERRAR_INTERROGACION,yycolumn,yyline,yytext());
}
"[" 
{
    return new Symbol(sym.ABRIR_CORCHETE,yycolumn,yyline,yytext());
}
"]" 
{
    return new Symbol(sym.CERRAR_CORCHETE,yycolumn,yyline,yytext());
}
"{" 
{
    return new Symbol(sym.ABRIR_LLAVE, yycolumn, yyline,yytext());
}
"}" 
{
    return new Symbol(sym.CERRAR_LLAVE, yycolumn,yyline,yytext());
}
<YYINITIAL> "string" 
{
    return new Symbol(sym.STRING,yycolumn,yyline,yytext());
}
<YYINITIAL> "int" 
{
    return new Symbol(sym.INT,yycolumn,yyline,yytext());
}
<YYINITIAL> "definirglobales"
{
    return new Symbol(sym.DEFINIR,yycolumn,yyline,yytext());
}
<YYINITIAL> "graficabarras" 
{
    return new Symbol(sym.GRAFICABARRAS,yycolumn,yyline,yytext());
}
<YYINITIAL> "graficalineas" 
{
    return new Symbol(sym.GRAFICALINEAS,yycolumn,yyline,yytext());
}
<YYINITIAL> "definirxyline" 
{
    return new Symbol(sym.DEFINIRXYLINE,yycolumn,yyline,yytext());
}
<YYINITIAL> "id" 
{
    return new Symbol(sym.ID,yycolumn,yyline,yytext());
}
<YYINITIAL> "titulo" 
{
    return new Symbol(sym.TITULO,yycolumn,yyline,yytext());
}
<YYINITIAL> "titulox" 
{
    return new Symbol(sym.TITULOX,yycolumn,yyline,yytext());
}
<YYINITIAL> "tituloy" 
{
    return new Symbol(sym.TITULOY,yycolumn,yyline,yytext());
}
<YYINITIAL> "EjeX"
{
    return new Symbol(sym.EJEX,yycolumn,yyline,yytext());
}
<YYINITIAL> "EjeY"
{
    return new Symbol(sym.EJEY,yycolumn,yyline,yytext());
}
<YYINITIAL> "puntosxy"
{
    return new Symbol(sym.PUNTOSXY,yycolumn,yyline,yytext());
}
<YYINITIAL> "nombre"
{
    return new Symbol(sym.NOMBRE,yycolumn,yyline,yytext());
}
<YYINITIAL> "color"
{
    return new Symbol(sym.COLOR,yycolumn,yyline,yytext());
}
<YYINITIAL> "grosor"
{
    return new Symbol(sym.GROSOR,yycolumn,yyline,yytext());
}
<YYINITIAL> "puntos"
{
    return new Symbol(sym.PUNTOS,yycolumn,yyline,yytext());
}
<YYINITIAL> "galeria"
{
    return new Symbol(sym.GALERIA,yycolumn,yyline,yytext());
}
{Identificador}
{
    return new Symbol(sym.IDENTIFICADOR, yycolumn,yyline,yytext());
}
{Comentario} {}
{ComentarioMulti} {}
{Espacio} {}
{Entero} 
{
    return new Symbol(sym.ENTERO, yycolumn, yyline, yytext());
}
{Cadena}  
{
    return new Symbol(sym.CADENA, yycolumn,yyline,yytext());
}
.
{
    Err += "Lexema " + yytext() + ", Línea " + yyline + ", Columna " + yychar + "\n";
    System.out.println(Err);
}
