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
		SE=21, CTX=22, COLON=23, INV=24, ID=25, INT=26;
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
			"COLON", "INV", "ID", "INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "'>'", "'<'", "'<>'", "'>='", "'<='", "'and'", "'or'", 
			"'xor'", "'implies'", "'not'", "'->'", "'.'", "'('", "')'", "'|'", "'''", 
			"'allInstances()'", "'forAll'", "'select'", "'context'", "':'", "'inv'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "EQ", "GT", "LT", "NE", "GE", "LE", "AND", "OR", "XOR", 
			"IMPLY", "NOT", "AR", "DOT", "LB", "RB", "SEP", "QUOTE", "ALL", "FA", 
			"SE", "CTX", "COLON", "INV", "ID", "INT"
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
		"\u0004\u0000\u001a\u00a6\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0004\u0000"+
		"7\b\u0000\u000b\u0000\f\u00008\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u009d\b\u0018"+
		"\n\u0018\f\u0018\u00a0\t\u0018\u0001\u0019\u0004\u0019\u00a3\b\u0019\u000b"+
		"\u0019\f\u0019\u00a4\u0000\u0000\u001a\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a\u0001\u0000"+
		"\u0004\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0004\u000009AZ__az\u0001"+
		"\u000009\u00a8\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00016\u0001\u0000\u0000\u0000\u0003<\u0001"+
		"\u0000\u0000\u0000\u0005>\u0001\u0000\u0000\u0000\u0007@\u0001\u0000\u0000"+
		"\u0000\tB\u0001\u0000\u0000\u0000\u000bE\u0001\u0000\u0000\u0000\rH\u0001"+
		"\u0000\u0000\u0000\u000fK\u0001\u0000\u0000\u0000\u0011O\u0001\u0000\u0000"+
		"\u0000\u0013R\u0001\u0000\u0000\u0000\u0015V\u0001\u0000\u0000\u0000\u0017"+
		"^\u0001\u0000\u0000\u0000\u0019b\u0001\u0000\u0000\u0000\u001be\u0001"+
		"\u0000\u0000\u0000\u001dg\u0001\u0000\u0000\u0000\u001fi\u0001\u0000\u0000"+
		"\u0000!k\u0001\u0000\u0000\u0000#m\u0001\u0000\u0000\u0000%o\u0001\u0000"+
		"\u0000\u0000\'~\u0001\u0000\u0000\u0000)\u0085\u0001\u0000\u0000\u0000"+
		"+\u008c\u0001\u0000\u0000\u0000-\u0094\u0001\u0000\u0000\u0000/\u0096"+
		"\u0001\u0000\u0000\u00001\u009a\u0001\u0000\u0000\u00003\u00a2\u0001\u0000"+
		"\u0000\u000057\u0007\u0000\u0000\u000065\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:;\u0006\u0000\u0000\u0000;\u0002\u0001\u0000"+
		"\u0000\u0000<=\u0005=\u0000\u0000=\u0004\u0001\u0000\u0000\u0000>?\u0005"+
		">\u0000\u0000?\u0006\u0001\u0000\u0000\u0000@A\u0005<\u0000\u0000A\b\u0001"+
		"\u0000\u0000\u0000BC\u0005<\u0000\u0000CD\u0005>\u0000\u0000D\n\u0001"+
		"\u0000\u0000\u0000EF\u0005>\u0000\u0000FG\u0005=\u0000\u0000G\f\u0001"+
		"\u0000\u0000\u0000HI\u0005<\u0000\u0000IJ\u0005=\u0000\u0000J\u000e\u0001"+
		"\u0000\u0000\u0000KL\u0005a\u0000\u0000LM\u0005n\u0000\u0000MN\u0005d"+
		"\u0000\u0000N\u0010\u0001\u0000\u0000\u0000OP\u0005o\u0000\u0000PQ\u0005"+
		"r\u0000\u0000Q\u0012\u0001\u0000\u0000\u0000RS\u0005x\u0000\u0000ST\u0005"+
		"o\u0000\u0000TU\u0005r\u0000\u0000U\u0014\u0001\u0000\u0000\u0000VW\u0005"+
		"i\u0000\u0000WX\u0005m\u0000\u0000XY\u0005p\u0000\u0000YZ\u0005l\u0000"+
		"\u0000Z[\u0005i\u0000\u0000[\\\u0005e\u0000\u0000\\]\u0005s\u0000\u0000"+
		"]\u0016\u0001\u0000\u0000\u0000^_\u0005n\u0000\u0000_`\u0005o\u0000\u0000"+
		"`a\u0005t\u0000\u0000a\u0018\u0001\u0000\u0000\u0000bc\u0005-\u0000\u0000"+
		"cd\u0005>\u0000\u0000d\u001a\u0001\u0000\u0000\u0000ef\u0005.\u0000\u0000"+
		"f\u001c\u0001\u0000\u0000\u0000gh\u0005(\u0000\u0000h\u001e\u0001\u0000"+
		"\u0000\u0000ij\u0005)\u0000\u0000j \u0001\u0000\u0000\u0000kl\u0005|\u0000"+
		"\u0000l\"\u0001\u0000\u0000\u0000mn\u0005\'\u0000\u0000n$\u0001\u0000"+
		"\u0000\u0000op\u0005a\u0000\u0000pq\u0005l\u0000\u0000qr\u0005l\u0000"+
		"\u0000rs\u0005I\u0000\u0000st\u0005n\u0000\u0000tu\u0005s\u0000\u0000"+
		"uv\u0005t\u0000\u0000vw\u0005a\u0000\u0000wx\u0005n\u0000\u0000xy\u0005"+
		"c\u0000\u0000yz\u0005e\u0000\u0000z{\u0005s\u0000\u0000{|\u0005(\u0000"+
		"\u0000|}\u0005)\u0000\u0000}&\u0001\u0000\u0000\u0000~\u007f\u0005f\u0000"+
		"\u0000\u007f\u0080\u0005o\u0000\u0000\u0080\u0081\u0005r\u0000\u0000\u0081"+
		"\u0082\u0005A\u0000\u0000\u0082\u0083\u0005l\u0000\u0000\u0083\u0084\u0005"+
		"l\u0000\u0000\u0084(\u0001\u0000\u0000\u0000\u0085\u0086\u0005s\u0000"+
		"\u0000\u0086\u0087\u0005e\u0000\u0000\u0087\u0088\u0005l\u0000\u0000\u0088"+
		"\u0089\u0005e\u0000\u0000\u0089\u008a\u0005c\u0000\u0000\u008a\u008b\u0005"+
		"t\u0000\u0000\u008b*\u0001\u0000\u0000\u0000\u008c\u008d\u0005c\u0000"+
		"\u0000\u008d\u008e\u0005o\u0000\u0000\u008e\u008f\u0005n\u0000\u0000\u008f"+
		"\u0090\u0005t\u0000\u0000\u0090\u0091\u0005e\u0000\u0000\u0091\u0092\u0005"+
		"x\u0000\u0000\u0092\u0093\u0005t\u0000\u0000\u0093,\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005:\u0000\u0000\u0095.\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005i\u0000\u0000\u0097\u0098\u0005n\u0000\u0000\u0098\u0099\u0005"+
		"v\u0000\u0000\u00990\u0001\u0000\u0000\u0000\u009a\u009e\u0007\u0001\u0000"+
		"\u0000\u009b\u009d\u0007\u0002\u0000\u0000\u009c\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f2\u0001\u0000\u0000\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a3\u0007\u0003\u0000\u0000"+
		"\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a54\u0001\u0000\u0000\u0000\u0004\u00008\u009e\u00a4\u0001\u0000\u0001"+
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