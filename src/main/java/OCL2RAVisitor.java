import ANTLR.OCL2RA.OCL2RAParser;
import ANTLR.OCL2RA.OCL2RAParserBaseVisitor;
import OCLConstructor.OCLAssociation;
import OCLConstructor.OCLClass;
import RAConstructor.Comparison;
import RAConstructor.Difference;
import RAConstructor.Implies;
import RAConstructor.Intersection;
import RAConstructor.NaturalJoin;
import RAConstructor.RAClass;
import RAConstructor.RAConstant;
import RAConstructor.RAContext;
import RAConstructor.RAList;
import RAConstructor.RAObject;
import RAConstructor.RAString;
import RAConstructor.Selection;
import RAConstructor.Union;
import java.util.ArrayList;
import java.util.Stack;

public class OCL2RAVisitor extends OCL2RAParserBaseVisitor<RAObject> {

    private ArrayList<OCLClass> transClasses;

    private ArrayList<OCLAssociation> transAssociations;

    private Stack<RAContext> contextQuery;

//    private String ORIGIN_CTX = "ORIGIN";

    private RAContext ORIGIN_CTX = new RAClass("ORIGIN");

    private String ROLECLASS_NOT_FOUND = "ROLECLASS_NOT_FOUND";

    private String INVALID_BOOLOP = "INVALID_BOOLOP";

    //    private String contextSelf;
    private RAContext contextSelf;

    /*
        oclText : oclExpr + EOF
    */
    @Override
    public RAObject visitOclText(OCL2RAParser.OclTextContext ctx) {
        this.initContextQuery();
        this.setContextQuery(ORIGIN_CTX);

        RAList res = new RAList();
        res.add(visit(ctx.oclExpr(0)));

        for (int i = 1; i < ctx.oclExpr().size(); i++) {
            if (!this.contextQuery.peek().equals(ORIGIN_CTX)) {
                this.contextQuery.pop();
            }
            res.add(visit(ctx.oclExpr(i)));
        }

        return res;
//        StringBuilder res = new StringBuilder(visit(ctx.oclExpr(0)));
//
//        for (int i = 1; i < ctx.oclExpr().size(); i++) {
//            if (!this.contextQuery.peek().equals(ORIGIN_CTX)) {
//                this.contextQuery.pop();
//            }
//            res.append("\n");
//            res.append(visit(ctx.oclExpr(i)));
//        }
//        return res.toString();
    }

    // oclExpr : context oclContext inv oclInvariant
    @Override
    public RAObject visitOclExpr(OCL2RAParser.OclExprContext ctx) {
        this.setContextQuery((RAClass) visit(ctx.oclContext()));
        this.setContextSelf(this.contextQuery.peek());
//        return visit(ctx.oclBool());
        return visit(ctx.oclInvariant());
    }

    /*
        oclInvariant: oclInvName : oclBool
     */
    @Override
    public RAObject visitOclInvariant(OCL2RAParser.OclInvariantContext ctx) {
        return visit(ctx.oclBool()).setName(visit(ctx.oclInvName()).getName());
    }

    /*
       oclBool : oclSet->forAll(var | oclBool)
       oclBool : oclSet AR FA LB var SEP oclBool RB
    */
    @Override
    public RAObject visitBoolForAll(OCL2RAParser.BoolForAllContext ctx) {
        RAObject rs = visit(ctx.oclSet());
        RAObject rb = visit(ctx.oclBool());
        if (!this.contextQuery.peek().equals(ORIGIN_CTX)) {
            this.contextQuery.pop();
        }
        return rb;
    }

    /*
        oclBool : oclSingle compOp oclSingle
     */
    @Override
    public RAObject visitBoolCompare(OCL2RAParser.BoolCompareContext ctx) {
        RAObject r1 = visit(ctx.oclSingle(0));
        RAObject r2 = visit(ctx.oclSingle(1));

//        StringBuilder conds = new StringBuilder();
//        conds.append(ctx.oclSingle(0).getText()).append(" ").append(ctx.compOp().getText())
//            .append(" ").append(ctx.oclSingle(1).getText());
//        if (r1 instanceof RAConstant) {
//            if (r2 instanceof RAConstant) {
//                return new Projection(new Selection(conds.toString(), this.contextQuery.peek()));
//            } else {
//                return new Projection(new Selection(conds.toString(), r2));
//            }
//        } else if (r2 instanceof RAConstant) {
//            return new Projection(new Selection(conds.toString(), r1));
//        }
//        if ((r1 instanceof RAClass) && !(r2 instanceof RAClass)) {
//            if (((NaturalJoin) r2).contains((RAClass) r1)) {
//                return new Projection(new Selection(conds.toString(), r2));
//            }
//        } else if ((r2 instanceof RAClass) && !(r1 instanceof RAClass)) {
//            if (((NaturalJoin) r1).contains((RAClass) r2)) {
//                return new Projection(new Selection(conds.toString(), r1));
//            }
//        }
//        return new Projection(
//            new Selection(conds.toString(), new NaturalJoin((RAContext) r1, (RAContext) r2)));
//        StringBuilder conds = new StringBuilder();
//        conds.append(ctx.oclSingle(0).getText()).append(" ").append(ctx.compOp().getText())
//            .append(" ").append(ctx.oclSingle(1).getText());

//        switch (ctx.compOp().getText()) {
//            case "<":
//                conds.add(new Comparison(ctx.oclSingle(0).getText(), ctx.oclSingle(1).getText(),
//                    CompareOperation.LT));
//                break;
//            case ">":
//                conds.add(new Comparison(ctx.oclSingle(0).getText(), ctx.oclSingle(1).getText(),
//                    CompareOperation.GT));
//                break;
//            case "<>":
//                conds.add(new Comparison(ctx.oclSingle(0).getText(), ctx.oclSingle(1).getText(),
//                    CompareOperation.NE));
//                break;
//            case "=":
//                conds.add(new Comparison(ctx.oclSingle(0).getText(), ctx.oclSingle(1).getText(),
//                    CompareOperation.EQ));
//                break;
//            case "<=":
//                conds.add(new Comparison(ctx.oclSingle(0).getText(), ctx.oclSingle(1).getText(),
//                    CompareOperation.LE));
//                break;
//            case ">=":
//                conds.add(new Comparison(ctx.oclSingle(0).getText(), ctx.oclSingle(1).getText(),
//                    CompareOperation.GE));
//                break;
//            default:
//                break;
//        }
        ArrayList<Comparison> conds = new ArrayList<>();
        conds.add(new Comparison(ctx.oclSingle(0).getText(), ctx.oclSingle(1).getText(),
            ctx.compOp().getText()));
        if (r1 instanceof RAConstant) {
            if (r2 instanceof RAConstant) {
                return new Selection(conds, this.contextQuery.peek());
            } else {
                return new Selection(conds, r2);
            }
        } else if (r2 instanceof RAConstant) {
            return new Selection(conds, r1);
        }
        if ((r1 instanceof RAClass) && !(r2 instanceof RAClass)) {
            if (((NaturalJoin) r2).contains((RAClass) r1)) {
                return new Selection(conds, r2);
            }
        } else if ((r2 instanceof RAClass) && !(r1 instanceof RAClass)) {
            if (((NaturalJoin) r1).contains((RAClass) r2)) {
                return new Selection(conds, r1);
            }
        }
        return
            new Selection(conds, new NaturalJoin((RAContext) r1, (RAContext) r2));
    }

    /*
        oclBool : oclBool boolop oclBool
     */
    @Override
    public RAObject visitBoolCalc(OCL2RAParser.BoolCalcContext ctx) {
        RAObject r1 = visit(ctx.oclBool(0));
        RAObject r2 = visit(ctx.oclBool(1));
        switch (visit(ctx.boolOp()).print()) {
            case "and":
                return new Intersection(r1, r2);
            case "or":
                return new Union(r1, r2);
            case "xor":
                return new Difference(new Union(r1, r2), new Intersection(r1, r2));
            case "implies":
                return new Implies(r1, r2);
            default:
                return new RAString(INVALID_BOOLOP);
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
    public RAObject visitClassAll(OCL2RAParser.ClassAllContext ctx) {
        RAContext cq = this.contextQuery.peek();
        if (cq.equals(ORIGIN_CTX)) {
            this.setContextQuery(new RAClass(ctx.oclClass().getText()));
            return new RAClass(ctx.oclClass().getText());
        }
        this.setContextQuery(new NaturalJoin(new RAClass(ctx.oclClass().getText()), cq));
        return new NaturalJoin(new RAClass(ctx.oclClass().getText()), cq);
    }

    /*
        oclSingle : oclObject.attr
     */
    @Override
    public RAObject visitObjectSingle(OCL2RAParser.ObjectSingleContext ctx) {
        return visit(ctx.oclObject());
    }

    /*
        oclSingle : constant
     */
    @Override
    public RAObject visitConstantSingle(OCL2RAParser.ConstantSingleContext ctx) {
        return visit(ctx.oclConstant());
    }

    /*
        oclObject : oclObject.role
     */
    @Override
    public RAObject visitRoleObj(OCL2RAParser.RoleObjContext ctx) {
        RAObject ro = visit(ctx.oclObject());
        RAObject rb = visit(ctx.oclRole());
        String rbContext = this.getRoleClass(rb.print());
        if (rbContext.equals(this.contextQuery.peek().print())) {
            return ro;
        }
//        return "(" + rbContext + " Cartesian " + ro + ")";
        return new NaturalJoin((RAContext) ro, new RAClass(rbContext));
    }

    /*
        oclObject : var
     */
    @Override
    public RAContext visitVarObj(OCL2RAParser.VarObjContext ctx) {
        if (ctx.getText().equals("self")) {
            return this.contextSelf;
        }
        return this.contextQuery.peek();
    }


    // Strings
    @Override
    public RAObject visitOclContext(OCL2RAParser.OclContextContext ctx) {
        return new RAClass(ctx.getText());
    }

    @Override
    public RAObject visitOclInvName(OCL2RAParser.OclInvNameContext ctx) {
        return new RAString(ctx.getText());
    }

    @Override
    public RAObject visitOclRole(OCL2RAParser.OclRoleContext ctx) {
        return new RAString(ctx.getText());
    }

    @Override
    public RAObject visitOclAttr(OCL2RAParser.OclAttrContext ctx) {
        return new RAString(ctx.getText());
    }

    @Override
    public RAObject visitOclVar(OCL2RAParser.OclVarContext ctx) {
        return new RAString(ctx.getText());
    }

    @Override
    public RAObject visitOclClass(OCL2RAParser.OclClassContext ctx) {
        return new RAClass(ctx.getText());
    }

    @Override
    public RAObject visitOclString(OCL2RAParser.OclStringContext ctx) {
        return new RAConstant("'" + ctx.ID().getText() + "'");
    }

    @Override
    public RAObject visitOclInt(OCL2RAParser.OclIntContext ctx) {
        return new RAConstant(ctx.getText());
    }

    @Override
    public RAObject visitCompOp(OCL2RAParser.CompOpContext ctx) {
        return new RAString(ctx.getText());
    }

    @Override
    public RAObject visitBoolOp(OCL2RAParser.BoolOpContext ctx) {
        return new RAString(ctx.getText());
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

    public void setContextQuery(RAContext cq) {
        this.contextQuery.push(cq);
    }

    public void setContextSelf(RAContext s) {
        this.contextSelf = s;
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

    private String getRoleClass(String role) {
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
