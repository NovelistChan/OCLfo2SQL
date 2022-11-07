// Generated from /Users/novelistchan/Documents/OCL2RA/src/main/java/ocl2ra/OCL2RAParser.g4 by ANTLR 4.10.1
package ocl2ra;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OCL2RAParser}.
 */
public interface OCL2RAParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OCL2RAParser#oclExpr}.
	 * @param ctx the parse tree
	 */
	void enterOclExpr(OCL2RAParser.OclExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OCL2RAParser#oclExpr}.
	 * @param ctx the parse tree
	 */
	void exitOclExpr(OCL2RAParser.OclExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolForAll}
	 * labeled alternative in {@link OCL2RAParser#oclBool}.
	 * @param ctx the parse tree
	 */
	void enterBoolForAll(OCL2RAParser.BoolForAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolForAll}
	 * labeled alternative in {@link OCL2RAParser#oclBool}.
	 * @param ctx the parse tree
	 */
	void exitBoolForAll(OCL2RAParser.BoolForAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolCompare}
	 * labeled alternative in {@link OCL2RAParser#oclBool}.
	 * @param ctx the parse tree
	 */
	void enterBoolCompare(OCL2RAParser.BoolCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolCompare}
	 * labeled alternative in {@link OCL2RAParser#oclBool}.
	 * @param ctx the parse tree
	 */
	void exitBoolCompare(OCL2RAParser.BoolCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolCalc}
	 * labeled alternative in {@link OCL2RAParser#oclBool}.
	 * @param ctx the parse tree
	 */
	void enterBoolCalc(OCL2RAParser.BoolCalcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolCalc}
	 * labeled alternative in {@link OCL2RAParser#oclBool}.
	 * @param ctx the parse tree
	 */
	void exitBoolCalc(OCL2RAParser.BoolCalcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setSelect}
	 * labeled alternative in {@link OCL2RAParser#oclSet}.
	 * @param ctx the parse tree
	 */
	void enterSetSelect(OCL2RAParser.SetSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setSelect}
	 * labeled alternative in {@link OCL2RAParser#oclSet}.
	 * @param ctx the parse tree
	 */
	void exitSetSelect(OCL2RAParser.SetSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classAll}
	 * labeled alternative in {@link OCL2RAParser#oclSet}.
	 * @param ctx the parse tree
	 */
	void enterClassAll(OCL2RAParser.ClassAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classAll}
	 * labeled alternative in {@link OCL2RAParser#oclSet}.
	 * @param ctx the parse tree
	 */
	void exitClassAll(OCL2RAParser.ClassAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectSingle}
	 * labeled alternative in {@link OCL2RAParser#oclSingle}.
	 * @param ctx the parse tree
	 */
	void enterObjectSingle(OCL2RAParser.ObjectSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectSingle}
	 * labeled alternative in {@link OCL2RAParser#oclSingle}.
	 * @param ctx the parse tree
	 */
	void exitObjectSingle(OCL2RAParser.ObjectSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantSingle}
	 * labeled alternative in {@link OCL2RAParser#oclSingle}.
	 * @param ctx the parse tree
	 */
	void enterConstantSingle(OCL2RAParser.ConstantSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantSingle}
	 * labeled alternative in {@link OCL2RAParser#oclSingle}.
	 * @param ctx the parse tree
	 */
	void exitConstantSingle(OCL2RAParser.ConstantSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roleObj}
	 * labeled alternative in {@link OCL2RAParser#oclObject}.
	 * @param ctx the parse tree
	 */
	void enterRoleObj(OCL2RAParser.RoleObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roleObj}
	 * labeled alternative in {@link OCL2RAParser#oclObject}.
	 * @param ctx the parse tree
	 */
	void exitRoleObj(OCL2RAParser.RoleObjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varObj}
	 * labeled alternative in {@link OCL2RAParser#oclObject}.
	 * @param ctx the parse tree
	 */
	void enterVarObj(OCL2RAParser.VarObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varObj}
	 * labeled alternative in {@link OCL2RAParser#oclObject}.
	 * @param ctx the parse tree
	 */
	void exitVarObj(OCL2RAParser.VarObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link OCL2RAParser#role}.
	 * @param ctx the parse tree
	 */
	void enterRole(OCL2RAParser.RoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OCL2RAParser#role}.
	 * @param ctx the parse tree
	 */
	void exitRole(OCL2RAParser.RoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OCL2RAParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(OCL2RAParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link OCL2RAParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(OCL2RAParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link OCL2RAParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(OCL2RAParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link OCL2RAParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(OCL2RAParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link OCL2RAParser#oclClass}.
	 * @param ctx the parse tree
	 */
	void enterOclClass(OCL2RAParser.OclClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link OCL2RAParser#oclClass}.
	 * @param ctx the parse tree
	 */
	void exitOclClass(OCL2RAParser.OclClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link OCL2RAParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(OCL2RAParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OCL2RAParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(OCL2RAParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OCL2RAParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(OCL2RAParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OCL2RAParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(OCL2RAParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OCL2RAParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(OCL2RAParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OCL2RAParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(OCL2RAParser.BoolOpContext ctx);
}