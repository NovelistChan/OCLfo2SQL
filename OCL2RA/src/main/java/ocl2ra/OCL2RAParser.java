// Generated from /Users/novelistchan/Documents/OCL2RA/src/main/java/ocl2ra/OCL2RAParser.g4 by ANTLR 4.10.1
package ocl2ra;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OCL2RAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, EQ=2, GT=3, LT=4, NE=5, GE=6, LE=7, AND=8, OR=9, XOR=10, IMPLY=11, 
		NOT=12, AR=13, DOT=14, LB=15, RB=16, SEP=17, ALL=18, FA=19, SE=20, STRING=21, 
		INT=22;
	public static final int
		RULE_oclExpr = 0, RULE_oclBool = 1, RULE_oclSet = 2, RULE_oclSingle = 3, 
		RULE_oclObject = 4, RULE_role = 5, RULE_attr = 6, RULE_var = 7, RULE_oclClass = 8, 
		RULE_constant = 9, RULE_compOp = 10, RULE_boolOp = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"oclExpr", "oclBool", "oclSet", "oclSingle", "oclObject", "role", "attr", 
			"var", "oclClass", "constant", "compOp", "boolOp"
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

	@Override
	public String getGrammarFileName() { return "OCL2RAParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OCL2RAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class OclExprContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(OCL2RAParser.EOF, 0); }
		public OclBoolContext oclBool() {
			return getRuleContext(OclBoolContext.class,0);
		}
		public OclExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterOclExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitOclExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitOclExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclExprContext oclExpr() throws RecognitionException {
		OclExprContext _localctx = new OclExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_oclExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING || _la==INT) {
				{
				setState(24);
				oclBool(0);
				}
			}

			setState(27);
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

	public static class OclBoolContext extends ParserRuleContext {
		public OclBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclBool; }
	 
		public OclBoolContext() { }
		public void copyFrom(OclBoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolForAllContext extends OclBoolContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public TerminalNode AR() { return getToken(OCL2RAParser.AR, 0); }
		public TerminalNode FA() { return getToken(OCL2RAParser.FA, 0); }
		public TerminalNode LB() { return getToken(OCL2RAParser.LB, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode SEP() { return getToken(OCL2RAParser.SEP, 0); }
		public OclBoolContext oclBool() {
			return getRuleContext(OclBoolContext.class,0);
		}
		public TerminalNode RB() { return getToken(OCL2RAParser.RB, 0); }
		public BoolForAllContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterBoolForAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitBoolForAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitBoolForAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolCompareContext extends OclBoolContext {
		public List<OclSingleContext> oclSingle() {
			return getRuleContexts(OclSingleContext.class);
		}
		public OclSingleContext oclSingle(int i) {
			return getRuleContext(OclSingleContext.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public BoolCompareContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterBoolCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitBoolCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitBoolCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolCalcContext extends OclBoolContext {
		public List<OclBoolContext> oclBool() {
			return getRuleContexts(OclBoolContext.class);
		}
		public OclBoolContext oclBool(int i) {
			return getRuleContext(OclBoolContext.class,i);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public BoolCalcContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterBoolCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitBoolCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitBoolCalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclBoolContext oclBool() throws RecognitionException {
		return oclBool(0);
	}

	private OclBoolContext oclBool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OclBoolContext _localctx = new OclBoolContext(_ctx, _parentState);
		OclBoolContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_oclBool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new BoolForAllContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(30);
				oclSet(0);
				setState(31);
				match(AR);
				setState(32);
				match(FA);
				setState(33);
				match(LB);
				setState(34);
				var();
				setState(35);
				match(SEP);
				setState(36);
				oclBool(0);
				setState(37);
				match(RB);
				}
				break;
			case 2:
				{
				_localctx = new BoolCompareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				oclSingle();
				setState(40);
				compOp();
				setState(41);
				oclSingle();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolCalcContext(new OclBoolContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_oclBool);
					setState(45);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(46);
					boolOp();
					setState(47);
					oclBool(2);
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class OclSetContext extends ParserRuleContext {
		public OclSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclSet; }
	 
		public OclSetContext() { }
		public void copyFrom(OclSetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetSelectContext extends OclSetContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public TerminalNode AR() { return getToken(OCL2RAParser.AR, 0); }
		public TerminalNode SE() { return getToken(OCL2RAParser.SE, 0); }
		public TerminalNode LB() { return getToken(OCL2RAParser.LB, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode SEP() { return getToken(OCL2RAParser.SEP, 0); }
		public OclBoolContext oclBool() {
			return getRuleContext(OclBoolContext.class,0);
		}
		public TerminalNode RB() { return getToken(OCL2RAParser.RB, 0); }
		public SetSelectContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterSetSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitSetSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitSetSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassAllContext extends OclSetContext {
		public OclClassContext oclClass() {
			return getRuleContext(OclClassContext.class,0);
		}
		public TerminalNode DOT() { return getToken(OCL2RAParser.DOT, 0); }
		public TerminalNode ALL() { return getToken(OCL2RAParser.ALL, 0); }
		public ClassAllContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterClassAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitClassAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitClassAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclSetContext oclSet() throws RecognitionException {
		return oclSet(0);
	}

	private OclSetContext oclSet(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OclSetContext _localctx = new OclSetContext(_ctx, _parentState);
		OclSetContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_oclSet, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ClassAllContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(55);
			oclClass();
			setState(56);
			match(DOT);
			setState(57);
			match(ALL);
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetSelectContext(new OclSetContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_oclSet);
					setState(59);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(60);
					match(AR);
					setState(61);
					match(SE);
					setState(62);
					match(LB);
					setState(63);
					var();
					setState(64);
					match(SEP);
					setState(65);
					oclBool(0);
					setState(66);
					match(RB);
					}
					} 
				}
				setState(72);
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

	public static class OclSingleContext extends ParserRuleContext {
		public OclSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclSingle; }
	 
		public OclSingleContext() { }
		public void copyFrom(OclSingleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstantSingleContext extends OclSingleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantSingleContext(OclSingleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterConstantSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitConstantSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitConstantSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectSingleContext extends OclSingleContext {
		public OclObjectContext oclObject() {
			return getRuleContext(OclObjectContext.class,0);
		}
		public TerminalNode DOT() { return getToken(OCL2RAParser.DOT, 0); }
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public ObjectSingleContext(OclSingleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterObjectSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitObjectSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitObjectSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclSingleContext oclSingle() throws RecognitionException {
		OclSingleContext _localctx = new OclSingleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_oclSingle);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ObjectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				oclObject(0);
				setState(74);
				match(DOT);
				setState(75);
				attr();
				}
				break;
			case 2:
				_localctx = new ConstantSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				constant();
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

	public static class OclObjectContext extends ParserRuleContext {
		public OclObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclObject; }
	 
		public OclObjectContext() { }
		public void copyFrom(OclObjectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RoleObjContext extends OclObjectContext {
		public OclObjectContext oclObject() {
			return getRuleContext(OclObjectContext.class,0);
		}
		public TerminalNode DOT() { return getToken(OCL2RAParser.DOT, 0); }
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public RoleObjContext(OclObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterRoleObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitRoleObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitRoleObj(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarObjContext extends OclObjectContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarObjContext(OclObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterVarObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitVarObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitVarObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclObjectContext oclObject() throws RecognitionException {
		return oclObject(0);
	}

	private OclObjectContext oclObject(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OclObjectContext _localctx = new OclObjectContext(_ctx, _parentState);
		OclObjectContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_oclObject, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new VarObjContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(81);
			var();
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RoleObjContext(new OclObjectContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_oclObject);
					setState(83);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(84);
					match(DOT);
					setState(85);
					role();
					}
					} 
				}
				setState(90);
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

	public static class RoleContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OCL2RAParser.STRING, 0); }
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_role);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(STRING);
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

	public static class AttrContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OCL2RAParser.STRING, 0); }
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(STRING);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OCL2RAParser.STRING, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(STRING);
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

	public static class OclClassContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OCL2RAParser.STRING, 0); }
		public OclClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterOclClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitOclClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitOclClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclClassContext oclClass() throws RecognitionException {
		OclClassContext _localctx = new OclClassContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_oclClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(STRING);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OCL2RAParser.STRING, 0); }
		public TerminalNode INT() { return getToken(OCL2RAParser.INT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
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

	public static class CompOpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(OCL2RAParser.EQ, 0); }
		public TerminalNode GE() { return getToken(OCL2RAParser.GE, 0); }
		public TerminalNode LE() { return getToken(OCL2RAParser.LE, 0); }
		public TerminalNode GT() { return getToken(OCL2RAParser.GT, 0); }
		public TerminalNode LT() { return getToken(OCL2RAParser.LT, 0); }
		public TerminalNode NE() { return getToken(OCL2RAParser.NE, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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

	public static class BoolOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(OCL2RAParser.AND, 0); }
		public TerminalNode OR() { return getToken(OCL2RAParser.OR, 0); }
		public TerminalNode XOR() { return getToken(OCL2RAParser.XOR, 0); }
		public TerminalNode IMPLY() { return getToken(OCL2RAParser.IMPLY, 0); }
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).enterBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OCL2RAParserListener ) ((OCL2RAParserListener)listener).exitBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCL2RAParserVisitor ) return ((OCL2RAParserVisitor<? extends T>)visitor).visitBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR) | (1L << IMPLY))) != 0)) ) {
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
			return oclBool_sempred((OclBoolContext)_localctx, predIndex);
		case 2:
			return oclSet_sempred((OclSetContext)_localctx, predIndex);
		case 4:
			return oclObject_sempred((OclObjectContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean oclBool_sempred(OclBoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean oclSet_sempred(OclSetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean oclObject_sempred(OclObjectContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0016j\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0003\u0000\u001a\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001,\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u00012\b\u0001\n\u0001\f\u00015\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002E\b\u0002\n\u0002\f\u0002H\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004W\b\u0004\n\u0004\f\u0004Z\t\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0003\u0002"+
		"\u0004\b\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0000\u0003\u0001\u0000\u0015\u0016\u0001\u0000\u0002\u0007\u0001\u0000"+
		"\b\u000bc\u0000\u0019\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000"+
		"\u0000\u00046\u0001\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\b"+
		"P\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000\u0000\f]\u0001\u0000\u0000"+
		"\u0000\u000e_\u0001\u0000\u0000\u0000\u0010a\u0001\u0000\u0000\u0000\u0012"+
		"c\u0001\u0000\u0000\u0000\u0014e\u0001\u0000\u0000\u0000\u0016g\u0001"+
		"\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u0018\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001b\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0006\u0001\uffff\uffff\u0000\u001e\u001f"+
		"\u0003\u0004\u0002\u0000\u001f \u0005\r\u0000\u0000 !\u0005\u0013\u0000"+
		"\u0000!\"\u0005\u000f\u0000\u0000\"#\u0003\u000e\u0007\u0000#$\u0005\u0011"+
		"\u0000\u0000$%\u0003\u0002\u0001\u0000%&\u0005\u0010\u0000\u0000&,\u0001"+
		"\u0000\u0000\u0000\'(\u0003\u0006\u0003\u0000()\u0003\u0014\n\u0000)*"+
		"\u0003\u0006\u0003\u0000*,\u0001\u0000\u0000\u0000+\u001d\u0001\u0000"+
		"\u0000\u0000+\'\u0001\u0000\u0000\u0000,3\u0001\u0000\u0000\u0000-.\n"+
		"\u0001\u0000\u0000./\u0003\u0016\u000b\u0000/0\u0003\u0002\u0001\u0002"+
		"02\u0001\u0000\u0000\u00001-\u0001\u0000\u0000\u000025\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u00004\u0003\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000067\u0006\u0002\uffff\uffff"+
		"\u000078\u0003\u0010\b\u000089\u0005\u000e\u0000\u00009:\u0005\u0012\u0000"+
		"\u0000:F\u0001\u0000\u0000\u0000;<\n\u0001\u0000\u0000<=\u0005\r\u0000"+
		"\u0000=>\u0005\u0014\u0000\u0000>?\u0005\u000f\u0000\u0000?@\u0003\u000e"+
		"\u0007\u0000@A\u0005\u0011\u0000\u0000AB\u0003\u0002\u0001\u0000BC\u0005"+
		"\u0010\u0000\u0000CE\u0001\u0000\u0000\u0000D;\u0001\u0000\u0000\u0000"+
		"EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000G\u0005\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0003"+
		"\b\u0004\u0000JK\u0005\u000e\u0000\u0000KL\u0003\f\u0006\u0000LO\u0001"+
		"\u0000\u0000\u0000MO\u0003\u0012\t\u0000NI\u0001\u0000\u0000\u0000NM\u0001"+
		"\u0000\u0000\u0000O\u0007\u0001\u0000\u0000\u0000PQ\u0006\u0004\uffff"+
		"\uffff\u0000QR\u0003\u000e\u0007\u0000RX\u0001\u0000\u0000\u0000ST\n\u0001"+
		"\u0000\u0000TU\u0005\u000e\u0000\u0000UW\u0003\n\u0005\u0000VS\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y\t\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"[\\\u0005\u0015\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]^\u0005\u0015"+
		"\u0000\u0000^\r\u0001\u0000\u0000\u0000_`\u0005\u0015\u0000\u0000`\u000f"+
		"\u0001\u0000\u0000\u0000ab\u0005\u0015\u0000\u0000b\u0011\u0001\u0000"+
		"\u0000\u0000cd\u0007\u0000\u0000\u0000d\u0013\u0001\u0000\u0000\u0000"+
		"ef\u0007\u0001\u0000\u0000f\u0015\u0001\u0000\u0000\u0000gh\u0007\u0002"+
		"\u0000\u0000h\u0017\u0001\u0000\u0000\u0000\u0006\u0019+3FNX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}