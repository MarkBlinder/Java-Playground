import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.lang.Math;

public class RNGFile {
    public static void main(String[] args) {
        File f = new File("numbers.txt");
        try {
            PrintWriter pw = new PrintWriter(f);
            int num;
            for (int i = 0; i < 1024; i++) {
                num = (int)(Math.random() * 1000 + 1);
                pw.print(num + "\n");
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(); 
        }
    }
}