import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.EOFException;
import java.lang.StringBuffer;

public class RandomAccessTest {
    public static void main(String[] args) {
        Student s1 = new Student("Mark", "Blinder", "w7217962", 3.75);

        try {
            RandomAccessFile raf = new RandomAccessFile("StudentList.txt", "rw");
            
        }
        catch (FileNotFoundException e) {
            System.out.println("No such file.");
        }
    }
}