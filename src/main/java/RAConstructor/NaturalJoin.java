package RAConstructor;

public class NaturalJoin extends RAContext {

    private RAContext para1;
    private RAContext para2;

    public NaturalJoin(RAContext p1, RAContext p2) {
        this.para1 = p1;
        this.para2 = p2;
        this.selfCheck();
    }

    public NaturalJoin(NaturalJoin n) {
        this.para1 = n.getPara1();
        this.para2 = n.getPara2();
    }

    public RAContext getPara1() {
        return para1;
    }

    public RAContext getPara2() {
        return para2;
    }

    @Override
    public String print() {
        return para1.print() + " join " + para2.print();
    }

    private void selfCheck() {
        if (this.para1 instanceof NaturalJoin) {
            if (((NaturalJoin) this.para1).contains(this.para2)) {
                NaturalJoin p = new NaturalJoin(((NaturalJoin) this.para1).getPara1(),
                    ((NaturalJoin) this.para1).getPara2());
                this.para1 = p.getPara1();
                this.para2 = p.getPara2();
            }
        }
        if (this.para2 instanceof NaturalJoin) {
            if (((NaturalJoin) this.para2).contains(this.para1)) {
                NaturalJoin p = new NaturalJoin(((NaturalJoin) this.para2).getPara1(),
                    ((NaturalJoin) this.para2).getPara2());
                this.para1 = p.getPara1();
                this.para2 = p.getPara2();
            }
        }
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
                if (this.para1 instanceof NaturalJoin && this.para2 instanceof NaturalJoin) {
                    return ((NaturalJoin) this.para1).contains(raObject)
                        || ((NaturalJoin) this.para2).contains(raObject);
                } else if (this.para1 instanceof NaturalJoin) {
                    return ((NaturalJoin) this.para1).contains(raObject);
                } else if (this.para2 instanceof NaturalJoin) {
                    return ((NaturalJoin) this.para2).contains(raObject);
                } else {
                    return false;
                }
            }
        } else if (raObject instanceof RAClass) {
            if (this.para1 instanceof NaturalJoin && this.para2 instanceof NaturalJoin) {
                return ((NaturalJoin) this.para1).contains(raObject) || ((NaturalJoin) this.para2)
                    .contains(raObject);
            } else if (this.para1 instanceof NaturalJoin) {
                return ((NaturalJoin) this.para1).contains(raObject) || this.para2.equals(raObject);
            } else if (this.para2 instanceof NaturalJoin) {
                return this.para1.equals(raObject) || ((NaturalJoin) this.para2).contains(raObject);
            } else {
                return this.para1.equals(raObject) || this.para2.equals(raObject);
            }
        } else {
            return false;
        }
    }

    @Override
    public RAObject negation() {
        return new NaturalJoin((RAContext) para1.negation(), (RAContext) para2.negation());
    }

    @Override
    public String getBinaryString() {
        return this.getContextName();
    }
}
