%{
package prog;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
%}

%token REF PIPE NAME FORMULE SPACE

%type<sval> REF NAME FORMULE


%%

axiome : importe
	| formuleReference
	;

formuleReference : REF formuleReference 	{String reference = $1; 
												Cellule cellule = conteneur.getCellule(reference.substring(1));
												refs.add(cellule);}
				| FORMULE formuleReference
				| REF 			{String reference = $1; 
									Cellule cellule = conteneur.getCellule(reference.substring(1));
									refs.add(cellule);}
				| FORMULE
				;

importe : NAME PIPE FORMULE SPACE	{cellName = $1; 
							cellFormule = $3;}

%%

private YyExtractRef lexer;

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


public ParserExtract(Reader r) {
	lexer = new YyExtractRef(r, this);
}

static List<Cellule> refs = new ArrayList<>();

static Conteneur conteneur = new Conteneur();

static String cellName;
static String cellFormule;


public static List<Cellule> extractRef(String formule, Conteneur conteneur) throws IOException, Exception {
	ParserExtract.conteneur = conteneur;
	ParserExtract yyparser;
	refs = new ArrayList<>();
	yyparser = new ParserExtract(new StringReader(formule));
	yyparser.yyparse();
	return refs;
}

public static Cellule extractCelluleFromLine(String line) throws IOException, Exception {
	ParserExtract yyparser;
	yyparser = new ParserExtract(new StringReader(line));
	yyparser.yyparse();
	return new Cellule(cellName, cellFormule);
}
