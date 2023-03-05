import ANTLR.RA2SQL.RA2SQLParser;
import ANTLR.RA2SQL.RA2SQLParserBaseVisitor;

public class RA2SQLVisitor extends RA2SQLParserBaseVisitor<String> {

    private boolean aggregationFlag;
    private boolean groupByFlag;
    private String groupByStr;

    /*
    script : relation + EOF
     */
    @Override
    public String visitScript(RA2SQLParser.ScriptContext ctx) {
        StringBuilder res = new StringBuilder();
        this.aggregationFlag = false;
        this.groupByFlag = false;
        this.groupByStr = "";
        for (int i = 0; i < ctx.relation().size(); i++) {
            String r = visit(ctx.relation(i));
//            if (r.charAt(0) == '(' && r.charAt(r.length() - 1) == ')') {
//                r = r.substring(1, r.length() - 1);
//            }
            res.append(r);
            res.append("\n\n");
        }

        return res.toString();
    }

    /*
    relation : aggregate relation
     */
    @Override
    public String visitAggregate(RA2SQLParser.AggregateContext ctx) {
        this.aggregationFlag = true;
        return visit(ctx.relation());
    }

    /*
    relation : aggregate group by xx.xx relation
     */
    @Override
    public String visitAggregateGroupBy(RA2SQLParser.AggregateGroupByContext ctx) {
        this.aggregationFlag = true;
        this.groupByFlag = true;
        this.groupByStr = visit(ctx.column());
        return visit(ctx.relation());
    }

    /*
    relation : selection
     */
    @Override
    public String visitSelect(RA2SQLParser.SelectContext ctx) {
        return visit(ctx.selection());
    }

    /*
    relation : relation intersect relation
     */
    @Override
    public String visitIntersect(RA2SQLParser.IntersectContext ctx) {
        return visit(ctx.relation(0)) + "\n"
            + "INTERSECT \n"
            + visit(ctx.relation(1));
    }

    /*
    relation : projection
     */
    @Override
    public String visitProject(RA2SQLParser.ProjectContext ctx) {
        return visit(ctx.projection());
    }

    /*
    relation : ID
     */
    @Override
    public String visitId(RA2SQLParser.IdContext ctx) {
        return ctx.ID().getText();
    }

    /*
    relation : relation union relation
     */
    @Override
    public String visitUnion(RA2SQLParser.UnionContext ctx) {
        return visit(ctx.relation(0)) + "\n"
            + "UNION \n"
            + visit(ctx.relation(1));
    }

    /*
    relation : relation join relation
     */
    @Override
    public String visitJoin(RA2SQLParser.JoinContext ctx) {
        return visit(ctx.relation(0))
            + " JOIN "
            + visit(ctx.relation(1));
    }

    /*
    relation : relation join (expressions) relation (thetaJoin)
     */
    @Override
    public String visitThetaJoin(RA2SQLParser.ThetaJoinContext ctx) {
        if (ctx.relation(0).getText().equals(ctx.relation(1).getText())) {
            return visit(ctx.relation(0)) + " " + ctx.ID(0).getText()
                + " JOIN "
                + visit(ctx.relation(1)) + " " + ctx.ID(1).getText() + "\n"
                + "ON "
                + visit(ctx.expressions());
        } else {
            return visit(ctx.relation(0))
                + " JOIN "
                + visit(ctx.relation(1)) + "\n"
                + "ON "
                + visit(ctx.expressions());
        }
    }

    /*
    relation : relation differ relation
     */
    @Override
    public String visitDiffer(RA2SQLParser.DifferContext ctx) {
        return "SELECT * \nFROM (" + visit(ctx.relation(0)) + ") as " + ctx.ID(0).getText() + "\n"
            + "WHERE id NOT IN (\n"
            + "SELECT id \n"
            + "FROM (" + visit(ctx.relation(1)) + ") as " + ctx.ID(1).getText() + ")";
    }

    /*
    projection : Pi ( columns ) relation
     */
    @Override
    public String visitProjection(RA2SQLParser.ProjectionContext ctx) {
        return "SELECT " + visit(ctx.columns()) + "\n"
            + "FROM " + visit(ctx.relation());
    }

    /*
    selection : Sigma ( expressions ) relation
     */
    @Override
    public String visitSelection(RA2SQLParser.SelectionContext ctx) {
        if (this.aggregationFlag) {
            this.aggregationFlag = false;
            if (this.groupByFlag) {
                this.groupByFlag = false;
                return "SELECT CASE " + visit(ctx.expressions())
                    + " WHEN 1 THEN 1 ELSE 0 END AS res\n"
                    + "FROM " + visit(ctx.relation()) + "\n"
                    + "GROUP BY " + this.groupByStr;
            } else {
                return "SELECT CASE " + visit(ctx.expressions())
                    + " WHEN 1 THEN 1 ELSE 0 END AS res\n"
                    + "FROM " + visit(ctx.relation());
            }
        }
        return "SELECT * \n"
            + "FROM " + visit(ctx.relation()) + "\n"
            + "WHERE " + visit(ctx.expressions());
    }

    /*
    columns : column , columns
     */
    @Override
    public String visitColumnMany(RA2SQLParser.ColumnManyContext ctx) {
        return visit(ctx.column()) + ", " + visit(ctx.columns());
    }

    /*
    columns : column
     */
    @Override
    public String visitColumnOne(RA2SQLParser.ColumnOneContext ctx) {
        return visit(ctx.column());
    }

    /*
    column : column DOT ID
     */
    @Override
    public String visitIdMany(RA2SQLParser.IdManyContext ctx) {
        return visit(ctx.column()) + ctx.DOT().getText() + ctx.ID().getText();
    }

    /*
    column : ID
     */
    @Override
    public String visitIdOne(RA2SQLParser.IdOneContext ctx) {
        return ctx.ID().getText();
    }

    /*
    column : constant
     */
    @Override
    public String visitIdCons(RA2SQLParser.IdConsContext ctx) {
        return visit(ctx.constant());
    }

    /*
    column : AGG(column)
     */
    @Override
    public String visitIdAgg(RA2SQLParser.IdAggContext ctx) {
        return ctx.aggregation().getText() + "(" + visit(ctx.column()) + ")";
    }

    /*
    expressions : expression boolOp expressions
     */
    @Override
    public String visitExpressionMany(RA2SQLParser.ExpressionManyContext ctx) {
        return visit(ctx.expression()) + " " + visit(ctx.boolOp()) + " " + visit(ctx.expressions());
    }

    /*
    expressions : expression
     */
    @Override
    public String visitExpressionOne(RA2SQLParser.ExpressionOneContext ctx) {
        return visit(ctx.expression());
    }

    /*
    expression : binaryExp compOp binaryExp
     */
    @Override
    public String visitExpression(RA2SQLParser.ExpressionContext ctx) {
        return visit(ctx.binaryExp(0)) + " " + visit(ctx.compOp()) + " " + visit(ctx.binaryExp(1));
    }

    /*
    binaryExp : LB binaryExp binaryOp binaryExp RB
     */
    @Override
    public String visitBinarySub(RA2SQLParser.BinarySubContext ctx) {
        return "( " + visit(ctx.binaryExp(0)) + " " + visit(ctx.binaryOp()) + " " + visit(
            ctx.binaryExp(1)) + " )";
    }

    /*
    binaryExp : column
     */
    @Override
    public String visitUnarySub(RA2SQLParser.UnarySubContext ctx) {
        return visit(ctx.column());
    }

    /*
    constant : 'ID'
     */
    @Override
    public String visitConsStri(RA2SQLParser.ConsStriContext ctx) {
        return "'" + ctx.ID().getText() + "'";
    }

    /*
    constant : int
     */
    @Override
    public String visitConsInt(RA2SQLParser.ConsIntContext ctx) {
        return ctx.getText();
    }

    /*
    String
     */
    @Override
    public String visitCompOp(RA2SQLParser.CompOpContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBoolOp(RA2SQLParser.BoolOpContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBinaryOp(RA2SQLParser.BinaryOpContext ctx) {
        return ctx.getText();
    }
}
