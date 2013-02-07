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
Stringvalue = [:jletterdigit:]*
String = "'" {Stringvalue} "'"
whitespace = [ \t]+


%%
<YYINITIAL> "schema"{LineTerminator} {return symbol(sym.SCHEMA);} 
<YYINITIAL> "instances" {LineTerminator} {return symbol(sym.INSTANCES);} 
<YYINITIAL> "end" {LineTerminator} {return symbol(sym.END);} 
<YYINITIAL> "integer" {return symbol(sym.INTEGER);} 
<YYINITIAL> "string" {return symbol(sym.STRING);} 
<YYINITIAL> {Lparen} {return symbol(sym.LPAREN);} 
<YYINITIAL> {Rparen} {return symbol(sym.RPAREN);} 
<YYINITIAL> {Lbrace} {return symbol(sym.LBRACE);} 
<YYINITIAL> {Rbrace} {return symbol(sym.RBRACE);} 
<YYINITIAL> {Comma} {return symbol(sym.COMMA);} 
<YYINITIAL> {Colon} {return symbol(sym.COLON);} 
<YYINITIAL> {Integer} {return symbol(sym.INTEGERVAL);} 
<YYINITIAL> {String} {return symbol(sym.STRINGVAL);} 
<YYINITIAL> {Stringvalue} {return symbol(sym.ATTRIBUTE);} 
<YYINITIAL> {whitespace} {} 



