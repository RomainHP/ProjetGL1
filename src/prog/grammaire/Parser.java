//### This file created by BYACC 1.8(/Java extension  1.15)
//### Java capabilities added 7 Jan 97, Bob Jamison
//### Updated : 27 Nov 97  -- Bob Jamison, Joe Nieten
//###           01 Jan 98  -- Bob Jamison -- fixed generic semantic constructor
//###           01 Jun 99  -- Bob Jamison -- added Runnable support
//###           06 Aug 00  -- Bob Jamison -- made state variables class-global
//###           03 Jan 01  -- Bob Jamison -- improved flags, tracing
//###           16 May 01  -- Bob Jamison -- added custom stack sizing
//###           04 Mar 02  -- Yuval Oren  -- improved java performance, added options
//###           14 Mar 02  -- Tomas Hurka -- -d support, static initializer workaround
//### Please send bug reports to tom@hukatronic.cz
//### static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";






//#line 1 "grammaire.y"

  package prog.grammaire;
  import prog.methods;
  import java.io.*;
  import java.util.ArrayList;
  import java.util.List;
//#line 24 "Parser.java"




public class Parser
{

boolean yydebug;        //do I want debug output?
int yynerrs;            //number of errors so far
int yyerrflag;          //was there an error?
int yychar;             //the current working character

//########## MESSAGES ##########
//###############################################################
// method: debug
//###############################################################
void debug(String msg)
{
  if (yydebug)
    System.out.println(msg);
}

//########## STATE STACK ##########
final static int YYSTACKSIZE = 500;  //maximum stack size
int statestk[] = new int[YYSTACKSIZE]; //state stack
int stateptr;
int stateptrmax;                     //highest index of stackptr
int statemax;                        //state when highest index reached
//###############################################################
// methods: state stack push,pop,drop,peek
//###############################################################
final void state_push(int state)
{
  try {
		stateptr++;
		statestk[stateptr]=state;
	 }
	 catch (ArrayIndexOutOfBoundsException e) {
     int oldsize = statestk.length;
     int newsize = oldsize * 2;
     int[] newstack = new int[newsize];
     System.arraycopy(statestk,0,newstack,0,oldsize);
     statestk = newstack;
     statestk[stateptr]=state;
  }
}
final int state_pop()
{
  return statestk[stateptr--];
}
final void state_drop(int cnt)
{
  stateptr -= cnt; 
}
final int state_peek(int relative)
{
  return statestk[stateptr-relative];
}
//###############################################################
// method: init_stacks : allocate and prepare stacks
//###############################################################
final boolean init_stacks()
{
  stateptr = -1;
  val_init();
  return true;
}
//###############################################################
// method: dump_stacks : show n levels of the stacks
//###############################################################
void dump_stacks(int count)
{
int i;
  System.out.println("=index==state====value=     s:"+stateptr+"  v:"+valptr);
  for (i=0;i<count;i++)
    System.out.println(" "+i+"    "+statestk[i]+"      "+valstk[i]);
  System.out.println("======================");
}


//########## SEMANTIC VALUES ##########
//public class ParserVal is defined in ParserVal.java


String   yytext;//user variable to return contextual strings
ParserVal yyval; //used to return semantic vals from action routines
ParserVal yylval;//the 'lval' (result) I got from yylex()
ParserVal valstk[];
int valptr;
//###############################################################
// methods: value stack push,pop,drop,peek.
//###############################################################
void val_init()
{
  valstk=new ParserVal[YYSTACKSIZE];
  yyval=new ParserVal();
  yylval=new ParserVal();
  valptr=-1;
}
void val_push(ParserVal val)
{
  if (valptr>=YYSTACKSIZE)
    return;
  valstk[++valptr]=val;
}
ParserVal val_pop()
{
  if (valptr<0)
    return new ParserVal();
  return valstk[valptr--];
}
void val_drop(int cnt)
{
int ptr;
  ptr=valptr-cnt;
  if (ptr<0)
    return;
  valptr = ptr;
}
ParserVal val_peek(int relative)
{
int ptr;
  ptr=valptr-relative;
  if (ptr<0)
    return new ParserVal();
  return valstk[ptr];
}
final ParserVal dup_yyval(ParserVal val)
{
  ParserVal dup = new ParserVal();
  dup.ival = val.ival;
  dup.dval = val.dval;
  dup.sval = val.sval;
  dup.obj = val.obj;
  return dup;
}
//#### end semantic value section ####
public final static short NAME=257;
public final static short NUM=258;
public final static short BOOLEAN=259;
public final static short PLUS=260;
public final static short MINUS=261;
public final static short TIMES=262;
public final static short DIVIDE=263;
public final static short MOD=264;
public final static short POW=265;
public final static short INF=266;
public final static short SUP=267;
public final static short EQ=268;
public final static short DIFF=269;
public final static short PAROUV=270;
public final static short PARFER=271;
public final static short PIPE=272;
public final static short COMMA=273;
public final static short QUOTE=274;
public final static short IF=275;
public final static short THEN=276;
public final static short ELSE=277;
public final static short OR=278;
public final static short AND=279;
public final static short XOR=280;
public final static short NOT=281;
public final static short SIN=282;
public final static short COS=283;
public final static short TAN=284;
public final static short MINIMUM=285;
public final static short MAXIMUM=286;
public final static short MOY=287;
public final static short SQRT=288;
public final static short REF=289;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    0,    0,    1,    1,    1,    1,    1,    1,    1,    3,
    3,    3,    3,    3,    3,    3,    2,    4,    5,    5,
};
final static short yylen[] = {                            2,
    2,    0,    3,    3,    3,    3,    1,    1,    3,    2,
    2,    2,    2,    2,    2,    2,    3,    3,    1,    3,
};
final static short yydefred[] = {                         2,
    0,    8,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    7,    0,    0,   10,   11,   12,    0,   13,   14,
   15,   16,    0,    0,    0,    0,    9,    0,    0,    0,
    0,    0,    6,    5,   17,    0,   18,   20,
};
final static short yydgoto[] = {                          1,
   29,   15,   12,   19,   30,
};
final static short yysindex[] = {                         0,
 -258,    0, -258, -268, -268, -268, -263, -263, -263, -268,
 -211,    0, -227, -258,    0,    0,    0, -258,    0,    0,
    0,    0, -258, -258, -258, -258,    0, -215, -257, -260,
 -241, -241,    0,    0,    0, -258,    0,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   39,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0, -256,    0,
    1,    8,    0,    0,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
   17,    4,    0,   29,  -23,
};
final static int YYTABLESIZE=327;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                          2,
    3,   14,   23,   24,   25,   26,   18,    4,   16,   17,
   37,    3,   38,   22,   19,   36,    0,   11,    0,   13,
   25,   26,    0,    4,    5,    6,    7,    8,    9,   10,
   28,    0,   23,   24,   25,   26,   20,   21,    1,   31,
   32,   33,   34,   27,   23,   24,   25,   26,   23,   24,
   25,   26,    0,    0,    0,   35,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    3,    0,
    3,    3,    0,    0,    0,    4,    0,    4,    4,    0,
    3,    3,    0,    3,    0,    0,    0,    4,    4,    0,
    4,    0,    3,    3,    3,    3,    3,    3,    3,    4,
    4,    4,    4,    4,    4,    4,    1,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    1,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    1,    1,    1,    1,    1,    1,    1,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                        258,
    0,  270,  260,  261,  262,  263,  270,    0,    5,    6,
  271,  270,   36,   10,  271,  273,   -1,    1,   -1,    3,
  262,  263,   -1,  282,  283,  284,  285,  286,  287,  288,
   14,   -1,  260,  261,  262,  263,    8,    9,    0,   23,
   24,   25,   26,  271,  260,  261,  262,  263,  260,  261,
  262,  263,   -1,   -1,   -1,  271,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  258,   -1,
  260,  261,   -1,   -1,   -1,  258,   -1,  260,  261,   -1,
  270,  271,   -1,  273,   -1,   -1,   -1,  270,  271,   -1,
  273,   -1,  282,  283,  284,  285,  286,  287,  288,  282,
  283,  284,  285,  286,  287,  288,  258,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  270,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
  282,  283,  284,  285,  286,  287,  288,
};
}
final static short YYFINAL=1;
final static short YYMAXTOKEN=289;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,"NAME","NUM","BOOLEAN","PLUS","MINUS","TIMES","DIVIDE","MOD",
"POW","INF","SUP","EQ","DIFF","PAROUV","PARFER","PIPE","COMMA","QUOTE","IF",
"THEN","ELSE","OR","AND","XOR","NOT","SIN","COS","TAN","MINIMUM","MAXIMUM",
"MOY","SQRT","REF",
};
final static String yyrule[] = {
"$accept : axiome",
"axiome : axiome operation",
"axiome :",
"operation : operation PLUS operation",
"operation : operation MINUS operation",
"operation : operation DIVIDE operation",
"operation : operation TIMES operation",
"operation : method",
"operation : NUM",
"operation : PAROUV operation PARFER",
"method : SIN oneArgument",
"method : COS oneArgument",
"method : TAN oneArgument",
"method : MINIMUM manyArgument",
"method : MAXIMUM manyArgument",
"method : MOY manyArgument",
"method : SQRT oneArgument",
"oneArgument : PAROUV operation PARFER",
"manyArgument : PAROUV listArgument PARFER",
"listArgument : operation",
"listArgument : operation COMMA listArgument",
};

//#line 63 "grammaire.y"


private Yylex lexer;

private int yylex () {
    	int yyl_return = -1;
    	try {
      		yylval = new ParserVal(0);
      		yyl_return = lexer.yylex();
	}
	catch (IOException e) {
		System.err.println("IO error :"+e);
	}
	return yyl_return;
}


public void yyerror (String error) {
	System.err.println ("Error: " + error);
}


public Parser(Reader r) {
	lexer = new Yylex(r, this);
}


static boolean interactive;
static Operation func;
static List<Double> funcArgs = new ArrayList<>();

public static void main(String args[]) throws IOException {

	Parser yyparser;
	yyparser = new Parser(new InputStreamReader(System.in));

	yyparser.yyparse();
}


/*compilation : byaccj -J grammaire.y*/
//#line 328 "Parser.java"
//###############################################################
// method: yylexdebug : check lexer state
//###############################################################
void yylexdebug(int state,int ch)
{
String s=null;
  if (ch < 0) ch=0;
  if (ch <= YYMAXTOKEN) //check index bounds
     s = yyname[ch];    //now get it
  if (s==null)
    s = "illegal-symbol";
  debug("state "+state+", reading "+ch+" ("+s+")");
}





//The following are now global, to aid in error reporting
int yyn;       //next next thing to do
int yym;       //
int yystate;   //current parsing state from state table
String yys;    //current token string


//###############################################################
// method: yyparse : parse input and execute indicated items
//###############################################################
int yyparse()
{
boolean doaction;
  init_stacks();
  yynerrs = 0;
  yyerrflag = 0;
  yychar = -1;          //impossible char forces a read
  yystate=0;            //initial state
  state_push(yystate);  //save it
  val_push(yylval);     //save empty value
  while (true) //until parsing is done, either correctly, or w/error
    {
    doaction=true;
    if (yydebug) debug("loop"); 
    //#### NEXT ACTION (from reduction table)
    for (yyn=yydefred[yystate];yyn==0;yyn=yydefred[yystate])
      {
      if (yydebug) debug("yyn:"+yyn+"  state:"+yystate+"  yychar:"+yychar);
      if (yychar < 0)      //we want a char?
        {
        yychar = yylex();  //get next token
        if (yydebug) debug(" next yychar:"+yychar);
        //#### ERROR CHECK ####
        if (yychar < 0)    //it it didn't work/error
          {
          yychar = 0;      //change it to default string (no -1!)
          if (yydebug)
            yylexdebug(yystate,yychar);
          }
        }//yychar<0
      yyn = yysindex[yystate];  //get amount to shift by (shift index)
      if ((yyn != 0) && (yyn += yychar) >= 0 &&
          yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
        {
        if (yydebug)
          debug("state "+yystate+", shifting to state "+yytable[yyn]);
        //#### NEXT STATE ####
        yystate = yytable[yyn];//we are in a new state
        state_push(yystate);   //save it
        val_push(yylval);      //push our lval as the input for next rule
        yychar = -1;           //since we have 'eaten' a token, say we need another
        if (yyerrflag > 0)     //have we recovered an error?
           --yyerrflag;        //give ourselves credit
        doaction=false;        //but don't process yet
        break;   //quit the yyn=0 loop
        }

    yyn = yyrindex[yystate];  //reduce
    if ((yyn !=0 ) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
      {   //we reduced!
      if (yydebug) debug("reduce");
      yyn = yytable[yyn];
      doaction=true; //get ready to execute
      break;         //drop down to actions
      }
    else //ERROR RECOVERY
      {
      if (yyerrflag==0)
        {
        yyerror("syntax error");
        yynerrs++;
        }
      if (yyerrflag < 3) //low error count?
        {
        yyerrflag = 3;
        while (true)   //do until break
          {
          if (stateptr<0)   //check for under & overflow here
            {
            yyerror("stack underflow. aborting...");  //note lower case 's'
            return 1;
            }
          yyn = yysindex[state_peek(0)];
          if ((yyn != 0) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
            if (yydebug)
              debug("state "+state_peek(0)+", error recovery shifting to state "+yytable[yyn]+" ");
            yystate = yytable[yyn];
            state_push(yystate);
            val_push(yylval);
            doaction=false;
            break;
            }
          else
            {
            if (yydebug)
              debug("error recovery discarding state "+state_peek(0)+" ");
            if (stateptr<0)   //check for under & overflow here
              {
              yyerror("Stack underflow. aborting...");  //capital 'S'
              return 1;
              }
            state_pop();
            val_pop();
            }
          }
        }
      else            //discard this token
        {
        if (yychar == 0)
          return 1; //yyabort
        if (yydebug)
          {
          yys = null;
          if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
          if (yys == null) yys = "illegal-symbol";
          debug("state "+yystate+", error recovery discards token "+yychar+" ("+yys+")");
          }
        yychar = -1;  //read another
        }
      }//end error recovery
    }//yyn=0 loop
    if (!doaction)   //any reason not to proceed?
      continue;      //skip action
    yym = yylen[yyn];          //get count of terminals on rhs
    if (yydebug)
      debug("state "+yystate+", reducing "+yym+" by rule "+yyn+" ("+yyrule[yyn]+")");
    if (yym>0)                 //if count of rhs not 'nil'
      yyval = val_peek(yym-1); //get current semantic value
    yyval = dup_yyval(yyval); //duplicate yyval if ParserVal is used as semantic value
    switch(yyn)
      {
//########## USER-SUPPLIED ACTIONS ##########
case 1:
//#line 28 "grammaire.y"
{System.out.println("resultat : " + val_peek(0).dval);}
break;
case 3:
//#line 32 "grammaire.y"
{yyval.dval = val_peek(2).dval + val_peek(0).dval;}
break;
case 4:
//#line 33 "grammaire.y"
{yyval.dval = val_peek(2).dval - val_peek(0).dval;}
break;
case 5:
//#line 34 "grammaire.y"
{yyval.dval = val_peek(2).dval / val_peek(0).dval;}
break;
case 6:
//#line 35 "grammaire.y"
{yyval.dval = val_peek(2).dval * val_peek(0).dval;}
break;
case 7:
//#line 36 "grammaire.y"
{func.setArgs(funcArgs);
									funcArgs.clear();
									yyval.dval = func.getResultat();}
break;
case 8:
//#line 39 "grammaire.y"
{yyval.dval = val_peek(0).dval;}
break;
case 9:
//#line 40 "grammaire.y"
{yyval.dval = val_peek(1).dval;}
break;
case 10:
//#line 43 "grammaire.y"
{ func = new Operation("sinus", new Sinus());}
break;
case 11:
//#line 44 "grammaire.y"
{ func = new Operation("cosinus", new Cosinus());}
break;
case 12:
//#line 45 "grammaire.y"
{ func = new Operation("tangente", new Tangente());}
break;
case 13:
//#line 46 "grammaire.y"
{ func = new Operation("minimum", new Minimum());}
break;
case 14:
//#line 47 "grammaire.y"
{ func = new Operation("maximum", new Maximum());}
break;
case 15:
//#line 48 "grammaire.y"
{ func = new Operation("moyenne", new Moyenne());}
break;
case 16:
//#line 49 "grammaire.y"
{ func = new Operation("sqrt", new Sqrt());}
break;
case 17:
//#line 52 "grammaire.y"
{funcArgs.add(val_peek(1).dval);}
break;
case 19:
//#line 58 "grammaire.y"
{funcArgs.add(val_peek(0).dval);}
break;
case 20:
//#line 59 "grammaire.y"
{funcArgs.add(val_peek(2).dval);}
break;
//#line 551 "Parser.java"
//########## END OF USER-SUPPLIED ACTIONS ##########
    }//switch
    //#### Now let's reduce... ####
    if (yydebug) debug("reduce");
    state_drop(yym);             //we just reduced yylen states
    yystate = state_peek(0);     //get new state
    val_drop(yym);               //corresponding value drop
    yym = yylhs[yyn];            //select next TERMINAL(on lhs)
    if (yystate == 0 && yym == 0)//done? 'rest' state and at first TERMINAL
      {
      if (yydebug) debug("After reduction, shifting from state 0 to state "+YYFINAL+"");
      yystate = YYFINAL;         //explicitly say we're done
      state_push(YYFINAL);       //and save it
      val_push(yyval);           //also save the semantic value of parsing
      if (yychar < 0)            //we want another character?
        {
        yychar = yylex();        //get next character
        if (yychar<0) yychar=0;  //clean, if necessary
        if (yydebug)
          yylexdebug(yystate,yychar);
        }
      if (yychar == 0)          //Good exit (if lex returns 0 ;-)
         break;                 //quit the loop--all DONE
      }//if yystate
    else                        //else not done yet
      {                         //get next state and push, for next yydefred[]
      yyn = yygindex[yym];      //find out where to go
      if ((yyn != 0) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn]; //get new state
      else
        yystate = yydgoto[yym]; //else go to new defred
      if (yydebug) debug("after reduction, shifting from state "+state_peek(0)+" to state "+yystate+"");
      state_push(yystate);     //going again, so push state & val...
      val_push(yyval);         //for next action
      }
    }//main loop
  return 0;//yyaccept!!
}
//## end of method parse() ######################################



//## run() --- for Thread #######################################
/**
 * A default run method, used for operating this parser
 * object in the background.  It is intended for extending Thread
 * or implementing Runnable.  Turn off with -Jnorun .
 */
public void run()
{
  yyparse();
}
//## end of method run() ########################################



//## Constructors ###############################################
/**
 * Default constructor.  Turn off with -Jnoconstruct .

 */
public Parser()
{
  //nothing to do
}


/**
 * Create a parser, setting the debug to true or false.
 * @param debugMe true for debugging, false for no debug.
 */
public Parser(boolean debugMe)
{
  yydebug=debugMe;
}
//###############################################################



}
//################### END OF CLASS ##############################
