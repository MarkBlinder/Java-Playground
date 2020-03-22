public class ArrayStack {
    private int[] stack;
    private int stackPosition;
    private int size;

    public ArrayStack() {
        stack = new int[10];
        stackPosition = 0;
        size = 10;
    }

    public ArrayStack(int size) {
        stack = new int[size];
        stackPosition = 0;
        this.size = size;
    }

    // return true is stack is empty, else return false
    public boolean empty() {
        return (stackPosition == 0) ? true : false;
    }

    // return top of stack
    public int peek() throws StackIsEmptyException {
        if (stackPosition == 0) {
            throw new StackIsEmptyException("The stack is empty."); 
        }
        else {
            return stack[stackPosition - 1];
        }
    }

    // return top of stack and remove from stack
    public int pop() throws StackIsEmptyException {
        if (stackPosition == 0) {
            throw new StackIsEmptyException("Stack is empty."); 
        }
        else {
            stackPosition--;
            return stack[stackPosition];
        }
    }

    // push n into stack
    public void push(int n) throws StackIsFullException{
        if (stackPosition < size) {
            stack[stackPosition] = n;
            stackPosition++;
        }
        else {
            throw new StackIsFullException("Stack is full.");
        }
    }

    // search
    public int search(int n) {
        int count = 1;
        for (int i = stackPosition - 1; i >= 0; i--) {
            if (stack[i] != n) {
                count++; 
            }
            if (stack[i] == n) {
                return count;
            }
        }
        return 0;
    }

    public int size() {
        return this.size;
    }
}