import java.io.Serializable;

public class BinaryObject implements Serializable {
    public String name;

    public BinaryObject(String n) {
        name = n; 
    }

    public String getName() {
        return name; 
    }
}