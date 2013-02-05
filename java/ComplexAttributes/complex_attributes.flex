/* keywords */
%%

%class Lexer
%unicode
%cup
%line
%column

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
<YYINITIAL> "schema" {return symbol(sym.SCHEMA);} 
<YYINITIAL> "instances" {return symbol(sym.INSTANCES);} 
<YYINITIAL> "end" {return symbol(sym.END);} 
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



