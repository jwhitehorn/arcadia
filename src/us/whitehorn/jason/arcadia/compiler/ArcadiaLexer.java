// Generated from /Users/jason/projects/arcadia/Arcadia.g4 by ANTLR 4.7.2
package us.whitehorn.jason.arcadia.compiler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArcadiaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ESCAPED_QUOTE", "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", 
			"END", "DEF", "RETURN", "PIR", "IF", "ELSE", "ELSIF", "UNLESS", "WHILE", 
			"RETRY", "BREAK", "FOR", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", 
			"MOD", "EXP", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", 
			"GREATER_EQUAL", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", 
			"BIT_NOT", "BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "LEFT_RBRACKET", 
			"RIGHT_RBRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "NIL", "SL_COMMENT", 
			"ML_COMMENT", "WS", "INT", "FLOAT", "R_ID", "R_ID_GLOBAL", "R_ID_FUNCTION"
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


	public ArcadiaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Arcadia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u018f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u0084\n\3\f\3\16\3\u0087\13\3\3\3\3"+
		"\3\3\3\3\3\7\3\u008d\n\3\f\3\16\3\u0090\13\3\3\3\5\3\u0093\n\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3"+
		"&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3"+
		".\3.\3/\3/\3/\3/\3/\5/\u0131\n/\3\60\3\60\3\60\3\60\5\60\u0137\n\60\3"+
		"\61\3\61\3\61\3\61\5\61\u013d\n\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\67\3\67\7\67\u014d\n\67\f\67\16\67\u0150\13"+
		"\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\78\u015e\n8\f8\168\u0161"+
		"\138\38\38\38\38\38\38\38\38\39\69\u016c\n9\r9\169\u016d\39\39\3:\6:\u0173"+
		"\n:\r:\16:\u0174\3;\7;\u0178\n;\f;\16;\u017b\13;\3;\3;\6;\u017f\n;\r;"+
		"\16;\u0180\3<\3<\7<\u0185\n<\f<\16<\u0188\13<\3=\3=\3=\3>\3>\3>\5\u0085"+
		"\u008e\u015f\2?\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31"+
		"\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33"+
		"\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g"+
		"\64i\65k\66m\67o8q9s:u;w<y={>\3\2\b\4\2\f\f\17\17\4\2\13\13\"\"\3\2\62"+
		";\5\2C\\aac|\6\2\62;C\\aac|\3\2AA\2\u019c\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3"+
		"\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\u0092\3\2\2\2\7\u0094"+
		"\3\2\2\2\t\u0096\3\2\2\2\13\u0098\3\2\2\2\r\u009a\3\2\2\2\17\u00a2\3\2"+
		"\2\2\21\u00a6\3\2\2\2\23\u00aa\3\2\2\2\25\u00b1\3\2\2\2\27\u00b5\3\2\2"+
		"\2\31\u00b8\3\2\2\2\33\u00bd\3\2\2\2\35\u00c3\3\2\2\2\37\u00ca\3\2\2\2"+
		"!\u00d0\3\2\2\2#\u00d6\3\2\2\2%\u00dc\3\2\2\2\'\u00e0\3\2\2\2)\u00e5\3"+
		"\2\2\2+\u00eb\3\2\2\2-\u00ed\3\2\2\2/\u00ef\3\2\2\2\61\u00f1\3\2\2\2\63"+
		"\u00f3\3\2\2\2\65\u00f5\3\2\2\2\67\u00f8\3\2\2\29\u00fb\3\2\2\2;\u00fe"+
		"\3\2\2\2=\u0100\3\2\2\2?\u0102\3\2\2\2A\u0105\3\2\2\2C\u0108\3\2\2\2E"+
		"\u010a\3\2\2\2G\u010d\3\2\2\2I\u0110\3\2\2\2K\u0113\3\2\2\2M\u0116\3\2"+
		"\2\2O\u0119\3\2\2\2Q\u011d\3\2\2\2S\u011f\3\2\2\2U\u0121\3\2\2\2W\u0123"+
		"\3\2\2\2Y\u0125\3\2\2\2[\u0128\3\2\2\2]\u0130\3\2\2\2_\u0136\3\2\2\2a"+
		"\u013c\3\2\2\2c\u013e\3\2\2\2e\u0140\3\2\2\2g\u0142\3\2\2\2i\u0144\3\2"+
		"\2\2k\u0146\3\2\2\2m\u014a\3\2\2\2o\u0155\3\2\2\2q\u016b\3\2\2\2s\u0172"+
		"\3\2\2\2u\u0179\3\2\2\2w\u0182\3\2\2\2y\u0189\3\2\2\2{\u018c\3\2\2\2}"+
		"~\7^\2\2~\177\7$\2\2\177\4\3\2\2\2\u0080\u0085\7$\2\2\u0081\u0084\5\3"+
		"\2\2\u0082\u0084\n\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u0093\7$\2\2\u0089\u008e\7)\2\2\u008a\u008d"+
		"\5\3\2\2\u008b\u008d\n\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0091\u0093\7)\2\2\u0092\u0080\3\2\2\2\u0092"+
		"\u0089\3\2\2\2\u0093\6\3\2\2\2\u0094\u0095\7.\2\2\u0095\b\3\2\2\2\u0096"+
		"\u0097\7=\2\2\u0097\n\3\2\2\2\u0098\u0099\7\f\2\2\u0099\f\3\2\2\2\u009a"+
		"\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d\7s\2\2\u009d\u009e\7w\2\2"+
		"\u009e\u009f\7k\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7g\2\2\u00a1\16\3\2"+
		"\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7f\2\2\u00a5\20"+
		"\3\2\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7h\2\2\u00a9"+
		"\22\3\2\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7v\2\2\u00ad"+
		"\u00ae\7w\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7p\2\2\u00b0\24\3\2\2\2\u00b1"+
		"\u00b2\7r\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7t\2\2\u00b4\26\3\2\2\2\u00b5"+
		"\u00b6\7k\2\2\u00b6\u00b7\7h\2\2\u00b7\30\3\2\2\2\u00b8\u00b9\7g\2\2\u00b9"+
		"\u00ba\7n\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7g\2\2\u00bc\32\3\2\2\2\u00bd"+
		"\u00be\7g\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7k\2\2"+
		"\u00c1\u00c2\7h\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7"+
		"p\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9"+
		"\7u\2\2\u00c9\36\3\2\2\2\u00ca\u00cb\7y\2\2\u00cb\u00cc\7j\2\2\u00cc\u00cd"+
		"\7k\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7g\2\2\u00cf \3\2\2\2\u00d0\u00d1"+
		"\7t\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7t\2\2\u00d4"+
		"\u00d5\7{\2\2\u00d5\"\3\2\2\2\u00d6\u00d7\7d\2\2\u00d7\u00d8\7t\2\2\u00d8"+
		"\u00d9\7g\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7m\2\2\u00db$\3\2\2\2\u00dc"+
		"\u00dd\7h\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7t\2\2\u00df&\3\2\2\2\u00e0"+
		"\u00e1\7v\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7g\2\2"+
		"\u00e4(\3\2\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7n\2"+
		"\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7g\2\2\u00ea*\3\2\2\2\u00eb\u00ec\7"+
		"-\2\2\u00ec,\3\2\2\2\u00ed\u00ee\7/\2\2\u00ee.\3\2\2\2\u00ef\u00f0\7,"+
		"\2\2\u00f0\60\3\2\2\2\u00f1\u00f2\7\61\2\2\u00f2\62\3\2\2\2\u00f3\u00f4"+
		"\7\'\2\2\u00f4\64\3\2\2\2\u00f5\u00f6\7,\2\2\u00f6\u00f7\7,\2\2\u00f7"+
		"\66\3\2\2\2\u00f8\u00f9\7?\2\2\u00f9\u00fa\7?\2\2\u00fa8\3\2\2\2\u00fb"+
		"\u00fc\7#\2\2\u00fc\u00fd\7?\2\2\u00fd:\3\2\2\2\u00fe\u00ff\7@\2\2\u00ff"+
		"<\3\2\2\2\u0100\u0101\7>\2\2\u0101>\3\2\2\2\u0102\u0103\7>\2\2\u0103\u0104"+
		"\7?\2\2\u0104@\3\2\2\2\u0105\u0106\7@\2\2\u0106\u0107\7?\2\2\u0107B\3"+
		"\2\2\2\u0108\u0109\7?\2\2\u0109D\3\2\2\2\u010a\u010b\7-\2\2\u010b\u010c"+
		"\7?\2\2\u010cF\3\2\2\2\u010d\u010e\7/\2\2\u010e\u010f\7?\2\2\u010fH\3"+
		"\2\2\2\u0110\u0111\7,\2\2\u0111\u0112\7?\2\2\u0112J\3\2\2\2\u0113\u0114"+
		"\7\61\2\2\u0114\u0115\7?\2\2\u0115L\3\2\2\2\u0116\u0117\7\'\2\2\u0117"+
		"\u0118\7?\2\2\u0118N\3\2\2\2\u0119\u011a\7,\2\2\u011a\u011b\7,\2\2\u011b"+
		"\u011c\7?\2\2\u011cP\3\2\2\2\u011d\u011e\7(\2\2\u011eR\3\2\2\2\u011f\u0120"+
		"\7~\2\2\u0120T\3\2\2\2\u0121\u0122\7`\2\2\u0122V\3\2\2\2\u0123\u0124\7"+
		"\u0080\2\2\u0124X\3\2\2\2\u0125\u0126\7>\2\2\u0126\u0127\7>\2\2\u0127"+
		"Z\3\2\2\2\u0128\u0129\7@\2\2\u0129\u012a\7@\2\2\u012a\\\3\2\2\2\u012b"+
		"\u012c\7c\2\2\u012c\u012d\7p\2\2\u012d\u0131\7f\2\2\u012e\u012f\7(\2\2"+
		"\u012f\u0131\7(\2\2\u0130\u012b\3\2\2\2\u0130\u012e\3\2\2\2\u0131^\3\2"+
		"\2\2\u0132\u0133\7q\2\2\u0133\u0137\7t\2\2\u0134\u0135\7~\2\2\u0135\u0137"+
		"\7~\2\2\u0136\u0132\3\2\2\2\u0136\u0134\3\2\2\2\u0137`\3\2\2\2\u0138\u0139"+
		"\7p\2\2\u0139\u013a\7q\2\2\u013a\u013d\7v\2\2\u013b\u013d\7#\2\2\u013c"+
		"\u0138\3\2\2\2\u013c\u013b\3\2\2\2\u013db\3\2\2\2\u013e\u013f\7*\2\2\u013f"+
		"d\3\2\2\2\u0140\u0141\7+\2\2\u0141f\3\2\2\2\u0142\u0143\7]\2\2\u0143h"+
		"\3\2\2\2\u0144\u0145\7_\2\2\u0145j\3\2\2\2\u0146\u0147\7p\2\2\u0147\u0148"+
		"\7k\2\2\u0148\u0149\7n\2\2\u0149l\3\2\2\2\u014a\u014e\7%\2\2\u014b\u014d"+
		"\n\2\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7\f"+
		"\2\2\u0152\u0153\3\2\2\2\u0153\u0154\b\67\2\2\u0154n\3\2\2\2\u0155\u0156"+
		"\7?\2\2\u0156\u0157\7d\2\2\u0157\u0158\7g\2\2\u0158\u0159\7i\2\2\u0159"+
		"\u015a\7k\2\2\u015a\u015b\7p\2\2\u015b\u015f\3\2\2\2\u015c\u015e\13\2"+
		"\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u0160\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7?"+
		"\2\2\u0163\u0164\7g\2\2\u0164\u0165\7p\2\2\u0165\u0166\7f\2\2\u0166\u0167"+
		"\7\f\2\2\u0167\u0168\3\2\2\2\u0168\u0169\b8\2\2\u0169p\3\2\2\2\u016a\u016c"+
		"\t\3\2\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b9\2\2\u0170r\3\2\2\2\u0171"+
		"\u0173\t\4\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175t\3\2\2\2\u0176\u0178\t\4\2\2\u0177\u0176"+
		"\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017e\7\60\2\2\u017d\u017f\t"+
		"\4\2\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181v\3\2\2\2\u0182\u0186\t\5\2\2\u0183\u0185\t\6\2\2"+
		"\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0187x\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7&\2\2\u018a\u018b"+
		"\5w<\2\u018bz\3\2\2\2\u018c\u018d\5w<\2\u018d\u018e\t\7\2\2\u018e|\3\2"+
		"\2\2\22\2\u0083\u0085\u008c\u008e\u0092\u0130\u0136\u013c\u014e\u015f"+
		"\u016d\u0174\u0179\u0180\u0186\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}