// Generated from /Users/novelistchan/Documents/OCL2RA/src/main/java/ocl2ra/OCL2RALexer.g4 by ANTLR 4.10.1
package ocl2ra;
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
		NOT=12, AR=13, DOT=14, LB=15, RB=16, SEP=17, ALL=18, FA=19, SE=20, STRING=21, 
		INT=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SPACE", "EQ", "GT", "LT", "NE", "GE", "LE", "AND", "OR", "XOR", "IMPLY", 
			"NOT", "AR", "DOT", "LB", "RB", "SEP", "ALL", "FA", "SE", "STRING", "INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "'>'", "'<'", "'<>'", "'>='", "'<='", "'and'", "'or'", 
			"'xor'", "'implies'", "'not'", "'->'", "'.'", "'('", "')'", "'|'", "'allInstances()'", 
			"'forAll'", "'select'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "EQ", "GT", "LT", "NE", "GE", "LE", "AND", "OR", "XOR", 
			"IMPLY", "NOT", "AR", "DOT", "LB", "RB", "SEP", "ALL", "FA", "SE", "STRING", 
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
		"\u0004\u0000\u0016\u008c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0004\u0000/\b\u0000\u000b\u0000"+
		"\f\u00000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0004\u0014\u0084\b\u0014\u000b"+
		"\u0014\f\u0014\u0085\u0001\u0015\u0004\u0015\u0089\b\u0015\u000b\u0015"+
		"\f\u0015\u008a\u0000\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016\u0001\u0000\u0003\u0003\u0000\t\n\r\r  \u0002\u0000"+
		"AZaz\u0001\u000009\u008e\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001.\u0001"+
		"\u0000\u0000\u0000\u00034\u0001\u0000\u0000\u0000\u00056\u0001\u0000\u0000"+
		"\u0000\u00078\u0001\u0000\u0000\u0000\t:\u0001\u0000\u0000\u0000\u000b"+
		"=\u0001\u0000\u0000\u0000\r@\u0001\u0000\u0000\u0000\u000fC\u0001\u0000"+
		"\u0000\u0000\u0011G\u0001\u0000\u0000\u0000\u0013J\u0001\u0000\u0000\u0000"+
		"\u0015N\u0001\u0000\u0000\u0000\u0017V\u0001\u0000\u0000\u0000\u0019Z"+
		"\u0001\u0000\u0000\u0000\u001b]\u0001\u0000\u0000\u0000\u001d_\u0001\u0000"+
		"\u0000\u0000\u001fa\u0001\u0000\u0000\u0000!c\u0001\u0000\u0000\u0000"+
		"#e\u0001\u0000\u0000\u0000%t\u0001\u0000\u0000\u0000\'{\u0001\u0000\u0000"+
		"\u0000)\u0083\u0001\u0000\u0000\u0000+\u0088\u0001\u0000\u0000\u0000-"+
		"/\u0007\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000023\u0006\u0000\u0000\u00003\u0002\u0001\u0000\u0000\u0000"+
		"45\u0005=\u0000\u00005\u0004\u0001\u0000\u0000\u000067\u0005>\u0000\u0000"+
		"7\u0006\u0001\u0000\u0000\u000089\u0005<\u0000\u00009\b\u0001\u0000\u0000"+
		"\u0000:;\u0005<\u0000\u0000;<\u0005>\u0000\u0000<\n\u0001\u0000\u0000"+
		"\u0000=>\u0005>\u0000\u0000>?\u0005=\u0000\u0000?\f\u0001\u0000\u0000"+
		"\u0000@A\u0005<\u0000\u0000AB\u0005=\u0000\u0000B\u000e\u0001\u0000\u0000"+
		"\u0000CD\u0005a\u0000\u0000DE\u0005n\u0000\u0000EF\u0005d\u0000\u0000"+
		"F\u0010\u0001\u0000\u0000\u0000GH\u0005o\u0000\u0000HI\u0005r\u0000\u0000"+
		"I\u0012\u0001\u0000\u0000\u0000JK\u0005x\u0000\u0000KL\u0005o\u0000\u0000"+
		"LM\u0005r\u0000\u0000M\u0014\u0001\u0000\u0000\u0000NO\u0005i\u0000\u0000"+
		"OP\u0005m\u0000\u0000PQ\u0005p\u0000\u0000QR\u0005l\u0000\u0000RS\u0005"+
		"i\u0000\u0000ST\u0005e\u0000\u0000TU\u0005s\u0000\u0000U\u0016\u0001\u0000"+
		"\u0000\u0000VW\u0005n\u0000\u0000WX\u0005o\u0000\u0000XY\u0005t\u0000"+
		"\u0000Y\u0018\u0001\u0000\u0000\u0000Z[\u0005-\u0000\u0000[\\\u0005>\u0000"+
		"\u0000\\\u001a\u0001\u0000\u0000\u0000]^\u0005.\u0000\u0000^\u001c\u0001"+
		"\u0000\u0000\u0000_`\u0005(\u0000\u0000`\u001e\u0001\u0000\u0000\u0000"+
		"ab\u0005)\u0000\u0000b \u0001\u0000\u0000\u0000cd\u0005|\u0000\u0000d"+
		"\"\u0001\u0000\u0000\u0000ef\u0005a\u0000\u0000fg\u0005l\u0000\u0000g"+
		"h\u0005l\u0000\u0000hi\u0005I\u0000\u0000ij\u0005n\u0000\u0000jk\u0005"+
		"s\u0000\u0000kl\u0005t\u0000\u0000lm\u0005a\u0000\u0000mn\u0005n\u0000"+
		"\u0000no\u0005c\u0000\u0000op\u0005e\u0000\u0000pq\u0005s\u0000\u0000"+
		"qr\u0005(\u0000\u0000rs\u0005)\u0000\u0000s$\u0001\u0000\u0000\u0000t"+
		"u\u0005f\u0000\u0000uv\u0005o\u0000\u0000vw\u0005r\u0000\u0000wx\u0005"+
		"A\u0000\u0000xy\u0005l\u0000\u0000yz\u0005l\u0000\u0000z&\u0001\u0000"+
		"\u0000\u0000{|\u0005s\u0000\u0000|}\u0005e\u0000\u0000}~\u0005l\u0000"+
		"\u0000~\u007f\u0005e\u0000\u0000\u007f\u0080\u0005c\u0000\u0000\u0080"+
		"\u0081\u0005t\u0000\u0000\u0081(\u0001\u0000\u0000\u0000\u0082\u0084\u0007"+
		"\u0001\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086*\u0001\u0000\u0000\u0000\u0087\u0089\u0007\u0002"+
		"\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b,\u0001\u0000\u0000\u0000\u0004\u00000\u0085\u008a\u0001"+
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