import ANTLR.RA2SQL.RA2SQLParser;
import ANTLR.RA2SQL.RA2SQLParserBaseVisitor;

public class RA2SQLVisitor extends RA2SQLParserBaseVisitor<String> {

    @Override
    public String visitScript(RA2SQLParser.ScriptContext ctx) {
        return null;
    }

    @Override
    public String visitUdiffer(RA2SQLParser.UdifferContext ctx) {
        return null;
    }

    @Override
    public String visitSelect(RA2SQLParser.SelectContext ctx) {
        return null;
    }

    @Override
    public String visitIntersect(RA2SQLParser.IntersectContext ctx) {
        return null;
    }

    @Override
    public String visitProject(RA2SQLParser.ProjectContext ctx) {
        return null;
    }

    @Override
    public String visitId(RA2SQLParser.IdContext ctx) {
        return null;
    }

    @Override
    public String visitUnion(RA2SQLParser.UnionContext ctx) {
        return null;
    }

    @Override
    public String visitJoin(RA2SQLParser.JoinContext ctx) {
        return null;
    }

    @Override
    public String visitDiffer(RA2SQLParser.DifferContext ctx) {
        return null;
    }

    @Override
    public String visitProjection(RA2SQLParser.ProjectionContext ctx) {
        return null;
    }

    @Override
    public String visitSelection(RA2SQLParser.SelectionContext ctx) {
        return null;
    }

    @Override
    public String visitColumnMany(RA2SQLParser.ColumnManyContext ctx) {
        return null;
    }

    @Override
    public String visitColumnOne(RA2SQLParser.ColumnOneContext ctx) {
        return null;
    }

    @Override
    public String visitIdMany(RA2SQLParser.IdManyContext ctx) {
        return null;
    }

    @Override
    public String visitIdOne(RA2SQLParser.IdOneContext ctx) {
        return null;
    }

    @Override
    public String visitExpression(RA2SQLParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public String visitCompOp(RA2SQLParser.CompOpContext ctx) {
        return null;
    }

}
