/* The following code was generated by JFlex 1.6.1 */

package prog;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>prog/grammaire/grammaire.flex</tt>
 */
class Yylex {

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
    "\11\0\1\52\1\52\25\0\1\52\1\15\1\22\2\0\1\10\2\0"+
    "\1\16\1\17\1\6\1\4\1\20\1\5\1\51\1\7\12\1\2\0"+
    "\1\12\1\14\1\13\1\0\1\3\32\2\3\0\1\11\2\0\1\35"+
    "\1\44\1\40\1\36\1\27\1\24\1\41\1\26\1\23\2\2\1\31"+
    "\1\42\1\30\1\33\1\45\1\50\1\34\1\32\1\25\1\47\1\2"+
    "\1\46\1\37\1\43\1\2\1\0\1\21\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff93\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\1\1\14\1\15"+
    "\1\16\1\17\1\20\16\1\1\21\1\0\1\22\1\23"+
    "\1\24\1\25\1\0\1\26\1\27\10\0\1\30\3\0"+
    "\1\31\14\0\1\32\7\0\1\33\1\0\1\34\1\35"+
    "\1\36\4\0\1\37\2\0\1\40\1\41\1\0\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\4\0\1\50\1\51"+
    "\1\0\1\52\1\0\1\53\1\54\1\55\1\0\1\56"+
    "\4\0\1\57\4\0\1\60\1\61\3\0\1\62\1\63"+
    "\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[127];
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
    "\0\0\0\53\0\126\0\201\0\53\0\53\0\53\0\53"+
    "\0\53\0\53\0\254\0\327\0\53\0\u0102\0\53\0\53"+
    "\0\53\0\53\0\u012d\0\u0158\0\u0183\0\u01ae\0\u01d9\0\u0204"+
    "\0\u022f\0\u025a\0\u0285\0\u02b0\0\u02db\0\u0306\0\u0331\0\u035c"+
    "\0\u0387\0\53\0\u03b2\0\u03dd\0\53\0\53\0\53\0\u012d"+
    "\0\53\0\53\0\u0408\0\u0433\0\u045e\0\u0489\0\u04b4\0\u04df"+
    "\0\u050a\0\u0535\0\53\0\u0560\0\u058b\0\u05b6\0\53\0\u05e1"+
    "\0\u060c\0\u0637\0\u0662\0\u068d\0\u06b8\0\u06e3\0\u070e\0\u0739"+
    "\0\u0764\0\u078f\0\u07ba\0\u03b2\0\u07e5\0\u0810\0\u083b\0\u0866"+
    "\0\u0891\0\u08bc\0\u08e7\0\53\0\u0912\0\53\0\53\0\53"+
    "\0\u093d\0\u0968\0\u0993\0\u09be\0\53\0\u09e9\0\u0a14\0\53"+
    "\0\53\0\u0a3f\0\53\0\53\0\53\0\53\0\53\0\53"+
    "\0\u0a6a\0\u0a95\0\u0ac0\0\u0aeb\0\53\0\53\0\u0b16\0\53"+
    "\0\u0b41\0\53\0\53\0\53\0\u0b6c\0\53\0\u0b97\0\u0bc2"+
    "\0\u0bed\0\u0c18\0\53\0\u0c43\0\u0c6e\0\u0c99\0\u0cc4\0\53"+
    "\0\53\0\u0cef\0\u0d1a\0\u0d45\0\53\0\53\0\53";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[127];
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
    "\1\2\1\3\1\2\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\2\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\2\1\36"+
    "\1\37\1\2\1\40\2\2\1\41\4\2\1\42\54\0"+
    "\1\3\47\0\1\43\3\0\1\44\20\0\26\44\16\0"+
    "\1\45\52\0\1\46\52\0\1\47\36\0\22\50\1\51"+
    "\30\50\24\0\1\52\63\0\1\53\43\0\1\54\4\0"+
    "\1\55\1\56\1\57\46\0\1\60\54\0\1\61\46\0"+
    "\1\62\1\63\45\0\1\64\23\0\1\65\1\66\36\0"+
    "\1\67\51\0\1\70\44\0\1\71\2\0\1\72\1\0"+
    "\1\73\5\0\1\74\3\0\1\75\41\0\1\76\52\0"+
    "\1\77\42\0\1\100\7\0\1\101\1\0\1\102\50\0"+
    "\1\103\20\0\1\104\52\0\2\44\20\0\26\44\33\0"+
    "\1\105\50\0\1\106\53\0\1\107\1\0\1\110\1\0"+
    "\1\111\1\0\1\112\63\0\1\113\33\0\1\114\54\0"+
    "\1\115\45\0\1\116\55\0\1\117\52\0\1\120\66\0"+
    "\1\121\42\0\1\122\65\0\1\123\40\0\1\124\53\0"+
    "\1\125\37\0\1\126\62\0\1\127\51\0\1\130\54\0"+
    "\1\131\46\0\1\132\1\0\1\133\50\0\1\134\65\0"+
    "\1\135\46\0\1\136\61\0\1\137\36\0\1\113\50\0"+
    "\1\140\71\0\1\141\30\0\1\142\62\0\1\143\44\0"+
    "\1\144\52\0\1\145\52\0\1\146\55\0\1\147\45\0"+
    "\1\150\55\0\1\151\52\0\1\152\52\0\1\153\54\0"+
    "\1\154\60\0\1\155\54\0\1\156\44\0\1\157\54\0"+
    "\1\160\55\0\1\161\36\0\1\162\63\0\1\163\51\0"+
    "\1\164\40\0\1\165\52\0\1\166\63\0\1\167\52\0"+
    "\1\170\43\0\1\171\55\0\1\172\57\0\1\173\44\0"+
    "\1\174\64\0\1\175\41\0\1\176\51\0\1\177\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3440];
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
    "\1\0\1\11\2\1\6\11\2\1\1\11\1\1\4\11"+
    "\17\1\1\11\1\0\1\1\3\11\1\0\2\11\10\0"+
    "\1\11\3\0\1\11\14\0\1\1\7\0\1\11\1\0"+
    "\3\11\4\0\1\11\2\0\2\11\1\0\6\11\4\0"+
    "\2\11\1\0\1\11\1\0\3\11\1\0\1\11\4\0"+
    "\1\11\4\0\2\11\3\0\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[127];
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
  private Parser yyparser;

  public Yylex(java.io.Reader r, Parser yyparser) {
    this(r);
    this.yyparser = yyparser;
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 146) {
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
  public int yylex() throws java.io.IOException {
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
            zzDoEOF();
          { return 0; }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return Parser.UNKNOWN;
            }
          case 53: break;
          case 2: 
            { yyparser.yylval = new ParserVal(Integer.parseInt(yytext())); 
							return Parser.INT;
            }
          case 54: break;
          case 3: 
            { return Parser.PLUS;
            }
          case 55: break;
          case 4: 
            { return Parser.MINUS;
            }
          case 56: break;
          case 5: 
            { return Parser.TIMES;
            }
          case 57: break;
          case 6: 
            { return Parser.DIVIDE;
            }
          case 58: break;
          case 7: 
            { return Parser.MOD;
            }
          case 59: break;
          case 8: 
            { return Parser.POW;
            }
          case 60: break;
          case 9: 
            { return Parser.INF;
            }
          case 61: break;
          case 10: 
            { return Parser.SUP;
            }
          case 62: break;
          case 11: 
            { return Parser.EQ;
            }
          case 63: break;
          case 12: 
            { return Parser.PAROUV;
            }
          case 64: break;
          case 13: 
            { return Parser.PARFER;
            }
          case 65: break;
          case 14: 
            { return Parser.COMMA;
            }
          case 66: break;
          case 15: 
            { return Parser.PIPE;
            }
          case 67: break;
          case 16: 
            { return Parser.QUOTE;
            }
          case 68: break;
          case 17: 
            { 
            }
          case 69: break;
          case 18: 
            { yyparser.yylval = new ParserVal(yytext()); 
							return Parser.REF;
            }
          case 70: break;
          case 19: 
            { return Parser.INFEQ;
            }
          case 71: break;
          case 20: 
            { return Parser.SUPEQ;
            }
          case 72: break;
          case 21: 
            { return Parser.DIFF;
            }
          case 73: break;
          case 22: 
            { yyparser.yylval = new ParserVal(yytext().substring(1, yytext().length() - 1)); 
							return Parser.STRING;
            }
          case 74: break;
          case 23: 
            { return Parser.IF;
            }
          case 75: break;
          case 24: 
            { return Parser.LN;
            }
          case 76: break;
          case 25: 
            { return Parser.OR;
            }
          case 77: break;
          case 26: 
            { yyparser.yylval = new ParserVal(Double.parseDouble(yytext())); 
							return Parser.DOUBLE;
            }
          case 78: break;
          case 27: 
            { return Parser.TAN;
            }
          case 79: break;
          case 28: 
            { return Parser.NOT;
            }
          case 80: break;
          case 29: 
            { return Parser.LEN;
            }
          case 81: break;
          case 30: 
            { return Parser.SIN;
            }
          case 82: break;
          case 31: 
            { return Parser.AND;
            }
          case 83: break;
          case 32: 
            { return Parser.ABS;
            }
          case 84: break;
          case 33: 
            { return Parser.XOR;
            }
          case 85: break;
          case 34: 
            { return Parser.COS;
            }
          case 86: break;
          case 35: 
            { return Parser.MINIMUM;
            }
          case 87: break;
          case 36: 
            { return Parser.MOY;
            }
          case 88: break;
          case 37: 
            { return Parser.MAXIMUM;
            }
          case 89: break;
          case 38: 
            { return Parser.POWER;
            }
          case 90: break;
          case 39: 
            { return Parser.THEN;
            }
          case 91: break;
          case 40: 
            { yyparser.yylval = new ParserVal(Boolean.parseBoolean(yytext()));
							return Parser.BOOLEAN;
            }
          case 92: break;
          case 41: 
            { return Parser.ELSE;
            }
          case 93: break;
          case 42: 
            { return Parser.SQRT;
            }
          case 94: break;
          case 43: 
            { return Parser.ATAN;
            }
          case 95: break;
          case 44: 
            { return Parser.ASIN;
            }
          case 96: break;
          case 45: 
            { return Parser.ACOS;
            }
          case 97: break;
          case 46: 
            { return Parser.TONUM;
            }
          case 98: break;
          case 47: 
            { return Parser.ROUND;
            }
          case 99: break;
          case 48: 
            { return Parser.SUBSTR;
            }
          case 100: break;
          case 49: 
            { return Parser.CONCAT;
            }
          case 101: break;
          case 50: 
            { return Parser.TOSTRING;
            }
          case 102: break;
          case 51: 
            { return Parser.TORADIAN;
            }
          case 103: break;
          case 52: 
            { return Parser.TODEGREE;
            }
          case 104: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
