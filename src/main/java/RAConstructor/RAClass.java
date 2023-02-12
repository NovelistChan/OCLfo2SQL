package RAConstructor;

public class RAClass extends RAContext {

    private String className;

    public RAClass(String cn) {
        this.className = cn;
    }

    public RAClass(RAClass c) {
        this.className = c.getClassName();
    }

    public String getClassName() {
        return className;
    }


    @Override
    public String print() {
        return className;
    }

    @Override
    public boolean equals(RAObject raObject) {
        if (!(raObject instanceof RAClass)) {
            return false;
        } else {
            return ((RAClass) raObject).getClassName().equals(this.className);
        }
    }

    @Override
    public String getBinaryString() {
        return this.getContextName();
    }


}
