package ocl2ra.RAConstructor;

public class NatureJoin extends RAContext {

    private RAContext para1;
    private RAContext para2;

    public NatureJoin(RAContext p1, RAContext p2) {
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
        if (!(raObject instanceof NatureJoin)) {
            return false;
        } else {
            return this.para1.equals(((NatureJoin) raObject).getPara1()) && this.para2
                .equals(((NatureJoin) raObject).getPara2());
        }
    }

    public boolean contains(RAContext raObject) {
        if (raObject instanceof NatureJoin) {
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
}
