public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(3);
        list.addFirst(5);
        list.add(12);
        System.out.println(list);
        System.out.println("List size: " + list.size());
    }
}