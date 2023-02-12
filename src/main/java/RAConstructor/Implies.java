package RAConstructor;

public class Implies extends RAObject {

    private RAObject r1;
    private RAObject r2;

    public Implies(RAObject r1, RAObject r2) {
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
        return new Union(r1.negation(), r2).print();
    }

    @Override
    public RAObject negation() {
        return new Intersection(r1.negation(), r2);
    }
}
