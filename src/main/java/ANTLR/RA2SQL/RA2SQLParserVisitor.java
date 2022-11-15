// Generated from /Users/novelistchan/Documents/OCLfo2SQL/src/main/java/ANTLR/RA2SQL/RA2SQLParser.g4 by ANTLR 4.10.1
package ANTLR.RA2SQL;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RA2SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RA2SQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RA2SQLParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(RA2SQLParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code udiffer}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdiffer(RA2SQLParser.UdifferContext ctx);
	/**
	 * Visit a parse tree produced by the {@code select}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(RA2SQLParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intersect}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersect(RA2SQLParser.IntersectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code project}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProject(RA2SQLParser.ProjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(RA2SQLParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code union}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(RA2SQLParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code join}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(RA2SQLParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code differ}
	 * labeled alternative in {@link RA2SQLParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiffer(RA2SQLParser.DifferContext ctx);
	/**
	 * Visit a parse tree produced by {@link RA2SQLParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(RA2SQLParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RA2SQLParser#selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection(RA2SQLParser.SelectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnMany}
	 * labeled alternative in {@link RA2SQLParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnMany(RA2SQLParser.ColumnManyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnOne}
	 * labeled alternative in {@link RA2SQLParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnOne(RA2SQLParser.ColumnOneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idCons}
	 * labeled alternative in {@link RA2SQLParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdCons(RA2SQLParser.IdConsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idMany}
	 * labeled alternative in {@link RA2SQLParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdMany(RA2SQLParser.IdManyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idOne}
	 * labeled alternative in {@link RA2SQLParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdOne(RA2SQLParser.IdOneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionMany}
	 * labeled alternative in {@link RA2SQLParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMany(RA2SQLParser.ExpressionManyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionOne}
	 * labeled alternative in {@link RA2SQLParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOne(RA2SQLParser.ExpressionOneContext ctx);
	/**
	 * Visit a parse tree produced by {@link RA2SQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RA2SQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code consStri}
	 * labeled alternative in {@link RA2SQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsStri(RA2SQLParser.ConsStriContext ctx);
	/**
	 * Visit a parse tree produced by the {@code consInt}
	 * labeled alternative in {@link RA2SQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsInt(RA2SQLParser.ConsIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link RA2SQLParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(RA2SQLParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link RA2SQLParser#boolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOp(RA2SQLParser.BoolOpContext ctx);
}