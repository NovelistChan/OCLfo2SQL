package ocl2ra.OCLConstructor;


import javafx.util.Pair;

public class OCLAssociation {

    private Pair<String, String> assocEnd;

    private Pair<String, String> assocClass;

    private String ROLECLASS_NOT_FOUND = "ROLECLASS_NOT_FOUND";

    public OCLAssociation(String ae1, String ae2, String ac1, String ac2) {
        this.assocEnd = new Pair<>(ae1, ae2);
        this.assocClass = new Pair<>(ac1, ac2);
    }

    public Pair<String, String> getAssocEnd() {
        return assocEnd;
    }

    public Pair<String, String> getAssocClass() {
        return assocClass;
    }

    public String getRoleClass(String role) {
        if (assocEnd.getValue().equals(role)) {
            return assocClass.getValue();
        } else if (assocEnd.getKey().equals(role)) {
            return assocClass.getKey();
        } else {
            return ROLECLASS_NOT_FOUND;
        }
    }
}
