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
	 * Enter a parse tree produced by the {@code udiffer}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterUdiffer(RA2SQLParser.UdifferContext ctx);
	/**
	 * Exit a parse tree produced by the {@code udiffer}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitUdiffer(RA2SQLParser.UdifferContext ctx);
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
	 * Enter a parse tree produced by {@link RA2SQLParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(RA2SQLParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RA2SQLParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(RA2SQLParser.CompOpContext ctx);
}