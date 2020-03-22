public class TestChild extends Test {
    private String type;

    public TestChild() {
        super();
        this.type = "Default";
    }

    public TestChild(String name, int age, String type) {
        super(name, age);
        this.type = type; 
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return super.toString() + " " + type; 
    }
}