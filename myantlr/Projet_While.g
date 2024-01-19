//NEW
grammar Projet_While;

options{
output=AST;
}

tokens
{
	FUNCTION;
	INPUT;
	DEFINITION;
	EXPRESSION;
	CONDITION;
	COMANDES;
	INPUT;
	OUTPUT;
	WHILE;
	FOR;
	FOREACH;
	IF;
	VARIABLE;
	VAR_LIST;
	EXP_LIST;
	AFFECTATION;
	SYMBOL;
	TL;
	HD;
	LIST;
	CONS;
}

WS : (' ' | '\t' | '\r' | '\n') { $channel = HIDDEN ; } ;

Maj  : 'A'..'Z';
Min  : 'a'..'z';
Dec:('0'..'9')+;
 // Expo : ('e'|'E')('+'|'-')?('0'..'9')+;
//Flottant : ((('0'..'9')+'.'('0'..'9')*(Expo)?)|('.'('0'..'9')+(Expo)?)|(('0'..'9')+(Expo)));

Variable : Maj (Maj|Min|Dec)* ('!'|'?')?;
Symbol: Min (Maj|Min|Dec)* ('!'|'?')?;


function  : 'function' Symbol ':' definition -> ^(Symbol definition);
definition 
	:	'read' input  '%' commands '%' 'write' output -> ^(INPUT input) commands ^(OUTPUT output); 	 
input : inputSub| ; 
inputSub: Variable  (','  Variable)* ->  ^(Variable)+;
output:Variable (','Variable)*->  ^(Variable)+;


//commands:command (';' commands)? ;
commands:command (';' command)* -> ^(COMANDES (command)+);

command: ('nop') 
	| (vars ':=' exprs) -> ^(AFFECTATION vars ':=' exprs)
	| ('if' expression 'then' commands ('else' commands)? 'fi') ->^(IF 'if' expression 'then' commands ('else' commands)? 'fi')
	| ('while' expression 'do' commands 'od') ->^(WHILE ^(CONDITION expression) commands )
	| ('for' expression 'do' commands 'od') -> ^(FOR ^(CONDITION expression) commands )
	| ( 'foreach' Variable 'in' expression 'do' commands 'od') -> ^(FOREACH 'foreach' Variable 'in' expression 'do' commands 'od');
	
vars:Variable (',' vars | Variable)? -> ^(VAR_LIST  (Variable)+);
exprs: expression (',' exprs | expression)? -> ^(EXP_LIST  (expression)+)  ;

exprBase:     'nil'-> ^('nil')
	| Variable -> ^(Variable)
	| Symbol -> ^(Symbol)
	| ('(' 'cons' lExpr ')') ->^(CONS ^(lExpr))
	| ('(' 'hd' exprBase ')') ->^(HD^(exprBase))
	| ('(' 'tl' exprBase ')') ->^(TL^('tl' exprBase))
	| ('(' 'list' exprBase')') ->^(LIST^('list'exprBase))
	| ('(' Symbol lExpr ')') ->^(SYMBOL^(Symbol lExpr));
	
	
expression: exprBase ('=?' exprBase)?;
lExpr : exprBase lExpr | ;


programme : function+ -> ^(FUNCTION function)+;
prog :programme;
