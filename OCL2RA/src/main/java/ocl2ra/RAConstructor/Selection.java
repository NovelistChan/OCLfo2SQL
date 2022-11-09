package ocl2ra.RAConstructor;

public class Selection extends RAObject {

    private String conds;
    private RAObject body;

    public Selection(RAObject b) {
        this.body = b;
    }

    public Selection(String c, RAObject b) {
        this.conds = c;
        this.body = b;
    }

    public RAObject getBody() {
        return body;
    }

    public String getConds() {
        return conds;
    }

    @Override
    public String print() {
        return "Sigma " + (conds == null ? "" : " (" + conds + ") ") + body.print();
    }

}
