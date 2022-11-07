// Generated from /Users/novelistchan/Documents/OCL2RA/src/main/java/ocl2ra/OCL2RAParser.g4 by ANTLR 4.10.1
package ocl2ra;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OCL2RAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OCL2RAParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#oclExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclExpr(OCL2RAParser.OclExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolForAll}
	 * labeled alternative in {@link OCL2RAParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolForAll(OCL2RAParser.BoolForAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolCompare}
	 * labeled alternative in {@link OCL2RAParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCompare(OCL2RAParser.BoolCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolCalc}
	 * labeled alternative in {@link OCL2RAParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCalc(OCL2RAParser.BoolCalcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setSelect}
	 * labeled alternative in {@link OCL2RAParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSelect(OCL2RAParser.SetSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classAll}
	 * labeled alternative in {@link OCL2RAParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAll(OCL2RAParser.ClassAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectSingle}
	 * labeled alternative in {@link OCL2RAParser#oclSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectSingle(OCL2RAParser.ObjectSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantSingle}
	 * labeled alternative in {@link OCL2RAParser#oclSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantSingle(OCL2RAParser.ConstantSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roleObj}
	 * labeled alternative in {@link OCL2RAParser#oclObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleObj(OCL2RAParser.RoleObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varObj}
	 * labeled alternative in {@link OCL2RAParser#oclObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarObj(OCL2RAParser.VarObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole(OCL2RAParser.RoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(OCL2RAParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(OCL2RAParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#oclClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclClass(OCL2RAParser.OclClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(OCL2RAParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(OCL2RAParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#boolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOp(OCL2RAParser.BoolOpContext ctx);
}