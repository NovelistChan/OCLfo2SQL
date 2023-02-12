package RAConstructor;

public class RAConstant extends RAContext {

    private String content;
    private ConstantType consType;

    public RAConstant(String c, ConstantType b) {
        this.content = c;
        this.consType = b;
    }

    public String getContent() {
        return this.content;
    }

    public ConstantType getConsType() {
        return this.consType;
    }

    @Override
    public String print() {
        if (consType.equals(ConstantType.INT)) {
            return this.content;
        } else {
            return "'" + this.content + "'";
        }
    }

    @Override
    public boolean equals(RAObject raObject) {
        if (!(raObject instanceof RAConstant)) {
            return false;
        } else if (!(this.consType.equals(((RAConstant) raObject).getConsType()))) {
            return false;
        } else {
            return ((RAConstant) raObject).getContent().equals(this.content);
        }
    }

    @Override
    public String getBinaryString() {
        return this.content;
    }

}
