import java_cup.runtime.Symbol;

%%

%{

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
Id = {Letra}({Letra}|{Entero}|"_")*
Espacio = \t\f|" "|\r|\n

%%

//Acciones

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
{Id}
{
    return new Symbol(sym.ID, yycolumn,yyline,yytext());
}
