public class Main {
    public static void main(String[] args) {
        try {
            ArrayStack stack = new ArrayStack(5);
            stack.push(5);
            stack.push(13);
            stack.push(27);
            stack.push(9);
            stack.push(4);
            //stack.push(7); // StackIsFullException is thrown and caught

            System.out.println(stack.peek());
            System.out.println(stack.search(27)); // returns 3 as intended
            System.out.println(stack.search(5));
            System.out.println(stack.empty());
        } 
        catch (StackIsEmptyException e) {
            System.out.println(e.getMessage());
        }
        catch (StackIsFullException e) {
            System.out.println(e.getMessage());
        }
    }
}