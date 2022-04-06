package proyecto;
import static proyecto.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
F=[0-9]*.[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
int |
if |
else |
switch |
case |
double |
for |
do |
while {lexeme=yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"//".* { return ComentarioLinea; }
"=" {return Igual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
";" {return finSentencia;}
"/*[^*/]**/" {return miltiComentario;}
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
{D}*.{D}+ {lexeme=yytext(); return Flotante;}
 . {return ERROR;}
