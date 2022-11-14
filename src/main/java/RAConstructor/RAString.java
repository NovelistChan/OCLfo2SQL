package RAConstructor;

public class RAString extends RAClass {

    private String content;

    public RAString(String c) {
        super(c);
        this.content = c;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String print() {
        return content;
    }
}
