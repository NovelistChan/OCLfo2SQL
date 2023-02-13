// Generated from /Users/novelistchan/Documents/OCLfo2SQL/src/main/java/ANTLR/RA2SQL/RA2SQLLexer.g4 by ANTLR 4.10.1
package ANTLR.RA2SQL;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RA2SQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, PROJECTION=2, SELECTION=3, UNION=4, DIFFER=5, INTERSECTION=6, 
		JOIN=7, UNIVERSALSET=8, ID=9, COMMA=10, EQ=11, GT=12, LT=13, NE=14, GE=15, 
		LE=16, AND=17, OR=18, XOR=19, IMPLY=20, NOT=21, AR=22, ADD=23, MIN=24, 
		MUL=25, DIV=26, MOD=27, DOT=28, LB=29, RB=30, SEP=31, QUOTE=32, STRING=33, 
		INT=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SPACE", "PROJECTION", "SELECTION", "UNION", "DIFFER", "INTERSECTION", 
			"JOIN", "UNIVERSALSET", "ID", "COMMA", "EQ", "GT", "LT", "NE", "GE", 
			"LE", "AND", "OR", "XOR", "IMPLY", "NOT", "AR", "ADD", "MIN", "MUL", 
			"DIV", "MOD", "DOT", "LB", "RB", "SEP", "QUOTE", "STRING", "INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'pi'", "'sigma'", "'union'", "'\\'", "'intersect'", "'join'", 
			"'U'", null, "','", "'='", "'>'", "'<'", "'<>'", "'>='", "'<='", "'and'", 
			"'or'", "'xor'", "'implies'", "'not'", "'->'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'.'", "'('", "')'", "'|'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "PROJECTION", "SELECTION", "UNION", "DIFFER", "INTERSECTION", 
			"JOIN", "UNIVERSALSET", "ID", "COMMA", "EQ", "GT", "LT", "NE", "GE", 
			"LE", "AND", "OR", "XOR", "IMPLY", "NOT", "AR", "ADD", "MIN", "MUL", 
			"DIV", "MOD", "DOT", "LB", "RB", "SEP", "QUOTE", "STRING", "INT"
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


	public RA2SQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RA2SQLLexer.g4"; }

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
		"\u0004\u0000\"\u00be\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0001\u0000\u0004\u0000G\b\u0000\u000b\u0000\f\u0000H\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0005\bq\b\b\n\b\f\bt\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001 \u0004 \u00b6\b \u000b \f \u00b7"+
		"\u0001!\u0004!\u00bb\b!\u000b!\f!\u00bc\u0000\u0000\"\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"\u0001\u0000\u0004\u0003\u0000"+
		"\t\n\r\r  \u0002\u0000AZaz\u0004\u000009AZ__az\u0001\u000009\u00c1\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0001F\u0001\u0000\u0000\u0000"+
		"\u0003L\u0001\u0000\u0000\u0000\u0005O\u0001\u0000\u0000\u0000\u0007U"+
		"\u0001\u0000\u0000\u0000\t[\u0001\u0000\u0000\u0000\u000b]\u0001\u0000"+
		"\u0000\u0000\rg\u0001\u0000\u0000\u0000\u000fl\u0001\u0000\u0000\u0000"+
		"\u0011n\u0001\u0000\u0000\u0000\u0013u\u0001\u0000\u0000\u0000\u0015w"+
		"\u0001\u0000\u0000\u0000\u0017y\u0001\u0000\u0000\u0000\u0019{\u0001\u0000"+
		"\u0000\u0000\u001b}\u0001\u0000\u0000\u0000\u001d\u0080\u0001\u0000\u0000"+
		"\u0000\u001f\u0083\u0001\u0000\u0000\u0000!\u0086\u0001\u0000\u0000\u0000"+
		"#\u008a\u0001\u0000\u0000\u0000%\u008d\u0001\u0000\u0000\u0000\'\u0091"+
		"\u0001\u0000\u0000\u0000)\u0099\u0001\u0000\u0000\u0000+\u009d\u0001\u0000"+
		"\u0000\u0000-\u00a0\u0001\u0000\u0000\u0000/\u00a2\u0001\u0000\u0000\u0000"+
		"1\u00a4\u0001\u0000\u0000\u00003\u00a6\u0001\u0000\u0000\u00005\u00a8"+
		"\u0001\u0000\u0000\u00007\u00aa\u0001\u0000\u0000\u00009\u00ac\u0001\u0000"+
		"\u0000\u0000;\u00ae\u0001\u0000\u0000\u0000=\u00b0\u0001\u0000\u0000\u0000"+
		"?\u00b2\u0001\u0000\u0000\u0000A\u00b5\u0001\u0000\u0000\u0000C\u00ba"+
		"\u0001\u0000\u0000\u0000EG\u0007\u0000\u0000\u0000FE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0006\u0000\u0000\u0000K\u0002"+
		"\u0001\u0000\u0000\u0000LM\u0005p\u0000\u0000MN\u0005i\u0000\u0000N\u0004"+
		"\u0001\u0000\u0000\u0000OP\u0005s\u0000\u0000PQ\u0005i\u0000\u0000QR\u0005"+
		"g\u0000\u0000RS\u0005m\u0000\u0000ST\u0005a\u0000\u0000T\u0006\u0001\u0000"+
		"\u0000\u0000UV\u0005u\u0000\u0000VW\u0005n\u0000\u0000WX\u0005i\u0000"+
		"\u0000XY\u0005o\u0000\u0000YZ\u0005n\u0000\u0000Z\b\u0001\u0000\u0000"+
		"\u0000[\\\u0005\\\u0000\u0000\\\n\u0001\u0000\u0000\u0000]^\u0005i\u0000"+
		"\u0000^_\u0005n\u0000\u0000_`\u0005t\u0000\u0000`a\u0005e\u0000\u0000"+
		"ab\u0005r\u0000\u0000bc\u0005s\u0000\u0000cd\u0005e\u0000\u0000de\u0005"+
		"c\u0000\u0000ef\u0005t\u0000\u0000f\f\u0001\u0000\u0000\u0000gh\u0005"+
		"j\u0000\u0000hi\u0005o\u0000\u0000ij\u0005i\u0000\u0000jk\u0005n\u0000"+
		"\u0000k\u000e\u0001\u0000\u0000\u0000lm\u0005U\u0000\u0000m\u0010\u0001"+
		"\u0000\u0000\u0000nr\u0007\u0001\u0000\u0000oq\u0007\u0002\u0000\u0000"+
		"po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000s\u0012\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000uv\u0005,\u0000\u0000v\u0014\u0001\u0000\u0000\u0000"+
		"wx\u0005=\u0000\u0000x\u0016\u0001\u0000\u0000\u0000yz\u0005>\u0000\u0000"+
		"z\u0018\u0001\u0000\u0000\u0000{|\u0005<\u0000\u0000|\u001a\u0001\u0000"+
		"\u0000\u0000}~\u0005<\u0000\u0000~\u007f\u0005>\u0000\u0000\u007f\u001c"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0005>\u0000\u0000\u0081\u0082\u0005"+
		"=\u0000\u0000\u0082\u001e\u0001\u0000\u0000\u0000\u0083\u0084\u0005<\u0000"+
		"\u0000\u0084\u0085\u0005=\u0000\u0000\u0085 \u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005a\u0000\u0000\u0087\u0088\u0005n\u0000\u0000\u0088\u0089\u0005"+
		"d\u0000\u0000\u0089\"\u0001\u0000\u0000\u0000\u008a\u008b\u0005o\u0000"+
		"\u0000\u008b\u008c\u0005r\u0000\u0000\u008c$\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0005x\u0000\u0000\u008e\u008f\u0005o\u0000\u0000\u008f\u0090\u0005"+
		"r\u0000\u0000\u0090&\u0001\u0000\u0000\u0000\u0091\u0092\u0005i\u0000"+
		"\u0000\u0092\u0093\u0005m\u0000\u0000\u0093\u0094\u0005p\u0000\u0000\u0094"+
		"\u0095\u0005l\u0000\u0000\u0095\u0096\u0005i\u0000\u0000\u0096\u0097\u0005"+
		"e\u0000\u0000\u0097\u0098\u0005s\u0000\u0000\u0098(\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005n\u0000\u0000\u009a\u009b\u0005o\u0000\u0000\u009b"+
		"\u009c\u0005t\u0000\u0000\u009c*\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"-\u0000\u0000\u009e\u009f\u0005>\u0000\u0000\u009f,\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005+\u0000\u0000\u00a1.\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005-\u0000\u0000\u00a30\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005"+
		"*\u0000\u0000\u00a52\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005/\u0000"+
		"\u0000\u00a74\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005%\u0000\u0000\u00a9"+
		"6\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005.\u0000\u0000\u00ab8\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005(\u0000\u0000\u00ad:\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005)\u0000\u0000\u00af<\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0005|\u0000\u0000\u00b1>\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"\'\u0000\u0000\u00b3@\u0001\u0000\u0000\u0000\u00b4\u00b6\u0007\u0001"+
		"\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8B\u0001\u0000\u0000\u0000\u00b9\u00bb\u0007\u0003\u0000"+
		"\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bdD\u0001\u0000\u0000\u0000\u0005\u0000Hr\u00b7\u00bc\u0001"+
		"\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}