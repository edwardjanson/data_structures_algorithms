package stack;

public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeight();

        System.out.println("\nStack:");
        myStack.printStack();
    }
}
