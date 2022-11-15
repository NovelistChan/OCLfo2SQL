// Generated from /Users/novelistchan/Documents/OCLfo2SQL/src/main/java/ANTLR/OCL2RA/OCL2RAParser.g4 by ANTLR 4.10.1
package ANTLR.OCL2RA;

import java.util.List;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OCL2RAParser extends Parser {

    static {
        RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
        new PredictionContextCache();
    public static final int
        SPACE = 1, EQ = 2, GT = 3, LT = 4, NE = 5, GE = 6, LE = 7, AND = 8, OR = 9, XOR = 10, IMPLY = 11,
        NOT = 12, AR = 13, DOT = 14, LB = 15, RB = 16, SEP = 17, QUOTE = 18, ALL = 19, FA = 20,
        SE = 21, CTX = 22, COLON = 23, INV = 24, ID = 25, INT = 26;
    public static final int
        RULE_oclText = 0, RULE_oclExpr = 1, RULE_oclContext = 2, RULE_oclInvariant = 3,
        RULE_oclInvName = 4, RULE_oclBool = 5, RULE_oclSet = 6, RULE_oclSingle = 7,
        RULE_oclObject = 8, RULE_oclRole = 9, RULE_oclAttr = 10, RULE_oclVar = 11,
        RULE_oclClass = 12, RULE_oclConstant = 13, RULE_compOp = 14, RULE_boolOp = 15;

    private static String[] makeRuleNames() {
        return new String[]{
            "oclText", "oclExpr", "oclContext", "oclInvariant", "oclInvName", "oclBool",
            "oclSet", "oclSingle", "oclObject", "oclRole", "oclAttr", "oclVar", "oclClass",
            "oclConstant", "compOp", "boolOp"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
            null, null, "'='", "'>'", "'<'", "'<>'", "'>='", "'<='", "'and'", "'or'",
            "'xor'", "'implies'", "'not'", "'->'", "'.'", "'('", "')'", "'|'", "'''",
            "'allInstances()'", "'forAll'", "'select'", "'context'", "':'", "'inv'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
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

    @Override
    public String getGrammarFileName() {
        return "OCL2RAParser.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public OCL2RAParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class OclTextContext extends ParserRuleContext {

        public TerminalNode EOF() {
            return getToken(OCL2RAParser.EOF, 0);
        }

        public List<OclExprContext> oclExpr() {
            return getRuleContexts(OclExprContext.class);
        }

        public OclExprContext oclExpr(int i) {
            return getRuleContext(OclExprContext.class, i);
        }

        public OclTextContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_oclText;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterOclText(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitOclText(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitOclText(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final OclTextContext oclText() throws RecognitionException {
        OclTextContext _localctx = new OclTextContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_oclText);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(33);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(32);
                            oclExpr();
                        }
                    }
                    setState(35);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == CTX);
                setState(37);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OclExprContext extends ParserRuleContext {

        public TerminalNode CTX() {
            return getToken(OCL2RAParser.CTX, 0);
        }

        public OclContextContext oclContext() {
            return getRuleContext(OclContextContext.class, 0);
        }

        public TerminalNode INV() {
            return getToken(OCL2RAParser.INV, 0);
        }

        public OclInvariantContext oclInvariant() {
            return getRuleContext(OclInvariantContext.class, 0);
        }

        public OclExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_oclExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterOclExpr(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitOclExpr(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitOclExpr(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final OclExprContext oclExpr() throws RecognitionException {
        OclExprContext _localctx = new OclExprContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_oclExpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(39);
                match(CTX);
                setState(40);
                oclContext();
                setState(41);
                match(INV);
                setState(42);
                oclInvariant();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OclContextContext extends ParserRuleContext {

        public TerminalNode ID() {
            return getToken(OCL2RAParser.ID, 0);
        }

        public OclContextContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_oclContext;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterOclContext(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitOclContext(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitOclContext(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final OclContextContext oclContext() throws RecognitionException {
        OclContextContext _localctx = new OclContextContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_oclContext);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(44);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OclInvariantContext extends ParserRuleContext {

        public OclInvNameContext oclInvName() {
            return getRuleContext(OclInvNameContext.class, 0);
        }

        public TerminalNode COLON() {
            return getToken(OCL2RAParser.COLON, 0);
        }

        public OclBoolContext oclBool() {
            return getRuleContext(OclBoolContext.class, 0);
        }

        public OclInvariantContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_oclInvariant;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterOclInvariant(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitOclInvariant(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitOclInvariant(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final OclInvariantContext oclInvariant() throws RecognitionException {
        OclInvariantContext _localctx = new OclInvariantContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_oclInvariant);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(46);
                oclInvName();
                setState(47);
                match(COLON);
                setState(48);
                oclBool(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OclInvNameContext extends ParserRuleContext {

        public TerminalNode ID() {
            return getToken(OCL2RAParser.ID, 0);
        }

        public OclInvNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_oclInvName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterOclInvName(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitOclInvName(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitOclInvName(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final OclInvNameContext oclInvName() throws RecognitionException {
        OclInvNameContext _localctx = new OclInvNameContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_oclInvName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(50);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OclBoolContext extends ParserRuleContext {

        public OclBoolContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_oclBool;
        }

        public OclBoolContext() {
        }

        public void copyFrom(OclBoolContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class BoolForAllContext extends OclBoolContext {

        public OclSetContext oclSet() {
            return getRuleContext(OclSetContext.class, 0);
        }

        public TerminalNode AR() {
            return getToken(OCL2RAParser.AR, 0);
        }

        public TerminalNode FA() {
            return getToken(OCL2RAParser.FA, 0);
        }

        public TerminalNode LB() {
            return getToken(OCL2RAParser.LB, 0);
        }

        public OclVarContext oclVar() {
            return getRuleContext(OclVarContext.class, 0);
        }

        public TerminalNode SEP() {
            return getToken(OCL2RAParser.SEP, 0);
        }

        public OclBoolContext oclBool() {
            return getRuleContext(OclBoolContext.class, 0);
        }

        public TerminalNode RB() {
            return getToken(OCL2RAParser.RB, 0);
        }

        public BoolForAllContext(OclBoolContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterBoolForAll(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitBoolForAll(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitBoolForAll(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class BoolCompareContext extends OclBoolContext {

        public List<OclSingleContext> oclSingle() {
            return getRuleContexts(OclSingleContext.class);
        }

        public OclSingleContext oclSingle(int i) {
            return getRuleContext(OclSingleContext.class, i);
        }

        public CompOpContext compOp() {
            return getRuleContext(CompOpContext.class, 0);
        }

        public BoolCompareContext(OclBoolContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterBoolCompare(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitBoolCompare(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitBoolCompare(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class BoolCalcContext extends OclBoolContext {

        public List<OclBoolContext> oclBool() {
            return getRuleContexts(OclBoolContext.class);
        }

        public OclBoolContext oclBool(int i) {
            return getRuleContext(OclBoolContext.class, i);
        }

        public BoolOpContext boolOp() {
            return getRuleContext(BoolOpContext.class, 0);
        }

        public BoolCalcContext(OclBoolContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterBoolCalc(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitBoolCalc(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitBoolCalc(this);
			} else {
				return visitor.visitChildren(this);
			}
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
        int _startState = 10;
        enterRecursionRule(_localctx, 10, RULE_oclBool, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(66);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                    case 1: {
                        _localctx = new BoolForAllContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(53);
                        oclSet();
                        setState(54);
                        match(AR);
                        setState(55);
                        match(FA);
                        setState(56);
                        match(LB);
                        setState(57);
                        oclVar();
                        setState(58);
                        match(SEP);
                        setState(59);
                        oclBool(0);
                        setState(60);
                        match(RB);
                    }
                    break;
                    case 2: {
                        _localctx = new BoolCompareContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(62);
                        oclSingle();
                        setState(63);
                        compOp();
                        setState(64);
                        oclSingle();
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(74);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
						if (_parseListeners != null) {
							triggerExitRuleEvent();
						}
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new BoolCalcContext(
                                    new OclBoolContext(_parentctx, _parentState));
                                pushNewRecursionContext(_localctx, _startState, RULE_oclBool);
                                setState(68);
								if (!(precpred(_ctx, 1))) {
									throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								}
                                setState(69);
                                boolOp();
                                setState(70);
                                oclBool(2);
                            }
                        }
                    }
                    setState(76);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class OclSetContext extends ParserRuleContext {

        public OclSetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_oclSet;
        }

        public OclSetContext() {
        }

        public void copyFrom(OclSetContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ClassAllContext extends OclSetContext {

        public OclClassContext oclClass() {
            return getRuleContext(OclClassContext.class, 0);
        }

        public TerminalNode DOT() {
            return getToken(OCL2RAParser.DOT, 0);
        }

        public TerminalNode ALL() {
            return getToken(OCL2RAParser.ALL, 0);
        }

        public ClassAllContext(OclSetContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterClassAll(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitClassAll(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitClassAll(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final OclSetContext oclSet() throws RecognitionException {
        OclSetContext _localctx = new OclSetContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_oclSet);
        try {
            _localctx = new ClassAllContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(77);
                oclClass();
                setState(78);
                match(DOT);
                setState(79);
                match(ALL);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OclSingleContext extends ParserRuleContext {

        public OclSingleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_oclSingle;
        }

        public OclSingleContext() {
        }

        public void copyFrom(OclSingleContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ConstantSingleContext extends OclSingleContext {

        public OclConstantContext oclConstant() {
            return getRuleContext(OclConstantContext.class, 0);
        }

        public ConstantSingleContext(OclSingleContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterConstantSingle(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitConstantSingle(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitConstantSingle(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class ObjectSingleContext extends OclSingleContext {

        public OclObjectContext oclObject() {
            return getRuleContext(OclObjectContext.class, 0);
        }

        public TerminalNode DOT() {
            return getToken(OCL2RAParser.DOT, 0);
        }

        public OclAttrContext oclAttr() {
            return getRuleContext(OclAttrContext.class, 0);
        }

        public ObjectSingleContext(OclSingleContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterObjectSingle(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitObjectSingle(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitObjectSingle(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final OclSingleContext oclSingle() throws RecognitionException {
        OclSingleContext _localctx = new OclSingleContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_oclSingle);
        try {
            setState(86);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ID:
                    _localctx = new ObjectSingleContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(81);
                    oclObject(0);
                    setState(82);
                    match(DOT);
                    setState(83);
                    oclAttr();
                }
                break;
                case QUOTE:
                case INT:
                    _localctx = new ConstantSingleContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(85);
                    oclConstant();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OclObjectContext extends ParserRuleContext {

        public OclObjectContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_oclObject;
        }

        public OclObjectContext() {
        }

        public void copyFrom(OclObjectContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class RoleObjContext extends OclObjectContext {

        public OclObjectContext oclObject() {
            return getRuleContext(OclObjectContext.class, 0);
        }

        public TerminalNode DOT() {
            return getToken(OCL2RAParser.DOT, 0);
        }

        public OclRoleContext oclRole() {
            return getRuleContext(OclRoleContext.class, 0);
        }

        public RoleObjContext(OclObjectContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterRoleObj(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitRoleObj(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitRoleObj(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class VarObjContext extends OclObjectContext {

        public OclVarContext oclVar() {
            return getRuleContext(OclVarContext.class, 0);
        }

        public VarObjContext(OclObjectContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterVarObj(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitVarObj(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitVarObj(this);
			} else {
				return visitor.visitChildren(this);
			}
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
        int _startState = 16;
        enterRecursionRule(_localctx, 16, RULE_oclObject, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    _localctx = new VarObjContext(_localctx);
                    _ctx = _localctx;
                    _prevctx = _localctx;

                    setState(89);
                    oclVar();
                }
                _ctx.stop = _input.LT(-1);
                setState(96);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
						if (_parseListeners != null) {
							triggerExitRuleEvent();
						}
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new RoleObjContext(
                                    new OclObjectContext(_parentctx, _parentState));
                                pushNewRecursionContext(_localctx, _startState, RULE_oclObject);
                                setState(91);
								if (!(precpred(_ctx, 1))) {
									throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								}
                                setState(92);
                                match(DOT);
                                setState(93);
                                oclRole();
                            }
                        }
                    }
                    setState(98);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class OclRoleContext extends ParserRuleContext {

        public TerminalNode ID() {
            return getToken(OCL2RAParser.ID, 0);
        }

        public OclRoleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_oclRole;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterOclRole(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitOclRole(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitOclRole(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final OclRoleContext oclRole() throws RecognitionException {
        OclRoleContext _localctx = new OclRoleContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_oclRole);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(99);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OclAttrContext extends ParserRuleContext {

        public TerminalNode ID() {
            return getToken(OCL2RAParser.ID, 0);
        }

        public OclAttrContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_oclAttr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterOclAttr(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitOclAttr(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitOclAttr(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final OclAttrContext oclAttr() throws RecognitionException {
        OclAttrContext _localctx = new OclAttrContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_oclAttr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(101);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OclVarContext extends ParserRuleContext {

        public TerminalNode ID() {
            return getToken(OCL2RAParser.ID, 0);
        }

        public OclVarContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_oclVar;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterOclVar(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitOclVar(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitOclVar(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final OclVarContext oclVar() throws RecognitionException {
        OclVarContext _localctx = new OclVarContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_oclVar);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(103);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OclClassContext extends ParserRuleContext {

        public TerminalNode ID() {
            return getToken(OCL2RAParser.ID, 0);
        }

        public OclClassContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_oclClass;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterOclClass(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitOclClass(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitOclClass(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final OclClassContext oclClass() throws RecognitionException {
        OclClassContext _localctx = new OclClassContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_oclClass);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(105);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OclConstantContext extends ParserRuleContext {

        public OclConstantContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_oclConstant;
        }

        public OclConstantContext() {
        }

        public void copyFrom(OclConstantContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class OclStringContext extends OclConstantContext {

        public List<TerminalNode> QUOTE() {
            return getTokens(OCL2RAParser.QUOTE);
        }

        public TerminalNode QUOTE(int i) {
            return getToken(OCL2RAParser.QUOTE, i);
        }

        public TerminalNode ID() {
            return getToken(OCL2RAParser.ID, 0);
        }

        public OclStringContext(OclConstantContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterOclString(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitOclString(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitOclString(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class OclIntContext extends OclConstantContext {

        public TerminalNode INT() {
            return getToken(OCL2RAParser.INT, 0);
        }

        public OclIntContext(OclConstantContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterOclInt(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitOclInt(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitOclInt(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final OclConstantContext oclConstant() throws RecognitionException {
        OclConstantContext _localctx = new OclConstantContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_oclConstant);
        try {
            setState(111);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case QUOTE:
                    _localctx = new OclStringContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(107);
                    match(QUOTE);
                    setState(108);
                    match(ID);
                    setState(109);
                    match(QUOTE);
                }
                break;
                case INT:
                    _localctx = new OclIntContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(110);
                    match(INT);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CompOpContext extends ParserRuleContext {

        public TerminalNode EQ() {
            return getToken(OCL2RAParser.EQ, 0);
        }

        public TerminalNode GE() {
            return getToken(OCL2RAParser.GE, 0);
        }

        public TerminalNode LE() {
            return getToken(OCL2RAParser.LE, 0);
        }

        public TerminalNode GT() {
            return getToken(OCL2RAParser.GT, 0);
        }

        public TerminalNode LT() {
            return getToken(OCL2RAParser.LT, 0);
        }

        public TerminalNode NE() {
            return getToken(OCL2RAParser.NE, 0);
        }

        public CompOpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_compOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterCompOp(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitCompOp(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitCompOp(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final CompOpContext compOp() throws RecognitionException {
        CompOpContext _localctx = new CompOpContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_compOp);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(113);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 &&
                    ((1L << _la) & ((1L << EQ) | (1L << GT) | (1L << LT) | (1L << NE) | (1L << GE)
                        | (1L << LE))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
					if (_input.LA(1) == Token.EOF) {
						matchedEOF = true;
					}
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BoolOpContext extends ParserRuleContext {

        public TerminalNode AND() {
            return getToken(OCL2RAParser.AND, 0);
        }

        public TerminalNode OR() {
            return getToken(OCL2RAParser.OR, 0);
        }

        public TerminalNode XOR() {
            return getToken(OCL2RAParser.XOR, 0);
        }

        public TerminalNode IMPLY() {
            return getToken(OCL2RAParser.IMPLY, 0);
        }

        public BoolOpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_boolOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).enterBoolOp(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OCL2RAParserListener) {
				((OCL2RAParserListener) listener).exitBoolOp(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof OCL2RAParserVisitor) {
				return ((OCL2RAParserVisitor<? extends T>) visitor).visitBoolOp(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final BoolOpContext boolOp() throws RecognitionException {
        BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_boolOp);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(115);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0
                    && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR) | (1L << IMPLY)))
                    != 0))) {
                    _errHandler.recoverInline(this);
                } else {
					if (_input.LA(1) == Token.EOF) {
						matchedEOF = true;
					}
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 5:
                return oclBool_sempred((OclBoolContext) _localctx, predIndex);
            case 8:
                return oclObject_sempred((OclObjectContext) _localctx, predIndex);
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

    private boolean oclObject_sempred(OclObjectContext _localctx, int predIndex) {
        switch (predIndex) {
            case 1:
                return precpred(_ctx, 1);
        }
        return true;
    }

    public static final String _serializedATN =
        "\u0004\u0001\u001av\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
            "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
            "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
            "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
            "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
            "\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0000\u0001" +
            "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
            "\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001" +
            "\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001" +
            "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001" +
            "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005C\b\u0005\u0001" +
            "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005I\b\u0005\n\u0005" +
            "\f\u0005L\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001" +
            "\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007W\b" +
            "\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b_\b\b\n" +
            "\b\f\bb\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001" +
            "\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\rp\b\r\u0001\u000e\u0001" +
            "\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0002\n\u0010\u0010\u0000" +
            "\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c" +
            "\u001e\u0000\u0002\u0001\u0000\u0002\u0007\u0001\u0000\b\u000bk\u0000" +
            "!\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000\u0004,\u0001" +
            "\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b2\u0001\u0000\u0000" +
            "\u0000\nB\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000eV\u0001" +
            "\u0000\u0000\u0000\u0010X\u0001\u0000\u0000\u0000\u0012c\u0001\u0000\u0000" +
            "\u0000\u0014e\u0001\u0000\u0000\u0000\u0016g\u0001\u0000\u0000\u0000\u0018" +
            "i\u0001\u0000\u0000\u0000\u001ao\u0001\u0000\u0000\u0000\u001cq\u0001" +
            "\u0000\u0000\u0000\u001es\u0001\u0000\u0000\u0000 \"\u0003\u0002\u0001" +
            "\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001\u0000" +
            "\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0005" +
            "\u0000\u0000\u0001&\u0001\u0001\u0000\u0000\u0000\'(\u0005\u0016\u0000" +
            "\u0000()\u0003\u0004\u0002\u0000)*\u0005\u0018\u0000\u0000*+\u0003\u0006" +
            "\u0003\u0000+\u0003\u0001\u0000\u0000\u0000,-\u0005\u0019\u0000\u0000" +
            "-\u0005\u0001\u0000\u0000\u0000./\u0003\b\u0004\u0000/0\u0005\u0017\u0000" +
            "\u000001\u0003\n\u0005\u00001\u0007\u0001\u0000\u0000\u000023\u0005\u0019" +
            "\u0000\u00003\t\u0001\u0000\u0000\u000045\u0006\u0005\uffff\uffff\u0000" +
            "56\u0003\f\u0006\u000067\u0005\r\u0000\u000078\u0005\u0014\u0000\u0000" +
            "89\u0005\u000f\u0000\u00009:\u0003\u0016\u000b\u0000:;\u0005\u0011\u0000" +
            "\u0000;<\u0003\n\u0005\u0000<=\u0005\u0010\u0000\u0000=C\u0001\u0000\u0000" +
            "\u0000>?\u0003\u000e\u0007\u0000?@\u0003\u001c\u000e\u0000@A\u0003\u000e" +
            "\u0007\u0000AC\u0001\u0000\u0000\u0000B4\u0001\u0000\u0000\u0000B>\u0001" +
            "\u0000\u0000\u0000CJ\u0001\u0000\u0000\u0000DE\n\u0001\u0000\u0000EF\u0003" +
            "\u001e\u000f\u0000FG\u0003\n\u0005\u0002GI\u0001\u0000\u0000\u0000HD\u0001" +
            "\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000" +
            "JK\u0001\u0000\u0000\u0000K\u000b\u0001\u0000\u0000\u0000LJ\u0001\u0000" +
            "\u0000\u0000MN\u0003\u0018\f\u0000NO\u0005\u000e\u0000\u0000OP\u0005\u0013" +
            "\u0000\u0000P\r\u0001\u0000\u0000\u0000QR\u0003\u0010\b\u0000RS\u0005" +
            "\u000e\u0000\u0000ST\u0003\u0014\n\u0000TW\u0001\u0000\u0000\u0000UW\u0003" +
            "\u001a\r\u0000VQ\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000W\u000f" +
            "\u0001\u0000\u0000\u0000XY\u0006\b\uffff\uffff\u0000YZ\u0003\u0016\u000b" +
            "\u0000Z`\u0001\u0000\u0000\u0000[\\\n\u0001\u0000\u0000\\]\u0005\u000e" +
            "\u0000\u0000]_\u0003\u0012\t\u0000^[\u0001\u0000\u0000\u0000_b\u0001\u0000" +
            "\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\u0011" +
            "\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0005\u0019\u0000" +
            "\u0000d\u0013\u0001\u0000\u0000\u0000ef\u0005\u0019\u0000\u0000f\u0015" +
            "\u0001\u0000\u0000\u0000gh\u0005\u0019\u0000\u0000h\u0017\u0001\u0000" +
            "\u0000\u0000ij\u0005\u0019\u0000\u0000j\u0019\u0001\u0000\u0000\u0000" +
            "kl\u0005\u0012\u0000\u0000lm\u0005\u0019\u0000\u0000mp\u0005\u0012\u0000" +
            "\u0000np\u0005\u001a\u0000\u0000ok\u0001\u0000\u0000\u0000on\u0001\u0000" +
            "\u0000\u0000p\u001b\u0001\u0000\u0000\u0000qr\u0007\u0000\u0000\u0000" +
            "r\u001d\u0001\u0000\u0000\u0000st\u0007\u0001\u0000\u0000t\u001f\u0001" +
            "\u0000\u0000\u0000\u0006#BJV`o";
    public static final ATN _ATN =
        new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}