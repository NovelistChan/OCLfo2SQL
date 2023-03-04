import ANTLR.OCL2RA.OCL2RAParser;
import ANTLR.OCL2RA.OCL2RAParser.BoolCompareContext;
import ANTLR.OCL2RA.OCL2RAParserBaseVisitor;
import OCLConstructor.OCLAssociation;
import OCLConstructor.OCLClass;
import RAConstructor.Comparison;
import RAConstructor.ConstantType;
import RAConstructor.Implies;
import RAConstructor.Intersection;
import RAConstructor.NaturalJoin;
import RAConstructor.RAAggregation;
import RAConstructor.RABinary;
import RAConstructor.RAClass;
import RAConstructor.RAConstant;
import RAConstructor.RAContext;
import RAConstructor.RAList;
import RAConstructor.RAObject;
import RAConstructor.RAString;
import RAConstructor.Selection;
import RAConstructor.ThetaJoin;
import RAConstructor.Union;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
    private RAContext contextTail;
    private int tempTableCount;

    private Map<String, RAContext> varContextPairList;

    private Stack<Boolean> negationFlag;

    /*
        oclText : oclExpr + EOF
    */
    @Override
    public RAObject visitOclText(OCL2RAParser.OclTextContext ctx) {
        this.tempTableCount = 0;
        this.initNegationFlag();
        this.setNegationFlag(true);
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
    }

    // oclExpr : context oclContext inv oclInvariant
    @Override
    public RAObject visitOclExpr(OCL2RAParser.OclExprContext ctx) {
        this.initVarContextPairList();
        this.setContextQuery((RAClass) visit(ctx.oclContext()));
        this.setContextSelf(this.contextQuery.peek());
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
        this.setNegationFlag(true);
        RAObject rs = visit(ctx.oclSet());
        String varName = ctx.oclVar().getText();
        this.varContextPairList.put(varName, this.contextTail);
        RAObject rb = visit(ctx.oclBool());
        if (!this.contextQuery.peek().equals(ORIGIN_CTX)) {
            this.contextQuery.pop();
        }
        this.negationFlag.pop();
        return rb;
    }

    /*
        oclBool : oclSingle compOp oclSingle
        Compare Conditions:
        I. including Aggregation
            i. Aggregation CompOp Aggregation
            ii. Aggregation CompOp Binary
            iii. Aggregation CompOp Context
            iv. Aggregation CompOp Constant
        II. including Binary
            i. Binary CompOp Binary
            ii. Binary CompOp Context
            iii. Binary CompOp Constant
        III. excluding A&B
            i. Context CompOp Context
            ii. Context CompOp Constant
            iii. Constant CompOp Constant
        Binary = Context BinaryOp Context
        Context = RAClass or Join/Selection
     */
    @Override
    public RAObject visitBoolCompare(OCL2RAParser.BoolCompareContext ctx) {
        RAObject r1 = visit(ctx.oclSingle(0));
        RAObject r2 = visit(ctx.oclSingle(1));
        ArrayList<Comparison> conds = new ArrayList<>();
        // get sigma conditions
        // I. including Aggregation
        if (r1 instanceof RAAggregation || r2 instanceof RAAggregation) {
            // Aggregation CompOp Aggregation
            if (r1 instanceof RAAggregation && r2 instanceof RAAggregation) {
                String lh = r1.print();
                String rh = r2.print();
                conds.add(new Comparison(lh, rh, visit(ctx.compOp()).print()));
                String class1 = ((RAAggregation) r1).getClassName();
                String class2 = ((RAAggregation) r2).getClassName();
                if (class1.equals(class2)) {
                    return new Selection(conds, new RAClass(class1), true);
                } else {
                    return new Selection(conds,
                        new NaturalJoin(new RAClass(class1), new RAClass(class2)), true);
                }
            }
            // Aggregation CompOp Binary
            else if (r1 instanceof RABinary || r2 instanceof RABinary) {
                RAObject t1 = (r1 instanceof RAAggregation) ? r1 : r2;
                RAObject t2 = (r2 instanceof RABinary) ? r2 : r1;
                String lh = t1.print();
                String rh = t2.getBinaryString();
                conds.add(new Comparison(lh, rh, visit(ctx.compOp()).print()));
                if (this.contextQuery.peek() instanceof NaturalJoin) {
                    ((NaturalJoin) this.contextQuery.peek()).selfCheck();
                }
                RAClass class1 = new RAClass(((RAAggregation) t1).getClassName());
                if (class1.equals(this.contextQuery.peek())) {
                    return new Selection(conds, class1, true);
                } else {
                    NaturalJoin join = new NaturalJoin(class1, this.contextQuery.peek());
                    join.selfCheck();
                    return new Selection(conds, join, true);
                }
            }
            // Aggregation CompOp Constant
            else if (r1 instanceof RAConstant || r2 instanceof RAConstant) {
                RAObject t1 = (r1 instanceof RAAggregation) ? r1 : r2;
                RAObject t2 = (r2 instanceof RAConstant) ? r2 : r1;
                String lh = t1.print();
                String rh = t2.print();
                conds.add(new Comparison(lh, rh, visit(ctx.compOp()).print()));
                RAClass class1 = new RAClass(((RAAggregation) t1).getClassName());
                return new Selection(conds, class1, true);
            }
            // Aggregation CompOp Context
            else if (r1 instanceof RAContext || r2 instanceof RAContext) {
                RAObject t1 = (r1 instanceof RAAggregation) ? r1 : r2;
                RAObject t2 = (r2 instanceof RAContext) ? r2 : r1;
                String lh = t1.print();
                String rh = "";
                String[] rctx = {};
                boolean rename = false;
                if (r1 instanceof RAContext) {
                    rh = ctx.oclSingle(0).getText();
                    rctx = ctx.oclSingle(0).getText().split("\\.");
                } else {
                    rh = ctx.oclSingle(1).getText();
                    rctx = ctx.oclSingle(1).getText().split("\\.");
                }
                RAContext c1 = new RAClass(((RAAggregation) t1).getClassName());
                Selection res = (Selection) compareWithRAContext(ctx, conds, (RAContext) t2, lh, rh,
                    rctx, rename, c1);
                res.setAggregateFlag(true);
                return res;
            }
        }
        // II. including Binary
        else if (r1 instanceof RABinary || r2 instanceof RABinary) {
            // Binary CompOp Binary, Binary CompOp Constant
            if ((r1 instanceof RABinary && r2 instanceof RABinary)
                || (r1 instanceof RAConstant || r2 instanceof RAConstant)) {
                String lh = r1.getBinaryString();
                String rh = r2.getBinaryString();
                conds.add(new Comparison(lh, rh, visit(ctx.compOp()).print()));
                if (this.contextQuery.peek() instanceof NaturalJoin) {
                    ((NaturalJoin) this.contextQuery.peek()).selfCheck();
                }
                return new Selection(conds, this.contextQuery.peek());
            }
            // Binary CompOp Context
            else if (r1 instanceof RAContext || r2 instanceof RAContext) {
                RAObject t1 = (r1 instanceof RABinary) ? r1 : r2;
                RAObject t2 = (r2 instanceof RAContext) ? r2 : r1;
                String lh = t1.getBinaryString();
                String rh = "";
                String[] rctx = {};
                boolean rename = false;
                if (r1 instanceof RAContext) {
                    rh = ctx.oclSingle(0).getText();
                    rctx = ctx.oclSingle(0).getText().split("\\.");
                } else {
                    rh = ctx.oclSingle(1).getText();
                    rctx = ctx.oclSingle(1).getText().split("\\.");
                }
                if (this.contextQuery.peek() instanceof NaturalJoin) {
                    ((NaturalJoin) this.contextQuery.peek()).selfCheck();
                }
                RAContext c1 = this.contextQuery.peek();
                return compareWithRAContext(ctx, conds, (RAContext) t2, lh, rh, rctx, rename, c1);
            }
        }
        // III. excluding A&B
        String[] leftCtx = ctx.oclSingle(0).getText().split("\\.");
        String[] rightCtx = ctx.oclSingle(1).getText().split("\\.");
        boolean rename = false;
        // Class CompOp Class: If Two Same Classes, Prepare Renaming
        if ((r1 instanceof RAClass) && (r2 instanceof RAClass) && r1.equals(r2) && (leftCtx.length
            != rightCtx.length)) {
            rename = true;
        }
        String lh, rh;
        // temptable: tn
        String tableName1 = "";
        String tableName2 = "";
        if (rename) {
            tableName1 = this.getTempTableName();
            tableName2 = this.getTempTableName();
        }
        if (r1 instanceof RAConstant) {
            lh = r1.print();
        } else {
            lh = makeUpConds(ctx.oclSingle(0).getText(), rename, tableName1);
        }
        if (r2 instanceof RAConstant) {
            rh = r2.print();
        } else {
            rh = makeUpConds(ctx.oclSingle(1).getText(), rename, tableName2);
        }

        conds.add(new Comparison(lh, rh, visit(ctx.compOp()).print()));

        // ensure no redundant join
        if (r1 instanceof RAConstant) {
            if (r2 instanceof RAConstant) {
                // Constant CompOp Constant
                return new Selection(conds, this.contextQuery.peek());
            } else {
                // Constant CompOp Context
                return new Selection(conds, r2);
            }
        } else if (r2 instanceof RAConstant) {
            // Context CompOp Constant
            return new Selection(conds, r1);
        }
        if ((r1 instanceof RAClass) && !(r2 instanceof RAClass)) {
            // Class CompOp NatureJoin
            if (((NaturalJoin) r2).contains((RAClass) r1)) {
                return new Selection(conds, r2);
            }
        } else if ((r2 instanceof RAClass) && !(r1 instanceof RAClass)) {
            // NatureJoin CompOp Class
            if (((NaturalJoin) r1).contains((RAClass) r2)) {
                return new Selection(conds, r1);
            }
        }

        // check if join on association ends
        if ((r1 instanceof RAClass) && (r2 instanceof RAClass)) {
            OCLAssociation as = this.hasAssociation((RAClass) r1, (RAClass) r2);
            if (as != null && (leftCtx.length != rightCtx.length)) {
                ArrayList<Comparison> joinConds = new ArrayList<>();
                if (r1.equals(r2)) {
                    joinConds.add(new Comparison(
                        tableName1 + "." + as.getAssocEnd().getKey(),
                        tableName2 + ".id",
                        "="
                    ));
                } else {
                    if (as.getAssocClass().getKey().equals(r1.print())) {
                        joinConds.add(new Comparison(
                            as.getAssocClass().getKey() + "." + as.getAssocEnd().getKey()
                            , as.getAssocClass().getValue() + "." + as.getAssocEnd().getValue(),
                            "="));
                    } else {
                        joinConds.add(new Comparison(
                            as.getAssocClass().getValue() + "." + as.getAssocEnd().getValue()
                            , as.getAssocClass().getKey() + "." + as.getAssocEnd().getKey(), "="));
                    }
                }
                return new Selection(conds,
                    new ThetaJoin((RAContext) r1, (RAContext) r2, joinConds, tableName1,
                        tableName2));
            }
        }
        // both Context
        if (r1.equals(r2)) {
            return new Selection(conds, r1);
        }
        assert r1 instanceof RAContext;
        return
            new Selection(conds, new NaturalJoin((RAContext) r1, (RAContext) r2));
    }

    private RAObject compareWithRAContext(BoolCompareContext ctx, ArrayList<Comparison> conds,
        RAContext t2, String lh, String rh, String[] rctx, boolean rename, RAContext c1) {
        RAContext c2 = t2;
        if (c1.equals(c2) && rctx.length > 2 && c1 instanceof RAClass
            && c2 instanceof RAClass) {
            rename = true;
        }
        String tableName1 = "";
        String tableName2 = "";
        if (rename) {
            tableName1 = this.getTempTableName();
            tableName2 = this.getTempTableName();
            lh = lh.replace(((RAClass) c1).getClassName(), tableName1);
        }
        rh = makeUpConds(rh, rename, tableName2);
        conds.add(new Comparison(lh, rh, visit(ctx.compOp()).print()));
        if ((c1 instanceof RAClass) && !(c2 instanceof RAClass)) {
            if (((NaturalJoin) c2).contains((RAClass) c1)) {
                return new Selection(conds, c2);
            }
        } else if ((c2 instanceof RAClass) && !(c1 instanceof RAClass)) {
            if (((NaturalJoin) c1).contains((RAClass) c2)) {
                return new Selection(conds, c1);
            }
        }
        if (c1 instanceof RAClass && c2 instanceof RAClass) {
            OCLAssociation as = this.hasAssociation((RAClass) c1, (RAClass) c2);
            if (as != null && rctx.length > 2) {
                ArrayList<Comparison> joinConds = new ArrayList<>();
                if (c1.equals(c2)) {
                    joinConds.add(new Comparison(
                        tableName1 + "." + as.getAssocEnd().getKey(),
                        tableName2 + ".id",
                        "="
                    ));
                } else {
                    if (as.getAssocClass().getKey().equals(c1.print())) {
                        joinConds.add(new Comparison(
                            as.getAssocClass().getKey() + "." + as.getAssocEnd().getKey()
                            , as.getAssocClass().getValue() + "." + as.getAssocEnd()
                            .getValue(),
                            "="));
                    } else {
                        joinConds.add(new Comparison(
                            as.getAssocClass().getValue() + "." + as.getAssocEnd()
                                .getValue()
                            , as.getAssocClass().getKey() + "." + as.getAssocEnd().getKey(),
                            "="));
                    }
                }
                return new Selection(conds,
                    new ThetaJoin(c1, (RAContext) c2, joinConds, tableName1,
                        tableName2));
            }
        }
        if (c1.equals(c2)) {
            return new Selection(conds, c1);
        }
        return
            new Selection(conds, new NaturalJoin(c1, (RAContext) c2));
    }

    /*
        oclBool : oclBool boolop oclBool
     */
    @Override
    public RAObject visitBoolCalc(OCL2RAParser.BoolCalcContext ctx) {
        RAObject r1 = visit(ctx.oclBool(0));
        RAObject r2 = visit(ctx.oclBool(1));
        if (this.negationFlag.peek()) {
            switch (visit(ctx.boolOp()).print()) {
                case "and":
                    return new Union(r1, r2);
                case "or":
                    return new Intersection(r1, r2);
                case "xor":
                    return new Union(new Intersection(r1, r2),
                        new Union(r1, r2)); // TODO formal negation
                case "implies":
                    return new Implies(r1, r2).negation();
                default:
                    return new RAString(INVALID_BOOLOP);
            }
        } else {
            switch (visit(ctx.boolOp()).print()) {
                case "and":
                    return new Intersection(r1, r2);
                case "or":
                    return new Union(r1, r2);
                case "xor":
                    return new Union(new Intersection(r1, r2),
                        new Union(r1, r2)); // TODO formal negation
                case "implies":
                    return new Implies(r1, r2);
                default:
                    return new RAString(INVALID_BOOLOP);
            }
        }
    }

    /*
        oclBool : oclQuery -> oclExist
        isEmpty -> forAll(var | not Bool) -> select result null -> true
        notEmpty -> select(var | Bool) ->
     */
    @Override
    public RAObject visitBoolExist(OCL2RAParser.BoolExistContext ctx) {
        String emp = ctx.oclExist().getText();
        // isEmpty, translate into select count(*) = 0, else into select count(*) > 0
        this.setNegationFlag(false);
        RAObject select = visit(ctx.oclQuery());
        this.negationFlag.pop();
        return select;
    }

//    /*
//        oclBool : oclAttr->Aggregation CompOp oclSingle
//     */
//    @Override
//    public RAObject visitBoolAggregation(OCL2RAParser.BoolAggregationContext ctx) {
//        this.setNegationFlag(false);
//        RAObject set = visit(ctx.oclAttr());
//        RAObject agg = visit(ctx.oclAggregation());
//        this.negationFlag.pop();
//        return new RAQuery((Selection) set, (RAAggregation) agg);
//    }

    /*
        oclQuery : oclSet -> Select(var | oclBool)
     */
    @Override
    public RAObject visitQuerySelect(OCL2RAParser.QuerySelectContext ctx) {
        RAObject qsBody = visit(ctx.oclSet());
        String varName = ctx.oclVar().getText();
        this.varContextPairList.put(varName, this.contextTail);
        if (!this.contextQuery.peek().equals(ORIGIN_CTX)) {
            this.contextQuery.pop();
        }
        return visit(ctx.oclBool());
    }

    /*
        oclQuery : oclSet -> Reject(var | oclBool)
     */
    @Override
    public RAObject visitQueryReject(OCL2RAParser.QueryRejectContext ctx) {
        RAObject qrBody = visit(ctx.oclSet());
        String varName = ctx.oclVar().getText();
        this.varContextPairList.put(varName, this.contextTail);
        if (!this.contextQuery.peek().equals(ORIGIN_CTX)) {
            this.contextQuery.pop();
        }
        return visit(ctx.oclBool());
    }

    /*
        oclAggregation
     */
    @Override
    public RAObject visitOclAggregation(OCL2RAParser.OclAggregationContext ctx) {
        return new RAAggregation(ctx.getText());
    }

    /*
        oclSet : oclClass.allInstances()
     */
    @Override

    public RAObject visitClassAll(OCL2RAParser.ClassAllContext ctx) {
        RAContext cq = this.contextQuery.peek();
        this.setContextTail(new RAClass(ctx.oclClass().getText()));
        if (cq.equals(ORIGIN_CTX)) {
            this.setContextQuery(new RAClass(ctx.oclClass().getText()));
            return new RAClass(ctx.oclClass().getText());
        }
        if (cq.print().equals(ctx.oclClass().getText())) {
            return cq;
        }
        this.setContextQuery(new NaturalJoin(new RAClass(ctx.oclClass().getText()), cq));
        return new NaturalJoin(new RAClass(ctx.oclClass().getText()), cq);
    }

    /*
        oclSingle : ( oclSingle binaryOp oclSingle )
     */
    @Override
    public RAObject visitBinarySingle(OCL2RAParser.BinarySingleContext ctx) {
        RAObject leftOp = visit(ctx.oclSingle(0));
        RAObject rightOp = visit(ctx.oclSingle(1));
        String op = ctx.binaryOp().getText();
        if (leftOp instanceof RAConstant) {
            ((RAConstant) leftOp).setContextName(leftOp.print());
        } else if (leftOp instanceof RAContext) {
            ((RAContext) leftOp).setContextName(makeUpConds(ctx.oclSingle(0).getText(), false, ""));
        }
        if (rightOp instanceof RAConstant) {
            ((RAConstant) rightOp).setContextName(rightOp.print());
        } else if (rightOp instanceof RAContext) {
            ((RAContext) rightOp)
                .setContextName(makeUpConds(ctx.oclSingle(1).getText(), false, ""));
        }

        return new RABinary(leftOp, rightOp, op);
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
        oclSingle : class.attr -> aggregation
     */
    @Override
    public RAObject visitAggregationSingle(OCL2RAParser.AggregationSingleContext ctx) {
        RAAggregation agg = (RAAggregation) visit(ctx.oclAggregation());
        String className = "";
        if (ctx.oclClass().getText().equals("self")) {
            className = ((RAClass) this.contextSelf).getClassName();
        } else {
            className = ctx.oclClass().getText();
        }
        String attrName = ctx.oclAttr().getText();
        agg.setClassName(className);
        agg.setAttrName(attrName);
        return agg;
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
//        System.out.println("varObj: " + ctx.getText());
        if (ctx.getText().equals("self")) {
            if (this.contextSelf instanceof RAClass) {
                return new RAClass((RAClass) this.contextSelf);
            } else {
                return new NaturalJoin((NaturalJoin) this.contextSelf);
            }
        }

//        System.out.println("context: " + this.varContextPairList.get(ctx.getText()).print());
        if (this.varContextPairList.get(ctx.getText()) instanceof RAClass) {
            return new RAClass((RAClass) this.varContextPairList.get(ctx.getText()));
        } else {
            return new NaturalJoin((NaturalJoin) this.varContextPairList.get(ctx.getText()));
        }
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
        return new RAConstant("'" + ctx.ID().getText() + "'", ConstantType.STR);
    }

    @Override
    public RAObject visitOclInt(OCL2RAParser.OclIntContext ctx) {
        return new RAConstant(ctx.getText(), ConstantType.INT);
    }

    @Override
    public RAObject visitCompOp(OCL2RAParser.CompOpContext ctx) {
        if (this.negationFlag.peek()) {
            switch (ctx.getText()) {
                case ">":
                    return new RAString("<=");
                case "<":
                    return new RAString(">=");
                case "=":
                    return new RAString("<>");
                case "<>":
                    return new RAString("=");
                case ">=":
                    return new RAString("<");
                case "<=":
                    return new RAString(">");
                default:
                    break;
            }
        }
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

    public void initNegationFlag() {
        this.negationFlag = new Stack<>();
    }

    public void setNegationFlag(Boolean nf) {
        this.negationFlag.push(nf);
    }

    public void setContextSelf(RAContext s) {
        this.contextSelf = s;
    }

    public void setContextTail(RAContext contextTail) {
        this.contextTail = contextTail;
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

    public void initVarContextPairList() {
        this.varContextPairList = new HashMap<>();
        for (OCLAssociation oa : this.transAssociations) {
            this.varContextPairList
                .put(oa.getAssocEnd().getKey(), new RAClass(oa.getAssocClass().getKey()));
            this.varContextPairList
                .put(oa.getAssocEnd().getValue(), new RAClass(oa.getAssocClass().getValue()));
        }
    }


    private String getRoleClass(String role) {
//        System.out.println("role: " + role);
        for (OCLAssociation oa : this.transAssociations) {
            if (!oa.getRoleClass(role).equals(ROLECLASS_NOT_FOUND)) {
                return oa.getRoleClass(role);
            }
        }
        return ROLECLASS_NOT_FOUND;
    }

    // Existence of Association Between Class S & Class T
    private OCLAssociation hasAssociation(RAClass r1, RAClass r2) {
        for (OCLAssociation oa : this.transAssociations) {
            if (oa.hasAssociation(r1.print(), r2.print())) {
                return oa;
            }
        }
        return null;
    }

    private String getTempTableName() {
        String res = "t" + Integer.toString(this.tempTableCount);
        this.tempTableCount++;
        return res;
    }

    private String makeUpConds(String operand, boolean changeName, String newName) {
        String[] ops = operand.split("\\.");
        String att = ops[ops.length - 1];
        if (changeName) {
            return newName + "." + att;
        }
        String var = ops[0];
        if (var.equals("self")) {
            var = this.contextSelf.print();
        } else {
            var = this.varContextPairList.get(ops[ops.length - 2]).print();
        }
        return var + "." + att;
    }

//    private RAContext getCombinationContext(RAContext c1, RAContext c2) {
//        if (c1 instanceof NaturalJoin &&)
//    }
//    boolean isOriginal() {
//        return this.contextQuery.peek().equals(ORIGIN_CTX);
//    }
}
