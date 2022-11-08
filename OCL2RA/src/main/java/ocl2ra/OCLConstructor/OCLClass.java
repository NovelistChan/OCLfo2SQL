package ocl2ra.OCLConstructor;

import java.util.ArrayList;

public class OCLClass {

    private String className;
    private ArrayList<String> attrs;
    private ArrayList<OCLAssociation> assocEnds;

    public OCLClass(String cn, ArrayList<String> at, ArrayList<OCLAssociation> as) {
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

    public ArrayList<OCLAssociation> getAssocs() {
        return this.assocEnds;
    }

    Boolean hasAttr(String attr) {
        return this.attrs.contains(attr);
    }

    Boolean hasAssoc(OCLAssociation assoc) {
        return this.assocEnds.contains(assoc);
    }

    Boolean equals(OCLClass oc) {
        return this.className.equals(oc.getClassName());
    }

    public void printClass() {
        System.out.println(this.className);
        System.out.println(this.attrs);
        System.out.println(this.assocEnds);
    }
}
