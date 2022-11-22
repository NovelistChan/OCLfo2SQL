import ANTLR.RA2SQL.RA2SQLParser;
import ANTLR.RA2SQL.RA2SQLParserBaseVisitor;

public class RA2SQLVisitor extends RA2SQLParserBaseVisitor<String> {

    /*
    script : relation + EOF
     */
    @Override
    public String visitScript(RA2SQLParser.ScriptContext ctx) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < ctx.relation().size(); i++) {
            String r = visit(ctx.relation(i));
            if (r.charAt(0) == '(' && r.charAt(r.length() - 1) == ')') {
                r = r.substring(1, r.length() - 1);
            }
            res.append(r);
            res.append("\n");
        }

        String r = res.toString();

        return res.toString();
    }

    /*
    relation : U - relation
     */
    @Override
    public String visitUdiffer(RA2SQLParser.UdifferContext ctx) {
        return null;
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
        return visit(ctx.relation(0)) + "\n"
            + "JOIN \n"
            + visit(ctx.relation(1));
    }

    /*
    relation : relation differ relation
     */
    @Override
    public String visitDiffer(RA2SQLParser.DifferContext ctx) {
        return "(SELECT * FROM " + visit(ctx.relation(0)) + "\n"
            + "WHERE id NOT IN SELECT id FROM " + visit(ctx.relation(1)) + ")";
    }

    /*
    projection : Pi ( columns ) relation
     */
    @Override
    public String visitProjection(RA2SQLParser.ProjectionContext ctx) {
        return "(SELECT " + visit(ctx.columns()) + "\n"
            + "FROM " + visit(ctx.relation()) + ")";
    }

    /*
    selection : Sigma ( expressions ) relation
     */
    @Override
    public String visitSelection(RA2SQLParser.SelectionContext ctx) {
        return "(SELECT * FROM \n"
            + visit(ctx.relation()) + "\n"
            + "WHERE " + visit(ctx.expressions()) + ")";
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
    expression : column compOp column
     */
    @Override
    public String visitExpression(RA2SQLParser.ExpressionContext ctx) {
        return visit(ctx.column(0)) + " " + visit(ctx.compOp()) + " " + visit(ctx.column(1));
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

}
