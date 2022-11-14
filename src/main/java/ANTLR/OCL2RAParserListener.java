// Generated from /Users/novelistchan/Documents/OCLfo2SQL/OCL2RA/src/main/java/ocl2ra/ANTLR/OCL2RAParser.g4 by ANTLR 4.10.1
package ANTLR;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by {@link OCL2RAParser}.
 */
public interface OCL2RAParserListener extends ParseTreeListener {

    /**
     * Enter a parse tree produced by {@link OCL2RAParser#oclText}.
     *
     * @param ctx the parse tree
     */
    void enterOclText(OCL2RAParser.OclTextContext ctx);

    /**
     * Exit a parse tree produced by {@link OCL2RAParser#oclText}.
     *
     * @param ctx the parse tree
     */
    void exitOclText(OCL2RAParser.OclTextContext ctx);

    /**
     * Enter a parse tree produced by {@link OCL2RAParser#oclExpr}.
     *
     * @param ctx the parse tree
     */
    void enterOclExpr(OCL2RAParser.OclExprContext ctx);

    /**
     * Exit a parse tree produced by {@link OCL2RAParser#oclExpr}.
     *
     * @param ctx the parse tree
     */
    void exitOclExpr(OCL2RAParser.OclExprContext ctx);

    /**
     * Enter a parse tree produced by {@link OCL2RAParser#oclContext}.
     *
     * @param ctx the parse tree
     */
    void enterOclContext(OCL2RAParser.OclContextContext ctx);

    /**
     * Exit a parse tree produced by {@link OCL2RAParser#oclContext}.
     *
     * @param ctx the parse tree
     */
    void exitOclContext(OCL2RAParser.OclContextContext ctx);

    /**
     * Enter a parse tree produced by {@link OCL2RAParser#oclInvariant}.
     *
     * @param ctx the parse tree
     */
    void enterOclInvariant(OCL2RAParser.OclInvariantContext ctx);

    /**
     * Exit a parse tree produced by {@link OCL2RAParser#oclInvariant}.
     *
     * @param ctx the parse tree
     */
    void exitOclInvariant(OCL2RAParser.OclInvariantContext ctx);

    /**
     * Enter a parse tree produced by {@link OCL2RAParser#oclInvName}.
     *
     * @param ctx the parse tree
     */
    void enterOclInvName(OCL2RAParser.OclInvNameContext ctx);

    /**
     * Exit a parse tree produced by {@link OCL2RAParser#oclInvName}.
     *
     * @param ctx the parse tree
     */
    void exitOclInvName(OCL2RAParser.OclInvNameContext ctx);

    /**
     * Enter a parse tree produced by the {@code boolForAll} labeled alternative in {@link
     * OCL2RAParser#oclBool}.
     *
     * @param ctx the parse tree
     */
    void enterBoolForAll(OCL2RAParser.BoolForAllContext ctx);

    /**
     * Exit a parse tree produced by the {@code boolForAll} labeled alternative in {@link
     * OCL2RAParser#oclBool}.
     *
     * @param ctx the parse tree
     */
    void exitBoolForAll(OCL2RAParser.BoolForAllContext ctx);

    /**
     * Enter a parse tree produced by the {@code boolCompare} labeled alternative in {@link
     * OCL2RAParser#oclBool}.
     *
     * @param ctx the parse tree
     */
    void enterBoolCompare(OCL2RAParser.BoolCompareContext ctx);

    /**
     * Exit a parse tree produced by the {@code boolCompare} labeled alternative in {@link
     * OCL2RAParser#oclBool}.
     *
     * @param ctx the parse tree
     */
    void exitBoolCompare(OCL2RAParser.BoolCompareContext ctx);

    /**
     * Enter a parse tree produced by the {@code boolCalc} labeled alternative in {@link
     * OCL2RAParser#oclBool}.
     *
     * @param ctx the parse tree
     */
    void enterBoolCalc(OCL2RAParser.BoolCalcContext ctx);

    /**
     * Exit a parse tree produced by the {@code boolCalc} labeled alternative in {@link
     * OCL2RAParser#oclBool}.
     *
     * @param ctx the parse tree
     */
    void exitBoolCalc(OCL2RAParser.BoolCalcContext ctx);

    /**
     * Enter a parse tree produced by the {@code classAll} labeled alternative in {@link
     * OCL2RAParser#oclSet}.
     *
     * @param ctx the parse tree
     */
    void enterClassAll(OCL2RAParser.ClassAllContext ctx);

    /**
     * Exit a parse tree produced by the {@code classAll} labeled alternative in {@link
     * OCL2RAParser#oclSet}.
     *
     * @param ctx the parse tree
     */
    void exitClassAll(OCL2RAParser.ClassAllContext ctx);

    /**
     * Enter a parse tree produced by the {@code objectSingle} labeled alternative in {@link
     * OCL2RAParser#oclSingle}.
     *
     * @param ctx the parse tree
     */
    void enterObjectSingle(OCL2RAParser.ObjectSingleContext ctx);

    /**
     * Exit a parse tree produced by the {@code objectSingle} labeled alternative in {@link
     * OCL2RAParser#oclSingle}.
     *
     * @param ctx the parse tree
     */
    void exitObjectSingle(OCL2RAParser.ObjectSingleContext ctx);

    /**
     * Enter a parse tree produced by the {@code constantSingle} labeled alternative in {@link
     * OCL2RAParser#oclSingle}.
     *
     * @param ctx the parse tree
     */
    void enterConstantSingle(OCL2RAParser.ConstantSingleContext ctx);

    /**
     * Exit a parse tree produced by the {@code constantSingle} labeled alternative in {@link
     * OCL2RAParser#oclSingle}.
     *
     * @param ctx the parse tree
     */
    void exitConstantSingle(OCL2RAParser.ConstantSingleContext ctx);

    /**
     * Enter a parse tree produced by the {@code roleObj} labeled alternative in {@link
     * OCL2RAParser#oclObject}.
     *
     * @param ctx the parse tree
     */
    void enterRoleObj(OCL2RAParser.RoleObjContext ctx);

    /**
     * Exit a parse tree produced by the {@code roleObj} labeled alternative in {@link
     * OCL2RAParser#oclObject}.
     *
     * @param ctx the parse tree
     */
    void exitRoleObj(OCL2RAParser.RoleObjContext ctx);

    /**
     * Enter a parse tree produced by the {@code varObj} labeled alternative in {@link
     * OCL2RAParser#oclObject}.
     *
     * @param ctx the parse tree
     */
    void enterVarObj(OCL2RAParser.VarObjContext ctx);

    /**
     * Exit a parse tree produced by the {@code varObj} labeled alternative in {@link
     * OCL2RAParser#oclObject}.
     *
     * @param ctx the parse tree
     */
    void exitVarObj(OCL2RAParser.VarObjContext ctx);

    /**
     * Enter a parse tree produced by {@link OCL2RAParser#oclRole}.
     *
     * @param ctx the parse tree
     */
    void enterOclRole(OCL2RAParser.OclRoleContext ctx);

    /**
     * Exit a parse tree produced by {@link OCL2RAParser#oclRole}.
     *
     * @param ctx the parse tree
     */
    void exitOclRole(OCL2RAParser.OclRoleContext ctx);

    /**
     * Enter a parse tree produced by {@link OCL2RAParser#oclAttr}.
     *
     * @param ctx the parse tree
     */
    void enterOclAttr(OCL2RAParser.OclAttrContext ctx);

    /**
     * Exit a parse tree produced by {@link OCL2RAParser#oclAttr}.
     *
     * @param ctx the parse tree
     */
    void exitOclAttr(OCL2RAParser.OclAttrContext ctx);

    /**
     * Enter a parse tree produced by {@link OCL2RAParser#oclVar}.
     *
     * @param ctx the parse tree
     */
    void enterOclVar(OCL2RAParser.OclVarContext ctx);

    /**
     * Exit a parse tree produced by {@link OCL2RAParser#oclVar}.
     *
     * @param ctx the parse tree
     */
    void exitOclVar(OCL2RAParser.OclVarContext ctx);

    /**
     * Enter a parse tree produced by {@link OCL2RAParser#oclClass}.
     *
     * @param ctx the parse tree
     */
    void enterOclClass(OCL2RAParser.OclClassContext ctx);

    /**
     * Exit a parse tree produced by {@link OCL2RAParser#oclClass}.
     *
     * @param ctx the parse tree
     */
    void exitOclClass(OCL2RAParser.OclClassContext ctx);

    /**
     * Enter a parse tree produced by {@link OCL2RAParser#oclConstant}.
     *
     * @param ctx the parse tree
     */
    void enterOclConstant(OCL2RAParser.OclConstantContext ctx);

    /**
     * Exit a parse tree produced by {@link OCL2RAParser#oclConstant}.
     *
     * @param ctx the parse tree
     */
    void exitOclConstant(OCL2RAParser.OclConstantContext ctx);

    /**
     * Enter a parse tree produced by {@link OCL2RAParser#compOp}.
     *
     * @param ctx the parse tree
     */
    void enterCompOp(OCL2RAParser.CompOpContext ctx);

    /**
     * Exit a parse tree produced by {@link OCL2RAParser#compOp}.
     *
     * @param ctx the parse tree
     */
    void exitCompOp(OCL2RAParser.CompOpContext ctx);

    /**
     * Enter a parse tree produced by {@link OCL2RAParser#boolOp}.
     *
     * @param ctx the parse tree
     */
    void enterBoolOp(OCL2RAParser.BoolOpContext ctx);

    /**
     * Exit a parse tree produced by {@link OCL2RAParser#boolOp}.
     *
     * @param ctx the parse tree
     */
    void exitBoolOp(OCL2RAParser.BoolOpContext ctx);
}