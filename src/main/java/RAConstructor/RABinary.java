package RAConstructor;

public class RABinary extends RAObject {

    private RAObject leftOp;
    private RAObject rightOp;
    private String op;

    public RABinary(RAObject left, RAObject right, String op) {
        this.leftOp = left;
        this.rightOp = right;
        this.op = op;
    }

    @Override
    public String print() {
        return leftOp + " " + op + " " + rightOp;
    }

    public RAObject getLeftOp() {
        return this.leftOp;
    }

    public RAObject getRightOp() {
        return this.rightOp;
    }

    public String getOp() {
        return this.op;
    }

    public RAObject getContext() {
        if (leftOp instanceof RAConstant) {
            return rightOp;
        } else if (rightOp instanceof RAConstant) {
            return leftOp;
        }
        if (leftOp instanceof NaturalJoin && rightOp instanceof NaturalJoin) {
            if (((NaturalJoin) leftOp).contains((RAContext) rightOp)) {
                return leftOp;
            } else if (((NaturalJoin) rightOp).contains((RAContext) leftOp)) {
                return rightOp;
            } else {
                return new NaturalJoin((RAContext) leftOp, (RAContext) rightOp);
            }
        } else if (leftOp instanceof NaturalJoin && rightOp instanceof RAClass) {
            if (((NaturalJoin) leftOp).contains((RAContext) rightOp)) {
                return leftOp;
            } else {
                return new NaturalJoin((RAContext) leftOp, (RAContext) rightOp);
            }
        } else if (leftOp instanceof RAClass && rightOp instanceof NaturalJoin) {
            if (((NaturalJoin) rightOp).contains((RAContext) leftOp)) {
                return rightOp;
            } else {
                return new NaturalJoin((RAContext) leftOp, (RAContext) rightOp);
            }
        }
        if (leftOp.equals(rightOp)) {
            return leftOp;
        } else {
            return new NaturalJoin((RAContext) leftOp, (RAContext) rightOp);
        }
    }

    @Override
    public String getBinaryString() {
        String biStr1 = this.leftOp.getBinaryString();
        String biStr2 = this.rightOp.getBinaryString();
        return "(" + biStr1 + " " + this.op + " " + biStr2 + ")";
    }
}
