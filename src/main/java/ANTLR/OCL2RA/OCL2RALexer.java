// Generated from /Users/novelistchan/Documents/OCLfo2SQL/src/main/java/ANTLR/OCL2RA/OCL2RALexer.g4 by ANTLR 4.10.1
package ANTLR.OCL2RA;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OCL2RALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, EQ=2, GT=3, LT=4, NE=5, GE=6, LE=7, AND=8, OR=9, XOR=10, IMPLY=11, 
		NOT=12, AR=13, DOT=14, LB=15, RB=16, SEP=17, QUOTE=18, ALL=19, FA=20, 
		SE=21, CTX=22, COLON=23, INV=24, ADD=25, MIN=26, MUL=27, DIV=28, MOD=29, 
		ID=30, INT=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SPACE", "EQ", "GT", "LT", "NE", "GE", "LE", "AND", "OR", "XOR", "IMPLY", 
			"NOT", "AR", "DOT", "LB", "RB", "SEP", "QUOTE", "ALL", "FA", "SE", "CTX", 
			"COLON", "INV", "ADD", "MIN", "MUL", "DIV", "MOD", "ID", "INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "'>'", "'<'", "'<>'", "'>='", "'<='", "'and'", "'or'", 
			"'xor'", "'implies'", "'not'", "'->'", "'.'", "'('", "')'", "'|'", "'''", 
			"'allInstances()'", "'forAll'", "'select'", "'context'", "':'", "'inv'", 
			"'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "EQ", "GT", "LT", "NE", "GE", "LE", "AND", "OR", "XOR", 
			"IMPLY", "NOT", "AR", "DOT", "LB", "RB", "SEP", "QUOTE", "ALL", "FA", 
			"SE", "CTX", "COLON", "INV", "ADD", "MIN", "MUL", "DIV", "MOD", "ID", 
			"INT"
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


	public OCL2RALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OCL2RALexer.g4"; }

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
		"\u0004\u0000\u001f\u00ba\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0004\u0000A\b\u0000\u000b\u0000"+
		"\f\u0000B\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u00b1\b\u001d\n\u001d\f\u001d\u00b4\t\u001d\u0001\u001e"+
		"\u0004\u001e\u00b7\b\u001e\u000b\u001e\f\u001e\u00b8\u0000\u0000\u001f"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f\u0001\u0000\u0004"+
		"\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0004\u000009AZ__az\u0001\u0000"+
		"09\u00bc\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000"+
		"\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000"+
		"\u0000=\u0001\u0000\u0000\u0000\u0001@\u0001\u0000\u0000\u0000\u0003F"+
		"\u0001\u0000\u0000\u0000\u0005H\u0001\u0000\u0000\u0000\u0007J\u0001\u0000"+
		"\u0000\u0000\tL\u0001\u0000\u0000\u0000\u000bO\u0001\u0000\u0000\u0000"+
		"\rR\u0001\u0000\u0000\u0000\u000fU\u0001\u0000\u0000\u0000\u0011Y\u0001"+
		"\u0000\u0000\u0000\u0013\\\u0001\u0000\u0000\u0000\u0015`\u0001\u0000"+
		"\u0000\u0000\u0017h\u0001\u0000\u0000\u0000\u0019l\u0001\u0000\u0000\u0000"+
		"\u001bo\u0001\u0000\u0000\u0000\u001dq\u0001\u0000\u0000\u0000\u001fs"+
		"\u0001\u0000\u0000\u0000!u\u0001\u0000\u0000\u0000#w\u0001\u0000\u0000"+
		"\u0000%y\u0001\u0000\u0000\u0000\'\u0088\u0001\u0000\u0000\u0000)\u008f"+
		"\u0001\u0000\u0000\u0000+\u0096\u0001\u0000\u0000\u0000-\u009e\u0001\u0000"+
		"\u0000\u0000/\u00a0\u0001\u0000\u0000\u00001\u00a4\u0001\u0000\u0000\u0000"+
		"3\u00a6\u0001\u0000\u0000\u00005\u00a8\u0001\u0000\u0000\u00007\u00aa"+
		"\u0001\u0000\u0000\u00009\u00ac\u0001\u0000\u0000\u0000;\u00ae\u0001\u0000"+
		"\u0000\u0000=\u00b6\u0001\u0000\u0000\u0000?A\u0007\u0000\u0000\u0000"+
		"@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0006\u0000"+
		"\u0000\u0000E\u0002\u0001\u0000\u0000\u0000FG\u0005=\u0000\u0000G\u0004"+
		"\u0001\u0000\u0000\u0000HI\u0005>\u0000\u0000I\u0006\u0001\u0000\u0000"+
		"\u0000JK\u0005<\u0000\u0000K\b\u0001\u0000\u0000\u0000LM\u0005<\u0000"+
		"\u0000MN\u0005>\u0000\u0000N\n\u0001\u0000\u0000\u0000OP\u0005>\u0000"+
		"\u0000PQ\u0005=\u0000\u0000Q\f\u0001\u0000\u0000\u0000RS\u0005<\u0000"+
		"\u0000ST\u0005=\u0000\u0000T\u000e\u0001\u0000\u0000\u0000UV\u0005a\u0000"+
		"\u0000VW\u0005n\u0000\u0000WX\u0005d\u0000\u0000X\u0010\u0001\u0000\u0000"+
		"\u0000YZ\u0005o\u0000\u0000Z[\u0005r\u0000\u0000[\u0012\u0001\u0000\u0000"+
		"\u0000\\]\u0005x\u0000\u0000]^\u0005o\u0000\u0000^_\u0005r\u0000\u0000"+
		"_\u0014\u0001\u0000\u0000\u0000`a\u0005i\u0000\u0000ab\u0005m\u0000\u0000"+
		"bc\u0005p\u0000\u0000cd\u0005l\u0000\u0000de\u0005i\u0000\u0000ef\u0005"+
		"e\u0000\u0000fg\u0005s\u0000\u0000g\u0016\u0001\u0000\u0000\u0000hi\u0005"+
		"n\u0000\u0000ij\u0005o\u0000\u0000jk\u0005t\u0000\u0000k\u0018\u0001\u0000"+
		"\u0000\u0000lm\u0005-\u0000\u0000mn\u0005>\u0000\u0000n\u001a\u0001\u0000"+
		"\u0000\u0000op\u0005.\u0000\u0000p\u001c\u0001\u0000\u0000\u0000qr\u0005"+
		"(\u0000\u0000r\u001e\u0001\u0000\u0000\u0000st\u0005)\u0000\u0000t \u0001"+
		"\u0000\u0000\u0000uv\u0005|\u0000\u0000v\"\u0001\u0000\u0000\u0000wx\u0005"+
		"\'\u0000\u0000x$\u0001\u0000\u0000\u0000yz\u0005a\u0000\u0000z{\u0005"+
		"l\u0000\u0000{|\u0005l\u0000\u0000|}\u0005I\u0000\u0000}~\u0005n\u0000"+
		"\u0000~\u007f\u0005s\u0000\u0000\u007f\u0080\u0005t\u0000\u0000\u0080"+
		"\u0081\u0005a\u0000\u0000\u0081\u0082\u0005n\u0000\u0000\u0082\u0083\u0005"+
		"c\u0000\u0000\u0083\u0084\u0005e\u0000\u0000\u0084\u0085\u0005s\u0000"+
		"\u0000\u0085\u0086\u0005(\u0000\u0000\u0086\u0087\u0005)\u0000\u0000\u0087"+
		"&\u0001\u0000\u0000\u0000\u0088\u0089\u0005f\u0000\u0000\u0089\u008a\u0005"+
		"o\u0000\u0000\u008a\u008b\u0005r\u0000\u0000\u008b\u008c\u0005A\u0000"+
		"\u0000\u008c\u008d\u0005l\u0000\u0000\u008d\u008e\u0005l\u0000\u0000\u008e"+
		"(\u0001\u0000\u0000\u0000\u008f\u0090\u0005s\u0000\u0000\u0090\u0091\u0005"+
		"e\u0000\u0000\u0091\u0092\u0005l\u0000\u0000\u0092\u0093\u0005e\u0000"+
		"\u0000\u0093\u0094\u0005c\u0000\u0000\u0094\u0095\u0005t\u0000\u0000\u0095"+
		"*\u0001\u0000\u0000\u0000\u0096\u0097\u0005c\u0000\u0000\u0097\u0098\u0005"+
		"o\u0000\u0000\u0098\u0099\u0005n\u0000\u0000\u0099\u009a\u0005t\u0000"+
		"\u0000\u009a\u009b\u0005e\u0000\u0000\u009b\u009c\u0005x\u0000\u0000\u009c"+
		"\u009d\u0005t\u0000\u0000\u009d,\u0001\u0000\u0000\u0000\u009e\u009f\u0005"+
		":\u0000\u0000\u009f.\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005i\u0000"+
		"\u0000\u00a1\u00a2\u0005n\u0000\u0000\u00a2\u00a3\u0005v\u0000\u0000\u00a3"+
		"0\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005+\u0000\u0000\u00a52\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005-\u0000\u0000\u00a74\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005*\u0000\u0000\u00a96\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0005/\u0000\u0000\u00ab8\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"%\u0000\u0000\u00ad:\u0001\u0000\u0000\u0000\u00ae\u00b2\u0007\u0001\u0000"+
		"\u0000\u00af\u00b1\u0007\u0002\u0000\u0000\u00b0\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3<\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b7\u0007\u0003\u0000\u0000"+
		"\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9>\u0001\u0000\u0000\u0000\u0004\u0000B\u00b2\u00b8\u0001\u0000\u0001"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}