package proyecto;
import static proyecto.Tokens.*;
%%
%class Lexer
%type Tokens
L = [a-zA-Z_]+
D = [0-9]*
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%
program {lexeme=yytext(); return Program;}
if {lexeme=yytext(); return If;}
else {lexeme=yytext(); return Else;}
fi {lexeme=yytext(); return Fi;}
do {lexeme=yytext(); return Do;}
until {lexeme=yytext(); return Until;}
while {lexeme=yytext(); return While;}
read {lexeme=yytext(); return Read;}
write {lexeme=yytext(); return Write;}
float {lexeme=yytext(); return Float;}
int {lexeme=yytext(); return Int;}
bool {lexeme=yytext(); return Bool;}
not {lexeme=yytext(); return Not;}
and {lexeme=yytext(); return And;}
or {lexeme=yytext(); return Or;}

{espacio} {/*Ignore*/}
"\n" {return Linea;}
"//".* { return ComentarioLinea; }
"=" {lexeme=yytext(); return Igual;}
"+" {lexeme=yytext(); return Suma;}
"-" {lexeme=yytext(); return Resta;}
"*" {lexeme=yytext(); return Multiplicacion;}
"/" {lexeme=yytext(); return Division;}
"^" {lexeme=yytext(); return Potencia;}
"<" {lexeme=yytext(); return Menor;}
"<=" {lexeme=yytext(); return MenorIgual;}
">" {lexeme=yytext(); return Mayor;}
">=" {lexeme=yytext(); return MayorIgual;}
"==" {lexeme=yytext(); return IgualComp;}
"!=" {lexeme=yytext(); return Diferente;}
"," {lexeme=yytext(); return Coma;}
";" {lexeme=yytext(); return FinSentencia;}
"(" {lexeme=yytext(); return Parentesis_a;}
")" {lexeme=yytext(); return Parentesis_c;}
"{" {lexeme=yytext(); return Llave_a;}
"}" {lexeme=yytext(); return Llave_c;}
"/*[^*/]**/" {lexeme=yytext(); return miltiComentario;}

{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}
