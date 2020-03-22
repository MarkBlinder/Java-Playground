import java.util.Scanner;

public class BruteForce {

    public static String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                                        "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                                        "u", "v", "w", "x", "y", "z", "0", "1", "2", "3",
                                        "4", "5", "6", "7", "8", "9"};

    public static String brutePass(String p, String s) {
        for (int i = 0; i < 36; i++) {
            if ((s + letters[i]).equals(p)) {
                return s + letters[i];
            }
        }
        if ((p.length() - s.length()) > 1) {
            return brutePass(p, s + letters[0]);
        }
        else {
            return brutePass(p, s);
        }
    }

    public static void testBrute(String p) {
        long startTime = System.nanoTime();
        long endTime = 0;
        String s = "";
        for (int v = 0; v < letters.length; v++) {
            for (int x = 0; x < letters.length; x++) {
                for (int z = 0; z < letters.length; z++) {
                    for (int l = 0; l < letters.length; l++) {
                        for (int i = 0; i < letters.length; i++) {
                            for (int j = 0; j < letters.length; j++) {
                                for (int k = 0; k < letters.length; k++) {
                                    s = letters[i] + letters[j] + letters[k] + letters[l] + letters[z] + letters[x] + letters[v];
                                    if (s.equals(p)) {
                                        endTime = System.nanoTime();
                                        System.out.println("Password cracked: " + s);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pass = "zzzzzzz";
        // System.out.print("Enter pass: ");
        // pass = in.nextLine();

        testBrute(pass);

        in.close();
    }
}