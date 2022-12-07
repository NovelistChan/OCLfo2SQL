// Generated from /Users/novelistchan/Documents/OCLfo2SQL/src/main/java/ANTLR/RA2SQL/RA2SQLParser.g4 by ANTLR 4.10.1
package ANTLR.RA2SQL;

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
public class RA2SQLParser extends Parser {

    static {
        RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
        new PredictionContextCache();
    public static final int
        SPACE = 1, PROJECTION = 2, SELECTION = 3, UNION = 4, DIFFER = 5, INTERSECTION = 6,
        JOIN = 7, UNIVERSALSET = 8, ID = 9, COMMA = 10, EQ = 11, GT = 12, LT = 13, NE = 14, GE = 15,
        LE = 16, AND = 17, OR = 18, XOR = 19, IMPLY = 20, NOT = 21, AR = 22, DOT = 23, LB = 24,
        RB = 25, SEP = 26, QUOTE = 27, STRING = 28, INT = 29;
    public static final int
        RULE_script = 0, RULE_relation = 1, RULE_projection = 2, RULE_selection = 3,
        RULE_columns = 4, RULE_column = 5, RULE_expressions = 6, RULE_expression = 7,
        RULE_constant = 8, RULE_compOp = 9, RULE_boolOp = 10;

    private static String[] makeRuleNames() {
        return new String[]{
            "script", "relation", "projection", "selection", "columns", "column",
            "expressions", "expression", "constant", "compOp", "boolOp"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
            null, null, "'pi'", "'sigma'", "'union'", "'\\'", "'intersect'", "'join'",
            "'U'", null, "','", "'='", "'>'", "'<'", "'<>'", "'>='", "'<='", "'and'",
            "'or'", "'xor'", "'implies'", "'not'", "'->'", "'.'", "'('", "')'", "'|'",
            "'''"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
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

    @Override
    public String getGrammarFileName() {
        return "RA2SQLParser.g4";
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

    public RA2SQLParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ScriptContext extends ParserRuleContext {

        public TerminalNode EOF() {
            return getToken(RA2SQLParser.EOF, 0);
        }

        public List<RelationContext> relation() {
            return getRuleContexts(RelationContext.class);
        }

        public RelationContext relation(int i) {
            return getRuleContext(RelationContext.class, i);
        }

        public ScriptContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_script;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterScript(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitScript(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitScript(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final ScriptContext script() throws RecognitionException {
        ScriptContext _localctx = new ScriptContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_script);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(23);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(22);
                            relation(0);
                        }
                    }
                    setState(25);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0
                    && ((1L << _la) & ((1L << PROJECTION) | (1L << SELECTION) | (1L << ID))) != 0));
                setState(27);
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

    public static class RelationContext extends ParserRuleContext {

        public RelationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_relation;
        }

        public RelationContext() {
        }

        public void copyFrom(RelationContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class SelectContext extends RelationContext {

        public SelectionContext selection() {
            return getRuleContext(SelectionContext.class, 0);
        }

        public SelectContext(RelationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterSelect(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitSelect(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitSelect(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class IntersectContext extends RelationContext {

        public List<RelationContext> relation() {
            return getRuleContexts(RelationContext.class);
        }

        public RelationContext relation(int i) {
            return getRuleContext(RelationContext.class, i);
        }

        public TerminalNode INTERSECTION() {
            return getToken(RA2SQLParser.INTERSECTION, 0);
        }

        public IntersectContext(RelationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterIntersect(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitIntersect(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitIntersect(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class ThetaJoinContext extends RelationContext {

        public List<RelationContext> relation() {
            return getRuleContexts(RelationContext.class);
        }

        public RelationContext relation(int i) {
            return getRuleContext(RelationContext.class, i);
        }

        public List<TerminalNode> ID() {
            return getTokens(RA2SQLParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(RA2SQLParser.ID, i);
        }

        public TerminalNode JOIN() {
            return getToken(RA2SQLParser.JOIN, 0);
        }

        public TerminalNode LB() {
            return getToken(RA2SQLParser.LB, 0);
        }

        public ExpressionsContext expressions() {
            return getRuleContext(ExpressionsContext.class, 0);
        }

        public TerminalNode RB() {
            return getToken(RA2SQLParser.RB, 0);
        }

        public ThetaJoinContext(RelationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterThetaJoin(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitThetaJoin(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitThetaJoin(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class ProjectContext extends RelationContext {

        public ProjectionContext projection() {
            return getRuleContext(ProjectionContext.class, 0);
        }

        public ProjectContext(RelationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterProject(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitProject(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitProject(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class IdContext extends RelationContext {

        public TerminalNode ID() {
            return getToken(RA2SQLParser.ID, 0);
        }

        public IdContext(RelationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterId(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitId(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitId(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class UnionContext extends RelationContext {

        public List<RelationContext> relation() {
            return getRuleContexts(RelationContext.class);
        }

        public RelationContext relation(int i) {
            return getRuleContext(RelationContext.class, i);
        }

        public TerminalNode UNION() {
            return getToken(RA2SQLParser.UNION, 0);
        }

        public UnionContext(RelationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterUnion(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitUnion(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitUnion(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class JoinContext extends RelationContext {

        public List<RelationContext> relation() {
            return getRuleContexts(RelationContext.class);
        }

        public RelationContext relation(int i) {
            return getRuleContext(RelationContext.class, i);
        }

        public TerminalNode JOIN() {
            return getToken(RA2SQLParser.JOIN, 0);
        }

        public JoinContext(RelationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterJoin(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitJoin(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitJoin(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class DifferContext extends RelationContext {

        public List<RelationContext> relation() {
            return getRuleContexts(RelationContext.class);
        }

        public RelationContext relation(int i) {
            return getRuleContext(RelationContext.class, i);
        }

        public List<TerminalNode> ID() {
            return getTokens(RA2SQLParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(RA2SQLParser.ID, i);
        }

        public TerminalNode DIFFER() {
            return getToken(RA2SQLParser.DIFFER, 0);
        }

        public DifferContext(RelationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterDiffer(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitDiffer(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitDiffer(this);
			} else {
				return visitor.visitChildren(this);
			}
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
                setState(33);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case PROJECTION: {
                        _localctx = new ProjectContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(30);
                        projection();
                    }
                    break;
                    case SELECTION: {
                        _localctx = new SelectContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(31);
                        selection();
                    }
                    break;
                    case ID: {
                        _localctx = new IdContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(32);
                        match(ID);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(61);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
						if (_parseListeners != null) {
							triggerExitRuleEvent();
						}
                        _prevctx = _localctx;
                        {
                            setState(59);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                                case 1: {
                                    _localctx = new UnionContext(
                                        new RelationContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_relation);
                                    setState(35);
									if (!(precpred(_ctx, 6))) {
										throw new FailedPredicateException(this,
											"precpred(_ctx, 6)");
									}
                                    setState(36);
                                    match(UNION);
                                    setState(37);
                                    relation(7);
                                }
                                break;
                                case 2: {
                                    _localctx = new IntersectContext(
                                        new RelationContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_relation);
                                    setState(38);
									if (!(precpred(_ctx, 5))) {
										throw new FailedPredicateException(this,
											"precpred(_ctx, 5)");
									}
                                    setState(39);
                                    match(INTERSECTION);
                                    setState(40);
                                    relation(6);
                                }
                                break;
                                case 3: {
                                    _localctx = new JoinContext(
                                        new RelationContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_relation);
                                    setState(41);
									if (!(precpred(_ctx, 3))) {
										throw new FailedPredicateException(this,
											"precpred(_ctx, 3)");
									}
                                    setState(42);
                                    match(JOIN);
                                    setState(43);
                                    relation(4);
                                }
                                break;
                                case 4: {
                                    _localctx = new DifferContext(
                                        new RelationContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_relation);
                                    setState(44);
									if (!(precpred(_ctx, 4))) {
										throw new FailedPredicateException(this,
											"precpred(_ctx, 4)");
									}
                                    setState(45);
                                    match(ID);
                                    setState(46);
                                    match(DIFFER);
                                    setState(47);
                                    relation(0);
                                    setState(48);
                                    match(ID);
                                }
                                break;
                                case 5: {
                                    _localctx = new ThetaJoinContext(
                                        new RelationContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_relation);
                                    setState(50);
									if (!(precpred(_ctx, 2))) {
										throw new FailedPredicateException(this,
											"precpred(_ctx, 2)");
									}
                                    setState(51);
                                    match(ID);
                                    setState(52);
                                    match(JOIN);
                                    setState(53);
                                    match(LB);
                                    setState(54);
                                    expressions();
                                    setState(55);
                                    match(RB);
                                    setState(56);
                                    relation(0);
                                    setState(57);
                                    match(ID);
                                }
                                break;
                            }
                        }
                    }
                    setState(63);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
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

    public static class ProjectionContext extends ParserRuleContext {

        public TerminalNode PROJECTION() {
            return getToken(RA2SQLParser.PROJECTION, 0);
        }

        public List<TerminalNode> LB() {
            return getTokens(RA2SQLParser.LB);
        }

        public TerminalNode LB(int i) {
            return getToken(RA2SQLParser.LB, i);
        }

        public ColumnsContext columns() {
            return getRuleContext(ColumnsContext.class, 0);
        }

        public List<TerminalNode> RB() {
            return getTokens(RA2SQLParser.RB);
        }

        public TerminalNode RB(int i) {
            return getToken(RA2SQLParser.RB, i);
        }

        public RelationContext relation() {
            return getRuleContext(RelationContext.class, 0);
        }

        public ProjectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_projection;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterProjection(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitProjection(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitProjection(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final ProjectionContext projection() throws RecognitionException {
        ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_projection);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(64);
                match(PROJECTION);
                setState(65);
                match(LB);
                setState(66);
                columns();
                setState(67);
                match(RB);
                setState(68);
                match(LB);
                setState(69);
                relation(0);
                setState(70);
                match(RB);
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

    public static class SelectionContext extends ParserRuleContext {

        public TerminalNode SELECTION() {
            return getToken(RA2SQLParser.SELECTION, 0);
        }

        public List<TerminalNode> LB() {
            return getTokens(RA2SQLParser.LB);
        }

        public TerminalNode LB(int i) {
            return getToken(RA2SQLParser.LB, i);
        }

        public ExpressionsContext expressions() {
            return getRuleContext(ExpressionsContext.class, 0);
        }

        public List<TerminalNode> RB() {
            return getTokens(RA2SQLParser.RB);
        }

        public TerminalNode RB(int i) {
            return getToken(RA2SQLParser.RB, i);
        }

        public RelationContext relation() {
            return getRuleContext(RelationContext.class, 0);
        }

        public SelectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selection;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterSelection(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitSelection(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitSelection(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final SelectionContext selection() throws RecognitionException {
        SelectionContext _localctx = new SelectionContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_selection);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(72);
                match(SELECTION);
                setState(73);
                match(LB);
                setState(74);
                expressions();
                setState(75);
                match(RB);
                setState(76);
                match(LB);
                setState(77);
                relation(0);
                setState(78);
                match(RB);
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

    public static class ColumnsContext extends ParserRuleContext {

        public ColumnsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_columns;
        }

        public ColumnsContext() {
        }

        public void copyFrom(ColumnsContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ColumnOneContext extends ColumnsContext {

        public ColumnContext column() {
            return getRuleContext(ColumnContext.class, 0);
        }

        public ColumnOneContext(ColumnsContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterColumnOne(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitColumnOne(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitColumnOne(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class ColumnManyContext extends ColumnsContext {

        public ColumnContext column() {
            return getRuleContext(ColumnContext.class, 0);
        }

        public TerminalNode COMMA() {
            return getToken(RA2SQLParser.COMMA, 0);
        }

        public ColumnsContext columns() {
            return getRuleContext(ColumnsContext.class, 0);
        }

        public ColumnManyContext(ColumnsContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterColumnMany(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitColumnMany(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitColumnMany(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final ColumnsContext columns() throws RecognitionException {
        ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_columns);
        try {
            setState(85);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                case 1:
                    _localctx = new ColumnManyContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(80);
                    column(0);
                    setState(81);
                    match(COMMA);
                    setState(82);
                    columns();
                }
                break;
                case 2:
                    _localctx = new ColumnOneContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(84);
                    column(0);
                }
                break;
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

    public static class ColumnContext extends ParserRuleContext {

        public ColumnContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_column;
        }

        public ColumnContext() {
        }

        public void copyFrom(ColumnContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class IdConsContext extends ColumnContext {

        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        public IdConsContext(ColumnContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterIdCons(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitIdCons(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitIdCons(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class IdManyContext extends ColumnContext {

        public ColumnContext column() {
            return getRuleContext(ColumnContext.class, 0);
        }

        public TerminalNode DOT() {
            return getToken(RA2SQLParser.DOT, 0);
        }

        public TerminalNode ID() {
            return getToken(RA2SQLParser.ID, 0);
        }

        public IdManyContext(ColumnContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterIdMany(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitIdMany(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitIdMany(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class IdOneContext extends ColumnContext {

        public TerminalNode ID() {
            return getToken(RA2SQLParser.ID, 0);
        }

        public IdOneContext(ColumnContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterIdOne(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitIdOne(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitIdOne(this);
			} else {
				return visitor.visitChildren(this);
			}
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
                setState(90);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case ID: {
                        _localctx = new IdOneContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(88);
                        match(ID);
                    }
                    break;
                    case QUOTE:
                    case INT: {
                        _localctx = new IdConsContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(89);
                        constant();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(97);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
						if (_parseListeners != null) {
							triggerExitRuleEvent();
						}
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new IdManyContext(
                                    new ColumnContext(_parentctx, _parentState));
                                pushNewRecursionContext(_localctx, _startState, RULE_column);
                                setState(92);
								if (!(precpred(_ctx, 2))) {
									throw new FailedPredicateException(this, "precpred(_ctx, 2)");
								}
                                setState(93);
                                match(DOT);
                                setState(94);
                                match(ID);
                            }
                        }
                    }
                    setState(99);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
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

    public static class ExpressionsContext extends ParserRuleContext {

        public ExpressionsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expressions;
        }

        public ExpressionsContext() {
        }

        public void copyFrom(ExpressionsContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ExpressionManyContext extends ExpressionsContext {

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public BoolOpContext boolOp() {
            return getRuleContext(BoolOpContext.class, 0);
        }

        public ExpressionsContext expressions() {
            return getRuleContext(ExpressionsContext.class, 0);
        }

        public ExpressionManyContext(ExpressionsContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterExpressionMany(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitExpressionMany(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitExpressionMany(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class ExpressionOneContext extends ExpressionsContext {

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ExpressionOneContext(ExpressionsContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterExpressionOne(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitExpressionOne(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitExpressionOne(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final ExpressionsContext expressions() throws RecognitionException {
        ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_expressions);
        try {
            setState(105);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                case 1:
                    _localctx = new ExpressionManyContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(100);
                    expression();
                    setState(101);
                    boolOp();
                    setState(102);
                    expressions();
                }
                break;
                case 2:
                    _localctx = new ExpressionOneContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(104);
                    expression();
                }
                break;
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

    public static class ExpressionContext extends ParserRuleContext {

        public List<ColumnContext> column() {
            return getRuleContexts(ColumnContext.class);
        }

        public ColumnContext column(int i) {
            return getRuleContext(ColumnContext.class, i);
        }

        public CompOpContext compOp() {
            return getRuleContext(CompOpContext.class, 0);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterExpression(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitExpression(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitExpression(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(107);
                column(0);
                setState(108);
                compOp();
                setState(109);
                column(0);
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

    public static class ConstantContext extends ParserRuleContext {

        public ConstantContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constant;
        }

        public ConstantContext() {
        }

        public void copyFrom(ConstantContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ConsStriContext extends ConstantContext {

        public List<TerminalNode> QUOTE() {
            return getTokens(RA2SQLParser.QUOTE);
        }

        public TerminalNode QUOTE(int i) {
            return getToken(RA2SQLParser.QUOTE, i);
        }

        public TerminalNode ID() {
            return getToken(RA2SQLParser.ID, 0);
        }

        public ConsStriContext(ConstantContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterConsStri(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitConsStri(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitConsStri(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class ConsIntContext extends ConstantContext {

        public TerminalNode INT() {
            return getToken(RA2SQLParser.INT, 0);
        }

        public ConsIntContext(ConstantContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterConsInt(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitConsInt(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitConsInt(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final ConstantContext constant() throws RecognitionException {
        ConstantContext _localctx = new ConstantContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_constant);
        try {
            setState(115);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case QUOTE:
                    _localctx = new ConsStriContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(111);
                    match(QUOTE);
                    setState(112);
                    match(ID);
                    setState(113);
                    match(QUOTE);
                }
                break;
                case INT:
                    _localctx = new ConsIntContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(114);
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
            return getToken(RA2SQLParser.EQ, 0);
        }

        public TerminalNode GE() {
            return getToken(RA2SQLParser.GE, 0);
        }

        public TerminalNode LE() {
            return getToken(RA2SQLParser.LE, 0);
        }

        public TerminalNode GT() {
            return getToken(RA2SQLParser.GT, 0);
        }

        public TerminalNode LT() {
            return getToken(RA2SQLParser.LT, 0);
        }

        public TerminalNode NE() {
            return getToken(RA2SQLParser.NE, 0);
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
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterCompOp(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitCompOp(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitCompOp(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final CompOpContext compOp() throws RecognitionException {
        CompOpContext _localctx = new CompOpContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_compOp);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(117);
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
            return getToken(RA2SQLParser.AND, 0);
        }

        public TerminalNode OR() {
            return getToken(RA2SQLParser.OR, 0);
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
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterBoolOp(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitBoolOp(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitBoolOp(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final BoolOpContext boolOp() throws RecognitionException {
        BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_boolOp);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(119);
                _la = _input.LA(1);
                if (!(_la == AND || _la == OR)) {
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
            case 1:
                return relation_sempred((RelationContext) _localctx, predIndex);
            case 5:
                return column_sempred((ColumnContext) _localctx, predIndex);
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
                return precpred(_ctx, 3);
            case 3:
                return precpred(_ctx, 4);
            case 4:
                return precpred(_ctx, 2);
        }
        return true;
    }

    private boolean column_sempred(ColumnContext _localctx, int predIndex) {
        switch (predIndex) {
            case 5:
                return precpred(_ctx, 2);
        }
        return true;
    }

    public static final String _serializedATN =
        "\u0004\u0001\u001dz\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
            "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
            "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
            "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018" +
            "\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0000\u0001\u0000\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001" +
            "<\b\u0001\n\u0001\f\u0001?\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002" +
            "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003" +
            "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
            "\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004" +
            "\u0003\u0004V\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005" +
            "[\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005`\b\u0005\n\u0005" +
            "\f\u0005c\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001" +
            "\u0006\u0003\u0006j\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001" +
            "\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bt\b\b\u0001\t\u0001\t\u0001" +
            "\n\u0001\n\u0001\n\u0000\u0002\u0002\n\u000b\u0000\u0002\u0004\u0006\b" +
            "\n\f\u000e\u0010\u0012\u0014\u0000\u0002\u0001\u0000\u000b\u0010\u0001" +
            "\u0000\u0011\u0012{\u0000\u0017\u0001\u0000\u0000\u0000\u0002!\u0001\u0000" +
            "\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000" +
            "\bU\u0001\u0000\u0000\u0000\nZ\u0001\u0000\u0000\u0000\fi\u0001\u0000" +
            "\u0000\u0000\u000ek\u0001\u0000\u0000\u0000\u0010s\u0001\u0000\u0000\u0000" +
            "\u0012u\u0001\u0000\u0000\u0000\u0014w\u0001\u0000\u0000\u0000\u0016\u0018" +
            "\u0003\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0019" +
            "\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a" +
            "\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c" +
            "\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001e" +
            "\u0006\u0001\uffff\uffff\u0000\u001e\"\u0003\u0004\u0002\u0000\u001f\"" +
            "\u0003\u0006\u0003\u0000 \"\u0005\t\u0000\u0000!\u001d\u0001\u0000\u0000" +
            "\u0000!\u001f\u0001\u0000\u0000\u0000! \u0001\u0000\u0000\u0000\"=\u0001" +
            "\u0000\u0000\u0000#$\n\u0006\u0000\u0000$%\u0005\u0004\u0000\u0000%<\u0003" +
            "\u0002\u0001\u0007&\'\n\u0005\u0000\u0000\'(\u0005\u0006\u0000\u0000(" +
            "<\u0003\u0002\u0001\u0006)*\n\u0003\u0000\u0000*+\u0005\u0007\u0000\u0000" +
            "+<\u0003\u0002\u0001\u0004,-\n\u0004\u0000\u0000-.\u0005\t\u0000\u0000" +
            "./\u0005\u0005\u0000\u0000/0\u0003\u0002\u0001\u000001\u0005\t\u0000\u0000" +
            "1<\u0001\u0000\u0000\u000023\n\u0002\u0000\u000034\u0005\t\u0000\u0000" +
            "45\u0005\u0007\u0000\u000056\u0005\u0018\u0000\u000067\u0003\f\u0006\u0000" +
            "78\u0005\u0019\u0000\u000089\u0003\u0002\u0001\u00009:\u0005\t\u0000\u0000" +
            ":<\u0001\u0000\u0000\u0000;#\u0001\u0000\u0000\u0000;&\u0001\u0000\u0000" +
            "\u0000;)\u0001\u0000\u0000\u0000;,\u0001\u0000\u0000\u0000;2\u0001\u0000" +
            "\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001" +
            "\u0000\u0000\u0000>\u0003\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000" +
            "\u0000@A\u0005\u0002\u0000\u0000AB\u0005\u0018\u0000\u0000BC\u0003\b\u0004" +
            "\u0000CD\u0005\u0019\u0000\u0000DE\u0005\u0018\u0000\u0000EF\u0003\u0002" +
            "\u0001\u0000FG\u0005\u0019\u0000\u0000G\u0005\u0001\u0000\u0000\u0000" +
            "HI\u0005\u0003\u0000\u0000IJ\u0005\u0018\u0000\u0000JK\u0003\f\u0006\u0000" +
            "KL\u0005\u0019\u0000\u0000LM\u0005\u0018\u0000\u0000MN\u0003\u0002\u0001" +
            "\u0000NO\u0005\u0019\u0000\u0000O\u0007\u0001\u0000\u0000\u0000PQ\u0003" +
            "\n\u0005\u0000QR\u0005\n\u0000\u0000RS\u0003\b\u0004\u0000SV\u0001\u0000" +
            "\u0000\u0000TV\u0003\n\u0005\u0000UP\u0001\u0000\u0000\u0000UT\u0001\u0000" +
            "\u0000\u0000V\t\u0001\u0000\u0000\u0000WX\u0006\u0005\uffff\uffff\u0000" +
            "X[\u0005\t\u0000\u0000Y[\u0003\u0010\b\u0000ZW\u0001\u0000\u0000\u0000" +
            "ZY\u0001\u0000\u0000\u0000[a\u0001\u0000\u0000\u0000\\]\n\u0002\u0000" +
            "\u0000]^\u0005\u0017\u0000\u0000^`\u0005\t\u0000\u0000_\\\u0001\u0000" +
            "\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001" +
            "\u0000\u0000\u0000b\u000b\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000" +
            "\u0000de\u0003\u000e\u0007\u0000ef\u0003\u0014\n\u0000fg\u0003\f\u0006" +
            "\u0000gj\u0001\u0000\u0000\u0000hj\u0003\u000e\u0007\u0000id\u0001\u0000" +
            "\u0000\u0000ih\u0001\u0000\u0000\u0000j\r\u0001\u0000\u0000\u0000kl\u0003" +
            "\n\u0005\u0000lm\u0003\u0012\t\u0000mn\u0003\n\u0005\u0000n\u000f\u0001" +
            "\u0000\u0000\u0000op\u0005\u001b\u0000\u0000pq\u0005\t\u0000\u0000qt\u0005" +
            "\u001b\u0000\u0000rt\u0005\u001d\u0000\u0000so\u0001\u0000\u0000\u0000" +
            "sr\u0001\u0000\u0000\u0000t\u0011\u0001\u0000\u0000\u0000uv\u0007\u0000" +
            "\u0000\u0000v\u0013\u0001\u0000\u0000\u0000wx\u0007\u0001\u0000\u0000" +
            "x\u0015\u0001\u0000\u0000\u0000\t\u0019!;=UZais";
    public static final ATN _ATN =
        new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}