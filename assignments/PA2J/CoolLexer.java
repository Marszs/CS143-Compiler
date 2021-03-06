/* The following code was generated by JFlex 1.6.1 */

/*
 *  The scanner definition for COOL.
 */

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>cool.lex</tt>
 */
class CoolLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int INLINE_COMMENT = 2;
  public static final int BLOCK_COMMENT = 4;
  public static final int STRING = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
    11,  0,  0,  0,  0,  0,  0,  0,  0,  5,  7,  0,  5,  5,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     5,  0, 12,  0,  0,  0,  0,  0, 10,  9,  8, 49, 55,  6, 53, 50, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 57, 56, 52, 51, 61,  0, 
    58, 19,  2, 15, 41, 23, 26,  2, 31, 27,  2,  2, 17,  2, 29, 39, 
    43,  2, 33, 21, 35, 47, 37, 45,  2,  2,  2,  0, 13,  0,  0,  3, 
     0, 20, 14, 16, 42, 24, 25,  4, 32, 28,  4,  4, 18,  4, 30, 40, 
    44,  4, 34, 22, 36, 48, 38, 46,  4,  4,  4, 59,  0, 60, 54,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\3\1\4\1\3\1\4"+
    "\1\3\2\4\2\3\1\4\1\3\1\4\1\3\1\4"+
    "\1\3\1\4\1\3\1\4\1\3\1\4\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\2\30\1\32\1\33\1\34"+
    "\1\35\1\32\1\36\1\37\1\40\2\3\2\4\2\3"+
    "\2\4\2\3\3\4\2\41\1\3\1\42\1\43\1\4"+
    "\1\42\1\43\2\3\2\4\1\3\2\4\2\44\1\3"+
    "\1\4\1\3\1\4\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\2\3\2\4\1\55\1\3\1\55"+
    "\1\4\2\3\3\4\2\3\2\4\1\56\1\57\1\56"+
    "\1\57\1\3\2\4\1\3\1\4\1\3\1\4\1\3"+
    "\1\60\1\4\1\60\2\61\1\62\1\63\1\62\1\63"+
    "\1\4\2\3\2\4\2\64\1\65\2\66\1\3\1\4"+
    "\2\67\1\70\2\3\2\4\2\71\1\72\1\3\1\72"+
    "\1\4\1\3\1\4\2\73";

  private static int [] zzUnpackAction() {
    int [] result = new int[168];
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
    "\0\0\0\76\0\174\0\272\0\370\0\u0136\0\u0174\0\u01b2"+
    "\0\u01f0\0\u022e\0\370\0\u026c\0\370\0\u02aa\0\370\0\u02e8"+
    "\0\u0326\0\u0364\0\u03a2\0\u03e0\0\u041e\0\u045c\0\u049a\0\u04d8"+
    "\0\u0516\0\u0554\0\u0592\0\u05d0\0\u060e\0\u064c\0\u068a\0\u06c8"+
    "\0\u0706\0\u0744\0\u0782\0\370\0\370\0\u07c0\0\u07fe\0\370"+
    "\0\370\0\370\0\370\0\370\0\370\0\370\0\370\0\370"+
    "\0\370\0\u083c\0\u087a\0\370\0\370\0\370\0\370\0\u08b8"+
    "\0\370\0\370\0\370\0\u08f6\0\u0934\0\u0972\0\u09b0\0\u09ee"+
    "\0\u0a2c\0\u0a6a\0\u0aa8\0\u0ae6\0\u0b24\0\u0b62\0\u0ba0\0\u0bde"+
    "\0\u01b2\0\u0174\0\u0c1c\0\u0174\0\u0c5a\0\u0c98\0\u01b2\0\u0cd6"+
    "\0\u0d14\0\u0d52\0\u0d90\0\u0dce\0\u0e0c\0\u0e4a\0\u0e88\0\u0174"+
    "\0\u01b2\0\u0ec6\0\u0f04\0\u0f42\0\u0f80\0\370\0\370\0\370"+
    "\0\370\0\370\0\370\0\370\0\370\0\u0fbe\0\u0ffc\0\u103a"+
    "\0\u1078\0\u0174\0\u10b6\0\u01b2\0\u10f4\0\u1132\0\u1170\0\u11ae"+
    "\0\u11ec\0\u122a\0\u1268\0\u12a6\0\u12e4\0\u1322\0\u0174\0\u0174"+
    "\0\u01b2\0\u01b2\0\u1360\0\u139e\0\u13dc\0\u141a\0\u1458\0\u1496"+
    "\0\u14d4\0\u1512\0\u0174\0\u1550\0\u01b2\0\u0174\0\u01b2\0\u0174"+
    "\0\u0174\0\u01b2\0\u01b2\0\u158e\0\u15cc\0\u160a\0\u1648\0\u1686"+
    "\0\u0174\0\u01b2\0\u01b2\0\u0174\0\u01b2\0\u16c4\0\u1702\0\u0174"+
    "\0\u01b2\0\u01b2\0\u1740\0\u177e\0\u17bc\0\u17fa\0\u0174\0\u01b2"+
    "\0\u0174\0\u1838\0\u01b2\0\u1876\0\u18b4\0\u18f2\0\u0174\0\u01b2";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[168];
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
    "\1\5\1\6\1\7\1\5\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\5\1\17\1\5\1\10\1\20"+
    "\1\21\1\22\1\23\1\7\1\10\1\7\1\10\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\7"+
    "\1\10\1\7\1\10\1\34\1\35\1\7\1\10\1\36"+
    "\1\37\1\7\1\10\1\40\1\41\1\42\1\43\1\7"+
    "\1\10\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\1\56\1\57\1\5\7\60\1\61"+
    "\75\60\1\13\1\62\1\60\1\63\1\5\62\60\7\64"+
    "\1\65\3\64\1\66\1\67\1\70\60\64\77\0\1\6"+
    "\75\0\4\7\11\0\43\7\16\0\4\10\11\0\43\10"+
    "\22\0\1\11\76\0\1\71\100\0\1\72\74\0\1\73"+
    "\66\0\4\7\11\0\3\7\2\74\2\75\34\7\16\0"+
    "\4\10\11\0\3\10\2\76\2\77\34\10\16\0\4\7"+
    "\11\0\11\7\2\100\16\7\2\101\10\7\16\0\4\10"+
    "\11\0\11\10\2\102\16\10\2\103\10\10\16\0\4\7"+
    "\11\0\3\7\2\104\2\7\2\105\32\7\16\0\4\10"+
    "\11\0\3\10\2\106\2\10\2\107\32\10\16\0\4\10"+
    "\11\0\5\10\2\110\6\10\2\111\24\10\16\0\4\7"+
    "\11\0\15\7\2\112\24\7\16\0\4\7\11\0\7\7"+
    "\2\113\2\7\2\114\2\7\2\115\22\7\16\0\4\10"+
    "\11\0\7\10\2\116\2\10\2\117\2\10\2\120\22\10"+
    "\16\0\4\7\11\0\11\7\2\121\16\7\2\122\10\7"+
    "\16\0\4\10\11\0\11\10\2\123\16\10\2\124\10\10"+
    "\16\0\4\7\11\0\21\7\2\125\20\7\16\0\4\10"+
    "\11\0\21\10\2\126\2\127\16\10\16\0\4\7\11\0"+
    "\13\7\2\130\26\7\16\0\4\10\11\0\13\10\2\131"+
    "\26\10\16\0\4\7\11\0\31\7\2\132\10\7\16\0"+
    "\4\10\11\0\31\10\2\133\10\10\16\0\4\7\11\0"+
    "\21\7\2\134\20\7\16\0\4\10\11\0\21\10\2\135"+
    "\20\10\112\0\1\136\6\0\1\137\54\0\1\140\23\0"+
    "\1\141\74\0\1\142\65\0\7\143\1\144\3\143\1\0"+
    "\2\143\1\145\12\143\1\145\4\143\1\145\5\143\1\145"+
    "\31\143\1\0\4\7\11\0\5\7\2\146\34\7\16\0"+
    "\4\7\11\0\7\7\2\147\32\7\16\0\4\10\11\0"+
    "\5\10\2\150\34\10\16\0\4\10\11\0\7\10\2\151"+
    "\32\10\16\0\4\7\11\0\25\7\2\152\14\7\16\0"+
    "\4\7\11\0\31\7\2\153\10\7\16\0\4\10\11\0"+
    "\25\10\2\154\14\10\16\0\4\10\11\0\31\10\2\155"+
    "\10\10\16\0\4\7\11\0\7\7\2\156\32\7\16\0"+
    "\4\7\11\0\5\7\2\157\34\7\16\0\4\10\11\0"+
    "\7\10\2\160\32\10\16\0\4\10\11\0\5\10\2\161"+
    "\34\10\16\0\4\10\11\0\3\10\2\162\36\10\16\0"+
    "\4\7\11\0\27\7\2\163\12\7\16\0\4\7\11\0"+
    "\21\7\2\164\20\7\16\0\4\10\11\0\27\10\2\165"+
    "\12\10\16\0\4\10\11\0\21\10\2\166\20\10\16\0"+
    "\4\7\11\0\37\7\2\167\2\7\16\0\4\7\11\0"+
    "\25\7\2\170\14\7\16\0\4\10\11\0\37\10\2\171"+
    "\2\10\16\0\4\10\11\0\25\10\2\172\14\10\16\0"+
    "\4\7\11\0\11\7\2\173\30\7\16\0\4\10\11\0"+
    "\11\10\2\174\30\10\16\0\4\10\11\0\41\10\2\175"+
    "\16\0\4\7\11\0\31\7\2\176\10\7\16\0\4\10"+
    "\11\0\31\10\2\177\10\10\16\0\4\7\11\0\15\7"+
    "\2\200\24\7\16\0\4\10\11\0\15\10\2\201\24\10"+
    "\16\0\4\7\11\0\7\7\2\202\32\7\16\0\4\7"+
    "\11\0\11\7\2\203\30\7\16\0\4\10\11\0\7\10"+
    "\2\204\32\10\16\0\4\10\11\0\11\10\2\205\30\10"+
    "\16\0\4\7\11\0\35\7\2\206\4\7\16\0\4\10"+
    "\11\0\35\10\2\207\4\10\16\0\4\7\11\0\11\7"+
    "\2\210\30\7\16\0\4\7\11\0\1\7\2\211\40\7"+
    "\16\0\4\10\11\0\11\10\2\212\30\10\16\0\4\10"+
    "\11\0\1\10\2\213\40\10\16\0\4\10\11\0\7\10"+
    "\2\214\32\10\16\0\4\7\11\0\31\7\2\215\10\7"+
    "\16\0\4\7\11\0\11\7\2\216\30\7\16\0\4\10"+
    "\11\0\31\10\2\217\10\10\16\0\4\10\11\0\11\10"+
    "\2\220\30\10\16\0\4\7\11\0\17\7\2\221\22\7"+
    "\16\0\4\10\11\0\17\10\2\222\22\10\16\0\4\10"+
    "\11\0\11\10\2\223\30\10\16\0\4\7\11\0\3\7"+
    "\2\224\36\7\16\0\4\10\11\0\3\10\2\225\36\10"+
    "\16\0\4\7\11\0\3\7\2\226\36\7\16\0\4\10"+
    "\11\0\3\10\2\227\36\10\16\0\4\7\11\0\7\7"+
    "\2\230\32\7\16\0\4\10\11\0\7\10\2\231\32\10"+
    "\16\0\4\10\11\0\11\10\2\232\30\10\16\0\4\7"+
    "\11\0\15\7\2\233\24\7\16\0\4\7\11\0\23\7"+
    "\2\234\16\7\16\0\4\10\11\0\15\10\2\235\24\10"+
    "\16\0\4\10\11\0\23\10\2\236\16\10\16\0\4\7"+
    "\11\0\11\7\2\237\30\7\16\0\4\10\11\0\11\10"+
    "\2\240\30\10\16\0\4\7\11\0\33\7\2\241\6\7"+
    "\16\0\4\7\11\0\15\7\2\242\24\7\16\0\4\10"+
    "\11\0\33\10\2\243\6\10\16\0\4\10\11\0\15\10"+
    "\2\244\24\10\16\0\4\7\11\0\25\7\2\245\14\7"+
    "\16\0\4\10\11\0\25\10\2\246\14\10\16\0\4\7"+
    "\11\0\7\7\2\247\32\7\16\0\4\10\11\0\7\10"+
    "\2\250\32\10\15\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6448];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\11\5\1\1\11\1\1\1\11\1\1\1\11"+
    "\24\1\2\11\2\1\12\11\2\1\4\11\1\1\3\11"+
    "\42\1\10\11\103\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[168];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

/*  Stuff enclosed in %{ %} is copied verbatim to the lexer class
 *  definition, all the extra variables/functions you want to use in the
 *  lexer actions should go here.  Don't remove or modify anything that
 *  was there initially.  */

    // Max size of string constants
    static int MAX_STR_CONST = 1025;

    // Countint BLOCK_COMMENT layer
    int bc_layer = 0;

    // For assembling string constants
    StringBuffer string_buf = new StringBuffer();

    private int curr_lineno = 1;
    int get_curr_lineno() {
	    return curr_lineno;
    }

    private AbstractSymbol filename;

    void set_filename(String fname) {
	    filename = AbstractTable.stringtable.addString(fname);
    }

    AbstractSymbol curr_filename() {
	    return filename;
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  CoolLexer(java.io.Reader in) {
  
/*  Stuff enclosed in %init{ %init} is copied verbatim to the lexer
 *  class constructor, all the extra initialization you want to do should
 *  go here.  Don't remove or modify anything that was there initially. */

    // empty for now
    this.zzReader = in;
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          { /*  Stuff enclosed in %eofval{ %eofval} specifies java code that is
 *  executed when end-of-file is reached.  If you use multiple lexical
 *  states and want to do something special if an EOF is encountered in
 *  one of those states, place your code in the switch statement.
 *  Ultimately, you should return the EOF symbol, or your lexer won't
 *  work.  */

    switch(yystate()) {
      case YYINITIAL:
	      /* nothing special to do in the initial state */
	      break;

      case BLOCK_COMMENT:
         yybegin(YYINITIAL);
         return new Symbol(TokenConstants.ERROR, "EOF in comment");
      
      case STRING:
         yybegin(YYINITIAL);
         return new Symbol(TokenConstants.ERROR, "EOF in string constant");
    }

    return new Symbol(TokenConstants.EOF);

 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return new Symbol(TokenConstants.ERROR, yytext());
            }
          case 60: break;
          case 2: 
            { return new Symbol(TokenConstants.INT_CONST, AbstractTable.inttable.addString(yytext()));
            }
          case 61: break;
          case 3: 
            { return new Symbol(TokenConstants.TYPEID, AbstractTable.inttable.addString(yytext()));
            }
          case 62: break;
          case 4: 
            { return new Symbol(TokenConstants.OBJECTID, AbstractTable.inttable.addString(yytext()));
            }
          case 63: break;
          case 5: 
            { /* Do Noting */
            }
          case 64: break;
          case 6: 
            { return new Symbol(TokenConstants.MINUS);
            }
          case 65: break;
          case 7: 
            { curr_lineno++; /* New Line */
            }
          case 66: break;
          case 8: 
            { return new Symbol(TokenConstants.MULT);
            }
          case 67: break;
          case 9: 
            { return new Symbol(TokenConstants.RPAREN);
            }
          case 68: break;
          case 10: 
            { return new Symbol(TokenConstants.LPAREN);
            }
          case 69: break;
          case 11: 
            { string_buf.setLength(0); yybegin(STRING);
            }
          case 70: break;
          case 12: 
            { return new Symbol(TokenConstants.PLUS);
            }
          case 71: break;
          case 13: 
            { return new Symbol(TokenConstants.DIV);
            }
          case 72: break;
          case 14: 
            { return new Symbol(TokenConstants.EQ);
            }
          case 73: break;
          case 15: 
            { return new Symbol(TokenConstants.LT);
            }
          case 74: break;
          case 16: 
            { return new Symbol(TokenConstants.DOT);
            }
          case 75: break;
          case 17: 
            { return new Symbol(TokenConstants.NEG);
            }
          case 76: break;
          case 18: 
            { return new Symbol(TokenConstants.COMMA);
            }
          case 77: break;
          case 19: 
            { return new Symbol(TokenConstants.SEMI);
            }
          case 78: break;
          case 20: 
            { return new Symbol(TokenConstants.COLON);
            }
          case 79: break;
          case 21: 
            { return new Symbol(TokenConstants.AT);
            }
          case 80: break;
          case 22: 
            { return new Symbol(TokenConstants.LBRACE);
            }
          case 81: break;
          case 23: 
            { return new Symbol(TokenConstants.RBRACE);
            }
          case 82: break;
          case 24: 
            { 
            }
          case 83: break;
          case 25: 
            { curr_lineno++; yybegin(YYINITIAL);
            }
          case 84: break;
          case 26: 
            { if(string_buf.length() > MAX_STR_CONST) return new Symbol(TokenConstants.ERROR, "String constant too lang");
   string_buf.append(yytext());
            }
          case 85: break;
          case 27: 
            { yybegin(YYINITIAL);
   curr_lineno++;
   return new Symbol(TokenConstants.ERROR, "Unterminated string constant");
            }
          case 86: break;
          case 28: 
            { yybegin(YYINITIAL); 
   return new Symbol(TokenConstants.ERROR, "String contains null character");
            }
          case 87: break;
          case 29: 
            { yybegin(YYINITIAL);
   return new Symbol(TokenConstants.STR_CONST, AbstractTable.stringtable.addString(string_buf.toString()));
            }
          case 88: break;
          case 30: 
            { yybegin(INLINE_COMMENT);
            }
          case 89: break;
          case 31: 
            { return new Symbol(TokenConstants.ERROR, "Unmatched *)");
            }
          case 90: break;
          case 32: 
            { yybegin(BLOCK_COMMENT);
            }
          case 91: break;
          case 33: 
            { return new Symbol(TokenConstants.FI);
            }
          case 92: break;
          case 34: 
            { return new Symbol(TokenConstants.IF);
            }
          case 93: break;
          case 35: 
            { return new Symbol(TokenConstants.IN);
            }
          case 94: break;
          case 36: 
            { return new Symbol(TokenConstants.OF);
            }
          case 95: break;
          case 37: 
            { return new Symbol(TokenConstants.DARROW);
            }
          case 96: break;
          case 38: 
            { return new Symbol(TokenConstants.ASSIGN);
            }
          case 97: break;
          case 39: 
            { return new Symbol(TokenConstants.LE);
            }
          case 98: break;
          case 40: 
            { if(bc_layer > 0) {
      bc_layer--;
   } else {
      yybegin(YYINITIAL);
   }
            }
          case 99: break;
          case 41: 
            { bc_layer++;
            }
          case 100: break;
          case 42: 
            { if(string_buf.length() > MAX_STR_CONST) return new Symbol(TokenConstants.ERROR, "String constant too lang");
   /* TODO */
   string_buf.append(yytext().substring(yytext().indexOf('\\')+1));
            }
          case 101: break;
          case 43: 
            { if(string_buf.length() > MAX_STR_CONST) return new Symbol(TokenConstants.ERROR, "String constant too lang");
   curr_lineno++;
   string_buf.append('\n');
            }
          case 102: break;
          case 44: 
            { if(string_buf.length() > MAX_STR_CONST) return new Symbol(TokenConstants.ERROR, "String constant too lang");
   switch(yytext()) {
      case "\\n": string_buf.append('\n'); break;
      case "\\b": string_buf.append('\b'); break;
      case "\\t": string_buf.append('\t'); break;
      case "\\f": string_buf.append('\f'); break;
   }
            }
          case 103: break;
          case 45: 
            { return new Symbol(TokenConstants.LET);
            }
          case 104: break;
          case 46: 
            { return new Symbol(TokenConstants.NEW);
            }
          case 105: break;
          case 47: 
            { return new Symbol(TokenConstants.NOT);
            }
          case 106: break;
          case 48: 
            { return new Symbol(TokenConstants.CASE);
            }
          case 107: break;
          case 49: 
            { return new Symbol(TokenConstants.LOOP);
            }
          case 108: break;
          case 50: 
            { return new Symbol(TokenConstants.ELSE);
            }
          case 109: break;
          case 51: 
            { return new Symbol(TokenConstants.ESAC);
            }
          case 110: break;
          case 52: 
            { return new Symbol(TokenConstants.THEN);
            }
          case 111: break;
          case 53: 
            { return new Symbol(TokenConstants.BOOL_CONST, new Boolean(true));
            }
          case 112: break;
          case 54: 
            { return new Symbol(TokenConstants.POOL);
            }
          case 113: break;
          case 55: 
            { return new Symbol(TokenConstants.CLASS);
            }
          case 114: break;
          case 56: 
            { return new Symbol(TokenConstants.BOOL_CONST, new Boolean(false));
            }
          case 115: break;
          case 57: 
            { return new Symbol(TokenConstants.WHILE);
            }
          case 116: break;
          case 58: 
            { return new Symbol(TokenConstants.ISVOID);
            }
          case 117: break;
          case 59: 
            { return new Symbol(TokenConstants.INHERITS);
            }
          case 118: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
