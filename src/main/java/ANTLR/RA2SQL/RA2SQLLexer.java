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
		LE=16, AND=17, OR=18, XOR=19, IMPLY=20, NOT=21, AR=22, DOT=23, LB=24, 
		RB=25, SEP=26, QUOTE=27, STRING=28, INT=29;
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
			"LE", "AND", "OR", "XOR", "IMPLY", "NOT", "AR", "DOT", "LB", "RB", "SEP", 
			"QUOTE", "STRING", "INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'pi'", "'sigma'", "'union'", "'\\'", "'intersect'", "'join'", 
			"'U'", null, "','", "'='", "'>'", "'<'", "'<>'", "'>='", "'<='", "'and'", 
			"'or'", "'xor'", "'implies'", "'not'", "'->'", "'.'", "'('", "')'", "'|'", 
			"'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "PROJECTION", "SELECTION", "UNION", "DIFFER", "INTERSECTION", 
			"JOIN", "UNIVERSALSET", "ID", "COMMA", "EQ", "GT", "LT", "NE", "GE", 
			"LE", "AND", "OR", "XOR", "IMPLY", "NOT", "AR", "DOT", "LB", "RB", "SEP", 
			"QUOTE", "STRING", "INT"
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
		"\u0004\u0000\u001d\u00aa\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0004\u0000"+
		"=\b\u0000\u000b\u0000\f\u0000>\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bg\b\b\n\b\f\bj\t"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0004\u001b\u00a2\b\u001b\u000b\u001b"+
		"\f\u001b\u00a3\u0001\u001c\u0004\u001c\u00a7\b\u001c\u000b\u001c\f\u001c"+
		"\u00a8\u0000\u0000\u001d\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		"\u0001\u0000\u0004\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0004\u00000"+
		"9AZ__az\u0001\u000009\u00ad\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0001<"+
		"\u0001\u0000\u0000\u0000\u0003B\u0001\u0000\u0000\u0000\u0005E\u0001\u0000"+
		"\u0000\u0000\u0007K\u0001\u0000\u0000\u0000\tQ\u0001\u0000\u0000\u0000"+
		"\u000bS\u0001\u0000\u0000\u0000\r]\u0001\u0000\u0000\u0000\u000fb\u0001"+
		"\u0000\u0000\u0000\u0011d\u0001\u0000\u0000\u0000\u0013k\u0001\u0000\u0000"+
		"\u0000\u0015m\u0001\u0000\u0000\u0000\u0017o\u0001\u0000\u0000\u0000\u0019"+
		"q\u0001\u0000\u0000\u0000\u001bs\u0001\u0000\u0000\u0000\u001dv\u0001"+
		"\u0000\u0000\u0000\u001fy\u0001\u0000\u0000\u0000!|\u0001\u0000\u0000"+
		"\u0000#\u0080\u0001\u0000\u0000\u0000%\u0083\u0001\u0000\u0000\u0000\'"+
		"\u0087\u0001\u0000\u0000\u0000)\u008f\u0001\u0000\u0000\u0000+\u0093\u0001"+
		"\u0000\u0000\u0000-\u0096\u0001\u0000\u0000\u0000/\u0098\u0001\u0000\u0000"+
		"\u00001\u009a\u0001\u0000\u0000\u00003\u009c\u0001\u0000\u0000\u00005"+
		"\u009e\u0001\u0000\u0000\u00007\u00a1\u0001\u0000\u0000\u00009\u00a6\u0001"+
		"\u0000\u0000\u0000;=\u0007\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@A\u0006\u0000\u0000\u0000A\u0002\u0001"+
		"\u0000\u0000\u0000BC\u0005p\u0000\u0000CD\u0005i\u0000\u0000D\u0004\u0001"+
		"\u0000\u0000\u0000EF\u0005s\u0000\u0000FG\u0005i\u0000\u0000GH\u0005g"+
		"\u0000\u0000HI\u0005m\u0000\u0000IJ\u0005a\u0000\u0000J\u0006\u0001\u0000"+
		"\u0000\u0000KL\u0005u\u0000\u0000LM\u0005n\u0000\u0000MN\u0005i\u0000"+
		"\u0000NO\u0005o\u0000\u0000OP\u0005n\u0000\u0000P\b\u0001\u0000\u0000"+
		"\u0000QR\u0005\\\u0000\u0000R\n\u0001\u0000\u0000\u0000ST\u0005i\u0000"+
		"\u0000TU\u0005n\u0000\u0000UV\u0005t\u0000\u0000VW\u0005e\u0000\u0000"+
		"WX\u0005r\u0000\u0000XY\u0005s\u0000\u0000YZ\u0005e\u0000\u0000Z[\u0005"+
		"c\u0000\u0000[\\\u0005t\u0000\u0000\\\f\u0001\u0000\u0000\u0000]^\u0005"+
		"j\u0000\u0000^_\u0005o\u0000\u0000_`\u0005i\u0000\u0000`a\u0005n\u0000"+
		"\u0000a\u000e\u0001\u0000\u0000\u0000bc\u0005U\u0000\u0000c\u0010\u0001"+
		"\u0000\u0000\u0000dh\u0007\u0001\u0000\u0000eg\u0007\u0002\u0000\u0000"+
		"fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000i\u0012\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000kl\u0005,\u0000\u0000l\u0014\u0001\u0000\u0000\u0000"+
		"mn\u0005=\u0000\u0000n\u0016\u0001\u0000\u0000\u0000op\u0005>\u0000\u0000"+
		"p\u0018\u0001\u0000\u0000\u0000qr\u0005<\u0000\u0000r\u001a\u0001\u0000"+
		"\u0000\u0000st\u0005<\u0000\u0000tu\u0005>\u0000\u0000u\u001c\u0001\u0000"+
		"\u0000\u0000vw\u0005>\u0000\u0000wx\u0005=\u0000\u0000x\u001e\u0001\u0000"+
		"\u0000\u0000yz\u0005<\u0000\u0000z{\u0005=\u0000\u0000{ \u0001\u0000\u0000"+
		"\u0000|}\u0005a\u0000\u0000}~\u0005n\u0000\u0000~\u007f\u0005d\u0000\u0000"+
		"\u007f\"\u0001\u0000\u0000\u0000\u0080\u0081\u0005o\u0000\u0000\u0081"+
		"\u0082\u0005r\u0000\u0000\u0082$\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"x\u0000\u0000\u0084\u0085\u0005o\u0000\u0000\u0085\u0086\u0005r\u0000"+
		"\u0000\u0086&\u0001\u0000\u0000\u0000\u0087\u0088\u0005i\u0000\u0000\u0088"+
		"\u0089\u0005m\u0000\u0000\u0089\u008a\u0005p\u0000\u0000\u008a\u008b\u0005"+
		"l\u0000\u0000\u008b\u008c\u0005i\u0000\u0000\u008c\u008d\u0005e\u0000"+
		"\u0000\u008d\u008e\u0005s\u0000\u0000\u008e(\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005n\u0000\u0000\u0090\u0091\u0005o\u0000\u0000\u0091\u0092\u0005"+
		"t\u0000\u0000\u0092*\u0001\u0000\u0000\u0000\u0093\u0094\u0005-\u0000"+
		"\u0000\u0094\u0095\u0005>\u0000\u0000\u0095,\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005.\u0000\u0000\u0097.\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"(\u0000\u0000\u00990\u0001\u0000\u0000\u0000\u009a\u009b\u0005)\u0000"+
		"\u0000\u009b2\u0001\u0000\u0000\u0000\u009c\u009d\u0005|\u0000\u0000\u009d"+
		"4\u0001\u0000\u0000\u0000\u009e\u009f\u0005\'\u0000\u0000\u009f6\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a2\u0007\u0001\u0000\u0000\u00a1\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a48\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a7\u0007\u0003\u0000\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9:\u0001\u0000\u0000"+
		"\u0000\u0005\u0000>h\u00a3\u00a8\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}