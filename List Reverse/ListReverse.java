import java.util.ArrayList;

public class ListReverse {
    public static void reverse(ArrayList<Integer> n) {
        int temp;

        for (int i = 0; i < n.size()/2; i++) {
            temp = n.get(i);
            n.set(i, n.get((n.size()-1) - i));
            n.set((n.size()-1) - i, temp);
        }
    }

    public static void main (String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println(numbers.size()/2);

        System.out.println(numbers);
        
        ListReverse.reverse(numbers);

        System.out.println(numbers);


    }
}