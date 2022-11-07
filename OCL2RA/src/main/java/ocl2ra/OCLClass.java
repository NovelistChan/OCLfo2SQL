package ocl2ra;

import java.util.ArrayList;

class OCLClass {

    private String className;
    private ArrayList<String> attrs;
    private ArrayList<String> assocEnds;

    public OCLClass(String cn, ArrayList<String> at, ArrayList<String> as) {
        this.className = cn;
        this.attrs = at;
        this.assocEnds = as;
    }

    public String getClassName() {
        return this.className;
    }

    public ArrayList<String> getAttrs() {
        return this.attrs;
    }

    public ArrayList<String> getAssocs() {
        return this.assocEnds;
    }

    Boolean hasAttr(String attr) {
        return this.attrs.contains(attr);
    }

    Boolean hasAssoc(String assoc) {
        return this.assocEnds.contains(assoc);
    }

    Boolean equals(OCLClass oc) {
        return this.className.equals(oc.getClassName());
    }
}
