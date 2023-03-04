package RAConstructor;

public class RAAggregation extends RAObject {

    private String aggregationName;
    private String className;
    private String attrName;

    public RAAggregation(String name) {
        this.aggregationName = name;
        this.className = null;
        this.attrName = null;
    }

    public String getClassName() {
        return className;
    }

    public String getAttrName() {
        return attrName;
    }

    public String getAggregationName() {
        return aggregationName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String print() {
        switch (this.aggregationName) {
            case "sum()":
                return "SUM(" + this.className + "." + this.attrName + ")";
            case "average()":
                return "AVG(" + this.className + "." + this.attrName + ")";
            case "min()":
                return "MIN(" + this.className + "." + this.attrName + ")";
            case "max()":
                return "MAX(" + this.className + "." + this.attrName + ")";
            case "count()":
                return "COUNT(" + this.className + "." + this.attrName + ")";
            default:
                break;
        }
        return this.aggregationName;
    }
}
