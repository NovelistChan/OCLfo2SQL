package ocl2ra.RAConstructor;

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
        return new Union(new Difference(new UniversalSet(), r1), r2).print();
    }
}
