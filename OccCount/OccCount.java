/*
* Given a non-negative int n, return the count of the occurrences of 7 as a digit, os for example 717 
* yeilds 2. (nop loops). Note that mod (%) by 10 yeilds the rightmost digit (126 % 10 is 6), while
* divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
*/

public class OccCount {
    public static int occurrences(int n) {
        if (n <= 0) {
            return 0;
        }
        if ((n % 10) == 7) {
            return 1 + occurrences(n/10);
        }
        else {
            return 0 + occurrences(n/10);
        }
    }

    public static void main(String[] args) {
        int n = 77845747;

        System.out.println(occurrences(n));
    }
}