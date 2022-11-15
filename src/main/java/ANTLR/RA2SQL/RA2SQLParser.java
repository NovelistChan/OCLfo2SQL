// Generated from /Users/novelistchan/Documents/OCLfo2SQL/src/main/java/ANTLR/RA2SQL/RA2SQLParser.g4 by ANTLR 4.10.1
package ANTLR.RA2SQL;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RA2SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, PROJECTION=2, SELECTION=3, UNION=4, DIFFER=5, INTERSECTION=6, 
		JOIN=7, UNIVERSALSET=8, ID=9, COMMA=10, EQ=11, GT=12, LT=13, NE=14, GE=15, 
		LE=16, AND=17, OR=18, XOR=19, IMPLY=20, NOT=21, AR=22, DOT=23, LB=24, 
		RB=25, SEP=26, STRING=27, INT=28;
	public static final int
		RULE_script = 0, RULE_relation = 1, RULE_projection = 2, RULE_selection = 3, 
		RULE_columns = 4, RULE_column = 5, RULE_expression = 6, RULE_compOp = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "relation", "projection", "selection", "columns", "column", 
			"expression", "compOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Pi'", "'Sigma'", "'union'", "'\\'", "'intersect'", "'join'", 
			"'U'", null, "','", "'='", "'>'", "'<'", "'<>'", "'>='", "'<='", "'and'", 
			"'or'", "'xor'", "'implies'", "'not'", "'->'", "'.'", "'('", "')'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "PROJECTION", "SELECTION", "UNION", "DIFFER", "INTERSECTION", 
			"JOIN", "UNIVERSALSET", "ID", "COMMA", "EQ", "GT", "LT", "NE", "GE", 
			"LE", "AND", "OR", "XOR", "IMPLY", "NOT", "AR", "DOT", "LB", "RB", "SEP", 
			"STRING", "INT"
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
	public String getGrammarFileName() { return "RA2SQLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RA2SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RA2SQLParser.EOF, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				relation(0);
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROJECTION) | (1L << SELECTION) | (1L << UNIVERSALSET) | (1L << ID))) != 0) );
			setState(21);
			match(EOF);
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

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UdifferContext extends RelationContext {
		public TerminalNode UNIVERSALSET() { return getToken(RA2SQLParser.UNIVERSALSET, 0); }
		public TerminalNode DIFFER() { return getToken(RA2SQLParser.DIFFER, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public UdifferContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterUdiffer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitUdiffer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitUdiffer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectContext extends RelationContext {
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public SelectContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntersectContext extends RelationContext {
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode INTERSECTION() { return getToken(RA2SQLParser.INTERSECTION, 0); }
		public IntersectContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterIntersect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitIntersect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitIntersect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProjectContext extends RelationContext {
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public ProjectContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterProject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitProject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitProject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends RelationContext {
		public TerminalNode ID() { return getToken(RA2SQLParser.ID, 0); }
		public IdContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnionContext extends RelationContext {
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode UNION() { return getToken(RA2SQLParser.UNION, 0); }
		public UnionContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinContext extends RelationContext {
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(RA2SQLParser.JOIN, 0); }
		public JoinContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DifferContext extends RelationContext {
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode DIFFER() { return getToken(RA2SQLParser.DIFFER, 0); }
		public DifferContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterDiffer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitDiffer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitDiffer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROJECTION:
				{
				_localctx = new ProjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(24);
				projection();
				}
				break;
			case SELECTION:
				{
				_localctx = new SelectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25);
				selection();
				}
				break;
			case UNIVERSALSET:
				{
				_localctx = new UdifferContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				match(UNIVERSALSET);
				setState(27);
				match(DIFFER);
				setState(28);
				relation(3);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(44);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new UnionContext(new RelationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relation);
						setState(32);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(33);
						match(UNION);
						setState(34);
						relation(7);
						}
						break;
					case 2:
						{
						_localctx = new IntersectContext(new RelationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relation);
						setState(35);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(36);
						match(INTERSECTION);
						setState(37);
						relation(6);
						}
						break;
					case 3:
						{
						_localctx = new DifferContext(new RelationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relation);
						setState(38);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(39);
						match(DIFFER);
						setState(40);
						relation(5);
						}
						break;
					case 4:
						{
						_localctx = new JoinContext(new RelationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relation);
						setState(41);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(42);
						match(JOIN);
						setState(43);
						relation(3);
						}
						break;
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ProjectionContext extends ParserRuleContext {
		public TerminalNode PROJECTION() { return getToken(RA2SQLParser.PROJECTION, 0); }
		public TerminalNode LB() { return getToken(RA2SQLParser.LB, 0); }
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public TerminalNode RB() { return getToken(RA2SQLParser.RB, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_projection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(PROJECTION);
			setState(50);
			match(LB);
			setState(51);
			columns();
			setState(52);
			match(RB);
			setState(53);
			relation(0);
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

	public static class SelectionContext extends ParserRuleContext {
		public TerminalNode SELECTION() { return getToken(RA2SQLParser.SELECTION, 0); }
		public TerminalNode LB() { return getToken(RA2SQLParser.LB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RB() { return getToken(RA2SQLParser.RB, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(SELECTION);
			setState(56);
			match(LB);
			setState(57);
			expression();
			setState(58);
			match(RB);
			setState(59);
			relation(0);
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

	public static class ColumnsContext extends ParserRuleContext {
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
	 
		public ColumnsContext() { }
		public void copyFrom(ColumnsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnOneContext extends ColumnsContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public ColumnOneContext(ColumnsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterColumnOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitColumnOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitColumnOne(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnManyContext extends ColumnsContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RA2SQLParser.COMMA, 0); }
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public ColumnManyContext(ColumnsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterColumnMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitColumnMany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitColumnMany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_columns);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ColumnManyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				column(0);
				setState(62);
				match(COMMA);
				setState(63);
				columns();
				}
				break;
			case 2:
				_localctx = new ColumnOneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				column(0);
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

	public static class ColumnContext extends ParserRuleContext {
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
	 
		public ColumnContext() { }
		public void copyFrom(ColumnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdManyContext extends ColumnContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RA2SQLParser.DOT, 0); }
		public TerminalNode ID() { return getToken(RA2SQLParser.ID, 0); }
		public IdManyContext(ColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterIdMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitIdMany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitIdMany(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdOneContext extends ColumnContext {
		public TerminalNode ID() { return getToken(RA2SQLParser.ID, 0); }
		public IdOneContext(ColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterIdOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitIdOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitIdOne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		return column(0);
	}

	private ColumnContext column(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ColumnContext _localctx = new ColumnContext(_ctx, _parentState);
		ColumnContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_column, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IdOneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(69);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdManyContext(new ColumnContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_column);
					setState(71);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(72);
					match(DOT);
					setState(73);
					match(ID);
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			column(0);
			setState(80);
			compOp();
			setState(81);
			column(0);
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

	public static class CompOpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(RA2SQLParser.EQ, 0); }
		public TerminalNode GE() { return getToken(RA2SQLParser.GE, 0); }
		public TerminalNode LE() { return getToken(RA2SQLParser.LE, 0); }
		public TerminalNode GT() { return getToken(RA2SQLParser.GT, 0); }
		public TerminalNode LT() { return getToken(RA2SQLParser.LT, 0); }
		public TerminalNode NE() { return getToken(RA2SQLParser.NE, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RA2SQLParserListener ) ((RA2SQLParserListener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RA2SQLParserVisitor ) return ((RA2SQLParserVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GT) | (1L << LT) | (1L << NE) | (1L << GE) | (1L << LE))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 5:
			return column_sempred((ColumnContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean column_sempred(ColumnContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001cV\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u001f\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001-\b\u0001"+
		"\n\u0001\f\u00010\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004C\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005K\b\u0005\n\u0005\f\u0005"+
		"N\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0000\u0002\u0002\n\b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0000\u0001\u0001\u0000\u000b\u0010W\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u00041\u0001\u0000\u0000"+
		"\u0000\u00067\u0001\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000\nD\u0001"+
		"\u0000\u0000\u0000\fO\u0001\u0000\u0000\u0000\u000eS\u0001\u0000\u0000"+
		"\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011\u0010\u0001\u0000\u0000"+
		"\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0001\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0006\u0001\uffff\uffff\u0000\u0018\u001f\u0003\u0004"+
		"\u0002\u0000\u0019\u001f\u0003\u0006\u0003\u0000\u001a\u001b\u0005\b\u0000"+
		"\u0000\u001b\u001c\u0005\u0005\u0000\u0000\u001c\u001f\u0003\u0002\u0001"+
		"\u0003\u001d\u001f\u0005\t\u0000\u0000\u001e\u0017\u0001\u0000\u0000\u0000"+
		"\u001e\u0019\u0001\u0000\u0000\u0000\u001e\u001a\u0001\u0000\u0000\u0000"+
		"\u001e\u001d\u0001\u0000\u0000\u0000\u001f.\u0001\u0000\u0000\u0000 !"+
		"\n\u0006\u0000\u0000!\"\u0005\u0004\u0000\u0000\"-\u0003\u0002\u0001\u0007"+
		"#$\n\u0005\u0000\u0000$%\u0005\u0006\u0000\u0000%-\u0003\u0002\u0001\u0006"+
		"&\'\n\u0004\u0000\u0000\'(\u0005\u0005\u0000\u0000(-\u0003\u0002\u0001"+
		"\u0005)*\n\u0002\u0000\u0000*+\u0005\u0007\u0000\u0000+-\u0003\u0002\u0001"+
		"\u0003, \u0001\u0000\u0000\u0000,#\u0001\u0000\u0000\u0000,&\u0001\u0000"+
		"\u0000\u0000,)\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\u0003\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u000012\u0005\u0002\u0000\u000023\u0005\u0018"+
		"\u0000\u000034\u0003\b\u0004\u000045\u0005\u0019\u0000\u000056\u0003\u0002"+
		"\u0001\u00006\u0005\u0001\u0000\u0000\u000078\u0005\u0003\u0000\u0000"+
		"89\u0005\u0018\u0000\u00009:\u0003\f\u0006\u0000:;\u0005\u0019\u0000\u0000"+
		";<\u0003\u0002\u0001\u0000<\u0007\u0001\u0000\u0000\u0000=>\u0003\n\u0005"+
		"\u0000>?\u0005\n\u0000\u0000?@\u0003\b\u0004\u0000@C\u0001\u0000\u0000"+
		"\u0000AC\u0003\n\u0005\u0000B=\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000"+
		"\u0000C\t\u0001\u0000\u0000\u0000DE\u0006\u0005\uffff\uffff\u0000EF\u0005"+
		"\t\u0000\u0000FL\u0001\u0000\u0000\u0000GH\n\u0001\u0000\u0000HI\u0005"+
		"\u0017\u0000\u0000IK\u0005\t\u0000\u0000JG\u0001\u0000\u0000\u0000KN\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"M\u000b\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0003\n\u0005"+
		"\u0000PQ\u0003\u000e\u0007\u0000QR\u0003\n\u0005\u0000R\r\u0001\u0000"+
		"\u0000\u0000ST\u0007\u0000\u0000\u0000T\u000f\u0001\u0000\u0000\u0000"+
		"\u0006\u0013\u001e,.BL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}