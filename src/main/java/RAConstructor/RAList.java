package RAConstructor;

import java.util.ArrayList;

public class RAList extends RAObject {

    private ArrayList<RAObject> raList;

    public RAList() {
        this.raList = new ArrayList<>();
    }

    public void add(RAObject r) {
        this.raList.add(r);
    }

    public ArrayList<RAObject> getRaList() {
        return raList;
    }

    @Override
    public String print() {
        StringBuilder res = new StringBuilder();
        for (RAObject r : raList) {
            res.append(r.print());
            res.append("\n");
        }
        return res.toString();
    }
}
