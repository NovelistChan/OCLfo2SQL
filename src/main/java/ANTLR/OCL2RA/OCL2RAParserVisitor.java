// Generated from /Users/novelistchan/Documents/OCLfo2SQL/src/main/java/ANTLR/OCL2RA/OCL2RAParser.g4 by ANTLR 4.10.1
package ANTLR.OCL2RA;
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
	 * Visit a parse tree produced by {@link OCL2RAParser#oclText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclText(OCL2RAParser.OclTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#oclExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclExpr(OCL2RAParser.OclExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#oclContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclContext(OCL2RAParser.OclContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#oclInvariant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclInvariant(OCL2RAParser.OclInvariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#oclInvName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclInvName(OCL2RAParser.OclInvNameContext ctx);
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
	 * Visit a parse tree produced by the {@code boolExist}
	 * labeled alternative in {@link OCL2RAParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExist(OCL2RAParser.BoolExistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolCalc}
	 * labeled alternative in {@link OCL2RAParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCalc(OCL2RAParser.BoolCalcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code querySelect}
	 * labeled alternative in {@link OCL2RAParser#oclQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySelect(OCL2RAParser.QuerySelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryReject}
	 * labeled alternative in {@link OCL2RAParser#oclQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryReject(OCL2RAParser.QueryRejectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classAll}
	 * labeled alternative in {@link OCL2RAParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAll(OCL2RAParser.ClassAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binarySingle}
	 * labeled alternative in {@link OCL2RAParser#oclSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinarySingle(OCL2RAParser.BinarySingleContext ctx);
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
	 * Visit a parse tree produced by the {@code aggregationSingle}
	 * labeled alternative in {@link OCL2RAParser#oclSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationSingle(OCL2RAParser.AggregationSingleContext ctx);
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
	 * Visit a parse tree produced by {@link OCL2RAParser#oclExist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclExist(OCL2RAParser.OclExistContext ctx);
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#oclAggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclAggregation(OCL2RAParser.OclAggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#oclRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclRole(OCL2RAParser.OclRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#oclAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclAttr(OCL2RAParser.OclAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#oclVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclVar(OCL2RAParser.OclVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#oclClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclClass(OCL2RAParser.OclClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oclString}
	 * labeled alternative in {@link OCL2RAParser#oclConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclString(OCL2RAParser.OclStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oclInt}
	 * labeled alternative in {@link OCL2RAParser#oclConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclInt(OCL2RAParser.OclIntContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link OCL2RAParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOp(OCL2RAParser.BinaryOpContext ctx);
}