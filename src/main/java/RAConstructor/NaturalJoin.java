package RAConstructor;

public class NaturalJoin extends RAContext {

    private RAContext para1;
    private RAContext para2;

    public NaturalJoin(RAContext p1, RAContext p2) {
        this.para1 = p1;
        this.para2 = p2;
    }

    public RAContext getPara1() {
        return para1;
    }

    public RAContext getPara2() {
        return para2;
    }

    @Override
    public String print() {
        return para1.print() + " Cartesian " + para2.print();
    }


    @Override
    public boolean equals(RAObject raObject) {
        if (!(raObject instanceof NaturalJoin)) {
            return false;
        } else {
            return this.para1.equals(((NaturalJoin) raObject).getPara1()) && this.para2
                .equals(((NaturalJoin) raObject).getPara2());
        }
    }

    public boolean contains(RAContext raObject) {
        if (raObject instanceof NaturalJoin) {
            if (this.equals(raObject)) {
                return true;
            } else {
                return this.para1.equals(raObject) || this.para2.equals(raObject);
            }
        } else if (raObject instanceof RAClass) {
            return this.para1.equals(raObject) || this.para2.equals(raObject);
        } else {
            return false;
        }
    }

    @Override
    public RAObject negation() {
        return new NaturalJoin((RAContext) para1.negation(), (RAContext) para2.negation());
    }
}
