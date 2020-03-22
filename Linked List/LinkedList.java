import java.util.ListIterator;

public class LinkedList<E> {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = head;
        size = 0; 
    }

    public void addFirst(E data) {
        Node node = new Node(data);
        if (size == 0) {
            head = node;
        }
        else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void add(E data) {
        Node node = new Node(data);
        if (size == 0) {
            head = node;
            tail = head;
        }
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void add(int index, E data) {
        Node node = new Node(data);
    }

    public int size() {
        return size;
    }

    public String toString() {
        String s = "";
        ListIterator iter = new ListIterator();
        while (iter.hasNext()) {
            iter.next();
            s += " " + iter.returned;
        }
        return s;
    }

    private class ListIterator {
        private Node returned;
        private Node next;
        private int index;

        private ListIterator() {
            if (head != null) {
                this.returned = null;
                this.next = head;
                index = 0;
            }
            else {
                System.out.println("EMPTY LINKED LIST!");
            }
        }

        private boolean hasNext() {
            return next != null; 
        }

        private boolean hasPrevious() {
            return returned.previous != null; 
        }

        private E next() {
            if (hasNext()) {
                returned = next;
                next = returned.next;
                index++;
                return returned.data;
            }
            else {
                System.out.println("END OF LIST");
                return null; 
            }
        }

        private int nextIndex() {
            return index + 1;
        }

        private E previous() {
            if (hasPrevious()) {
                returned = returned.previous;
                next = returned.next;
                index--;
                return returned.data;
            }
            else {
                System.out.println("END OF LIST");
                return null; 
            }
        }

        private int previousIndex() {
            return index - 1;
        }

        private void remove() {
            if (hasPrevious()) {
                returned.previous.next = returned.next;
            }
            else {
                head = returned.next;
            }
        }

        private void set(E data) {
            // Replace data of last element returned by prev or next
            if (returned != null) {
                returned.data = data;
            }
            else {
                System.out.println("EXCEPTION");
            }
        }
    }

    private class Node {
        private E data;
        private Node next;
        private Node previous;

        private Node() {
            data = null;
            next = null;
            previous = null; 
        }
        
        private Node(E data) {
            this.data = data;
            next = null;
            previous = null;
        }

        private Node(E data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }

        public String toString() {
            return "[" + data + "]";
        }
    }
}