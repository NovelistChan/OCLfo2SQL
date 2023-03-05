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
        JOIN = 7, UNIVERSALSET = 8, COMMA = 9, EQ = 10, GT = 11, LT = 12, NE = 13, GE = 14, LE = 15,
        AND = 16, OR = 17, XOR = 18, IMPLY = 19, NOT = 20, AR = 21, ADD = 22, MIN = 23, MUL = 24,
        DIV = 25, MOD = 26, SUM = 27, AVG = 28, Min = 29, Max = 30, COUNT = 31, AGG = 32, GROUP = 33,
        BY = 34, DOT = 35, LB = 36, RB = 37, SEP = 38, QUOTE = 39, ID = 40, STRING = 41, INT = 42;
    public static final int
        RULE_script = 0, RULE_relation = 1, RULE_projection = 2, RULE_selection = 3,
        RULE_columns = 4, RULE_column = 5, RULE_expressions = 6, RULE_expression = 7,
        RULE_binaryExp = 8, RULE_constant = 9, RULE_aggregation = 10, RULE_compOp = 11,
        RULE_boolOp = 12, RULE_binaryOp = 13;

    private static String[] makeRuleNames() {
        return new String[]{
            "script", "relation", "projection", "selection", "columns", "column",
            "expressions", "expression", "binaryExp", "constant", "aggregation",
            "compOp", "boolOp", "binaryOp"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
            null, null, "'pi'", "'sigma'", "'union'", "'\\'", "'intersect'", "'join'",
            "'U'", "','", "'='", "'>'", "'<'", "'<>'", "'>='", "'<='", "'and'", "'or'",
            "'xor'", "'implies'", "'not'", "'->'", "'+'", "'-'", "'*'", "'/'", "'%'",
            "'SUM'", "'AVG'", "'MIN'", "'MAX'", "'COUNT'", "'aggregate'", "'group'",
            "'by'", "'.'", "'('", "')'", "'|'", "'''"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
            null, "SPACE", "PROJECTION", "SELECTION", "UNION", "DIFFER", "INTERSECTION",
            "JOIN", "UNIVERSALSET", "COMMA", "EQ", "GT", "LT", "NE", "GE", "LE",
            "AND", "OR", "XOR", "IMPLY", "NOT", "AR", "ADD", "MIN", "MUL", "DIV",
            "MOD", "SUM", "AVG", "Min", "Max", "COUNT", "AGG", "GROUP", "BY", "DOT",
            "LB", "RB", "SEP", "QUOTE", "ID", "STRING", "INT"
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
                setState(29);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(28);
                            relation(0);
                        }
                    }
                    setState(31);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 &&
                    ((1L << _la) & ((1L << PROJECTION) | (1L << SELECTION) | (1L << AGG) | (1L
                        << ID))) != 0));
                setState(33);
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

    public static class AggregateGroupByContext extends RelationContext {

        public TerminalNode AGG() {
            return getToken(RA2SQLParser.AGG, 0);
        }

        public TerminalNode GROUP() {
            return getToken(RA2SQLParser.GROUP, 0);
        }

        public TerminalNode BY() {
            return getToken(RA2SQLParser.BY, 0);
        }

        public ColumnContext column() {
            return getRuleContext(ColumnContext.class, 0);
        }

        public RelationContext relation() {
            return getRuleContext(RelationContext.class, 0);
        }

        public AggregateGroupByContext(RelationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterAggregateGroupBy(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitAggregateGroupBy(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitAggregateGroupBy(this);
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

    public static class AggregateContext extends RelationContext {

        public TerminalNode AGG() {
            return getToken(RA2SQLParser.AGG, 0);
        }

        public RelationContext relation() {
            return getRuleContext(RelationContext.class, 0);
        }

        public AggregateContext(RelationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterAggregate(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitAggregate(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitAggregate(this);
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
                setState(47);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                    case 1: {
                        _localctx = new ProjectContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(36);
                        projection();
                    }
                    break;
                    case 2: {
                        _localctx = new SelectContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(37);
                        selection();
                    }
                    break;
                    case 3: {
                        _localctx = new IdContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(38);
                        match(ID);
                    }
                    break;
                    case 4: {
                        _localctx = new AggregateContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(39);
                        match(AGG);
                        setState(40);
                        relation(2);
                    }
                    break;
                    case 5: {
                        _localctx = new AggregateGroupByContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(41);
                        match(AGG);
                        setState(42);
                        match(GROUP);
                        setState(43);
                        match(BY);
                        setState(44);
                        column(0);
                        setState(45);
                        relation(1);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(75);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
						if (_parseListeners != null) {
							triggerExitRuleEvent();
						}
                        _prevctx = _localctx;
                        {
                            setState(73);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                                case 1: {
                                    _localctx = new UnionContext(
                                        new RelationContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_relation);
                                    setState(49);
									if (!(precpred(_ctx, 8))) {
										throw new FailedPredicateException(this,
											"precpred(_ctx, 8)");
									}
                                    setState(50);
                                    match(UNION);
                                    setState(51);
                                    relation(9);
                                }
                                break;
                                case 2: {
                                    _localctx = new IntersectContext(
                                        new RelationContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_relation);
                                    setState(52);
									if (!(precpred(_ctx, 7))) {
										throw new FailedPredicateException(this,
											"precpred(_ctx, 7)");
									}
                                    setState(53);
                                    match(INTERSECTION);
                                    setState(54);
                                    relation(8);
                                }
                                break;
                                case 3: {
                                    _localctx = new JoinContext(
                                        new RelationContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_relation);
                                    setState(55);
									if (!(precpred(_ctx, 5))) {
										throw new FailedPredicateException(this,
											"precpred(_ctx, 5)");
									}
                                    setState(56);
                                    match(JOIN);
                                    setState(57);
                                    relation(6);
                                }
                                break;
                                case 4: {
                                    _localctx = new DifferContext(
                                        new RelationContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_relation);
                                    setState(58);
									if (!(precpred(_ctx, 6))) {
										throw new FailedPredicateException(this,
											"precpred(_ctx, 6)");
									}
                                    setState(59);
                                    match(ID);
                                    setState(60);
                                    match(DIFFER);
                                    setState(61);
                                    relation(0);
                                    setState(62);
                                    match(ID);
                                }
                                break;
                                case 5: {
                                    _localctx = new ThetaJoinContext(
                                        new RelationContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_relation);
                                    setState(64);
									if (!(precpred(_ctx, 4))) {
										throw new FailedPredicateException(this,
											"precpred(_ctx, 4)");
									}
                                    setState(65);
                                    match(ID);
                                    setState(66);
                                    match(JOIN);
                                    setState(67);
                                    match(LB);
                                    setState(68);
                                    expressions();
                                    setState(69);
                                    match(RB);
                                    setState(70);
                                    relation(0);
                                    setState(71);
                                    match(ID);
                                }
                                break;
                            }
                        }
                    }
                    setState(77);
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
                setState(78);
                match(PROJECTION);
                setState(79);
                match(LB);
                setState(80);
                columns();
                setState(81);
                match(RB);
                setState(82);
                match(LB);
                setState(83);
                relation(0);
                setState(84);
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
                setState(86);
                match(SELECTION);
                setState(87);
                match(LB);
                setState(88);
                expressions();
                setState(89);
                match(RB);
                setState(90);
                match(LB);
                setState(91);
                relation(0);
                setState(92);
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
            setState(99);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                case 1:
                    _localctx = new ColumnManyContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(94);
                    column(0);
                    setState(95);
                    match(COMMA);
                    setState(96);
                    columns();
                }
                break;
                case 2:
                    _localctx = new ColumnOneContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(98);
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

    public static class IdAggContext extends ColumnContext {

        public AggregationContext aggregation() {
            return getRuleContext(AggregationContext.class, 0);
        }

        public TerminalNode LB() {
            return getToken(RA2SQLParser.LB, 0);
        }

        public ColumnContext column() {
            return getRuleContext(ColumnContext.class, 0);
        }

        public TerminalNode RB() {
            return getToken(RA2SQLParser.RB, 0);
        }

        public IdAggContext(ColumnContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterIdAgg(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitIdAgg(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitIdAgg(this);
			} else {
				return visitor.visitChildren(this);
			}
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
                setState(109);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case ID: {
                        _localctx = new IdOneContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(102);
                        match(ID);
                    }
                    break;
                    case QUOTE:
                    case INT: {
                        _localctx = new IdConsContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(103);
                        constant();
                    }
                    break;
                    case SUM:
                    case AVG:
                    case Min:
                    case Max:
                    case COUNT: {
                        _localctx = new IdAggContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(104);
                        aggregation();
                        setState(105);
                        match(LB);
                        setState(106);
                        column(0);
                        setState(107);
                        match(RB);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(116);
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
                                setState(111);
								if (!(precpred(_ctx, 3))) {
									throw new FailedPredicateException(this, "precpred(_ctx, 3)");
								}
                                setState(112);
                                match(DOT);
                                setState(113);
                                match(ID);
                            }
                        }
                    }
                    setState(118);
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
            setState(124);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                case 1:
                    _localctx = new ExpressionManyContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(119);
                    expression();
                    setState(120);
                    boolOp();
                    setState(121);
                    expressions();
                }
                break;
                case 2:
                    _localctx = new ExpressionOneContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(123);
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

        public List<BinaryExpContext> binaryExp() {
            return getRuleContexts(BinaryExpContext.class);
        }

        public BinaryExpContext binaryExp(int i) {
            return getRuleContext(BinaryExpContext.class, i);
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
                setState(126);
                binaryExp();
                setState(127);
                compOp();
                setState(128);
                binaryExp();
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

    public static class BinaryExpContext extends ParserRuleContext {

        public BinaryExpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_binaryExp;
        }

        public BinaryExpContext() {
        }

        public void copyFrom(BinaryExpContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class UnarySubContext extends BinaryExpContext {

        public ColumnContext column() {
            return getRuleContext(ColumnContext.class, 0);
        }

        public UnarySubContext(BinaryExpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterUnarySub(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitUnarySub(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitUnarySub(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public static class BinarySubContext extends BinaryExpContext {

        public TerminalNode LB() {
            return getToken(RA2SQLParser.LB, 0);
        }

        public List<BinaryExpContext> binaryExp() {
            return getRuleContexts(BinaryExpContext.class);
        }

        public BinaryExpContext binaryExp(int i) {
            return getRuleContext(BinaryExpContext.class, i);
        }

        public BinaryOpContext binaryOp() {
            return getRuleContext(BinaryOpContext.class, 0);
        }

        public TerminalNode RB() {
            return getToken(RA2SQLParser.RB, 0);
        }

        public BinarySubContext(BinaryExpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterBinarySub(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitBinarySub(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitBinarySub(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final BinaryExpContext binaryExp() throws RecognitionException {
        BinaryExpContext _localctx = new BinaryExpContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_binaryExp);
        try {
            setState(137);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LB:
                    _localctx = new BinarySubContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(130);
                    match(LB);
                    setState(131);
                    binaryExp();
                    setState(132);
                    binaryOp();
                    setState(133);
                    binaryExp();
                    setState(134);
                    match(RB);
                }
                break;
                case SUM:
                case AVG:
                case Min:
                case Max:
                case COUNT:
                case QUOTE:
                case ID:
                case INT:
                    _localctx = new UnarySubContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(136);
                    column(0);
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
        enterRule(_localctx, 18, RULE_constant);
        try {
            setState(143);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case QUOTE:
                    _localctx = new ConsStriContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(139);
                    match(QUOTE);
                    setState(140);
                    match(ID);
                    setState(141);
                    match(QUOTE);
                }
                break;
                case INT:
                    _localctx = new ConsIntContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(142);
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

    public static class AggregationContext extends ParserRuleContext {

        public TerminalNode SUM() {
            return getToken(RA2SQLParser.SUM, 0);
        }

        public TerminalNode AVG() {
            return getToken(RA2SQLParser.AVG, 0);
        }

        public TerminalNode Min() {
            return getToken(RA2SQLParser.Min, 0);
        }

        public TerminalNode Max() {
            return getToken(RA2SQLParser.Max, 0);
        }

        public TerminalNode COUNT() {
            return getToken(RA2SQLParser.COUNT, 0);
        }

        public AggregationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_aggregation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterAggregation(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitAggregation(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitAggregation(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final AggregationContext aggregation() throws RecognitionException {
        AggregationContext _localctx = new AggregationContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_aggregation);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(145);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 &&
                    ((1L << _la) & ((1L << SUM) | (1L << AVG) | (1L << Min) | (1L << Max) | (1L
                        << COUNT))) != 0))) {
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
        enterRule(_localctx, 22, RULE_compOp);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(147);
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
        enterRule(_localctx, 24, RULE_boolOp);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(149);
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

    public static class BinaryOpContext extends ParserRuleContext {

        public TerminalNode ADD() {
            return getToken(RA2SQLParser.ADD, 0);
        }

        public TerminalNode MIN() {
            return getToken(RA2SQLParser.MIN, 0);
        }

        public TerminalNode MUL() {
            return getToken(RA2SQLParser.MUL, 0);
        }

        public TerminalNode MOD() {
            return getToken(RA2SQLParser.MOD, 0);
        }

        public TerminalNode DIV() {
            return getToken(RA2SQLParser.DIV, 0);
        }

        public BinaryOpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_binaryOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).enterBinaryOp(this);
			}
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RA2SQLParserListener) {
				((RA2SQLParserListener) listener).exitBinaryOp(this);
			}
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof RA2SQLParserVisitor) {
				return ((RA2SQLParserVisitor<? extends T>) visitor).visitBinaryOp(this);
			} else {
				return visitor.visitChildren(this);
			}
        }
    }

    public final BinaryOpContext binaryOp() throws RecognitionException {
        BinaryOpContext _localctx = new BinaryOpContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_binaryOp);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(151);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 &&
                    ((1L << _la) & ((1L << ADD) | (1L << MIN) | (1L << MUL) | (1L << DIV) | (1L
                        << MOD))) != 0))) {
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
                return precpred(_ctx, 8);
            case 1:
                return precpred(_ctx, 7);
            case 2:
                return precpred(_ctx, 5);
            case 3:
                return precpred(_ctx, 6);
            case 4:
                return precpred(_ctx, 4);
        }
        return true;
    }

    private boolean column_sempred(ColumnContext _localctx, int predIndex) {
        switch (predIndex) {
            case 5:
                return precpred(_ctx, 3);
        }
        return true;
    }

    public static final String _serializedATN =
        "\u0004\u0001*\u009a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
            "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
            "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
            "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
            "\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000\u000b" +
            "\u0000\f\u0000\u001f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005" +
            "\u0001J\b\u0001\n\u0001\f\u0001M\t\u0001\u0001\u0002\u0001\u0002\u0001" +
            "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001" +
            "\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001" +
            "\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001" +
            "\u0004\u0003\u0004d\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001" +
            "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005n\b" +
            "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005s\b\u0005\n\u0005" +
            "\f\u0005v\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001" +
            "\u0006\u0003\u0006}\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001" +
            "\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b" +
            "\u008a\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0090\b\t\u0001\n\u0001" +
            "\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0000" +
            "\u0002\u0002\n\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014" +
            "\u0016\u0018\u001a\u0000\u0004\u0001\u0000\u001b\u001f\u0001\u0000\n\u000f" +
            "\u0001\u0000\u0010\u0011\u0001\u0000\u0016\u001a\u009c\u0000\u001d\u0001" +
            "\u0000\u0000\u0000\u0002/\u0001\u0000\u0000\u0000\u0004N\u0001\u0000\u0000" +
            "\u0000\u0006V\u0001\u0000\u0000\u0000\bc\u0001\u0000\u0000\u0000\nm\u0001" +
            "\u0000\u0000\u0000\f|\u0001\u0000\u0000\u0000\u000e~\u0001\u0000\u0000" +
            "\u0000\u0010\u0089\u0001\u0000\u0000\u0000\u0012\u008f\u0001\u0000\u0000" +
            "\u0000\u0014\u0091\u0001\u0000\u0000\u0000\u0016\u0093\u0001\u0000\u0000" +
            "\u0000\u0018\u0095\u0001\u0000\u0000\u0000\u001a\u0097\u0001\u0000\u0000" +
            "\u0000\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000" +
            "\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000" +
            "\u0000\u001f \u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0005" +
            "\u0000\u0000\u0001\"\u0001\u0001\u0000\u0000\u0000#$\u0006\u0001\uffff" +
            "\uffff\u0000$0\u0003\u0004\u0002\u0000%0\u0003\u0006\u0003\u0000&0\u0005" +
            "(\u0000\u0000\'(\u0005 \u0000\u0000(0\u0003\u0002\u0001\u0002)*\u0005" +
            " \u0000\u0000*+\u0005!\u0000\u0000+,\u0005\"\u0000\u0000,-\u0003\n\u0005" +
            "\u0000-.\u0003\u0002\u0001\u0001.0\u0001\u0000\u0000\u0000/#\u0001\u0000" +
            "\u0000\u0000/%\u0001\u0000\u0000\u0000/&\u0001\u0000\u0000\u0000/\'\u0001" +
            "\u0000\u0000\u0000/)\u0001\u0000\u0000\u00000K\u0001\u0000\u0000\u0000" +
            "12\n\b\u0000\u000023\u0005\u0004\u0000\u00003J\u0003\u0002\u0001\t45\n" +
            "\u0007\u0000\u000056\u0005\u0006\u0000\u00006J\u0003\u0002\u0001\b78\n" +
            "\u0005\u0000\u000089\u0005\u0007\u0000\u00009J\u0003\u0002\u0001\u0006" +
            ":;\n\u0006\u0000\u0000;<\u0005(\u0000\u0000<=\u0005\u0005\u0000\u0000" +
            "=>\u0003\u0002\u0001\u0000>?\u0005(\u0000\u0000?J\u0001\u0000\u0000\u0000" +
            "@A\n\u0004\u0000\u0000AB\u0005(\u0000\u0000BC\u0005\u0007\u0000\u0000" +
            "CD\u0005$\u0000\u0000DE\u0003\f\u0006\u0000EF\u0005%\u0000\u0000FG\u0003" +
            "\u0002\u0001\u0000GH\u0005(\u0000\u0000HJ\u0001\u0000\u0000\u0000I1\u0001" +
            "\u0000\u0000\u0000I4\u0001\u0000\u0000\u0000I7\u0001\u0000\u0000\u0000" +
            "I:\u0001\u0000\u0000\u0000I@\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000" +
            "\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0003\u0001" +
            "\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0005\u0002\u0000\u0000" +
            "OP\u0005$\u0000\u0000PQ\u0003\b\u0004\u0000QR\u0005%\u0000\u0000RS\u0005" +
            "$\u0000\u0000ST\u0003\u0002\u0001\u0000TU\u0005%\u0000\u0000U\u0005\u0001" +
            "\u0000\u0000\u0000VW\u0005\u0003\u0000\u0000WX\u0005$\u0000\u0000XY\u0003" +
            "\f\u0006\u0000YZ\u0005%\u0000\u0000Z[\u0005$\u0000\u0000[\\\u0003\u0002" +
            "\u0001\u0000\\]\u0005%\u0000\u0000]\u0007\u0001\u0000\u0000\u0000^_\u0003" +
            "\n\u0005\u0000_`\u0005\t\u0000\u0000`a\u0003\b\u0004\u0000ad\u0001\u0000" +
            "\u0000\u0000bd\u0003\n\u0005\u0000c^\u0001\u0000\u0000\u0000cb\u0001\u0000" +
            "\u0000\u0000d\t\u0001\u0000\u0000\u0000ef\u0006\u0005\uffff\uffff\u0000" +
            "fn\u0005(\u0000\u0000gn\u0003\u0012\t\u0000hi\u0003\u0014\n\u0000ij\u0005" +
            "$\u0000\u0000jk\u0003\n\u0005\u0000kl\u0005%\u0000\u0000ln\u0001\u0000" +
            "\u0000\u0000me\u0001\u0000\u0000\u0000mg\u0001\u0000\u0000\u0000mh\u0001" +
            "\u0000\u0000\u0000nt\u0001\u0000\u0000\u0000op\n\u0003\u0000\u0000pq\u0005" +
            "#\u0000\u0000qs\u0005(\u0000\u0000ro\u0001\u0000\u0000\u0000sv\u0001\u0000" +
            "\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u000b" +
            "\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0003\u000e\u0007" +
            "\u0000xy\u0003\u0018\f\u0000yz\u0003\f\u0006\u0000z}\u0001\u0000\u0000" +
            "\u0000{}\u0003\u000e\u0007\u0000|w\u0001\u0000\u0000\u0000|{\u0001\u0000" +
            "\u0000\u0000}\r\u0001\u0000\u0000\u0000~\u007f\u0003\u0010\b\u0000\u007f" +
            "\u0080\u0003\u0016\u000b\u0000\u0080\u0081\u0003\u0010\b\u0000\u0081\u000f" +
            "\u0001\u0000\u0000\u0000\u0082\u0083\u0005$\u0000\u0000\u0083\u0084\u0003" +
            "\u0010\b\u0000\u0084\u0085\u0003\u001a\r\u0000\u0085\u0086\u0003\u0010" +
            "\b\u0000\u0086\u0087\u0005%\u0000\u0000\u0087\u008a\u0001\u0000\u0000" +
            "\u0000\u0088\u008a\u0003\n\u0005\u0000\u0089\u0082\u0001\u0000\u0000\u0000" +
            "\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u0011\u0001\u0000\u0000\u0000" +
            "\u008b\u008c\u0005\'\u0000\u0000\u008c\u008d\u0005(\u0000\u0000\u008d" +
            "\u0090\u0005\'\u0000\u0000\u008e\u0090\u0005*\u0000\u0000\u008f\u008b" +
            "\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0013" +
            "\u0001\u0000\u0000\u0000\u0091\u0092\u0007\u0000\u0000\u0000\u0092\u0015" +
            "\u0001\u0000\u0000\u0000\u0093\u0094\u0007\u0001\u0000\u0000\u0094\u0017" +
            "\u0001\u0000\u0000\u0000\u0095\u0096\u0007\u0002\u0000\u0000\u0096\u0019" +
            "\u0001\u0000\u0000\u0000\u0097\u0098\u0007\u0003\u0000\u0000\u0098\u001b" +
            "\u0001\u0000\u0000\u0000\n\u001f/IKcmt|\u0089\u008f";
    public static final ATN _ATN =
        new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}