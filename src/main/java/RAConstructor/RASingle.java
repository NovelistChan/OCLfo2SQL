package RAConstructor;

public class RASingle extends RAObject {

    private String att;
    private RAContext context;

    public RASingle(RAContext context, String att) {
        this.att = att;
        this.context = context;
    }

    public String getAtt() {
        return this.att;
    }

    public RAContext getContext() {
        return this.context;
    }


    @Override
    public String print() {
        return this.context.print() + "." + att;
    }

}
