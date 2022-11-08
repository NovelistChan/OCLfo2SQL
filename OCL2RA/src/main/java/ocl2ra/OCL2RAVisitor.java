package ocl2ra;

import java.util.ArrayList;
import java.util.Stack;
import ocl2ra.ANTLR.OCL2RAParser;
import ocl2ra.ANTLR.OCL2RAParser.ConstantSingleContext;
import ocl2ra.ANTLR.OCL2RAParserBaseVisitor;
import ocl2ra.OCLConstructor.OCLAssociation;
import ocl2ra.OCLConstructor.OCLClass;

public class OCL2RAVisitor extends OCL2RAParserBaseVisitor<String> {

    private ArrayList<OCLClass> transClasses;

    private ArrayList<OCLAssociation> transAssociations;

    private Stack<String> contextQuery;

    private String ORIGIN_CTX = "ORIGIN";

    private String ROLECLASS_NOT_FOUND = "ROLECLASS_NOT_FOUND";

    private String INVALID_BOOLOP = "INVALID_BOOLOP";

    /*
        oclText : oclExpr + EOF
    */
    @Override
    public String visitOclText(OCL2RAParser.OclTextContext ctx) {
        this.initContextQuery();
        this.setContextQuery(ORIGIN_CTX);

        StringBuilder res = new StringBuilder(visit(ctx.oclExpr(0)));

        for (int i = 1; i < ctx.oclExpr().size(); i++) {
            if (!this.contextQuery.peek().equals(ORIGIN_CTX)) {
                this.contextQuery.pop();
            }
            res.append("\n");
            res.append(visit(ctx.oclExpr(i)));
        }
        return res.toString();
    }

    // oclExpr : context oclContext inv oclInvariant
    @Override
    public String visitOclExpr(OCL2RAParser.OclExprContext ctx) {
        this.setContextQuery(visit(ctx.oclContext()));
//        return visit(ctx.oclBool());
        return visit(ctx.oclInvariant());
    }

    /*
        oclInvariant: oclInvName : oclBool
     */
    @Override
    public String visitOclInvariant(OCL2RAParser.OclInvariantContext ctx) {
        return visit(ctx.oclInvName()) + ": " + visit(ctx.oclBool());
    }

    /*
       oclBool : oclSet->forAll(var | oclBool)
       oclBool : oclSet AR FA LB var SEP oclBool RB
    */
    @Override
    public String visitBoolForAll(OCL2RAParser.BoolForAllContext ctx) {
        String rs = visit(ctx.oclSet());
        String rb = visit(ctx.oclBool());
        if (!this.contextQuery.peek().equals(ORIGIN_CTX)) {
            this.contextQuery.pop();
        }
        return rb;
    }

    /*
        oclBool : oclSingle compOp oclSingle
     */
    @Override
    public String visitBoolCompare(OCL2RAParser.BoolCompareContext ctx) {
        String r1 = visit(ctx.oclSingle(0));
        String r2 = visit(ctx.oclSingle(1));
        if (r1.equals(r2)) {
            return "PI Sigma (" + ctx.oclSingle(0).getText() + " " + visit(ctx.compOp()) + " " + ctx
                .oclSingle(1)
                .getText() + ") " + r1;
        }
        if (ctx.oclSingle(0) instanceof ConstantSingleContext) {
            if (ctx.oclSingle(1) instanceof ConstantSingleContext) {
                return "PI Sigma (" + ctx.oclSingle(0).getText() + " " + visit(ctx.compOp()) + " "
                    + ctx
                    .oclSingle(1)
                    .getText() + ") ";
            } else {
                return "PI Sigma (" + ctx.oclSingle(0).getText() + " " + visit(ctx.compOp()) + " "
                    + ctx
                    .oclSingle(1)
                    .getText() + ") " + r2;
            }
        } else {
            if (ctx.oclSingle(1) instanceof ConstantSingleContext) {
                return "PI Sigma (" + ctx.oclSingle(0).getText() + " " + visit(ctx.compOp()) + " "
                    + ctx
                    .oclSingle(1)
                    .getText() + ") " + r1;
            } else {
                return "PI Sigma (" + ctx.oclSingle(0).getText() + " " + visit(ctx.compOp()) + " "
                    + ctx
                    .oclSingle(1)
                    .getText() + ") " + "(" + r1 + " Cartesian " + r2 + ")";
            }
        }
    }

    /*
        oclBool : oclBool boolop oclBool
     */
    @Override
    public String visitBoolCalc(OCL2RAParser.BoolCalcContext ctx) {
        String r1 = visit(ctx.oclBool(0));
        String r2 = visit(ctx.oclBool(1));
        switch (visit(ctx.boolOp())) {
            case "and":
                return r1 + " intersect " + r2;
            case "or":
                return r1 + " union " + r2;
            case "xor":
                return "(" + r1 + " union " + r2 + ")" + " differ " + "(" + r1 + " intersect " + r2
                    + ")";
            case "implies":
                return "U differ " + r1 + " union " + r2;
            default:
                return INVALID_BOOLOP;
        }
//        return visitChildren(ctx);
    }

//    /*
//        oclSet : oclSet->select(var | oclBool)
//        oclSet : oclSet AR SE LB var SEP oclBool RB
//     */
//    @Override
//    public String visitSetSelect(OCL2RAParser.SetSelectContext ctx) {
//        String rs = visit(ctx.oclSet());
//        String rb = visit(ctx.oclBool());
//
//        return visitChildren(ctx);
//    }

    /*
        oclSet : oclClass.allInstances()
     */
    @Override
    public String visitClassAll(OCL2RAParser.ClassAllContext ctx) {
        String cq = this.contextQuery.peek();
        if (cq.equals(ORIGIN_CTX)) {
            this.setContextQuery(ctx.oclClass().getText());
            return ctx.oclClass().getText();
        }
        this.setContextQuery(ctx.oclClass().getText() + " Cartesian " + cq);
        return ctx.oclClass().getText() + " Cartesian " + cq;
    }

    /*
        oclSingle : oclObject.attr
     */
    @Override
    public String visitObjectSingle(OCL2RAParser.ObjectSingleContext ctx) {
        return visit(ctx.oclObject());
    }

    /*
        oclSingle : constant
     */
    @Override
    public String visitConstantSingle(OCL2RAParser.ConstantSingleContext ctx) {
        return visit(ctx.oclConstant());
    }

    /*
        oclObject : oclObject.role
     */
    @Override
    public String visitRoleObj(OCL2RAParser.RoleObjContext ctx) {
        String ro = visit(ctx.oclObject());
        String rb = visit(ctx.oclRole());
        String rbContext = this.getRoleClass(rb);
//        if (rbContext.equals(this.contextQuery.peek())) {
//            return ro;
//        }
        return "(" + rbContext + " Cartesian " + ro + ")";
    }

    /*
        oclObject : var
     */
    @Override
    public String visitVarObj(OCL2RAParser.VarObjContext ctx) {
        return this.contextQuery.peek();
    }


    // Strings
    @Override
    public String visitOclContext(OCL2RAParser.OclContextContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOclInvName(OCL2RAParser.OclInvNameContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOclRole(OCL2RAParser.OclRoleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOclAttr(OCL2RAParser.OclAttrContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOclVar(OCL2RAParser.OclVarContext ctx) {
        return ctx.getText();
    }

    // unused
    @Override
    public String visitOclClass(OCL2RAParser.OclClassContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOclConstant(OCL2RAParser.OclConstantContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCompOp(OCL2RAParser.CompOpContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBoolOp(OCL2RAParser.BoolOpContext ctx) {
        return ctx.getText();
    }


    // oclClass mgr
    public void freeTransClasses() {
        this.transClasses = new ArrayList<>();
    }

    public void setTransClasses(ArrayList<OCLClass> tc) {
        this.transClasses = tc;
    }

    public void addTransClasses(ArrayList<OCLClass> tc) {
        this.transClasses.addAll(tc);
    }

    public void addTransClass(OCLClass oc) {
        this.transClasses.add(oc);
    }


    // context query mgr
    public void initContextQuery() {
        this.contextQuery = new Stack<>();
    }

    public void setContextQuery(String cq) {
        this.contextQuery.push(cq);
    }

    // oclAssoc mgr
    public void freeTransAssoc() {
        this.transAssociations = new ArrayList<>();
    }

    public void setTransAssoc(ArrayList<OCLAssociation> ta) {
        this.transAssociations = ta;
    }

    public void addTransAssoc(ArrayList<OCLAssociation> ta) {
        this.transAssociations.addAll(ta);
    }

    public void addTransAssoc(OCLAssociation oa) {
        this.transAssociations.add(oa);
    }

    String getRoleClass(String role) {
        for (OCLAssociation oa : this.transAssociations) {
            if (!oa.getRoleClass(role).equals(ROLECLASS_NOT_FOUND)) {
                return oa.getRoleClass(role);
            }
        }
        return ROLECLASS_NOT_FOUND;
    }

//    boolean isOriginal() {
//        return this.contextQuery.peek().equals(ORIGIN_CTX);
//    }
}
