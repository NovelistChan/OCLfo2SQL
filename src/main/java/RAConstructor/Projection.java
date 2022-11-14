package RAConstructor;

import java.util.ArrayList;

public class Projection extends RAObject {

    private RAObject body;
    private ArrayList<String> columns;

    public Projection(RAObject b) {
        this.body = b;
    }

    public Projection(RAObject b, ArrayList<String> c) {
        this.body = b;
        this.columns = c;
    }

    public RAObject getBody() {
        return body;
    }

    public ArrayList<String> getColumns() {
        return columns;
    }

    @Override
    public String print() {
        return "Pi " + body.print();
    }

}
