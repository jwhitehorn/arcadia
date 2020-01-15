// Generated from /Users/jason/projects/arcadia/Arcadia.g4 by ANTLR 4.7.2
package us.whitehorn.jason.arcadia.compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArcadiaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITERAL=1, COMMA=2, SEMICOLON=3, CRLF=4, REQUIRE=5, END=6, DEF=7, RETURN=8, 
		PIR=9, IF=10, ELSE=11, ELSIF=12, UNLESS=13, WHILE=14, RETRY=15, BREAK=16, 
		FOR=17, TRUE=18, FALSE=19, PLUS=20, MINUS=21, MUL=22, DIV=23, MOD=24, 
		EXP=25, EQUAL=26, NOT_EQUAL=27, GREATER=28, LESS=29, LESS_EQUAL=30, GREATER_EQUAL=31, 
		ASSIGN=32, PLUS_ASSIGN=33, MINUS_ASSIGN=34, MUL_ASSIGN=35, DIV_ASSIGN=36, 
		MOD_ASSIGN=37, EXP_ASSIGN=38, BIT_AND=39, BIT_OR=40, BIT_XOR=41, BIT_NOT=42, 
		BIT_SHL=43, BIT_SHR=44, AND=45, OR=46, NOT=47, LEFT_RBRACKET=48, RIGHT_RBRACKET=49, 
		LEFT_SBRACKET=50, RIGHT_SBRACKET=51, NIL=52, SL_COMMENT=53, ML_COMMENT=54, 
		WS=55, INT=56, FLOAT=57, R_ID=58, R_ID_GLOBAL=59, R_ID_FUNCTION=60;
	public static final int
		RULE_prog = 0, RULE_expression_list = 1, RULE_expression = 2, RULE_global_get = 3, 
		RULE_global_set = 4, RULE_global_result = 5, RULE_function_inline_call = 6, 
		RULE_require_block = 7, RULE_pir_inline = 8, RULE_pir_expression_list = 9, 
		RULE_function_definition = 10, RULE_function_definition_body = 11, RULE_function_definition_header = 12, 
		RULE_function_name = 13, RULE_function_definition_params = 14, RULE_function_definition_params_list = 15, 
		RULE_function_definition_param_r_id = 16, RULE_return_statement = 17, 
		RULE_function_call = 18, RULE_function_call_param_list = 19, RULE_function_call_params = 20, 
		RULE_function_param = 21, RULE_function_unnamed_param = 22, RULE_function_named_param = 23, 
		RULE_function_call_assignment = 24, RULE_all_result = 25, RULE_elsif_statement = 26, 
		RULE_if_elsif_statement = 27, RULE_if_statement = 28, RULE_unless_statement = 29, 
		RULE_while_statement = 30, RULE_for_statement = 31, RULE_init_expression = 32, 
		RULE_all_assignment = 33, RULE_for_init_list = 34, RULE_cond_expression = 35, 
		RULE_loop_expression = 36, RULE_for_loop_list = 37, RULE_statement_body = 38, 
		RULE_statement_expression_list = 39, RULE_assignment = 40, RULE_dynamic_assignment = 41, 
		RULE_int_assignment = 42, RULE_float_assignment = 43, RULE_string_assignment = 44, 
		RULE_array_assignment = 45, RULE_array_definition = 46, RULE_array_definition_elements = 47, 
		RULE_array_selector = 48, RULE_dynamic_result = 49, RULE_dynamic = 50, 
		RULE_int_result = 51, RULE_float_result = 52, RULE_string_result = 53, 
		RULE_comparison_list = 54, RULE_comparison = 55, RULE_comp_var = 56, RULE_lvalue = 57, 
		RULE_rvalue = 58, RULE_break_expression = 59, RULE_literal_t = 60, RULE_float_t = 61, 
		RULE_int_t = 62, RULE_bool_t = 63, RULE_nil_t = 64, RULE_r_id = 65, RULE_r_id_global = 66, 
		RULE_r_id_function = 67, RULE_terminator = 68, RULE_else_token = 69, RULE_crlf = 70;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expression_list", "expression", "global_get", "global_set", 
			"global_result", "function_inline_call", "require_block", "pir_inline", 
			"pir_expression_list", "function_definition", "function_definition_body", 
			"function_definition_header", "function_name", "function_definition_params", 
			"function_definition_params_list", "function_definition_param_r_id", 
			"return_statement", "function_call", "function_call_param_list", "function_call_params", 
			"function_param", "function_unnamed_param", "function_named_param", "function_call_assignment", 
			"all_result", "elsif_statement", "if_elsif_statement", "if_statement", 
			"unless_statement", "while_statement", "for_statement", "init_expression", 
			"all_assignment", "for_init_list", "cond_expression", "loop_expression", 
			"for_loop_list", "statement_body", "statement_expression_list", "assignment", 
			"dynamic_assignment", "int_assignment", "float_assignment", "string_assignment", 
			"array_assignment", "array_definition", "array_definition_elements", 
			"array_selector", "dynamic_result", "dynamic", "int_result", "float_result", 
			"string_result", "comparison_list", "comparison", "comp_var", "lvalue", 
			"rvalue", "break_expression", "literal_t", "float_t", "int_t", "bool_t", 
			"nil_t", "r_id", "r_id_global", "r_id_function", "terminator", "else_token", 
			"crlf"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "','", "';'", "'\n'", "'require'", "'end'", "'def'", "'return'", 
			"'pir'", "'if'", "'else'", "'elsif'", "'unless'", "'while'", "'retry'", 
			"'break'", "'for'", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'**'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'='", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'**='", "'&'", "'|'", "'^'", "'~'", 
			"'<<'", "'>>'", null, null, null, "'('", "')'", "'['", "']'", "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", "END", "DEF", 
			"RETURN", "PIR", "IF", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", 
			"FOR", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EXP", 
			"EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", 
			"ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", 
			"BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "LEFT_RBRACKET", "RIGHT_RBRACKET", 
			"LEFT_SBRACKET", "RIGHT_SBRACKET", "NIL", "SL_COMMENT", "ML_COMMENT", 
			"WS", "INT", "FLOAT", "R_ID", "R_ID_GLOBAL", "R_ID_FUNCTION"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Arcadia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArcadiaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			expression_list(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		return expression_list(0);
	}

	private Expression_listContext expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_listContext _localctx = new Expression_listContext(_ctx, _parentState);
		Expression_listContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case REQUIRE:
			case DEF:
			case RETURN:
			case PIR:
			case IF:
			case UNLESS:
			case WHILE:
			case FOR:
			case TRUE:
			case FALSE:
			case BIT_NOT:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case R_ID:
			case R_ID_GLOBAL:
			case R_ID_FUNCTION:
				{
				setState(145);
				expression();
				setState(146);
				terminator(0);
				}
				break;
			case SEMICOLON:
			case CRLF:
				{
				setState(148);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(151);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(152);
					expression();
					setState(153);
					terminator(0);
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Function_inline_callContext function_inline_call() {
			return getRuleContext(Function_inline_callContext.class,0);
		}
		public Require_blockContext require_block() {
			return getRuleContext(Require_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Unless_statementContext unless_statement() {
			return getRuleContext(Unless_statementContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Pir_inlineContext pir_inline() {
			return getRuleContext(Pir_inlineContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				function_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				function_inline_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				require_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				unless_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				rvalue(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				return_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(167);
				while_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(168);
				for_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(169);
				pir_inline();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_getContext extends ParserRuleContext {
		public LvalueContext var_name;
		public Token op;
		public R_id_globalContext global_name;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ArcadiaParser.ASSIGN, 0); }
		public R_id_globalContext r_id_global() {
			return getRuleContext(R_id_globalContext.class,0);
		}
		public Global_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterGlobal_get(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitGlobal_get(this);
		}
	}

	public final Global_getContext global_get() throws RecognitionException {
		Global_getContext _localctx = new Global_getContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_global_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((Global_getContext)_localctx).var_name = lvalue();
			setState(173);
			((Global_getContext)_localctx).op = match(ASSIGN);
			setState(174);
			((Global_getContext)_localctx).global_name = r_id_global();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_setContext extends ParserRuleContext {
		public R_id_globalContext global_name;
		public Token op;
		public All_resultContext result;
		public R_id_globalContext r_id_global() {
			return getRuleContext(R_id_globalContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ArcadiaParser.ASSIGN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Global_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterGlobal_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitGlobal_set(this);
		}
	}

	public final Global_setContext global_set() throws RecognitionException {
		Global_setContext _localctx = new Global_setContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_global_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((Global_setContext)_localctx).global_name = r_id_global();
			setState(177);
			((Global_setContext)_localctx).op = match(ASSIGN);
			setState(178);
			((Global_setContext)_localctx).result = all_result();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_resultContext extends ParserRuleContext {
		public R_id_globalContext r_id_global() {
			return getRuleContext(R_id_globalContext.class,0);
		}
		public Global_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterGlobal_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitGlobal_result(this);
		}
	}

	public final Global_resultContext global_result() throws RecognitionException {
		Global_resultContext _localctx = new Global_resultContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_global_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			r_id_global();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_inline_callContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_inline_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_inline_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFunction_inline_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFunction_inline_call(this);
		}
	}

	public final Function_inline_callContext function_inline_call() throws RecognitionException {
		Function_inline_callContext _localctx = new Function_inline_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_inline_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			function_call();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Require_blockContext extends ParserRuleContext {
		public TerminalNode REQUIRE() { return getToken(ArcadiaParser.REQUIRE, 0); }
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Require_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_require_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterRequire_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitRequire_block(this);
		}
	}

	public final Require_blockContext require_block() throws RecognitionException {
		Require_blockContext _localctx = new Require_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_require_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(REQUIRE);
			setState(185);
			literal_t();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pir_inlineContext extends ParserRuleContext {
		public TerminalNode PIR() { return getToken(ArcadiaParser.PIR, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Pir_expression_listContext pir_expression_list() {
			return getRuleContext(Pir_expression_listContext.class,0);
		}
		public TerminalNode END() { return getToken(ArcadiaParser.END, 0); }
		public Pir_inlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pir_inline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterPir_inline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitPir_inline(this);
		}
	}

	public final Pir_inlineContext pir_inline() throws RecognitionException {
		Pir_inlineContext _localctx = new Pir_inlineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pir_inline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(PIR);
			setState(188);
			crlf();
			setState(189);
			pir_expression_list();
			setState(190);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pir_expression_listContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Pir_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pir_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterPir_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitPir_expression_list(this);
		}
	}

	public final Pir_expression_listContext pir_expression_list() throws RecognitionException {
		Pir_expression_listContext _localctx = new Pir_expression_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pir_expression_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			expression_list(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public Function_definition_headerContext function_definition_header() {
			return getRuleContext(Function_definition_headerContext.class,0);
		}
		public Function_definition_bodyContext function_definition_body() {
			return getRuleContext(Function_definition_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(ArcadiaParser.END, 0); }
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			function_definition_header();
			setState(195);
			function_definition_body();
			setState(196);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definition_bodyContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Function_definition_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFunction_definition_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFunction_definition_body(this);
		}
	}

	public final Function_definition_bodyContext function_definition_body() throws RecognitionException {
		Function_definition_bodyContext _localctx = new Function_definition_bodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_definition_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			expression_list(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definition_headerContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(ArcadiaParser.DEF, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Function_definition_paramsContext function_definition_params() {
			return getRuleContext(Function_definition_paramsContext.class,0);
		}
		public Function_definition_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFunction_definition_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFunction_definition_header(this);
		}
	}

	public final Function_definition_headerContext function_definition_header() throws RecognitionException {
		Function_definition_headerContext _localctx = new Function_definition_headerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_definition_header);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(DEF);
				setState(201);
				function_name();
				setState(202);
				crlf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(DEF);
				setState(205);
				function_name();
				setState(206);
				function_definition_params();
				setState(207);
				crlf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public R_id_functionContext r_id_function() {
			return getRuleContext(R_id_functionContext.class,0);
		}
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_name);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_ID_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				r_id_function();
				}
				break;
			case R_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				r_id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definition_paramsContext extends ParserRuleContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(ArcadiaParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(ArcadiaParser.RIGHT_RBRACKET, 0); }
		public Function_definition_params_listContext function_definition_params_list() {
			return getRuleContext(Function_definition_params_listContext.class,0);
		}
		public Function_definition_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFunction_definition_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFunction_definition_params(this);
		}
	}

	public final Function_definition_paramsContext function_definition_params() throws RecognitionException {
		Function_definition_paramsContext _localctx = new Function_definition_paramsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_definition_params);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(LEFT_RBRACKET);
				setState(216);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(LEFT_RBRACKET);
				setState(218);
				function_definition_params_list(0);
				setState(219);
				match(RIGHT_RBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				function_definition_params_list(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definition_params_listContext extends ParserRuleContext {
		public Function_definition_param_r_idContext function_definition_param_r_id() {
			return getRuleContext(Function_definition_param_r_idContext.class,0);
		}
		public Function_definition_params_listContext function_definition_params_list() {
			return getRuleContext(Function_definition_params_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ArcadiaParser.COMMA, 0); }
		public Function_definition_params_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFunction_definition_params_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFunction_definition_params_list(this);
		}
	}

	public final Function_definition_params_listContext function_definition_params_list() throws RecognitionException {
		return function_definition_params_list(0);
	}

	private Function_definition_params_listContext function_definition_params_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_definition_params_listContext _localctx = new Function_definition_params_listContext(_ctx, _parentState);
		Function_definition_params_listContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_function_definition_params_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(225);
			function_definition_param_r_id();
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_definition_params_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_definition_params_list);
					setState(227);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(228);
					match(COMMA);
					setState(229);
					function_definition_param_r_id();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_definition_param_r_idContext extends ParserRuleContext {
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public Function_definition_param_r_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_param_r_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFunction_definition_param_r_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFunction_definition_param_r_id(this);
		}
	}

	public final Function_definition_param_r_idContext function_definition_param_r_id() throws RecognitionException {
		Function_definition_param_r_idContext _localctx = new Function_definition_param_r_idContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_definition_param_r_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			r_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ArcadiaParser.RETURN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(RETURN);
			setState(238);
			all_result();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public Function_nameContext name;
		public Function_call_param_listContext params;
		public TerminalNode LEFT_RBRACKET() { return getToken(ArcadiaParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(ArcadiaParser.RIGHT_RBRACKET, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_call_param_listContext function_call_param_list() {
			return getRuleContext(Function_call_param_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_call);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				((Function_callContext)_localctx).name = function_name();
				setState(241);
				match(LEFT_RBRACKET);
				setState(242);
				((Function_callContext)_localctx).params = function_call_param_list();
				setState(243);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				((Function_callContext)_localctx).name = function_name();
				setState(246);
				((Function_callContext)_localctx).params = function_call_param_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				((Function_callContext)_localctx).name = function_name();
				setState(249);
				match(LEFT_RBRACKET);
				setState(250);
				match(RIGHT_RBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_param_listContext extends ParserRuleContext {
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public Function_call_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFunction_call_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFunction_call_param_list(this);
		}
	}

	public final Function_call_param_listContext function_call_param_list() throws RecognitionException {
		Function_call_param_listContext _localctx = new Function_call_param_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_call_param_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			function_call_params(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_paramsContext extends ParserRuleContext {
		public Function_paramContext function_param() {
			return getRuleContext(Function_paramContext.class,0);
		}
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ArcadiaParser.COMMA, 0); }
		public Function_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFunction_call_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFunction_call_params(this);
		}
	}

	public final Function_call_paramsContext function_call_params() throws RecognitionException {
		return function_call_params(0);
	}

	private Function_call_paramsContext function_call_params(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_call_paramsContext _localctx = new Function_call_paramsContext(_ctx, _parentState);
		Function_call_paramsContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_function_call_params, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(257);
			function_param();
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_call_paramsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_call_params);
					setState(259);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(260);
					match(COMMA);
					setState(261);
					function_param();
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_paramContext extends ParserRuleContext {
		public Function_unnamed_paramContext function_unnamed_param() {
			return getRuleContext(Function_unnamed_paramContext.class,0);
		}
		public Function_named_paramContext function_named_param() {
			return getRuleContext(Function_named_paramContext.class,0);
		}
		public Function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFunction_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFunction_param(this);
		}
	}

	public final Function_paramContext function_param() throws RecognitionException {
		Function_paramContext _localctx = new Function_paramContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(267);
				function_unnamed_param();
				}
				break;
			case 2:
				{
				setState(268);
				function_named_param();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_unnamed_paramContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Function_unnamed_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_unnamed_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFunction_unnamed_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFunction_unnamed_param(this);
		}
	}

	public final Function_unnamed_paramContext function_unnamed_param() throws RecognitionException {
		Function_unnamed_paramContext _localctx = new Function_unnamed_paramContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_unnamed_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(271);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(272);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(273);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(274);
				dynamic_result(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_named_paramContext extends ParserRuleContext {
		public Token op;
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ArcadiaParser.ASSIGN, 0); }
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Function_named_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_named_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFunction_named_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFunction_named_param(this);
		}
	}

	public final Function_named_paramContext function_named_param() throws RecognitionException {
		Function_named_paramContext _localctx = new Function_named_paramContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_named_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			r_id();
			setState(278);
			((Function_named_paramContext)_localctx).op = match(ASSIGN);
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(279);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(280);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(281);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(282);
				dynamic_result(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_assignmentContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_call_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFunction_call_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFunction_call_assignment(this);
		}
	}

	public final Function_call_assignmentContext function_call_assignment() throws RecognitionException {
		Function_call_assignmentContext _localctx = new Function_call_assignmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_call_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			function_call();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_resultContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Global_resultContext global_result() {
			return getRuleContext(Global_resultContext.class,0);
		}
		public All_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterAll_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitAll_result(this);
		}
	}

	public final All_resultContext all_result() throws RecognitionException {
		All_resultContext _localctx = new All_resultContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_all_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(287);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(288);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(289);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(290);
				dynamic_result(0);
				}
				break;
			case 5:
				{
				setState(291);
				global_result();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elsif_statementContext extends ParserRuleContext {
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public Elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterElsif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitElsif_statement(this);
		}
	}

	public final Elsif_statementContext elsif_statement() throws RecognitionException {
		Elsif_statementContext _localctx = new Elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_elsif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			if_elsif_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_elsif_statementContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(ArcadiaParser.ELSIF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public If_elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_elsif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterIf_elsif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitIf_elsif_statement(this);
		}
	}

	public final If_elsif_statementContext if_elsif_statement() throws RecognitionException {
		If_elsif_statementContext _localctx = new If_elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_if_elsif_statement);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(ELSIF);
				setState(297);
				cond_expression();
				setState(298);
				crlf();
				setState(299);
				statement_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(ELSIF);
				setState(302);
				cond_expression();
				setState(303);
				crlf();
				setState(304);
				statement_body();
				setState(305);
				else_token();
				setState(306);
				crlf();
				setState(307);
				statement_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(ELSIF);
				setState(310);
				cond_expression();
				setState(311);
				crlf();
				setState(312);
				statement_body();
				setState(313);
				if_elsif_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ArcadiaParser.IF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(ArcadiaParser.END, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Elsif_statementContext elsif_statement() {
			return getRuleContext(Elsif_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_if_statement);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(IF);
				setState(318);
				cond_expression();
				setState(319);
				crlf();
				setState(320);
				statement_body();
				setState(321);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(IF);
				setState(324);
				cond_expression();
				setState(325);
				crlf();
				setState(326);
				statement_body();
				setState(327);
				else_token();
				setState(328);
				crlf();
				setState(329);
				statement_body();
				setState(330);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(IF);
				setState(333);
				cond_expression();
				setState(334);
				crlf();
				setState(335);
				statement_body();
				setState(336);
				elsif_statement();
				setState(337);
				match(END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unless_statementContext extends ParserRuleContext {
		public TerminalNode UNLESS() { return getToken(ArcadiaParser.UNLESS, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(ArcadiaParser.END, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Elsif_statementContext elsif_statement() {
			return getRuleContext(Elsif_statementContext.class,0);
		}
		public Unless_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unless_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterUnless_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitUnless_statement(this);
		}
	}

	public final Unless_statementContext unless_statement() throws RecognitionException {
		Unless_statementContext _localctx = new Unless_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unless_statement);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(UNLESS);
				setState(342);
				cond_expression();
				setState(343);
				crlf();
				setState(344);
				statement_body();
				setState(345);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(UNLESS);
				setState(348);
				cond_expression();
				setState(349);
				crlf();
				setState(350);
				statement_body();
				setState(351);
				else_token();
				setState(352);
				crlf();
				setState(353);
				statement_body();
				setState(354);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				match(UNLESS);
				setState(357);
				cond_expression();
				setState(358);
				crlf();
				setState(359);
				statement_body();
				setState(360);
				elsif_statement();
				setState(361);
				match(END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ArcadiaParser.WHILE, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(ArcadiaParser.END, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(WHILE);
			setState(366);
			cond_expression();
			setState(367);
			crlf();
			setState(368);
			statement_body();
			setState(369);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ArcadiaParser.FOR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(ArcadiaParser.LEFT_RBRACKET, 0); }
		public Init_expressionContext init_expression() {
			return getRuleContext(Init_expressionContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ArcadiaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ArcadiaParser.SEMICOLON, i);
		}
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public Loop_expressionContext loop_expression() {
			return getRuleContext(Loop_expressionContext.class,0);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(ArcadiaParser.RIGHT_RBRACKET, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(ArcadiaParser.END, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_for_statement);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(FOR);
				setState(372);
				match(LEFT_RBRACKET);
				setState(373);
				init_expression();
				setState(374);
				match(SEMICOLON);
				setState(375);
				cond_expression();
				setState(376);
				match(SEMICOLON);
				setState(377);
				loop_expression();
				setState(378);
				match(RIGHT_RBRACKET);
				setState(379);
				crlf();
				setState(380);
				statement_body();
				setState(381);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(FOR);
				setState(384);
				init_expression();
				setState(385);
				match(SEMICOLON);
				setState(386);
				cond_expression();
				setState(387);
				match(SEMICOLON);
				setState(388);
				loop_expression();
				setState(389);
				crlf();
				setState(390);
				statement_body();
				setState(391);
				match(END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_expressionContext extends ParserRuleContext {
		public For_init_listContext for_init_list() {
			return getRuleContext(For_init_listContext.class,0);
		}
		public Init_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterInit_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitInit_expression(this);
		}
	}

	public final Init_expressionContext init_expression() throws RecognitionException {
		Init_expressionContext _localctx = new Init_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_init_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			for_init_list(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_assignmentContext extends ParserRuleContext {
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public Float_assignmentContext float_assignment() {
			return getRuleContext(Float_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Dynamic_assignmentContext dynamic_assignment() {
			return getRuleContext(Dynamic_assignmentContext.class,0);
		}
		public All_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterAll_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitAll_assignment(this);
		}
	}

	public final All_assignmentContext all_assignment() throws RecognitionException {
		All_assignmentContext _localctx = new All_assignmentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_all_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(397);
				int_assignment();
				}
				break;
			case 2:
				{
				setState(398);
				float_assignment();
				}
				break;
			case 3:
				{
				setState(399);
				string_assignment();
				}
				break;
			case 4:
				{
				setState(400);
				dynamic_assignment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_init_listContext extends ParserRuleContext {
		public All_assignmentContext all_assignment() {
			return getRuleContext(All_assignmentContext.class,0);
		}
		public For_init_listContext for_init_list() {
			return getRuleContext(For_init_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ArcadiaParser.COMMA, 0); }
		public For_init_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFor_init_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFor_init_list(this);
		}
	}

	public final For_init_listContext for_init_list() throws RecognitionException {
		return for_init_list(0);
	}

	private For_init_listContext for_init_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		For_init_listContext _localctx = new For_init_listContext(_ctx, _parentState);
		For_init_listContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_for_init_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(404);
			all_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new For_init_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_for_init_list);
					setState(406);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(407);
					match(COMMA);
					setState(408);
					all_assignment();
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Cond_expressionContext extends ParserRuleContext {
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public Cond_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterCond_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitCond_expression(this);
		}
	}

	public final Cond_expressionContext cond_expression() throws RecognitionException {
		Cond_expressionContext _localctx = new Cond_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cond_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			comparison_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_expressionContext extends ParserRuleContext {
		public For_loop_listContext for_loop_list() {
			return getRuleContext(For_loop_listContext.class,0);
		}
		public Loop_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterLoop_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitLoop_expression(this);
		}
	}

	public final Loop_expressionContext loop_expression() throws RecognitionException {
		Loop_expressionContext _localctx = new Loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			for_loop_list(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loop_listContext extends ParserRuleContext {
		public All_assignmentContext all_assignment() {
			return getRuleContext(All_assignmentContext.class,0);
		}
		public For_loop_listContext for_loop_list() {
			return getRuleContext(For_loop_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ArcadiaParser.COMMA, 0); }
		public For_loop_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFor_loop_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFor_loop_list(this);
		}
	}

	public final For_loop_listContext for_loop_list() throws RecognitionException {
		return for_loop_list(0);
	}

	private For_loop_listContext for_loop_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		For_loop_listContext _localctx = new For_loop_listContext(_ctx, _parentState);
		For_loop_listContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_for_loop_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(419);
			all_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new For_loop_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_for_loop_list);
					setState(421);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(422);
					match(COMMA);
					setState(423);
					all_assignment();
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Statement_bodyContext extends ParserRuleContext {
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Statement_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterStatement_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitStatement_body(this);
		}
	}

	public final Statement_bodyContext statement_body() throws RecognitionException {
		Statement_bodyContext _localctx = new Statement_bodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_statement_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			statement_expression_list(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode RETRY() { return getToken(ArcadiaParser.RETRY, 0); }
		public Break_expressionContext break_expression() {
			return getRuleContext(Break_expressionContext.class,0);
		}
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Statement_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterStatement_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitStatement_expression_list(this);
		}
	}

	public final Statement_expression_listContext statement_expression_list() throws RecognitionException {
		return statement_expression_list(0);
	}

	private Statement_expression_listContext statement_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_expression_listContext _localctx = new Statement_expression_listContext(_ctx, _parentState);
		Statement_expression_listContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_statement_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case REQUIRE:
			case DEF:
			case RETURN:
			case PIR:
			case IF:
			case UNLESS:
			case WHILE:
			case FOR:
			case TRUE:
			case FALSE:
			case BIT_NOT:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case R_ID:
			case R_ID_GLOBAL:
			case R_ID_FUNCTION:
				{
				setState(432);
				expression();
				setState(433);
				terminator(0);
				}
				break;
			case RETRY:
				{
				setState(435);
				match(RETRY);
				setState(436);
				terminator(0);
				}
				break;
			case BREAK:
				{
				setState(437);
				break_expression();
				setState(438);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(453);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(442);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(443);
						expression();
						setState(444);
						terminator(0);
						}
						break;
					case 2:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(446);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(447);
						match(RETRY);
						setState(448);
						terminator(0);
						}
						break;
					case 3:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(449);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(450);
						break_expression();
						setState(451);
						terminator(0);
						}
						break;
					}
					} 
				}
				setState(457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext var_r_id;
		public Token op;
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ArcadiaParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(ArcadiaParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(ArcadiaParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(ArcadiaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(ArcadiaParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(ArcadiaParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(ArcadiaParser.EXP_ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_assignment);
		int _la;
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				((AssignmentContext)_localctx).var_r_id = lvalue();
				setState(459);
				((AssignmentContext)_localctx).op = match(ASSIGN);
				setState(460);
				rvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				((AssignmentContext)_localctx).var_r_id = lvalue();
				setState(463);
				((AssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((AssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(464);
				rvalue(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dynamic_assignmentContext extends ParserRuleContext {
		public LvalueContext var_r_id;
		public Token op;
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ArcadiaParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(ArcadiaParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(ArcadiaParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(ArcadiaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(ArcadiaParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(ArcadiaParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(ArcadiaParser.EXP_ASSIGN, 0); }
		public Dynamic_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterDynamic_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitDynamic_assignment(this);
		}
	}

	public final Dynamic_assignmentContext dynamic_assignment() throws RecognitionException {
		Dynamic_assignmentContext _localctx = new Dynamic_assignmentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dynamic_assignment);
		int _la;
		try {
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				((Dynamic_assignmentContext)_localctx).var_r_id = lvalue();
				setState(469);
				((Dynamic_assignmentContext)_localctx).op = match(ASSIGN);
				setState(470);
				dynamic_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				((Dynamic_assignmentContext)_localctx).var_r_id = lvalue();
				setState(473);
				((Dynamic_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Dynamic_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(474);
				dynamic_result(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_assignmentContext extends ParserRuleContext {
		public LvalueContext var_r_id;
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ArcadiaParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(ArcadiaParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(ArcadiaParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(ArcadiaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(ArcadiaParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(ArcadiaParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(ArcadiaParser.EXP_ASSIGN, 0); }
		public Int_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterInt_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitInt_assignment(this);
		}
	}

	public final Int_assignmentContext int_assignment() throws RecognitionException {
		Int_assignmentContext _localctx = new Int_assignmentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_int_assignment);
		int _la;
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				((Int_assignmentContext)_localctx).var_r_id = lvalue();
				setState(479);
				((Int_assignmentContext)_localctx).op = match(ASSIGN);
				setState(480);
				int_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				((Int_assignmentContext)_localctx).var_r_id = lvalue();
				setState(483);
				((Int_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Int_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(484);
				int_result(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_assignmentContext extends ParserRuleContext {
		public LvalueContext var_r_id;
		public Token op;
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ArcadiaParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(ArcadiaParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(ArcadiaParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(ArcadiaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(ArcadiaParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(ArcadiaParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(ArcadiaParser.EXP_ASSIGN, 0); }
		public Float_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFloat_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFloat_assignment(this);
		}
	}

	public final Float_assignmentContext float_assignment() throws RecognitionException {
		Float_assignmentContext _localctx = new Float_assignmentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_float_assignment);
		int _la;
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				((Float_assignmentContext)_localctx).var_r_id = lvalue();
				setState(489);
				((Float_assignmentContext)_localctx).op = match(ASSIGN);
				setState(490);
				float_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				((Float_assignmentContext)_localctx).var_r_id = lvalue();
				setState(493);
				((Float_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Float_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(494);
				float_result(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_assignmentContext extends ParserRuleContext {
		public LvalueContext var_r_id;
		public Token op;
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ArcadiaParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(ArcadiaParser.PLUS_ASSIGN, 0); }
		public String_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterString_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitString_assignment(this);
		}
	}

	public final String_assignmentContext string_assignment() throws RecognitionException {
		String_assignmentContext _localctx = new String_assignmentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_string_assignment);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				((String_assignmentContext)_localctx).var_r_id = lvalue();
				setState(499);
				((String_assignmentContext)_localctx).op = match(ASSIGN);
				setState(500);
				string_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				((String_assignmentContext)_localctx).var_r_id = lvalue();
				setState(503);
				((String_assignmentContext)_localctx).op = match(PLUS_ASSIGN);
				setState(504);
				string_result(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Array_definitionContext arr_val;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ArcadiaParser.ASSIGN, 0); }
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public Array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterArray_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitArray_assignment(this);
		}
	}

	public final Array_assignmentContext array_assignment() throws RecognitionException {
		Array_assignmentContext _localctx = new Array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			((Array_assignmentContext)_localctx).var_id = lvalue();
			setState(509);
			((Array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(510);
			((Array_assignmentContext)_localctx).arr_val = array_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_definitionContext extends ParserRuleContext {
		public TerminalNode LEFT_SBRACKET() { return getToken(ArcadiaParser.LEFT_SBRACKET, 0); }
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode RIGHT_SBRACKET() { return getToken(ArcadiaParser.RIGHT_SBRACKET, 0); }
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterArray_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitArray_definition(this);
		}
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_array_definition);
		try {
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(LEFT_SBRACKET);
				setState(513);
				array_definition_elements(0);
				setState(514);
				match(RIGHT_SBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(LEFT_SBRACKET);
				setState(517);
				match(RIGHT_SBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_definition_elementsContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ArcadiaParser.COMMA, 0); }
		public Array_definition_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterArray_definition_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitArray_definition_elements(this);
		}
	}

	public final Array_definition_elementsContext array_definition_elements() throws RecognitionException {
		return array_definition_elements(0);
	}

	private Array_definition_elementsContext array_definition_elements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Array_definition_elementsContext _localctx = new Array_definition_elementsContext(_ctx, _parentState);
		Array_definition_elementsContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_array_definition_elements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(521);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(522);
				dynamic_result(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Array_definition_elementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_array_definition_elements);
					setState(525);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(526);
					match(COMMA);
					setState(529);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(527);
						int_result(0);
						}
						break;
					case 2:
						{
						setState(528);
						dynamic_result(0);
						}
						break;
					}
					}
					} 
				}
				setState(535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Array_selectorContext extends ParserRuleContext {
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public TerminalNode LEFT_SBRACKET() { return getToken(ArcadiaParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(ArcadiaParser.RIGHT_SBRACKET, 0); }
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public R_id_globalContext r_id_global() {
			return getRuleContext(R_id_globalContext.class,0);
		}
		public Array_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterArray_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitArray_selector(this);
		}
	}

	public final Array_selectorContext array_selector() throws RecognitionException {
		Array_selectorContext _localctx = new Array_selectorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_array_selector);
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				r_id();
				setState(537);
				match(LEFT_SBRACKET);
				setState(540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(538);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(539);
					dynamic_result(0);
					}
					break;
				}
				setState(542);
				match(RIGHT_SBRACKET);
				}
				break;
			case R_ID_GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				r_id_global();
				setState(545);
				match(LEFT_SBRACKET);
				setState(548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(546);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(547);
					dynamic_result(0);
					}
					break;
				}
				setState(550);
				match(RIGHT_SBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dynamic_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Dynamic_resultContext> dynamic_result() {
			return getRuleContexts(Dynamic_resultContext.class);
		}
		public Dynamic_resultContext dynamic_result(int i) {
			return getRuleContext(Dynamic_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ArcadiaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ArcadiaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ArcadiaParser.MOD, 0); }
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ArcadiaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ArcadiaParser.MINUS, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(ArcadiaParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(ArcadiaParser.RIGHT_RBRACKET, 0); }
		public DynamicContext dynamic() {
			return getRuleContext(DynamicContext.class,0);
		}
		public Dynamic_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterDynamic_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitDynamic_result(this);
		}
	}

	public final Dynamic_resultContext dynamic_result() throws RecognitionException {
		return dynamic_result(0);
	}

	private Dynamic_resultContext dynamic_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dynamic_resultContext _localctx = new Dynamic_resultContext(_ctx, _parentState);
		Dynamic_resultContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_dynamic_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(555);
				int_result(0);
				setState(556);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(557);
				dynamic_result(13);
				}
				break;
			case 2:
				{
				setState(559);
				float_result(0);
				setState(560);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(561);
				dynamic_result(11);
				}
				break;
			case 3:
				{
				setState(563);
				string_result(0);
				setState(564);
				((Dynamic_resultContext)_localctx).op = match(MUL);
				setState(565);
				dynamic_result(8);
				}
				break;
			case 4:
				{
				setState(567);
				int_result(0);
				setState(568);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(569);
				dynamic_result(6);
				}
				break;
			case 5:
				{
				setState(571);
				float_result(0);
				setState(572);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(573);
				dynamic_result(4);
				}
				break;
			case 6:
				{
				setState(575);
				match(LEFT_RBRACKET);
				setState(576);
				dynamic_result(0);
				setState(577);
				match(RIGHT_RBRACKET);
				}
				break;
			case 7:
				{
				setState(579);
				dynamic();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(605);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(603);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(582);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(583);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(584);
						dynamic_result(11);
						}
						break;
					case 2:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(585);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(586);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(587);
						dynamic_result(4);
						}
						break;
					case 3:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(588);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(589);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(590);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(591);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(592);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(593);
						float_result(0);
						}
						break;
					case 5:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(594);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(595);
						((Dynamic_resultContext)_localctx).op = match(MUL);
						setState(596);
						string_result(0);
						}
						break;
					case 6:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(597);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(598);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(599);
						int_result(0);
						}
						break;
					case 7:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(600);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(601);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(602);
						float_result(0);
						}
						break;
					}
					} 
				}
				setState(607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DynamicContext extends ParserRuleContext {
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public Function_call_assignmentContext function_call_assignment() {
			return getRuleContext(Function_call_assignmentContext.class,0);
		}
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public DynamicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterDynamic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitDynamic(this);
		}
	}

	public final DynamicContext dynamic() throws RecognitionException {
		DynamicContext _localctx = new DynamicContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_dynamic);
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				r_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				function_call_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(610);
				array_selector();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_resultContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LEFT_RBRACKET() { return getToken(ArcadiaParser.LEFT_RBRACKET, 0); }
		public List<Int_resultContext> int_result() {
			return getRuleContexts(Int_resultContext.class);
		}
		public Int_resultContext int_result(int i) {
			return getRuleContext(Int_resultContext.class,i);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(ArcadiaParser.RIGHT_RBRACKET, 0); }
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public TerminalNode MUL() { return getToken(ArcadiaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ArcadiaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ArcadiaParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(ArcadiaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ArcadiaParser.MINUS, 0); }
		public Int_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterInt_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitInt_result(this);
		}
	}

	public final Int_resultContext int_result() throws RecognitionException {
		return int_result(0);
	}

	private Int_resultContext int_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Int_resultContext _localctx = new Int_resultContext(_ctx, _parentState);
		Int_resultContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_int_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
				{
				setState(614);
				match(LEFT_RBRACKET);
				setState(615);
				int_result(0);
				setState(616);
				match(RIGHT_RBRACKET);
				}
				break;
			case INT:
				{
				setState(618);
				int_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(629);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(627);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(621);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(622);
						((Int_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Int_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(623);
						int_result(5);
						}
						break;
					case 2:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(624);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(625);
						((Int_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Int_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(626);
						int_result(4);
						}
						break;
					}
					} 
				}
				setState(631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Float_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Float_resultContext> float_result() {
			return getRuleContexts(Float_resultContext.class);
		}
		public Float_resultContext float_result(int i) {
			return getRuleContext(Float_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ArcadiaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ArcadiaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ArcadiaParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(ArcadiaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ArcadiaParser.MINUS, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(ArcadiaParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(ArcadiaParser.RIGHT_RBRACKET, 0); }
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Float_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFloat_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFloat_result(this);
		}
	}

	public final Float_resultContext float_result() throws RecognitionException {
		return float_result(0);
	}

	private Float_resultContext float_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Float_resultContext _localctx = new Float_resultContext(_ctx, _parentState);
		Float_resultContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_float_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(633);
				int_result(0);
				setState(634);
				((Float_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(635);
				float_result(7);
				}
				break;
			case 2:
				{
				setState(637);
				int_result(0);
				setState(638);
				((Float_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(639);
				float_result(4);
				}
				break;
			case 3:
				{
				setState(641);
				match(LEFT_RBRACKET);
				setState(642);
				float_result(0);
				setState(643);
				match(RIGHT_RBRACKET);
				}
				break;
			case 4:
				{
				setState(645);
				float_t();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(660);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(648);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(649);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(650);
						float_result(9);
						}
						break;
					case 2:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(651);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(652);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(653);
						float_result(6);
						}
						break;
					case 3:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(654);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(655);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(656);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(657);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(658);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(659);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class String_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<String_resultContext> string_result() {
			return getRuleContexts(String_resultContext.class);
		}
		public String_resultContext string_result(int i) {
			return getRuleContext(String_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ArcadiaParser.MUL, 0); }
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ArcadiaParser.PLUS, 0); }
		public String_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterString_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitString_result(this);
		}
	}

	public final String_resultContext string_result() throws RecognitionException {
		return string_result(0);
	}

	private String_resultContext string_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_resultContext _localctx = new String_resultContext(_ctx, _parentState);
		String_resultContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_string_result, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
			case INT:
				{
				setState(666);
				int_result(0);
				setState(667);
				((String_resultContext)_localctx).op = match(MUL);
				setState(668);
				string_result(3);
				}
				break;
			case LITERAL:
				{
				setState(670);
				literal_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(681);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(679);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(673);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(674);
						((String_resultContext)_localctx).op = match(PLUS);
						setState(675);
						string_result(3);
						}
						break;
					case 2:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(676);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(677);
						((String_resultContext)_localctx).op = match(MUL);
						setState(678);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(683);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Comparison_listContext extends ParserRuleContext {
		public ComparisonContext left;
		public Token op;
		public Comparison_listContext right;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode BIT_AND() { return getToken(ArcadiaParser.BIT_AND, 0); }
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(ArcadiaParser.AND, 0); }
		public TerminalNode BIT_OR() { return getToken(ArcadiaParser.BIT_OR, 0); }
		public TerminalNode OR() { return getToken(ArcadiaParser.OR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(ArcadiaParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(ArcadiaParser.RIGHT_RBRACKET, 0); }
		public Comparison_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterComparison_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitComparison_list(this);
		}
	}

	public final Comparison_listContext comparison_list() throws RecognitionException {
		Comparison_listContext _localctx = new Comparison_listContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_comparison_list);
		try {
			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				((Comparison_listContext)_localctx).left = comparison();
				setState(685);
				((Comparison_listContext)_localctx).op = match(BIT_AND);
				setState(686);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				((Comparison_listContext)_localctx).left = comparison();
				setState(689);
				((Comparison_listContext)_localctx).op = match(AND);
				setState(690);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(692);
				((Comparison_listContext)_localctx).left = comparison();
				setState(693);
				((Comparison_listContext)_localctx).op = match(BIT_OR);
				setState(694);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(696);
				((Comparison_listContext)_localctx).left = comparison();
				setState(697);
				((Comparison_listContext)_localctx).op = match(OR);
				setState(698);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(700);
				match(LEFT_RBRACKET);
				setState(701);
				comparison_list();
				setState(702);
				match(RIGHT_RBRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(704);
				comparison();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public Comp_varContext left;
		public Token op;
		public Comp_varContext right;
		public List<Comp_varContext> comp_var() {
			return getRuleContexts(Comp_varContext.class);
		}
		public Comp_varContext comp_var(int i) {
			return getRuleContext(Comp_varContext.class,i);
		}
		public TerminalNode LESS() { return getToken(ArcadiaParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(ArcadiaParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(ArcadiaParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(ArcadiaParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(ArcadiaParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(ArcadiaParser.NOT_EQUAL, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_comparison);
		int _la;
		try {
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				((ComparisonContext)_localctx).left = comp_var();
				setState(708);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(709);
				((ComparisonContext)_localctx).right = comp_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				((ComparisonContext)_localctx).left = comp_var();
				setState(712);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(713);
				((ComparisonContext)_localctx).right = comp_var();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_varContext extends ParserRuleContext {
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public Comp_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterComp_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitComp_var(this);
		}
	}

	public final Comp_varContext comp_var() throws RecognitionException {
		Comp_varContext _localctx = new Comp_varContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_comp_var);
		try {
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				all_result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				array_selector();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(719);
				r_id();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LvalueContext extends ParserRuleContext {
		public R_idContext r_id() {
			return getRuleContext(R_idContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			r_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RvalueContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Array_assignmentContext array_assignment() {
			return getRuleContext(Array_assignmentContext.class,0);
		}
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Global_setContext global_set() {
			return getRuleContext(Global_setContext.class,0);
		}
		public Global_getContext global_get() {
			return getRuleContext(Global_getContext.class,0);
		}
		public Dynamic_assignmentContext dynamic_assignment() {
			return getRuleContext(Dynamic_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Float_assignmentContext float_assignment() {
			return getRuleContext(Float_assignmentContext.class,0);
		}
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Bool_tContext bool_t() {
			return getRuleContext(Bool_tContext.class,0);
		}
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public Nil_tContext nil_t() {
			return getRuleContext(Nil_tContext.class,0);
		}
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public TerminalNode NOT() { return getToken(ArcadiaParser.NOT, 0); }
		public TerminalNode BIT_NOT() { return getToken(ArcadiaParser.BIT_NOT, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(ArcadiaParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(ArcadiaParser.RIGHT_RBRACKET, 0); }
		public TerminalNode EXP() { return getToken(ArcadiaParser.EXP, 0); }
		public TerminalNode MUL() { return getToken(ArcadiaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ArcadiaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ArcadiaParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(ArcadiaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ArcadiaParser.MINUS, 0); }
		public TerminalNode BIT_SHL() { return getToken(ArcadiaParser.BIT_SHL, 0); }
		public TerminalNode BIT_SHR() { return getToken(ArcadiaParser.BIT_SHR, 0); }
		public TerminalNode BIT_AND() { return getToken(ArcadiaParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(ArcadiaParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(ArcadiaParser.BIT_XOR, 0); }
		public TerminalNode LESS() { return getToken(ArcadiaParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(ArcadiaParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(ArcadiaParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(ArcadiaParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(ArcadiaParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(ArcadiaParser.NOT_EQUAL, 0); }
		public TerminalNode OR() { return getToken(ArcadiaParser.OR, 0); }
		public TerminalNode AND() { return getToken(ArcadiaParser.AND, 0); }
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterRvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitRvalue(this);
		}
	}

	public final RvalueContext rvalue() throws RecognitionException {
		return rvalue(0);
	}

	private RvalueContext rvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RvalueContext _localctx = new RvalueContext(_ctx, _parentState);
		RvalueContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_rvalue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(725);
				lvalue();
				}
				break;
			case 2:
				{
				setState(726);
				array_assignment();
				}
				break;
			case 3:
				{
				setState(727);
				int_result(0);
				}
				break;
			case 4:
				{
				setState(728);
				float_result(0);
				}
				break;
			case 5:
				{
				setState(729);
				string_result(0);
				}
				break;
			case 6:
				{
				setState(730);
				global_set();
				}
				break;
			case 7:
				{
				setState(731);
				global_get();
				}
				break;
			case 8:
				{
				setState(732);
				dynamic_assignment();
				}
				break;
			case 9:
				{
				setState(733);
				string_assignment();
				}
				break;
			case 10:
				{
				setState(734);
				float_assignment();
				}
				break;
			case 11:
				{
				setState(735);
				int_assignment();
				}
				break;
			case 12:
				{
				setState(736);
				assignment();
				}
				break;
			case 13:
				{
				setState(737);
				function_call();
				}
				break;
			case 14:
				{
				setState(738);
				literal_t();
				}
				break;
			case 15:
				{
				setState(739);
				bool_t();
				}
				break;
			case 16:
				{
				setState(740);
				float_t();
				}
				break;
			case 17:
				{
				setState(741);
				int_t();
				}
				break;
			case 18:
				{
				setState(742);
				nil_t();
				}
				break;
			case 19:
				{
				setState(743);
				_la = _input.LA(1);
				if ( !(_la==BIT_NOT || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(744);
				rvalue(10);
				}
				break;
			case 20:
				{
				setState(745);
				match(LEFT_RBRACKET);
				setState(746);
				rvalue(0);
				setState(747);
				match(RIGHT_RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(778);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(751);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(752);
						match(EXP);
						setState(753);
						rvalue(12);
						}
						break;
					case 2:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(754);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(755);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(756);
						rvalue(10);
						}
						break;
					case 3:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(757);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(758);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(759);
						rvalue(9);
						}
						break;
					case 4:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(760);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(761);
						_la = _input.LA(1);
						if ( !(_la==BIT_SHL || _la==BIT_SHR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(762);
						rvalue(8);
						}
						break;
					case 5:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(763);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(764);
						match(BIT_AND);
						setState(765);
						rvalue(7);
						}
						break;
					case 6:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(766);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(767);
						_la = _input.LA(1);
						if ( !(_la==BIT_OR || _la==BIT_XOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(768);
						rvalue(6);
						}
						break;
					case 7:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(769);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(770);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(771);
						rvalue(5);
						}
						break;
					case 8:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(772);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(773);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(774);
						rvalue(4);
						}
						break;
					case 9:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(775);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(776);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(777);
						rvalue(3);
						}
						break;
					}
					} 
				}
				setState(782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Break_expressionContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(ArcadiaParser.BREAK, 0); }
		public Break_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterBreak_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitBreak_expression(this);
		}
	}

	public final Break_expressionContext break_expression() throws RecognitionException {
		Break_expressionContext _localctx = new Break_expressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_break_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_tContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(ArcadiaParser.LITERAL, 0); }
		public Literal_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterLiteral_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitLiteral_t(this);
		}
	}

	public final Literal_tContext literal_t() throws RecognitionException {
		Literal_tContext _localctx = new Literal_tContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_literal_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_tContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ArcadiaParser.FLOAT, 0); }
		public Float_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterFloat_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitFloat_t(this);
		}
	}

	public final Float_tContext float_t() throws RecognitionException {
		Float_tContext _localctx = new Float_tContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_float_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_tContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ArcadiaParser.INT, 0); }
		public Int_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterInt_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitInt_t(this);
		}
	}

	public final Int_tContext int_t() throws RecognitionException {
		Int_tContext _localctx = new Int_tContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_int_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_tContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ArcadiaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ArcadiaParser.FALSE, 0); }
		public Bool_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterBool_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitBool_t(this);
		}
	}

	public final Bool_tContext bool_t() throws RecognitionException {
		Bool_tContext _localctx = new Bool_tContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_bool_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nil_tContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(ArcadiaParser.NIL, 0); }
		public Nil_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterNil_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitNil_t(this);
		}
	}

	public final Nil_tContext nil_t() throws RecognitionException {
		Nil_tContext _localctx = new Nil_tContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_nil_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(NIL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class R_idContext extends ParserRuleContext {
		public TerminalNode R_ID() { return getToken(ArcadiaParser.R_ID, 0); }
		public R_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterR_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitR_id(this);
		}
	}

	public final R_idContext r_id() throws RecognitionException {
		R_idContext _localctx = new R_idContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_r_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(R_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class R_id_globalContext extends ParserRuleContext {
		public TerminalNode R_ID_GLOBAL() { return getToken(ArcadiaParser.R_ID_GLOBAL, 0); }
		public R_id_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_id_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterR_id_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitR_id_global(this);
		}
	}

	public final R_id_globalContext r_id_global() throws RecognitionException {
		R_id_globalContext _localctx = new R_id_globalContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_r_id_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(R_ID_GLOBAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class R_id_functionContext extends ParserRuleContext {
		public TerminalNode R_ID_FUNCTION() { return getToken(ArcadiaParser.R_ID_FUNCTION, 0); }
		public R_id_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_id_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterR_id_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitR_id_function(this);
		}
	}

	public final R_id_functionContext r_id_function() throws RecognitionException {
		R_id_functionContext _localctx = new R_id_functionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_r_id_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(R_ID_FUNCTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(ArcadiaParser.SEMICOLON, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitTerminator(this);
		}
	}

	public final TerminatorContext terminator() throws RecognitionException {
		return terminator(0);
	}

	private TerminatorContext terminator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TerminatorContext _localctx = new TerminatorContext(_ctx, _parentState);
		TerminatorContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_terminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(802);
				match(SEMICOLON);
				}
				break;
			case CRLF:
				{
				setState(803);
				crlf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(812);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(810);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(806);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(807);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(808);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(809);
						crlf();
						}
						break;
					}
					} 
				}
				setState(814);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Else_tokenContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ArcadiaParser.ELSE, 0); }
		public Else_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterElse_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitElse_token(this);
		}
	}

	public final Else_tokenContext else_token() throws RecognitionException {
		Else_tokenContext _localctx = new Else_tokenContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_else_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(ELSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrlfContext extends ParserRuleContext {
		public TerminalNode CRLF() { return getToken(ArcadiaParser.CRLF, 0); }
		public CrlfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crlf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).enterCrlf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArcadiaListener ) ((ArcadiaListener)listener).exitCrlf(this);
		}
	}

	public final CrlfContext crlf() throws RecognitionException {
		CrlfContext _localctx = new CrlfContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_crlf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(CRLF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		case 15:
			return function_definition_params_list_sempred((Function_definition_params_listContext)_localctx, predIndex);
		case 20:
			return function_call_params_sempred((Function_call_paramsContext)_localctx, predIndex);
		case 34:
			return for_init_list_sempred((For_init_listContext)_localctx, predIndex);
		case 37:
			return for_loop_list_sempred((For_loop_listContext)_localctx, predIndex);
		case 39:
			return statement_expression_list_sempred((Statement_expression_listContext)_localctx, predIndex);
		case 47:
			return array_definition_elements_sempred((Array_definition_elementsContext)_localctx, predIndex);
		case 49:
			return dynamic_result_sempred((Dynamic_resultContext)_localctx, predIndex);
		case 51:
			return int_result_sempred((Int_resultContext)_localctx, predIndex);
		case 52:
			return float_result_sempred((Float_resultContext)_localctx, predIndex);
		case 53:
			return string_result_sempred((String_resultContext)_localctx, predIndex);
		case 58:
			return rvalue_sempred((RvalueContext)_localctx, predIndex);
		case 68:
			return terminator_sempred((TerminatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_list_sempred(Expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean function_definition_params_list_sempred(Function_definition_params_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean function_call_params_sempred(Function_call_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean for_init_list_sempred(For_init_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean for_loop_list_sempred(For_loop_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean statement_expression_list_sempred(Statement_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean array_definition_elements_sempred(Array_definition_elementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dynamic_result_sempred(Dynamic_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 14);
		case 12:
			return precpred(_ctx, 12);
		case 13:
			return precpred(_ctx, 9);
		case 14:
			return precpred(_ctx, 7);
		case 15:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean int_result_sempred(Int_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 4);
		case 17:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean float_result_sempred(Float_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 8);
		case 19:
			return precpred(_ctx, 5);
		case 20:
			return precpred(_ctx, 6);
		case 21:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean string_result_sempred(String_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 2);
		case 23:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean rvalue_sempred(RvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 11);
		case 25:
			return precpred(_ctx, 9);
		case 26:
			return precpred(_ctx, 8);
		case 27:
			return precpred(_ctx, 7);
		case 28:
			return precpred(_ctx, 6);
		case 29:
			return precpred(_ctx, 5);
		case 30:
			return precpred(_ctx, 4);
		case 31:
			return precpred(_ctx, 3);
		case 32:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean terminator_sempred(TerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 4);
		case 34:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u0336\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u0098\n\3\3\3\3\3\3\3\3\3\7\3\u009e\n\3\f"+
		"\3\16\3\u00a1\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00ad\n"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00d4\n\16\3\17\3\17\5\17\u00d8\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e1\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u00e9\n\21\f\21\16\21\u00ec\13\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ff"+
		"\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0109\n\26\f\26\16"+
		"\26\u010c\13\26\3\27\3\27\5\27\u0110\n\27\3\30\3\30\3\30\3\30\5\30\u0116"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u011e\n\31\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0127\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u013e\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0156\n\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u016e\n\37\3 \3 \3 \3 \3 \3 "+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!"+
		"\u018c\n!\3\"\3\"\3#\3#\3#\3#\5#\u0194\n#\3$\3$\3$\3$\3$\3$\7$\u019c\n"+
		"$\f$\16$\u019f\13$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01ab\n\'\f"+
		"\'\16\'\u01ae\13\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01bb\n)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u01c8\n)\f)\16)\u01cb\13)\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\5*\u01d5\n*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01df\n+\3,\3,\3,\3"+
		",\3,\3,\3,\3,\5,\u01e9\n,\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01f3\n-\3.\3.\3"+
		".\3.\3.\3.\3.\3.\5.\u01fd\n.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u0209\n\60\3\61\3\61\3\61\5\61\u020e\n\61\3\61\3\61\3\61\3\61\5"+
		"\61\u0214\n\61\7\61\u0216\n\61\f\61\16\61\u0219\13\61\3\62\3\62\3\62\3"+
		"\62\5\62\u021f\n\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0227\n\62\3\62"+
		"\3\62\5\62\u022b\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\5\63\u0247\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u025e"+
		"\n\63\f\63\16\63\u0261\13\63\3\64\3\64\3\64\5\64\u0266\n\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\5\65\u026e\n\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65"+
		"\u0276\n\65\f\65\16\65\u0279\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0289\n\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0297\n\66\f\66\16\66\u029a"+
		"\13\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u02a2\n\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\7\67\u02aa\n\67\f\67\16\67\u02ad\13\67\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u02c4\n8\39\39\39\3"+
		"9\39\39\39\39\59\u02ce\n9\3:\3:\3:\5:\u02d3\n:\3;\3;\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u02f0\n"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\7<\u030d\n<\f<\16<\u0310\13<\3=\3=\3>\3>\3?\3?\3@\3@\3A"+
		"\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F\5F\u0327\nF\3F\3F\3F\3F\7F\u032d"+
		"\nF\fF\16F\u0330\13F\3G\3G\3H\3H\3H\2\17\4 *FLP`dhjlv\u008aI\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\2\f"+
		"\3\2#(\3\2\30\32\3\2\26\27\3\2\36!\3\2\34\35\4\2,,\61\61\3\2-.\3\2*+\3"+
		"\2/\60\3\2\24\25\2\u036c\2\u0090\3\2\2\2\4\u0097\3\2\2\2\6\u00ac\3\2\2"+
		"\2\b\u00ae\3\2\2\2\n\u00b2\3\2\2\2\f\u00b6\3\2\2\2\16\u00b8\3\2\2\2\20"+
		"\u00ba\3\2\2\2\22\u00bd\3\2\2\2\24\u00c2\3\2\2\2\26\u00c4\3\2\2\2\30\u00c8"+
		"\3\2\2\2\32\u00d3\3\2\2\2\34\u00d7\3\2\2\2\36\u00e0\3\2\2\2 \u00e2\3\2"+
		"\2\2\"\u00ed\3\2\2\2$\u00ef\3\2\2\2&\u00fe\3\2\2\2(\u0100\3\2\2\2*\u0102"+
		"\3\2\2\2,\u010f\3\2\2\2.\u0115\3\2\2\2\60\u0117\3\2\2\2\62\u011f\3\2\2"+
		"\2\64\u0126\3\2\2\2\66\u0128\3\2\2\28\u013d\3\2\2\2:\u0155\3\2\2\2<\u016d"+
		"\3\2\2\2>\u016f\3\2\2\2@\u018b\3\2\2\2B\u018d\3\2\2\2D\u0193\3\2\2\2F"+
		"\u0195\3\2\2\2H\u01a0\3\2\2\2J\u01a2\3\2\2\2L\u01a4\3\2\2\2N\u01af\3\2"+
		"\2\2P\u01ba\3\2\2\2R\u01d4\3\2\2\2T\u01de\3\2\2\2V\u01e8\3\2\2\2X\u01f2"+
		"\3\2\2\2Z\u01fc\3\2\2\2\\\u01fe\3\2\2\2^\u0208\3\2\2\2`\u020a\3\2\2\2"+
		"b\u022a\3\2\2\2d\u0246\3\2\2\2f\u0265\3\2\2\2h\u026d\3\2\2\2j\u0288\3"+
		"\2\2\2l\u02a1\3\2\2\2n\u02c3\3\2\2\2p\u02cd\3\2\2\2r\u02d2\3\2\2\2t\u02d4"+
		"\3\2\2\2v\u02ef\3\2\2\2x\u0311\3\2\2\2z\u0313\3\2\2\2|\u0315\3\2\2\2~"+
		"\u0317\3\2\2\2\u0080\u0319\3\2\2\2\u0082\u031b\3\2\2\2\u0084\u031d\3\2"+
		"\2\2\u0086\u031f\3\2\2\2\u0088\u0321\3\2\2\2\u008a\u0326\3\2\2\2\u008c"+
		"\u0331\3\2\2\2\u008e\u0333\3\2\2\2\u0090\u0091\5\4\3\2\u0091\3\3\2\2\2"+
		"\u0092\u0093\b\3\1\2\u0093\u0094\5\6\4\2\u0094\u0095\5\u008aF\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0098\5\u008aF\2\u0097\u0092\3\2\2\2\u0097\u0096"+
		"\3\2\2\2\u0098\u009f\3\2\2\2\u0099\u009a\f\4\2\2\u009a\u009b\5\6\4\2\u009b"+
		"\u009c\5\u008aF\2\u009c\u009e\3\2\2\2\u009d\u0099\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\5\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00ad\5\26\f\2\u00a3\u00ad\5\16\b\2\u00a4\u00ad\5"+
		"\20\t\2\u00a5\u00ad\5:\36\2\u00a6\u00ad\5<\37\2\u00a7\u00ad\5v<\2\u00a8"+
		"\u00ad\5$\23\2\u00a9\u00ad\5> \2\u00aa\u00ad\5@!\2\u00ab\u00ad\5\22\n"+
		"\2\u00ac\u00a2\3\2\2\2\u00ac\u00a3\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00a5"+
		"\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac"+
		"\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\7\3\2\2\2"+
		"\u00ae\u00af\5t;\2\u00af\u00b0\7\"\2\2\u00b0\u00b1\5\u0086D\2\u00b1\t"+
		"\3\2\2\2\u00b2\u00b3\5\u0086D\2\u00b3\u00b4\7\"\2\2\u00b4\u00b5\5\64\33"+
		"\2\u00b5\13\3\2\2\2\u00b6\u00b7\5\u0086D\2\u00b7\r\3\2\2\2\u00b8\u00b9"+
		"\5&\24\2\u00b9\17\3\2\2\2\u00ba\u00bb\7\7\2\2\u00bb\u00bc\5z>\2\u00bc"+
		"\21\3\2\2\2\u00bd\u00be\7\13\2\2\u00be\u00bf\5\u008eH\2\u00bf\u00c0\5"+
		"\24\13\2\u00c0\u00c1\7\b\2\2\u00c1\23\3\2\2\2\u00c2\u00c3\5\4\3\2\u00c3"+
		"\25\3\2\2\2\u00c4\u00c5\5\32\16\2\u00c5\u00c6\5\30\r\2\u00c6\u00c7\7\b"+
		"\2\2\u00c7\27\3\2\2\2\u00c8\u00c9\5\4\3\2\u00c9\31\3\2\2\2\u00ca\u00cb"+
		"\7\t\2\2\u00cb\u00cc\5\34\17\2\u00cc\u00cd\5\u008eH\2\u00cd\u00d4\3\2"+
		"\2\2\u00ce\u00cf\7\t\2\2\u00cf\u00d0\5\34\17\2\u00d0\u00d1\5\36\20\2\u00d1"+
		"\u00d2\5\u008eH\2\u00d2\u00d4\3\2\2\2\u00d3\u00ca\3\2\2\2\u00d3\u00ce"+
		"\3\2\2\2\u00d4\33\3\2\2\2\u00d5\u00d8\5\u0088E\2\u00d6\u00d8\5\u0084C"+
		"\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\35\3\2\2\2\u00d9\u00da"+
		"\7\62\2\2\u00da\u00e1\7\63\2\2\u00db\u00dc\7\62\2\2\u00dc\u00dd\5 \21"+
		"\2\u00dd\u00de\7\63\2\2\u00de\u00e1\3\2\2\2\u00df\u00e1\5 \21\2\u00e0"+
		"\u00d9\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\37\3\2\2"+
		"\2\u00e2\u00e3\b\21\1\2\u00e3\u00e4\5\"\22\2\u00e4\u00ea\3\2\2\2\u00e5"+
		"\u00e6\f\3\2\2\u00e6\u00e7\7\4\2\2\u00e7\u00e9\5\"\22\2\u00e8\u00e5\3"+
		"\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"!\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\5\u0084C\2\u00ee#\3\2\2\2\u00ef"+
		"\u00f0\7\n\2\2\u00f0\u00f1\5\64\33\2\u00f1%\3\2\2\2\u00f2\u00f3\5\34\17"+
		"\2\u00f3\u00f4\7\62\2\2\u00f4\u00f5\5(\25\2\u00f5\u00f6\7\63\2\2\u00f6"+
		"\u00ff\3\2\2\2\u00f7\u00f8\5\34\17\2\u00f8\u00f9\5(\25\2\u00f9\u00ff\3"+
		"\2\2\2\u00fa\u00fb\5\34\17\2\u00fb\u00fc\7\62\2\2\u00fc\u00fd\7\63\2\2"+
		"\u00fd\u00ff\3\2\2\2\u00fe\u00f2\3\2\2\2\u00fe\u00f7\3\2\2\2\u00fe\u00fa"+
		"\3\2\2\2\u00ff\'\3\2\2\2\u0100\u0101\5*\26\2\u0101)\3\2\2\2\u0102\u0103"+
		"\b\26\1\2\u0103\u0104\5,\27\2\u0104\u010a\3\2\2\2\u0105\u0106\f\3\2\2"+
		"\u0106\u0107\7\4\2\2\u0107\u0109\5,\27\2\u0108\u0105\3\2\2\2\u0109\u010c"+
		"\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b+\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010d\u0110\5.\30\2\u010e\u0110\5\60\31\2\u010f\u010d\3"+
		"\2\2\2\u010f\u010e\3\2\2\2\u0110-\3\2\2\2\u0111\u0116\5h\65\2\u0112\u0116"+
		"\5j\66\2\u0113\u0116\5l\67\2\u0114\u0116\5d\63\2\u0115\u0111\3\2\2\2\u0115"+
		"\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116/\3\2\2\2"+
		"\u0117\u0118\5\u0084C\2\u0118\u011d\7\"\2\2\u0119\u011e\5h\65\2\u011a"+
		"\u011e\5j\66\2\u011b\u011e\5l\67\2\u011c\u011e\5d\63\2\u011d\u0119\3\2"+
		"\2\2\u011d\u011a\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e"+
		"\61\3\2\2\2\u011f\u0120\5&\24\2\u0120\63\3\2\2\2\u0121\u0127\5h\65\2\u0122"+
		"\u0127\5j\66\2\u0123\u0127\5l\67\2\u0124\u0127\5d\63\2\u0125\u0127\5\f"+
		"\7\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0123\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\65\3\2\2\2\u0128\u0129\58\35"+
		"\2\u0129\67\3\2\2\2\u012a\u012b\7\16\2\2\u012b\u012c\5H%\2\u012c\u012d"+
		"\5\u008eH\2\u012d\u012e\5N(\2\u012e\u013e\3\2\2\2\u012f\u0130\7\16\2\2"+
		"\u0130\u0131\5H%\2\u0131\u0132\5\u008eH\2\u0132\u0133\5N(\2\u0133\u0134"+
		"\5\u008cG\2\u0134\u0135\5\u008eH\2\u0135\u0136\5N(\2\u0136\u013e\3\2\2"+
		"\2\u0137\u0138\7\16\2\2\u0138\u0139\5H%\2\u0139\u013a\5\u008eH\2\u013a"+
		"\u013b\5N(\2\u013b\u013c\58\35\2\u013c\u013e\3\2\2\2\u013d\u012a\3\2\2"+
		"\2\u013d\u012f\3\2\2\2\u013d\u0137\3\2\2\2\u013e9\3\2\2\2\u013f\u0140"+
		"\7\f\2\2\u0140\u0141\5H%\2\u0141\u0142\5\u008eH\2\u0142\u0143\5N(\2\u0143"+
		"\u0144\7\b\2\2\u0144\u0156\3\2\2\2\u0145\u0146\7\f\2\2\u0146\u0147\5H"+
		"%\2\u0147\u0148\5\u008eH\2\u0148\u0149\5N(\2\u0149\u014a\5\u008cG\2\u014a"+
		"\u014b\5\u008eH\2\u014b\u014c\5N(\2\u014c\u014d\7\b\2\2\u014d\u0156\3"+
		"\2\2\2\u014e\u014f\7\f\2\2\u014f\u0150\5H%\2\u0150\u0151\5\u008eH\2\u0151"+
		"\u0152\5N(\2\u0152\u0153\5\66\34\2\u0153\u0154\7\b\2\2\u0154\u0156\3\2"+
		"\2\2\u0155\u013f\3\2\2\2\u0155\u0145\3\2\2\2\u0155\u014e\3\2\2\2\u0156"+
		";\3\2\2\2\u0157\u0158\7\17\2\2\u0158\u0159\5H%\2\u0159\u015a\5\u008eH"+
		"\2\u015a\u015b\5N(\2\u015b\u015c\7\b\2\2\u015c\u016e\3\2\2\2\u015d\u015e"+
		"\7\17\2\2\u015e\u015f\5H%\2\u015f\u0160\5\u008eH\2\u0160\u0161\5N(\2\u0161"+
		"\u0162\5\u008cG\2\u0162\u0163\5\u008eH\2\u0163\u0164\5N(\2\u0164\u0165"+
		"\7\b\2\2\u0165\u016e\3\2\2\2\u0166\u0167\7\17\2\2\u0167\u0168\5H%\2\u0168"+
		"\u0169\5\u008eH\2\u0169\u016a\5N(\2\u016a\u016b\5\66\34\2\u016b\u016c"+
		"\7\b\2\2\u016c\u016e\3\2\2\2\u016d\u0157\3\2\2\2\u016d\u015d\3\2\2\2\u016d"+
		"\u0166\3\2\2\2\u016e=\3\2\2\2\u016f\u0170\7\20\2\2\u0170\u0171\5H%\2\u0171"+
		"\u0172\5\u008eH\2\u0172\u0173\5N(\2\u0173\u0174\7\b\2\2\u0174?\3\2\2\2"+
		"\u0175\u0176\7\23\2\2\u0176\u0177\7\62\2\2\u0177\u0178\5B\"\2\u0178\u0179"+
		"\7\5\2\2\u0179\u017a\5H%\2\u017a\u017b\7\5\2\2\u017b\u017c\5J&\2\u017c"+
		"\u017d\7\63\2\2\u017d\u017e\5\u008eH\2\u017e\u017f\5N(\2\u017f\u0180\7"+
		"\b\2\2\u0180\u018c\3\2\2\2\u0181\u0182\7\23\2\2\u0182\u0183\5B\"\2\u0183"+
		"\u0184\7\5\2\2\u0184\u0185\5H%\2\u0185\u0186\7\5\2\2\u0186\u0187\5J&\2"+
		"\u0187\u0188\5\u008eH\2\u0188\u0189\5N(\2\u0189\u018a\7\b\2\2\u018a\u018c"+
		"\3\2\2\2\u018b\u0175\3\2\2\2\u018b\u0181\3\2\2\2\u018cA\3\2\2\2\u018d"+
		"\u018e\5F$\2\u018eC\3\2\2\2\u018f\u0194\5V,\2\u0190\u0194\5X-\2\u0191"+
		"\u0194\5Z.\2\u0192\u0194\5T+\2\u0193\u018f\3\2\2\2\u0193\u0190\3\2\2\2"+
		"\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194E\3\2\2\2\u0195\u0196\b"+
		"$\1\2\u0196\u0197\5D#\2\u0197\u019d\3\2\2\2\u0198\u0199\f\4\2\2\u0199"+
		"\u019a\7\4\2\2\u019a\u019c\5D#\2\u019b\u0198\3\2\2\2\u019c\u019f\3\2\2"+
		"\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019eG\3\2\2\2\u019f\u019d"+
		"\3\2\2\2\u01a0\u01a1\5n8\2\u01a1I\3\2\2\2\u01a2\u01a3\5L\'\2\u01a3K\3"+
		"\2\2\2\u01a4\u01a5\b\'\1\2\u01a5\u01a6\5D#\2\u01a6\u01ac\3\2\2\2\u01a7"+
		"\u01a8\f\4\2\2\u01a8\u01a9\7\4\2\2\u01a9\u01ab\5D#\2\u01aa\u01a7\3\2\2"+
		"\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01adM"+
		"\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\5P)\2\u01b0O\3\2\2\2\u01b1\u01b2"+
		"\b)\1\2\u01b2\u01b3\5\6\4\2\u01b3\u01b4\5\u008aF\2\u01b4\u01bb\3\2\2\2"+
		"\u01b5\u01b6\7\21\2\2\u01b6\u01bb\5\u008aF\2\u01b7\u01b8\5x=\2\u01b8\u01b9"+
		"\5\u008aF\2\u01b9\u01bb\3\2\2\2\u01ba\u01b1\3\2\2\2\u01ba\u01b5\3\2\2"+
		"\2\u01ba\u01b7\3\2\2\2\u01bb\u01c9\3\2\2\2\u01bc\u01bd\f\5\2\2\u01bd\u01be"+
		"\5\6\4\2\u01be\u01bf\5\u008aF\2\u01bf\u01c8\3\2\2\2\u01c0\u01c1\f\4\2"+
		"\2\u01c1\u01c2\7\21\2\2\u01c2\u01c8\5\u008aF\2\u01c3\u01c4\f\3\2\2\u01c4"+
		"\u01c5\5x=\2\u01c5\u01c6\5\u008aF\2\u01c6\u01c8\3\2\2\2\u01c7\u01bc\3"+
		"\2\2\2\u01c7\u01c0\3\2\2\2\u01c7\u01c3\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01caQ\3\2\2\2\u01cb\u01c9\3\2\2\2"+
		"\u01cc\u01cd\5t;\2\u01cd\u01ce\7\"\2\2\u01ce\u01cf\5v<\2\u01cf\u01d5\3"+
		"\2\2\2\u01d0\u01d1\5t;\2\u01d1\u01d2\t\2\2\2\u01d2\u01d3\5v<\2\u01d3\u01d5"+
		"\3\2\2\2\u01d4\u01cc\3\2\2\2\u01d4\u01d0\3\2\2\2\u01d5S\3\2\2\2\u01d6"+
		"\u01d7\5t;\2\u01d7\u01d8\7\"\2\2\u01d8\u01d9\5d\63\2\u01d9\u01df\3\2\2"+
		"\2\u01da\u01db\5t;\2\u01db\u01dc\t\2\2\2\u01dc\u01dd\5d\63\2\u01dd\u01df"+
		"\3\2\2\2\u01de\u01d6\3\2\2\2\u01de\u01da\3\2\2\2\u01dfU\3\2\2\2\u01e0"+
		"\u01e1\5t;\2\u01e1\u01e2\7\"\2\2\u01e2\u01e3\5h\65\2\u01e3\u01e9\3\2\2"+
		"\2\u01e4\u01e5\5t;\2\u01e5\u01e6\t\2\2\2\u01e6\u01e7\5h\65\2\u01e7\u01e9"+
		"\3\2\2\2\u01e8\u01e0\3\2\2\2\u01e8\u01e4\3\2\2\2\u01e9W\3\2\2\2\u01ea"+
		"\u01eb\5t;\2\u01eb\u01ec\7\"\2\2\u01ec\u01ed\5j\66\2\u01ed\u01f3\3\2\2"+
		"\2\u01ee\u01ef\5t;\2\u01ef\u01f0\t\2\2\2\u01f0\u01f1\5j\66\2\u01f1\u01f3"+
		"\3\2\2\2\u01f2\u01ea\3\2\2\2\u01f2\u01ee\3\2\2\2\u01f3Y\3\2\2\2\u01f4"+
		"\u01f5\5t;\2\u01f5\u01f6\7\"\2\2\u01f6\u01f7\5l\67\2\u01f7\u01fd\3\2\2"+
		"\2\u01f8\u01f9\5t;\2\u01f9\u01fa\7#\2\2\u01fa\u01fb\5l\67\2\u01fb\u01fd"+
		"\3\2\2\2\u01fc\u01f4\3\2\2\2\u01fc\u01f8\3\2\2\2\u01fd[\3\2\2\2\u01fe"+
		"\u01ff\5t;\2\u01ff\u0200\7\"\2\2\u0200\u0201\5^\60\2\u0201]\3\2\2\2\u0202"+
		"\u0203\7\64\2\2\u0203\u0204\5`\61\2\u0204\u0205\7\65\2\2\u0205\u0209\3"+
		"\2\2\2\u0206\u0207\7\64\2\2\u0207\u0209\7\65\2\2\u0208\u0202\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0209_\3\2\2\2\u020a\u020d\b\61\1\2\u020b\u020e\5h\65\2"+
		"\u020c\u020e\5d\63\2\u020d\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020e\u0217"+
		"\3\2\2\2\u020f\u0210\f\3\2\2\u0210\u0213\7\4\2\2\u0211\u0214\5h\65\2\u0212"+
		"\u0214\5d\63\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214\u0216\3\2"+
		"\2\2\u0215\u020f\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218a\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021b\5\u0084"+
		"C\2\u021b\u021e\7\64\2\2\u021c\u021f\5h\65\2\u021d\u021f\5d\63\2\u021e"+
		"\u021c\3\2\2\2\u021e\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\7\65"+
		"\2\2\u0221\u022b\3\2\2\2\u0222\u0223\5\u0086D\2\u0223\u0226\7\64\2\2\u0224"+
		"\u0227\5h\65\2\u0225\u0227\5d\63\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2"+
		"\2\2\u0227\u0228\3\2\2\2\u0228\u0229\7\65\2\2\u0229\u022b\3\2\2\2\u022a"+
		"\u021a\3\2\2\2\u022a\u0222\3\2\2\2\u022bc\3\2\2\2\u022c\u022d\b\63\1\2"+
		"\u022d\u022e\5h\65\2\u022e\u022f\t\3\2\2\u022f\u0230\5d\63\17\u0230\u0247"+
		"\3\2\2\2\u0231\u0232\5j\66\2\u0232\u0233\t\3\2\2\u0233\u0234\5d\63\r\u0234"+
		"\u0247\3\2\2\2\u0235\u0236\5l\67\2\u0236\u0237\7\30\2\2\u0237\u0238\5"+
		"d\63\n\u0238\u0247\3\2\2\2\u0239\u023a\5h\65\2\u023a\u023b\t\4\2\2\u023b"+
		"\u023c\5d\63\b\u023c\u0247\3\2\2\2\u023d\u023e\5j\66\2\u023e\u023f\t\4"+
		"\2\2\u023f\u0240\5d\63\6\u0240\u0247\3\2\2\2\u0241\u0242\7\62\2\2\u0242"+
		"\u0243\5d\63\2\u0243\u0244\7\63\2\2\u0244\u0247\3\2\2\2\u0245\u0247\5"+
		"f\64\2\u0246\u022c\3\2\2\2\u0246\u0231\3\2\2\2\u0246\u0235\3\2\2\2\u0246"+
		"\u0239\3\2\2\2\u0246\u023d\3\2\2\2\u0246\u0241\3\2\2\2\u0246\u0245\3\2"+
		"\2\2\u0247\u025f\3\2\2\2\u0248\u0249\f\f\2\2\u0249\u024a\t\3\2\2\u024a"+
		"\u025e\5d\63\r\u024b\u024c\f\5\2\2\u024c\u024d\t\4\2\2\u024d\u025e\5d"+
		"\63\6\u024e\u024f\f\20\2\2\u024f\u0250\t\3\2\2\u0250\u025e\5h\65\2\u0251"+
		"\u0252\f\16\2\2\u0252\u0253\t\3\2\2\u0253\u025e\5j\66\2\u0254\u0255\f"+
		"\13\2\2\u0255\u0256\7\30\2\2\u0256\u025e\5l\67\2\u0257\u0258\f\t\2\2\u0258"+
		"\u0259\t\4\2\2\u0259\u025e\5h\65\2\u025a\u025b\f\7\2\2\u025b\u025c\t\4"+
		"\2\2\u025c\u025e\5j\66\2\u025d\u0248\3\2\2\2\u025d\u024b\3\2\2\2\u025d"+
		"\u024e\3\2\2\2\u025d\u0251\3\2\2\2\u025d\u0254\3\2\2\2\u025d\u0257\3\2"+
		"\2\2\u025d\u025a\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f"+
		"\u0260\3\2\2\2\u0260e\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0266\5\u0084"+
		"C\2\u0263\u0266\5\62\32\2\u0264\u0266\5b\62\2\u0265\u0262\3\2\2\2\u0265"+
		"\u0263\3\2\2\2\u0265\u0264\3\2\2\2\u0266g\3\2\2\2\u0267\u0268\b\65\1\2"+
		"\u0268\u0269\7\62\2\2\u0269\u026a\5h\65\2\u026a\u026b\7\63\2\2\u026b\u026e"+
		"\3\2\2\2\u026c\u026e\5~@\2\u026d\u0267\3\2\2\2\u026d\u026c\3\2\2\2\u026e"+
		"\u0277\3\2\2\2\u026f\u0270\f\6\2\2\u0270\u0271\t\3\2\2\u0271\u0276\5h"+
		"\65\7\u0272\u0273\f\5\2\2\u0273\u0274\t\4\2\2\u0274\u0276\5h\65\6\u0275"+
		"\u026f\3\2\2\2\u0275\u0272\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2"+
		"\2\2\u0277\u0278\3\2\2\2\u0278i\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027b"+
		"\b\66\1\2\u027b\u027c\5h\65\2\u027c\u027d\t\3\2\2\u027d\u027e\5j\66\t"+
		"\u027e\u0289\3\2\2\2\u027f\u0280\5h\65\2\u0280\u0281\t\4\2\2\u0281\u0282"+
		"\5j\66\6\u0282\u0289\3\2\2\2\u0283\u0284\7\62\2\2\u0284\u0285\5j\66\2"+
		"\u0285\u0286\7\63\2\2\u0286\u0289\3\2\2\2\u0287\u0289\5|?\2\u0288\u027a"+
		"\3\2\2\2\u0288\u027f\3\2\2\2\u0288\u0283\3\2\2\2\u0288\u0287\3\2\2\2\u0289"+
		"\u0298\3\2\2\2\u028a\u028b\f\n\2\2\u028b\u028c\t\3\2\2\u028c\u0297\5j"+
		"\66\13\u028d\u028e\f\7\2\2\u028e\u028f\t\4\2\2\u028f\u0297\5j\66\b\u0290"+
		"\u0291\f\b\2\2\u0291\u0292\t\3\2\2\u0292\u0297\5h\65\2\u0293\u0294\f\5"+
		"\2\2\u0294\u0295\t\4\2\2\u0295\u0297\5h\65\2\u0296\u028a\3\2\2\2\u0296"+
		"\u028d\3\2\2\2\u0296\u0290\3\2\2\2\u0296\u0293\3\2\2\2\u0297\u029a\3\2"+
		"\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299k\3\2\2\2\u029a\u0298"+
		"\3\2\2\2\u029b\u029c\b\67\1\2\u029c\u029d\5h\65\2\u029d\u029e\7\30\2\2"+
		"\u029e\u029f\5l\67\5\u029f\u02a2\3\2\2\2\u02a0\u02a2\5z>\2\u02a1\u029b"+
		"\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2\u02ab\3\2\2\2\u02a3\u02a4\f\4\2\2\u02a4"+
		"\u02a5\7\26\2\2\u02a5\u02aa\5l\67\5\u02a6\u02a7\f\6\2\2\u02a7\u02a8\7"+
		"\30\2\2\u02a8\u02aa\5h\65\2\u02a9\u02a3\3\2\2\2\u02a9\u02a6\3\2\2\2\u02aa"+
		"\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02acm\3\2\2\2"+
		"\u02ad\u02ab\3\2\2\2\u02ae\u02af\5p9\2\u02af\u02b0\7)\2\2\u02b0\u02b1"+
		"\5n8\2\u02b1\u02c4\3\2\2\2\u02b2\u02b3\5p9\2\u02b3\u02b4\7/\2\2\u02b4"+
		"\u02b5\5n8\2\u02b5\u02c4\3\2\2\2\u02b6\u02b7\5p9\2\u02b7\u02b8\7*\2\2"+
		"\u02b8\u02b9\5n8\2\u02b9\u02c4\3\2\2\2\u02ba\u02bb\5p9\2\u02bb\u02bc\7"+
		"\60\2\2\u02bc\u02bd\5n8\2\u02bd\u02c4\3\2\2\2\u02be\u02bf\7\62\2\2\u02bf"+
		"\u02c0\5n8\2\u02c0\u02c1\7\63\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c4\5p9"+
		"\2\u02c3\u02ae\3\2\2\2\u02c3\u02b2\3\2\2\2\u02c3\u02b6\3\2\2\2\u02c3\u02ba"+
		"\3\2\2\2\u02c3\u02be\3\2\2\2\u02c3\u02c2\3\2\2\2\u02c4o\3\2\2\2\u02c5"+
		"\u02c6\5r:\2\u02c6\u02c7\t\5\2\2\u02c7\u02c8\5r:\2\u02c8\u02ce\3\2\2\2"+
		"\u02c9\u02ca\5r:\2\u02ca\u02cb\t\6\2\2\u02cb\u02cc\5r:\2\u02cc\u02ce\3"+
		"\2\2\2\u02cd\u02c5\3\2\2\2\u02cd\u02c9\3\2\2\2\u02ceq\3\2\2\2\u02cf\u02d3"+
		"\5\64\33\2\u02d0\u02d3\5b\62\2\u02d1\u02d3\5\u0084C\2\u02d2\u02cf\3\2"+
		"\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3s\3\2\2\2\u02d4\u02d5"+
		"\5\u0084C\2\u02d5u\3\2\2\2\u02d6\u02d7\b<\1\2\u02d7\u02f0\5t;\2\u02d8"+
		"\u02f0\5\\/\2\u02d9\u02f0\5h\65\2\u02da\u02f0\5j\66\2\u02db\u02f0\5l\67"+
		"\2\u02dc\u02f0\5\n\6\2\u02dd\u02f0\5\b\5\2\u02de\u02f0\5T+\2\u02df\u02f0"+
		"\5Z.\2\u02e0\u02f0\5X-\2\u02e1\u02f0\5V,\2\u02e2\u02f0\5R*\2\u02e3\u02f0"+
		"\5&\24\2\u02e4\u02f0\5z>\2\u02e5\u02f0\5\u0080A\2\u02e6\u02f0\5|?\2\u02e7"+
		"\u02f0\5~@\2\u02e8\u02f0\5\u0082B\2\u02e9\u02ea\t\7\2\2\u02ea\u02f0\5"+
		"v<\f\u02eb\u02ec\7\62\2\2\u02ec\u02ed\5v<\2\u02ed\u02ee\7\63\2\2\u02ee"+
		"\u02f0\3\2\2\2\u02ef\u02d6\3\2\2\2\u02ef\u02d8\3\2\2\2\u02ef\u02d9\3\2"+
		"\2\2\u02ef\u02da\3\2\2\2\u02ef\u02db\3\2\2\2\u02ef\u02dc\3\2\2\2\u02ef"+
		"\u02dd\3\2\2\2\u02ef\u02de\3\2\2\2\u02ef\u02df\3\2\2\2\u02ef\u02e0\3\2"+
		"\2\2\u02ef\u02e1\3\2\2\2\u02ef\u02e2\3\2\2\2\u02ef\u02e3\3\2\2\2\u02ef"+
		"\u02e4\3\2\2\2\u02ef\u02e5\3\2\2\2\u02ef\u02e6\3\2\2\2\u02ef\u02e7\3\2"+
		"\2\2\u02ef\u02e8\3\2\2\2\u02ef\u02e9\3\2\2\2\u02ef\u02eb\3\2\2\2\u02f0"+
		"\u030e\3\2\2\2\u02f1\u02f2\f\r\2\2\u02f2\u02f3\7\33\2\2\u02f3\u030d\5"+
		"v<\16\u02f4\u02f5\f\13\2\2\u02f5\u02f6\t\3\2\2\u02f6\u030d\5v<\f\u02f7"+
		"\u02f8\f\n\2\2\u02f8\u02f9\t\4\2\2\u02f9\u030d\5v<\13\u02fa\u02fb\f\t"+
		"\2\2\u02fb\u02fc\t\b\2\2\u02fc\u030d\5v<\n\u02fd\u02fe\f\b\2\2\u02fe\u02ff"+
		"\7)\2\2\u02ff\u030d\5v<\t\u0300\u0301\f\7\2\2\u0301\u0302\t\t\2\2\u0302"+
		"\u030d\5v<\b\u0303\u0304\f\6\2\2\u0304\u0305\t\5\2\2\u0305\u030d\5v<\7"+
		"\u0306\u0307\f\5\2\2\u0307\u0308\t\6\2\2\u0308\u030d\5v<\6\u0309\u030a"+
		"\f\4\2\2\u030a\u030b\t\n\2\2\u030b\u030d\5v<\5\u030c\u02f1\3\2\2\2\u030c"+
		"\u02f4\3\2\2\2\u030c\u02f7\3\2\2\2\u030c\u02fa\3\2\2\2\u030c\u02fd\3\2"+
		"\2\2\u030c\u0300\3\2\2\2\u030c\u0303\3\2\2\2\u030c\u0306\3\2\2\2\u030c"+
		"\u0309\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2"+
		"\2\2\u030fw\3\2\2\2\u0310\u030e\3\2\2\2\u0311\u0312\7\22\2\2\u0312y\3"+
		"\2\2\2\u0313\u0314\7\3\2\2\u0314{\3\2\2\2\u0315\u0316\7;\2\2\u0316}\3"+
		"\2\2\2\u0317\u0318\7:\2\2\u0318\177\3\2\2\2\u0319\u031a\t\13\2\2\u031a"+
		"\u0081\3\2\2\2\u031b\u031c\7\66\2\2\u031c\u0083\3\2\2\2\u031d\u031e\7"+
		"<\2\2\u031e\u0085\3\2\2\2\u031f\u0320\7=\2\2\u0320\u0087\3\2\2\2\u0321"+
		"\u0322\7>\2\2\u0322\u0089\3\2\2\2\u0323\u0324\bF\1\2\u0324\u0327\7\5\2"+
		"\2\u0325\u0327\5\u008eH\2\u0326\u0323\3\2\2\2\u0326\u0325\3\2\2\2\u0327"+
		"\u032e\3\2\2\2\u0328\u0329\f\6\2\2\u0329\u032d\7\5\2\2\u032a\u032b\f\5"+
		"\2\2\u032b\u032d\5\u008eH\2\u032c\u0328\3\2\2\2\u032c\u032a\3\2\2\2\u032d"+
		"\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u008b\3\2"+
		"\2\2\u0330\u032e\3\2\2\2\u0331\u0332\7\r\2\2\u0332\u008d\3\2\2\2\u0333"+
		"\u0334\7\6\2\2\u0334\u008f\3\2\2\2;\u0097\u009f\u00ac\u00d3\u00d7\u00e0"+
		"\u00ea\u00fe\u010a\u010f\u0115\u011d\u0126\u013d\u0155\u016d\u018b\u0193"+
		"\u019d\u01ac\u01ba\u01c7\u01c9\u01d4\u01de\u01e8\u01f2\u01fc\u0208\u020d"+
		"\u0213\u0217\u021e\u0226\u022a\u0246\u025d\u025f\u0265\u026d\u0275\u0277"+
		"\u0288\u0296\u0298\u02a1\u02a9\u02ab\u02c3\u02cd\u02d2\u02ef\u030c\u030e"+
		"\u0326\u032c\u032e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}