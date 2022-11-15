import ANTLR.RA2SQL.RA2SQLParser;
import ANTLR.RA2SQL.RA2SQLParserBaseVisitor;

public class RA2SQLVisitor extends RA2SQLParserBaseVisitor<String> {

    /*
    script : relation + EOF
     */
    @Override
    public String visitScript(RA2SQLParser.ScriptContext ctx) {
        StringBuilder res = new StringBuilder(visit(ctx.relation(0)));

        for (int i = 1; i < ctx.relation().size(); i++) {
            res.append("\n");
            res.append(visit(ctx.relation(i)));
        }

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
        return null;
    }

    /*
    relation : relation intersect relation
     */
    @Override
    public String visitIntersect(RA2SQLParser.IntersectContext ctx) {
        return null;
    }

    /*
    relation : projection
     */
    @Override
    public String visitProject(RA2SQLParser.ProjectContext ctx) {
        return null;
    }

    /*
    relation : ID
     */
    @Override
    public String visitId(RA2SQLParser.IdContext ctx) {
        return null;
    }

    /*
    relation : relation union relation
     */
    @Override
    public String visitUnion(RA2SQLParser.UnionContext ctx) {
        return null;
    }

    /*
    relation : relation join relation
     */
    @Override
    public String visitJoin(RA2SQLParser.JoinContext ctx) {
        return null;
    }

    /*
    relation : relation differ relation
     */
    @Override
    public String visitDiffer(RA2SQLParser.DifferContext ctx) {
        return null;
    }

    /*
    projection : Pi columns relation
     */
    @Override
    public String visitProjection(RA2SQLParser.ProjectionContext ctx) {
        return null;
    }

    /*
    selection : Sigma expression relation
     */
    @Override
    public String visitSelection(RA2SQLParser.SelectionContext ctx) {
        return null;
    }

    /*
    columns : column , columns
     */
    @Override
    public String visitColumnMany(RA2SQLParser.ColumnManyContext ctx) {
        return null;
    }

    /*
    columns : column
     */
    @Override
    public String visitColumnOne(RA2SQLParser.ColumnOneContext ctx) {
        return null;
    }

    /*
    columns : column , columns
     */
    @Override
    public String visitIdMany(RA2SQLParser.IdManyContext ctx) {
        return null;
    }

    /*
    columns : ID
     */
    @Override
    public String visitIdOne(RA2SQLParser.IdOneContext ctx) {
        return null;
    }

    /*
    columns : constant
     */
    @Override
    public String visitIdCons(RA2SQLParser.IdConsContext ctx) {
        return null;
    }

    /*
    expressions : expression boolOp expressions
     */
    @Override
    public String visitExpressionMany(RA2SQLParser.ExpressionManyContext ctx) {
        return null;
    }

    /*
    expressions : expression
     */
    @Override
    public String visitExpressionOne(RA2SQLParser.ExpressionOneContext ctx) {
        return null;
    }

    /*
    expression : column compOp column
     */
    @Override
    public String visitExpression(RA2SQLParser.ExpressionContext ctx) {
        return null;
    }

    /*
    constant : 'ID'
     */
    @Override
    public String visitConsStri(RA2SQLParser.ConsStriContext ctx) {
        return null;
    }

    /*
    constant : int
     */
    @Override
    public String visitConsInt(RA2SQLParser.ConsIntContext ctx) {
        return null;
    }

    /*
    String
     */
    @Override
    public String visitCompOp(RA2SQLParser.CompOpContext ctx) {
        return null;
    }

    @Override
    public String visitBoolOp(RA2SQLParser.BoolOpContext ctx) {
        return null;
    }

}
