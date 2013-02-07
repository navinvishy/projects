/* The following code was generated by JFlex 1.4.3 on 2/6/13 11:05 PM */

/* keywords */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2/6/13 11:05 PM from the specification file
 * <tt>/home/navin/personal/projects/java/ComplexAttributes/complex_attributes.flex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\12\1\14\1\2\2\0\1\1\16\12\4\0\1\14\3\0\1\12"+
    "\2\0\1\13\1\3\1\4\2\0\1\7\3\0\12\11\1\10\6\0"+
    "\32\12\4\0\1\12\1\0\1\22\1\12\1\16\1\26\1\20\1\12"+
    "\1\27\1\17\1\23\3\12\1\21\1\24\3\12\1\30\1\15\1\25"+
    "\6\12\1\5\1\0\1\6\1\0\41\12\2\0\4\12\4\0\1\12"+
    "\2\0\1\12\7\0\1\12\4\0\1\12\5\0\27\12\1\0\37\12"+
    "\1\0\u01ca\12\4\0\14\12\16\0\5\12\7\0\1\12\1\0\1\12"+
    "\21\0\165\12\1\0\2\12\2\0\4\12\10\0\1\12\1\0\3\12"+
    "\1\0\1\12\1\0\24\12\1\0\123\12\1\0\213\12\1\0\5\12"+
    "\2\0\236\12\11\0\46\12\2\0\1\12\7\0\47\12\11\0\55\12"+
    "\1\0\1\12\1\0\2\12\1\0\2\12\1\0\1\12\10\0\33\12"+
    "\5\0\3\12\15\0\4\12\7\0\1\12\4\0\13\12\5\0\100\12"+
    "\12\11\4\0\146\12\1\0\11\12\1\0\12\12\1\0\6\12\12\11"+
    "\3\12\2\0\1\12\17\0\74\12\2\0\145\12\16\0\12\11\54\12"+
    "\4\0\1\12\5\0\56\12\22\0\34\12\244\0\144\12\2\0\12\11"+
    "\1\0\7\12\1\0\7\12\1\0\3\12\1\0\10\12\2\0\2\12"+
    "\2\0\26\12\1\0\7\12\1\0\1\12\3\0\4\12\2\0\11\12"+
    "\2\0\2\12\2\0\4\12\10\0\1\12\4\0\2\12\1\0\5\12"+
    "\2\0\12\11\4\12\7\0\1\12\5\0\3\12\1\0\6\12\4\0"+
    "\2\12\2\0\26\12\1\0\7\12\1\0\2\12\1\0\2\12\1\0"+
    "\2\12\2\0\1\12\1\0\5\12\4\0\2\12\2\0\3\12\3\0"+
    "\1\12\7\0\4\12\1\0\1\12\7\0\12\11\6\12\13\0\3\12"+
    "\1\0\11\12\1\0\3\12\1\0\26\12\1\0\7\12\1\0\2\12"+
    "\1\0\5\12\2\0\12\12\1\0\3\12\1\0\3\12\2\0\1\12"+
    "\17\0\4\12\2\0\12\11\1\0\1\12\17\0\3\12\1\0\10\12"+
    "\2\0\2\12\2\0\26\12\1\0\7\12\1\0\2\12\1\0\5\12"+
    "\2\0\11\12\2\0\2\12\2\0\3\12\10\0\2\12\4\0\2\12"+
    "\1\0\5\12\2\0\12\11\1\0\1\12\20\0\2\12\1\0\6\12"+
    "\3\0\3\12\1\0\4\12\3\0\2\12\1\0\1\12\1\0\2\12"+
    "\3\0\2\12\3\0\3\12\3\0\14\12\4\0\5\12\3\0\3\12"+
    "\1\0\4\12\2\0\1\12\6\0\1\12\16\0\12\11\11\0\1\12"+
    "\7\0\3\12\1\0\10\12\1\0\3\12\1\0\27\12\1\0\12\12"+
    "\1\0\5\12\3\0\10\12\1\0\3\12\1\0\4\12\7\0\2\12"+
    "\1\0\2\12\6\0\4\12\2\0\12\11\22\0\2\12\1\0\10\12"+
    "\1\0\3\12\1\0\27\12\1\0\12\12\1\0\5\12\2\0\11\12"+
    "\1\0\3\12\1\0\4\12\7\0\2\12\7\0\1\12\1\0\4\12"+
    "\2\0\12\11\1\0\2\12\17\0\2\12\1\0\10\12\1\0\3\12"+
    "\1\0\51\12\2\0\10\12\1\0\3\12\1\0\5\12\10\0\1\12"+
    "\10\0\4\12\2\0\12\11\12\0\6\12\2\0\2\12\1\0\22\12"+
    "\3\0\30\12\1\0\11\12\1\0\1\12\2\0\7\12\3\0\1\12"+
    "\4\0\6\12\1\0\1\12\1\0\10\12\22\0\2\12\15\0\72\12"+
    "\4\0\20\12\1\0\12\11\47\0\2\12\1\0\1\12\2\0\2\12"+
    "\1\0\1\12\2\0\1\12\6\0\4\12\1\0\7\12\1\0\3\12"+
    "\1\0\1\12\1\0\1\12\2\0\2\12\1\0\15\12\1\0\3\12"+
    "\2\0\5\12\1\0\1\12\1\0\6\12\2\0\12\11\2\0\2\12"+
    "\42\0\1\12\27\0\2\12\6\0\12\11\13\0\1\12\1\0\1\12"+
    "\1\0\1\12\4\0\12\12\1\0\44\12\4\0\24\12\1\0\22\12"+
    "\1\0\44\12\11\0\1\12\71\0\100\12\12\11\6\0\100\12\12\11"+
    "\4\12\2\0\46\12\12\0\53\12\1\0\1\12\3\0\u0149\12\1\0"+
    "\4\12\2\0\7\12\1\0\1\12\1\0\4\12\2\0\51\12\1\0"+
    "\4\12\2\0\41\12\1\0\4\12\2\0\7\12\1\0\1\12\1\0"+
    "\4\12\2\0\17\12\1\0\71\12\1\0\4\12\2\0\103\12\2\0"+
    "\3\12\40\0\20\12\20\0\125\12\14\0\u026c\12\2\0\21\12\1\0"+
    "\32\12\5\0\113\12\3\0\3\12\17\0\15\12\1\0\7\12\13\0"+
    "\25\12\13\0\24\12\14\0\15\12\1\0\3\12\1\0\2\12\14\0"+
    "\124\12\3\0\1\12\3\0\3\12\2\0\12\11\41\0\3\12\2\0"+
    "\12\11\6\0\130\12\10\0\53\12\5\0\106\12\12\0\35\12\3\0"+
    "\14\12\4\0\14\12\12\0\12\11\36\12\2\0\5\12\13\0\54\12"+
    "\4\0\32\12\6\0\12\11\46\0\34\12\4\0\77\12\1\0\35\12"+
    "\2\0\1\12\12\11\6\0\12\11\15\0\1\12\130\0\114\12\4\0"+
    "\12\11\21\0\11\12\14\0\53\12\3\0\2\12\12\11\6\0\64\12"+
    "\14\0\70\12\10\0\12\11\3\0\3\12\12\11\44\12\122\0\3\12"+
    "\1\0\37\12\15\0\347\12\25\0\u011a\12\2\0\6\12\2\0\46\12"+
    "\2\0\6\12\2\0\10\12\1\0\1\12\1\0\1\12\1\0\1\12"+
    "\1\0\37\12\2\0\65\12\1\0\7\12\1\0\1\12\3\0\3\12"+
    "\1\0\7\12\3\0\4\12\2\0\6\12\4\0\15\12\5\0\3\12"+
    "\1\0\7\12\16\0\5\12\32\0\5\12\20\0\2\12\23\0\1\12"+
    "\13\0\5\12\5\0\6\12\1\0\1\12\15\0\1\12\20\0\15\12"+
    "\3\0\32\12\26\0\15\12\4\0\1\12\3\0\14\12\21\0\1\12"+
    "\4\0\1\12\2\0\12\12\1\0\1\12\3\0\5\12\6\0\1\12"+
    "\1\0\1\12\1\0\1\12\1\0\4\12\1\0\13\12\2\0\4\12"+
    "\5\0\5\12\4\0\1\12\21\0\51\12\u0a77\0\57\12\1\0\57\12"+
    "\1\0\205\12\6\0\7\12\16\0\46\12\12\0\66\12\11\0\1\12"+
    "\17\0\30\12\11\0\7\12\1\0\7\12\1\0\7\12\1\0\7\12"+
    "\1\0\7\12\1\0\7\12\1\0\7\12\1\0\7\12\1\0\40\12"+
    "\57\0\1\12\u01d5\0\3\12\31\0\17\12\1\0\5\12\2\0\5\12"+
    "\4\0\126\12\2\0\2\12\2\0\3\12\1\0\132\12\1\0\4\12"+
    "\5\0\51\12\3\0\136\12\21\0\33\12\65\0\20\12\u0200\0\u19b6\12"+
    "\112\0\u51cc\12\64\0\u048d\12\103\0\56\12\2\0\u010d\12\3\0\20\12"+
    "\12\11\2\12\24\0\60\12\14\0\2\12\1\0\31\12\10\0\122\12"+
    "\45\0\11\12\2\0\147\12\2\0\4\12\1\0\2\12\16\0\12\12"+
    "\120\0\56\12\20\0\1\12\7\0\64\12\14\0\105\12\13\0\12\11"+
    "\6\0\30\12\3\0\1\12\4\0\12\11\44\12\2\0\44\12\14\0"+
    "\35\12\3\0\101\12\16\0\1\12\12\11\46\0\67\12\11\0\16\12"+
    "\2\0\12\11\6\0\27\12\3\0\2\12\4\0\103\12\30\0\3\12"+
    "\43\0\6\12\2\0\6\12\2\0\6\12\11\0\7\12\1\0\7\12"+
    "\221\0\53\12\1\0\2\12\2\0\12\11\6\0\u2ba4\12\14\0\27\12"+
    "\4\0\61\12\u2104\0\u012e\12\2\0\76\12\2\0\152\12\46\0\7\12"+
    "\14\0\5\12\5\0\14\12\1\0\15\12\1\0\5\12\1\0\1\12"+
    "\1\0\2\12\1\0\2\12\1\0\154\12\41\0\u016b\12\22\0\100\12"+
    "\2\0\66\12\50\0\15\12\3\0\20\12\20\0\7\12\14\0\2\12"+
    "\30\0\3\12\31\0\1\12\6\0\5\12\1\0\207\12\2\0\1\12"+
    "\4\0\1\12\13\0\12\11\7\0\32\12\4\0\1\12\1\0\32\12"+
    "\13\0\131\12\3\0\6\12\2\0\6\12\2\0\6\12\2\0\3\12"+
    "\3\0\2\12\3\0\2\12\22\0\3\12\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\1"+
    "\1\10\1\0\1\11\3\10\1\12\13\10\2\13\7\10"+
    "\1\14\2\10\2\15\1\10\1\16\2\10\2\17";

  private static int [] zzUnpackAction() {
    int [] result = new int[46];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\31\0\31\0\31\0\31\0\31\0\31\0\62"+
    "\0\113\0\144\0\175\0\226\0\257\0\310\0\31\0\341"+
    "\0\372\0\u0113\0\u012c\0\u0145\0\u015e\0\u0177\0\u0190\0\u01a9"+
    "\0\u01c2\0\u01db\0\u01f4\0\31\0\u020d\0\u0226\0\u023f\0\u0258"+
    "\0\u0271\0\u028a\0\u02a3\0\113\0\u02bc\0\u02d5\0\u02ee\0\31"+
    "\0\u0307\0\113\0\u0320\0\u0339\0\u0352\0\31";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[46];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\3\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\2\11\1\15\2\11\1\16"+
    "\5\11\42\0\1\10\1\11\2\0\14\11\11\0\2\11"+
    "\2\0\14\11\11\0\2\12\1\17\1\0\14\12\14\0"+
    "\1\13\25\0\2\11\2\0\1\11\1\20\6\11\1\21"+
    "\3\11\11\0\2\11\2\0\7\11\1\22\4\11\11\0"+
    "\2\11\2\0\7\11\1\23\4\11\11\0\2\11\2\0"+
    "\2\11\1\24\11\11\11\0\2\11\2\0\13\11\1\25"+
    "\11\0\2\11\2\0\11\11\1\26\2\11\11\0\2\11"+
    "\2\0\1\27\7\11\1\30\3\11\11\0\2\11\2\0"+
    "\3\11\1\31\10\11\11\0\2\11\2\0\6\11\1\32"+
    "\5\11\1\0\1\33\1\34\6\0\2\11\2\0\14\11"+
    "\11\0\2\11\2\0\10\11\1\35\3\11\11\0\2\11"+
    "\2\0\3\11\1\36\10\11\11\0\2\11\2\0\4\11"+
    "\1\37\7\11\11\0\2\11\2\0\7\11\1\40\4\11"+
    "\2\0\1\34\37\0\2\11\2\0\5\11\1\41\6\11"+
    "\11\0\2\11\2\0\12\11\1\42\1\11\11\0\2\11"+
    "\2\0\5\11\1\43\6\11\11\0\2\11\2\0\12\11"+
    "\1\44\1\11\11\0\2\11\2\0\7\11\1\45\4\11"+
    "\11\0\2\11\2\0\3\11\1\46\10\11\1\0\1\47"+
    "\1\50\6\0\2\11\2\0\14\11\11\0\2\11\2\0"+
    "\1\11\1\51\12\11\11\0\2\11\2\0\13\11\1\52"+
    "\2\0\1\50\37\0\2\11\2\0\3\11\1\53\10\11"+
    "\11\0\2\11\2\0\1\54\13\11\1\0\1\55\1\56"+
    "\6\0\2\11\2\0\14\11\2\0\1\56\26\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[875];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\6\11\2\1\1\0\4\1\1\11\14\1\1\11"+
    "\13\1\1\11\5\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[46];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1894) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 14: 
          { return symbol(sym.INTEGER);
          }
        case 16: break;
        case 11: 
          { return symbol(sym.END);
          }
        case 17: break;
        case 7: 
          { return symbol(sym.COLON);
          }
        case 18: break;
        case 1: 
          { return symbol(sym.INTEGERVAL);
          }
        case 19: break;
        case 15: 
          { return symbol(sym.INSTANCES);
          }
        case 20: break;
        case 12: 
          { return symbol(sym.STRING);
          }
        case 21: break;
        case 13: 
          { return symbol(sym.SCHEMA);
          }
        case 22: break;
        case 3: 
          { return symbol(sym.RPAREN);
          }
        case 23: break;
        case 2: 
          { return symbol(sym.LPAREN);
          }
        case 24: break;
        case 10: 
          { return symbol(sym.STRINGVAL);
          }
        case 25: break;
        case 6: 
          { return symbol(sym.COMMA);
          }
        case 26: break;
        case 8: 
          { return symbol(sym.ATTRIBUTE);
          }
        case 27: break;
        case 5: 
          { return symbol(sym.RBRACE);
          }
        case 28: break;
        case 9: 
          { 
          }
        case 29: break;
        case 4: 
          { return symbol(sym.LBRACE);
          }
        case 30: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
