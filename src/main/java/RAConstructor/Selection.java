package RAConstructor;

import java.util.ArrayList;

public class Selection extends RAObject {

    private ArrayList<Comparison> conds;
    private RAObject body;


    public Selection(RAObject b) {
        this.body = b;
    }

    public Selection(ArrayList<Comparison> c, RAObject b) {
        this.conds = c;
        this.body = b;
    }

    public RAObject getBody() {
        return body;
    }

    public ArrayList<Comparison> getConds() {
        return conds;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("sigma ");
        if (conds.size() != 0) {
            sb.append("(");
            for (Comparison cond : conds) {
                sb.append(cond.getLh()).append(" ").append(cond.getCompOp()).append(" ")
                    .append(cond.getRh());
                if (!cond.equals(conds.get(conds.size() - 1))) {
                    sb.append(", ");
                }
            }
            sb.append(") ");
        }
        sb.append("(").append(body.print()).append(")");
        return sb.toString();
    }

    @Override
    public RAObject negation() {
        for (Comparison cond : conds) {
            switch (cond.getCompOp()) {
                case "<":
                    cond.setCompOp(">=");
                    break;
                case ">":
                    cond.setCompOp("<=");
                    break;
                case "=":
                    cond.setCompOp("<>");
                    break;
                case "<>":
                    cond.setCompOp("=");
                    break;
                case "<=":
                    cond.setCompOp(">");
                    break;
                case ">=":
                    cond.setCompOp("<");
                    break;
                default:
                    break;
            }
        }
        return this;
    }
}
