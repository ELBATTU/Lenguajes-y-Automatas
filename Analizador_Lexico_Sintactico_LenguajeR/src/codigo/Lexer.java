package codigo;
import static codigo.Tokens.*;

class Lexer {

  public static final int YYEOF = -1;

  private static final int ZZ_BUFFERSIZE = 16384;

  public static final int YYINITIAL = 0;

 
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\5\2\0\1\3\22\0\1\3\1\34\1\6\1\4"+
    "\1\0\1\37\1\32\1\0\1\42\1\43\1\30\1\25\1\3\1\26"+
    "\1\0\1\31\12\2\1\27\1\50\1\36\1\24\1\35\2\0\32\1"+
    "\1\46\1\0\1\47\1\0\1\1\1\0\1\41\2\1\1\20\1\15"+
    "\1\14\1\1\1\23\1\11\2\1\1\16\1\1\1\12\1\21\1\7"+
    "\1\1\1\10\1\17\1\13\1\40\1\1\1\22\3\1\1\44\1\33"+
    "\1\45\uff82\0";

  
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\4\1\5\1\6\7\2"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\3\15\2\16"+
    "\1\1\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\2\1\26\1\27\4\2\1\30\1\2\1\16\1\31"+
    "\1\15\1\0\2\2\1\32\3\2\1\0\1\2\1\33"+
    "\1\34\1\2\1\3\1\35\1\36";

  private static int [] zzUnpackAction() {
    int [] result = new int[61];
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

  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\51\0\51"+
    "\0\366\0\u011f\0\u0148\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215"+
    "\0\u023e\0\u023e\0\51\0\u023e\0\u023e\0\u0267\0\u0290\0\u0215"+
    "\0\u02b9\0\u02e2\0\u023e\0\u030b\0\51\0\51\0\51\0\51"+
    "\0\51\0\51\0\u0334\0\122\0\122\0\u035d\0\u0386\0\u03af"+
    "\0\u03d8\0\122\0\u0401\0\51\0\51\0\51\0\u042a\0\u0453"+
    "\0\u047c\0\122\0\u04a5\0\u04ce\0\u04f7\0\u0520\0\u0549\0\122"+
    "\0\122\0\u0572\0\51\0\122\0\122";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[61];
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


  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\3\1\12\1\3\1\13\1\14\1\15\2\3\1\16"+
    "\1\3\1\17\1\3\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\2\3"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\52\0"+
    "\2\3\4\0\15\3\14\0\2\3\11\0\1\4\51\0"+
    "\1\5\45\0\5\6\1\0\43\6\1\0\2\3\4\0"+
    "\1\3\1\43\13\3\14\0\2\3\10\0\2\3\4\0"+
    "\3\3\1\44\1\3\1\45\7\3\14\0\2\3\10\0"+
    "\2\3\4\0\1\3\1\46\13\3\14\0\2\3\10\0"+
    "\2\3\4\0\12\3\1\47\2\3\14\0\1\3\1\50"+
    "\10\0\2\3\4\0\7\3\1\51\5\3\14\0\2\3"+
    "\10\0\2\3\4\0\12\3\1\52\2\3\14\0\2\3"+
    "\10\0\2\3\4\0\14\3\1\53\14\0\2\3\33\0"+
    "\1\54\50\0\1\55\56\0\1\56\51\0\1\56\41\0"+
    "\1\54\10\0\1\54\37\0\1\54\11\0\1\54\40\0"+
    "\1\57\23\0\2\3\4\0\2\3\1\60\12\3\14\0"+
    "\2\3\10\0\2\3\4\0\15\3\14\0\1\61\1\3"+
    "\10\0\2\3\4\0\1\3\1\62\13\3\14\0\2\3"+
    "\10\0\2\3\4\0\7\3\1\63\5\3\14\0\2\3"+
    "\10\0\2\3\4\0\10\3\1\64\4\3\14\0\2\3"+
    "\10\0\2\3\4\0\2\3\1\65\12\3\14\0\2\3"+
    "\11\0\1\66\47\0\2\3\4\0\3\3\1\67\11\3"+
    "\14\0\2\3\10\0\2\3\4\0\6\3\1\70\6\3"+
    "\14\0\2\3\10\0\2\3\4\0\10\3\1\61\4\3"+
    "\14\0\2\3\10\0\2\3\4\0\6\3\1\71\6\3"+
    "\14\0\2\3\10\0\2\3\4\0\7\3\1\72\5\3"+
    "\14\0\2\3\11\0\1\66\40\0\1\73\6\0\2\3"+
    "\4\0\4\3\1\74\10\3\14\0\2\3\10\0\2\3"+
    "\4\0\6\3\1\75\6\3\14\0\2\3\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1435];
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


  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };


  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\2\11\12\1\1\11\11\1\6\11"+
    "\11\1\3\11\1\0\6\1\1\0\4\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[61];
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

  private java.io.Reader zzReader;

  private int zzState;

  private int zzLexicalState = YYINITIAL;

  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  private int zzMarkedPos;

  private int zzCurrentPos;

  private int zzStartRead;

  private int zzEndRead;

  private int yyline;

  private int yychar;

  private int yycolumn;

  private boolean zzAtBOL = true;

  private boolean zzAtEOF;

  private boolean zzEOFDone;

    public String lexeme;

  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

 
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 124) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  private boolean zzRefill() throws java.io.IOException {

    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    if (zzCurrentPos >= zzBuffer.length) {
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    return true;
  }

    

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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
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
        case 6: 
          { lexeme=yytext(); return Comillas;
          }
        case 31: break;
        case 21: 
          { lexeme=yytext(); return P_coma;
          }
        case 32: break;
        case 14: 
          { lexeme = yytext(); return Op_relacional;
          }
        case 33: break;
        case 22: 
          { lexeme=yytext(); return In;
          }
        case 34: break;
        case 19: 
          { lexeme = yytext(); return Corchete_a;
          }
        case 35: break;
        case 27: 
          { lexeme = yytext(); return Op_booleano;
          }
        case 36: break;
        case 17: 
          { lexeme=yytext(); return Llave_a;
          }
        case 37: break;
        case 8: 
          { lexeme=yytext(); return Suma;
          }
        case 38: break;
        case 12: 
          { lexeme=yytext(); return Division;
          }
        case 39: break;
        case 5: 
          { return Linea;
          }
        case 40: break;
        case 25: 
          { lexeme = yytext(); return Op_atribucion;
          }
        case 41: break;
        case 29: 
          { lexeme=yytext(); return Print;
          }
        case 42: break;
        case 23: 
          { lexeme=yytext(); return If;
          }
        case 43: break;
        case 10: 
          { lexeme=yytext(); return Conector;
          }
        case 44: break;
        case 7: 
          { lexeme=yytext(); return Igual;
          }
        case 45: break;
        case 16: 
          { lexeme=yytext(); return Parentesis_c;
          }
        case 46: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 47: break;
        case 26: 
          { lexeme=yytext(); return For;
          }
        case 48: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 49: break;
        case 24: 
          { lexeme=yytext(); return Do;
          }
        case 50: break;
        case 11: 
          { lexeme=yytext(); return Multiplicacion;
          }
        case 51: break;
        case 1: 
          { return ERROR;
          }
        case 52: break;
        case 4: 
          { /*Ignore*/
          }
        case 53: break;
        case 13: 
          { lexeme=yytext(); return Op_logico;
          }
        case 54: break;
        case 30: 
          { lexeme=yytext(); return While;
          }
        case 55: break;
        case 15: 
          { lexeme=yytext(); return Parentesis_a;
          }
        case 56: break;
        case 20: 
          { lexeme = yytext(); return Corchete_c;
          }
        case 57: break;
        case 18: 
          { lexeme=yytext(); return Llave_c;
          }
        case 58: break;
        case 28: 
          { lexeme=yytext(); return Else;
          }
        case 59: break;
        case 9: 
          { lexeme=yytext(); return Resta;
          }
        case 60: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
