package RAConstructor;

public class Comparison {

    private String lh;
    private String rh;
    private String compOp;

    public Comparison(String lh, String rh, String compOp) {
        this.lh = lh;
        this.rh = rh;
        this.compOp = compOp;
    }

    public String getCompOp() {
        return compOp;
    }

    public String getLh() {
        return lh;
    }

    public String getRh() {
        return rh;
    }

    public void setCompOp(String compOp) {
        this.compOp = compOp;
    }
}
