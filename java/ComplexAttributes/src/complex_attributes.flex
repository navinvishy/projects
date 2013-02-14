/* keywords */
%%

%class Lexer
%unicode
%cup
%line
%column

%{
  private java_cup.runtime.Symbol symbol(int type) {
    return new java_cup.runtime.Symbol(type, yyline, yycolumn);
  }
  private java_cup.runtime.Symbol symbol(int type, Object value) {
    return new java_cup.runtime.Symbol(type, yyline, yycolumn, value);
  }
%}

LineTerminator = \r|\n|\r\n
Lparen = "("
Rparen = ")"
Lbrace = "{"
Rbrace = "}"
Comma = ","
Colon = ":"
Integer = [:digit:]*
Stringvalue = [a-zA-Z]*
String = "'" {Stringvalue} "'"
whitespace = [ \t]+


%%
<YYINITIAL> "schema"{LineTerminator} {return symbol(sym.SCHEMA,"schema");} 
<YYINITIAL> "instances" {LineTerminator} {return symbol(sym.INSTANCES,"instances");} 
<YYINITIAL> "end" {LineTerminator} {return symbol(sym.END,"end");} 
<YYINITIAL> "integer" {return symbol(sym.INTEGER,"integer");} 
<YYINITIAL> "string" {return symbol(sym.STRING,"string");} 
<YYINITIAL> {Lparen} {return symbol(sym.LPAREN,"(");} 
<YYINITIAL> {Rparen} {return symbol(sym.RPAREN,")");} 
<YYINITIAL> {Lbrace} {return symbol(sym.LBRACE,"{");} 
<YYINITIAL> {Rbrace} {return symbol(sym.RBRACE,"}");} 
<YYINITIAL> {Comma} {return symbol(sym.COMMA,",");} 
<YYINITIAL> {Colon} {return symbol(sym.COLON,":");} 
<YYINITIAL> {Integer} {return symbol(sym.INTEGERVAL, Integer.parseInt(yytext()));} 
<YYINITIAL> {String} {return symbol(sym.STRINGVAL, yytext());} 
<YYINITIAL> {Stringvalue} {return symbol(sym.ATTRIBUTE, yytext());} 
<YYINITIAL> {whitespace} {}
<YYINITIAL> {LineTerminator} {} 



