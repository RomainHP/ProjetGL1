/* The following code was generated by JFlex 1.4.3 on 19/12/17 18:33 */

package prog;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 19/12/17 18:33 from the specification file
 * <tt>prog/grammaire/grammaire.flex</tt>
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
    "\11\0\1\0\1\0\26\0\1\17\1\24\5\0\1\20\1\21\1\6"+
    "\1\4\1\22\1\5\1\47\1\7\12\1\2\0\1\14\1\16\1\15"+
    "\1\0\1\3\32\2\3\0\1\13\2\0\1\36\1\42\1\40\1\12"+
    "\1\31\1\26\1\41\1\30\1\25\2\2\1\33\1\10\1\32\1\11"+
    "\1\43\1\46\1\35\1\34\1\27\1\45\1\2\1\44\1\37\2\2"+
    "\1\0\1\23\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\1\1\2\1\4\1\5\1\6"+
    "\1\7\2\1\1\10\1\11\1\12\1\13\1\2\1\14"+
    "\1\15\1\16\1\17\1\20\14\1\1\0\1\21\3\1"+
    "\1\22\1\23\1\24\1\25\1\26\10\1\1\27\14\1"+
    "\1\30\1\31\1\32\1\33\7\1\1\34\1\1\1\35"+
    "\1\36\1\37\4\1\1\40\2\1\1\41\1\42\1\1"+
    "\1\43\1\10\4\1\1\44\1\45\1\46\1\1\1\47"+
    "\1\1\1\50\1\51\1\52\2\1\1\53\3\1\1\54"+
    "\4\1\1\55\1\56\3\1\1\57\1\60\1\61";

  private static int [] zzUnpackAction() {
    int [] result = new int[124];
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
    "\0\0\0\50\0\120\0\170\0\240\0\50\0\50\0\50"+
    "\0\50\0\310\0\360\0\50\0\u0118\0\u0140\0\50\0\u0168"+
    "\0\50\0\50\0\50\0\50\0\50\0\u0190\0\u01b8\0\u01e0"+
    "\0\u0208\0\u0230\0\u0258\0\u0280\0\u02a8\0\u02d0\0\u02f8\0\u0320"+
    "\0\u0348\0\u0370\0\u0398\0\u03c0\0\u03e8\0\u0410\0\170\0\50"+
    "\0\50\0\50\0\170\0\u0438\0\u0460\0\u0488\0\u04b0\0\u04d8"+
    "\0\u0500\0\u0528\0\u0550\0\170\0\u0578\0\u05a0\0\u05c8\0\u05f0"+
    "\0\u0618\0\u0640\0\u0668\0\u0690\0\u06b8\0\u06e0\0\u0708\0\u0730"+
    "\0\u0370\0\170\0\170\0\170\0\u0758\0\u0780\0\u07a8\0\u07d0"+
    "\0\u07f8\0\u0820\0\u0848\0\170\0\u0870\0\170\0\170\0\170"+
    "\0\u0898\0\u08c0\0\u08e8\0\u0910\0\170\0\u0938\0\u0960\0\170"+
    "\0\170\0\u0988\0\170\0\170\0\u09b0\0\u09d8\0\u0a00\0\u0a28"+
    "\0\170\0\170\0\170\0\u0a50\0\170\0\u0a78\0\170\0\170"+
    "\0\170\0\u0aa0\0\u0ac8\0\170\0\u0af0\0\u0b18\0\u0b40\0\170"+
    "\0\u0b68\0\u0b90\0\u0bb8\0\u0be0\0\170\0\170\0\u0c08\0\u0c30"+
    "\0\u0c58\0\170\0\170\0\170";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[124];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\4\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\4\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\2\4\1\41\3\4\1\2\51\0\1\3\45\0"+
    "\1\42\2\0\1\4\5\0\3\4\12\0\22\4\3\0"+
    "\1\43\5\0\3\43\12\0\22\43\3\0\1\4\5\0"+
    "\1\4\1\44\1\4\12\0\1\45\10\4\1\46\10\4"+
    "\3\0\1\4\5\0\3\4\12\0\10\4\1\47\11\4"+
    "\17\0\1\50\47\0\1\51\47\0\1\52\33\0\1\4"+
    "\5\0\3\4\12\0\1\4\1\53\20\4\3\0\1\4"+
    "\5\0\3\4\12\0\11\4\1\54\10\4\3\0\1\4"+
    "\5\0\1\4\1\55\1\4\12\0\3\4\1\56\4\4"+
    "\1\57\1\60\10\4\3\0\1\4\5\0\3\4\12\0"+
    "\6\4\1\61\13\4\3\0\1\4\5\0\1\4\1\62"+
    "\1\4\12\0\22\4\3\0\1\4\5\0\3\4\12\0"+
    "\4\4\1\63\1\64\14\4\3\0\1\4\5\0\3\4"+
    "\12\0\1\65\17\4\1\66\1\67\3\0\1\4\5\0"+
    "\1\4\1\70\1\4\12\0\22\4\3\0\1\4\5\0"+
    "\3\4\12\0\2\4\1\71\2\4\1\72\1\4\1\73"+
    "\3\4\1\74\1\4\1\75\4\4\3\0\1\4\5\0"+
    "\1\4\1\76\1\4\12\0\22\4\3\0\1\4\5\0"+
    "\1\4\1\77\1\4\12\0\22\4\3\0\1\4\5\0"+
    "\1\4\1\100\1\4\12\0\22\4\2\0\1\101\47\0"+
    "\2\43\5\0\3\43\12\0\22\43\3\0\1\4\5\0"+
    "\2\4\1\102\12\0\22\4\3\0\1\4\5\0\3\4"+
    "\12\0\5\4\1\103\14\4\3\0\1\4\5\0\3\4"+
    "\12\0\12\4\1\104\7\4\3\0\1\4\5\0\3\4"+
    "\12\0\6\4\1\105\13\4\3\0\1\4\5\0\2\4"+
    "\1\106\12\0\5\4\1\107\1\4\1\110\1\111\11\4"+
    "\3\0\1\4\5\0\3\4\12\0\4\4\1\112\15\4"+
    "\3\0\1\4\5\0\3\4\12\0\20\4\1\113\1\4"+
    "\3\0\1\4\5\0\3\4\12\0\5\4\1\114\14\4"+
    "\3\0\1\4\5\0\3\4\12\0\7\4\1\115\12\4"+
    "\3\0\1\4\5\0\3\4\12\0\2\4\1\116\17\4"+
    "\3\0\1\4\5\0\3\4\12\0\5\4\1\117\14\4"+
    "\3\0\1\4\5\0\3\4\12\0\5\4\1\120\14\4"+
    "\3\0\1\4\5\0\3\4\12\0\15\4\1\121\4\4"+
    "\3\0\1\4\5\0\3\4\12\0\10\4\1\122\11\4"+
    "\3\0\1\4\5\0\3\4\12\0\20\4\1\123\1\4"+
    "\3\0\1\4\5\0\3\4\12\0\11\4\1\124\10\4"+
    "\3\0\1\4\5\0\2\4\1\125\12\0\22\4\3\0"+
    "\1\4\5\0\3\4\12\0\1\126\21\4\3\0\1\4"+
    "\5\0\1\4\1\127\1\4\12\0\22\4\3\0\1\4"+
    "\5\0\3\4\12\0\7\4\1\130\12\4\3\0\1\4"+
    "\5\0\3\4\12\0\10\4\1\131\11\4\3\0\1\4"+
    "\5\0\3\4\12\0\5\4\1\132\1\4\1\133\12\4"+
    "\3\0\1\4\5\0\3\4\12\0\17\4\1\134\2\4"+
    "\3\0\1\4\5\0\3\4\12\0\7\4\1\113\12\4"+
    "\3\0\1\4\5\0\3\4\12\0\4\4\1\135\15\4"+
    "\3\0\1\4\5\0\3\4\12\0\20\4\1\136\1\4"+
    "\3\0\1\4\5\0\3\4\12\0\2\4\1\137\17\4"+
    "\3\0\1\4\5\0\3\4\12\0\11\4\1\140\10\4"+
    "\3\0\1\4\5\0\3\4\12\0\5\4\1\141\14\4"+
    "\3\0\1\4\5\0\3\4\12\0\4\4\1\142\15\4"+
    "\3\0\1\4\5\0\3\4\12\0\4\4\1\143\15\4"+
    "\3\0\1\4\5\0\3\4\12\0\7\4\1\144\12\4"+
    "\3\0\1\4\5\0\3\4\12\0\2\4\1\145\17\4"+
    "\3\0\1\4\5\0\3\4\12\0\5\4\1\146\14\4"+
    "\3\0\1\4\5\0\3\4\12\0\5\4\1\147\14\4"+
    "\3\0\1\4\5\0\3\4\12\0\5\4\1\150\14\4"+
    "\3\0\1\4\5\0\3\4\12\0\7\4\1\151\12\4"+
    "\3\0\1\4\5\0\3\4\12\0\13\4\1\152\6\4"+
    "\3\0\1\4\5\0\3\4\12\0\14\4\1\153\5\4"+
    "\3\0\1\4\5\0\1\154\2\4\12\0\22\4\3\0"+
    "\1\4\5\0\3\4\12\0\10\4\1\155\11\4\3\0"+
    "\1\4\5\0\2\4\1\156\12\0\22\4\3\0\1\4"+
    "\5\0\3\4\12\0\2\4\1\157\17\4\3\0\1\4"+
    "\5\0\2\4\1\160\12\0\22\4\3\0\1\4\5\0"+
    "\3\4\12\0\11\4\1\161\10\4\3\0\1\4\5\0"+
    "\3\4\12\0\10\4\1\162\11\4\3\0\1\4\5\0"+
    "\3\4\12\0\1\163\21\4\3\0\1\4\5\0\3\4"+
    "\12\0\1\164\21\4\3\0\1\4\5\0\3\4\12\0"+
    "\10\4\1\165\11\4\3\0\1\4\5\0\3\4\12\0"+
    "\2\4\1\166\17\4\3\0\1\4\5\0\3\4\12\0"+
    "\4\4\1\167\15\4\3\0\1\4\5\0\3\4\12\0"+
    "\5\4\1\170\14\4\3\0\1\4\5\0\3\4\12\0"+
    "\11\4\1\171\10\4\3\0\1\4\5\0\3\4\12\0"+
    "\4\4\1\172\15\4\3\0\1\4\5\0\3\4\12\0"+
    "\14\4\1\173\5\4\3\0\1\4\5\0\3\4\12\0"+
    "\5\4\1\174\14\4\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3200];
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
    "\1\1\1\11\3\1\4\11\2\1\1\11\2\1\1\11"+
    "\1\1\5\11\14\1\1\0\5\1\3\11\122\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[124];
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
  private Parser yyparser;

  public Yylex(java.io.Reader r, Parser yyparser) {
    this(r);
    this.yyparser = yyparser;
  }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
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
    while (i < 106) {
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
        case 15: 
          { return Parser.PIPE;
          }
        case 50: break;
        case 43: 
          { return Parser.TONUM;
          }
        case 51: break;
        case 47: 
          { return Parser.TODEGREE;
          }
        case 52: break;
        case 32: 
          { return Parser.AND;
          }
        case 53: break;
        case 29: 
          { return Parser.NOT;
          }
        case 54: break;
        case 41: 
          { return Parser.ASIN;
          }
        case 55: break;
        case 5: 
          { return Parser.MINUS;
          }
        case 56: break;
        case 4: 
          { return Parser.PLUS;
          }
        case 57: break;
        case 28: 
          { return Parser.TAN;
          }
        case 58: break;
        case 21: 
          { return Parser.DIFF;
          }
        case 59: break;
        case 6: 
          { return Parser.TIMES;
          }
        case 60: break;
        case 12: 
          { return Parser.PAROUV;
          }
        case 61: break;
        case 42: 
          { return Parser.ACOS;
          }
        case 62: break;
        case 7: 
          { return Parser.DIVIDE;
          }
        case 63: break;
        case 20: 
          { return Parser.SUPEQ;
          }
        case 64: break;
        case 11: 
          { return Parser.EQ;
          }
        case 65: break;
        case 3: 
          { yyparser.yylval = new ParserVal(Integer.parseInt(yytext())); 
							return Parser.INT;
          }
        case 66: break;
        case 39: 
          { return Parser.SQRT;
          }
        case 67: break;
        case 30: 
          { return Parser.LEN;
          }
        case 68: break;
        case 48: 
          { return Parser.TOSTRING;
          }
        case 69: break;
        case 22: 
          { return Parser.IF;
          }
        case 70: break;
        case 26: 
          { return Parser.MINIMUM;
          }
        case 71: break;
        case 17: 
          { yyparser.yylval = new ParserVal(yytext()); 
							return Parser.REF;
          }
        case 72: break;
        case 40: 
          { return Parser.ATAN;
          }
        case 73: break;
        case 23: 
          { return Parser.LN;
          }
        case 74: break;
        case 46: 
          { return Parser.CONCAT;
          }
        case 75: break;
        case 24: 
          { yyparser.yylval = new ParserVal(Double.parseDouble(yytext())); 
							return Parser.DOUBLE;
          }
        case 76: break;
        case 1: 
          { yyparser.yylval = new ParserVal(yytext()); 
							return Parser.STRING;
          }
        case 77: break;
        case 27: 
          { return Parser.MAXIMUM;
          }
        case 78: break;
        case 33: 
          { return Parser.ABS;
          }
        case 79: break;
        case 44: 
          { return Parser.ROUND;
          }
        case 80: break;
        case 13: 
          { return Parser.PARFER;
          }
        case 81: break;
        case 49: 
          { return Parser.TORADIAN;
          }
        case 82: break;
        case 14: 
          { return Parser.COMMA;
          }
        case 83: break;
        case 9: 
          { return Parser.INF;
          }
        case 84: break;
        case 10: 
          { return Parser.SUP;
          }
        case 85: break;
        case 31: 
          { return Parser.SIN;
          }
        case 86: break;
        case 18: 
          { return Parser.OR;
          }
        case 87: break;
        case 34: 
          { return Parser.XOR;
          }
        case 88: break;
        case 36: 
          { return Parser.THEN;
          }
        case 89: break;
        case 25: 
          { return Parser.MOD;
          }
        case 90: break;
        case 19: 
          { return Parser.INFEQ;
          }
        case 91: break;
        case 35: 
          { return Parser.COS;
          }
        case 92: break;
        case 38: 
          { return Parser.ELSE;
          }
        case 93: break;
        case 8: 
          { return Parser.POW;
          }
        case 94: break;
        case 45: 
          { return Parser.SUBSTR;
          }
        case 95: break;
        case 16: 
          { return Parser.QUOTE;
          }
        case 96: break;
        case 37: 
          { yyparser.yylval = new ParserVal(Boolean.parseBoolean(yytext()));
							return Parser.BOOLEAN;
          }
        case 97: break;
        case 2: 
          { 
          }
        case 98: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return 0; }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
