public class NumComp {
    public static int SameDigits(int n1, int n2) {
        if ((n1 == 0 || n2 == 0)) {
            return 0;
        }
        if ((n1 % 10) == (n2 % 10)) {
            return 1 + SameDigits(n1/10, n2/10);
        }
        return 0 + SameDigits(n1/10, n2/10);
    }

    public static void main(String[] args) {
        System.out.println(SameDigits(2456080, 2557091));
    }
}