import java.io.*;

public class BinaryFile {
    public static void main(String[] args) {
        BinaryObject o = new BinaryObject("Mark Blinder");
        BinaryObject oCopy;
        
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("binary.txt"));
            os.writeObject(o);
            os.close(); 
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("binary.txt"));
            oCopy = (BinaryObject)is.readObject();
            System.out.println(oCopy.getName());
            is.close(); 
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}