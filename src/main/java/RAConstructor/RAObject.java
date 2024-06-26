package RAConstructor;

public class RAObject implements RAObjectInterface {

    private String name;

    public RAObject setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    @Override
    public String print() {
        return null;
    }

    @Override
    public boolean equals(RAObject raObject) {
        return false;
    }

    @Override
    public RAObject negation() {
        return this;
    }

    @Override
    public String getBinaryString() {
        return null;
    }
}
