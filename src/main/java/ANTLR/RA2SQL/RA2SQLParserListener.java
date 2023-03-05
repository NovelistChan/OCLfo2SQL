// Generated from /Users/novelistchan/Documents/OCLfo2SQL/src/main/java/ANTLR/RA2SQL/RA2SQLParser.g4 by ANTLR 4.10.1
package ANTLR.RA2SQL;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RA2SQLParser}.
 */
public interface RA2SQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RA2SQLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(RA2SQLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link RA2SQLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(RA2SQLParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code select}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterSelect(RA2SQLParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code select}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitSelect(RA2SQLParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intersect}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterIntersect(RA2SQLParser.IntersectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intersect}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitIntersect(RA2SQLParser.IntersectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thetaJoin}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterThetaJoin(RA2SQLParser.ThetaJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thetaJoin}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitThetaJoin(RA2SQLParser.ThetaJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code project}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterProject(RA2SQLParser.ProjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code project}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitProject(RA2SQLParser.ProjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateGroupBy}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterAggregateGroupBy(RA2SQLParser.AggregateGroupByContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateGroupBy}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitAggregateGroupBy(RA2SQLParser.AggregateGroupByContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterId(RA2SQLParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitId(RA2SQLParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code union}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterUnion(RA2SQLParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code union}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitUnion(RA2SQLParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code join}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterJoin(RA2SQLParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code join}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitJoin(RA2SQLParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code differ}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterDiffer(RA2SQLParser.DifferContext ctx);
	/**
	 * Exit a parse tree produced by the {@code differ}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitDiffer(RA2SQLParser.DifferContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregate}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(RA2SQLParser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregate}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(RA2SQLParser.AggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link RA2SQLParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(RA2SQLParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RA2SQLParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(RA2SQLParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RA2SQLParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(RA2SQLParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RA2SQLParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(RA2SQLParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnMany}
	 * labeled alternative in {@link RA2SQLParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumnMany(RA2SQLParser.ColumnManyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnMany}
	 * labeled alternative in {@link RA2SQLParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumnMany(RA2SQLParser.ColumnManyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnOne}
	 * labeled alternative in {@link RA2SQLParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumnOne(RA2SQLParser.ColumnOneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnOne}
	 * labeled alternative in {@link RA2SQLParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumnOne(RA2SQLParser.ColumnOneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAgg}
	 * labeled alternative in {@link RA2SQLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterIdAgg(RA2SQLParser.IdAggContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAgg}
	 * labeled alternative in {@link RA2SQLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitIdAgg(RA2SQLParser.IdAggContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idCons}
	 * labeled alternative in {@link RA2SQLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterIdCons(RA2SQLParser.IdConsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idCons}
	 * labeled alternative in {@link RA2SQLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitIdCons(RA2SQLParser.IdConsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idMany}
	 * labeled alternative in {@link RA2SQLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterIdMany(RA2SQLParser.IdManyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idMany}
	 * labeled alternative in {@link RA2SQLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitIdMany(RA2SQLParser.IdManyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idOne}
	 * labeled alternative in {@link RA2SQLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterIdOne(RA2SQLParser.IdOneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idOne}
	 * labeled alternative in {@link RA2SQLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitIdOne(RA2SQLParser.IdOneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionMany}
	 * labeled alternative in {@link RA2SQLParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMany(RA2SQLParser.ExpressionManyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionMany}
	 * labeled alternative in {@link RA2SQLParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMany(RA2SQLParser.ExpressionManyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionOne}
	 * labeled alternative in {@link RA2SQLParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOne(RA2SQLParser.ExpressionOneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionOne}
	 * labeled alternative in {@link RA2SQLParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOne(RA2SQLParser.ExpressionOneContext ctx);
	/**
	 * Enter a parse tree produced by {@link RA2SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RA2SQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RA2SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RA2SQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binarySub}
	 * labeled alternative in {@link RA2SQLParser#binaryExp}.
	 * @param ctx the parse tree
	 */
	void enterBinarySub(RA2SQLParser.BinarySubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binarySub}
	 * labeled alternative in {@link RA2SQLParser#binaryExp}.
	 * @param ctx the parse tree
	 */
	void exitBinarySub(RA2SQLParser.BinarySubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unarySub}
	 * labeled alternative in {@link RA2SQLParser#binaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnarySub(RA2SQLParser.UnarySubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unarySub}
	 * labeled alternative in {@link RA2SQLParser#binaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnarySub(RA2SQLParser.UnarySubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code consStri}
	 * labeled alternative in {@link RA2SQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConsStri(RA2SQLParser.ConsStriContext ctx);
	/**
	 * Exit a parse tree produced by the {@code consStri}
	 * labeled alternative in {@link RA2SQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConsStri(RA2SQLParser.ConsStriContext ctx);
	/**
	 * Enter a parse tree produced by the {@code consInt}
	 * labeled alternative in {@link RA2SQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConsInt(RA2SQLParser.ConsIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code consInt}
	 * labeled alternative in {@link RA2SQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConsInt(RA2SQLParser.ConsIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link RA2SQLParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(RA2SQLParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RA2SQLParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(RA2SQLParser.AggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RA2SQLParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(RA2SQLParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RA2SQLParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(RA2SQLParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RA2SQLParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(RA2SQLParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RA2SQLParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(RA2SQLParser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RA2SQLParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(RA2SQLParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RA2SQLParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(RA2SQLParser.BinaryOpContext ctx);
}