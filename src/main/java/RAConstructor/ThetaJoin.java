package RAConstructor;

import java.util.ArrayList;

public class ThetaJoin extends NaturalJoin {

    private ArrayList<Comparison> conds;

    public ThetaJoin(RAContext p1, RAContext p2, ArrayList<Comparison> conds) {
        super(p1, p2);
        this.conds = conds;
    }

    public ArrayList<Comparison> getConds() {
        return conds;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getPara1().print());
//        if (this.getPara1().equals(this.getPara2())) {
//            sb.append(" A");
//        }
        sb.append(" join(");
        for (Comparison cond : conds) {
            sb.append(cond.getLh()).append(" ").append(cond.getCompOp()).append(" ")
                .append(cond.getRh());
            if (!cond.equals(conds.get(conds.size() - 1))) {
                sb.append(", ");
            }
        }
        sb.append(") ").append(this.getPara2().print());
//        if (this.getPara1().equals(this.getPara2())) {
//            sb.append(" B");
//        }
        return sb.toString();
    }
}
