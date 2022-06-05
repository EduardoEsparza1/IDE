package proyecto;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char

L = [a-zA-Z_]+
D = [0-9]*
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
(program) {return new Symbol(sym.Program, yychar, yyline, yytext());}
(if) {return new Symbol(sym.If, yychar, yyline, yytext());}
(else) {return new Symbol(sym.Else, yychar, yyline, yytext());}
(fi) {return new Symbol(sym.Fi, yychar, yyline, yytext());}
(do) {return new Symbol(sym.Do, yychar, yyline, yytext());}

(while) {return new Symbol(sym.While, yychar, yyline, yytext());}
(read) {return new Symbol(sym.Read, yychar, yyline, yytext());}
(write) {return new Symbol(sym.Write, yychar, yyline, yytext());}
(float) {return new Symbol(sym.Float, yychar, yyline, yytext());}
(int) {return new Symbol(sym.Int, yychar, yyline, yytext());}
(bool) {return new Symbol(sym.Bool, yychar, yyline, yytext());}
(not) {return new Symbol(sym.Not, yychar, yyline, yytext());}
(and) {return new Symbol(sym.And, yychar, yyline, yytext());}
(or) {return new Symbol(sym.Or, yychar, yyline, yytext());}
(until) {return new Symbol(sym.Until, yychar, yyline, yytext());}

{espacio} {/*Ignore*/}
("//".*) {return new Symbol(sym.ComentarioLinea, yychar, yyline, yytext());}
("=") {return new Symbol(sym.Igual, yychar, yyline, yytext());}
("+") {return new Symbol(sym.Suma, yychar, yyline, yytext());}
("-") {return new Symbol(sym.Resta, yychar, yyline, yytext());}
("*") {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}
("/") {return new Symbol(sym.Division, yychar, yyline, yytext());}
("^") {return new Symbol(sym.Potencia, yychar, yyline, yytext());}
("<") {return new Symbol(sym.Menor, yychar, yyline, yytext());}
("<=") {return new Symbol(sym.MenorIgual, yychar, yyline, yytext());}
(">") {return new Symbol(sym.Mayor, yychar, yyline, yytext());}
(">=") {return new Symbol(sym.MayorIgual, yychar, yyline, yytext());}
("==") {return new Symbol(sym.IgualComp, yychar, yyline, yytext());}
("!=") {return new Symbol(sym.Diferente, yychar, yyline, yytext());}
(",") {return new Symbol(sym.Coma, yychar, yyline, yytext());}
(";") {return new Symbol(sym.FinSentencia, yychar, yyline, yytext());}
("(") {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}
(")") {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}
("{") {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}
("}") {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}
("/*[^*/]**/") {return new Symbol(sym.multiComentario, yychar, yyline, yytext());}

{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
