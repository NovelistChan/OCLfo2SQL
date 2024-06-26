package RAConstructor;

public class Union extends RAObject {

    private RAObject r1;
    private RAObject r2;

    public Union(RAObject r1, RAObject r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public RAObject getR1() {
        return r1;
    }

    public RAObject getR2() {
        return r2;
    }

    @Override
    public String print() {
        return r1.print() + " union " + r2.print();
    }

    @Override
    public RAObject negation() {
        return new Intersection(r1.negation(), r2.negation());
    }
}
