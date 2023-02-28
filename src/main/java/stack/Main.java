package stack;

import linked_list.LinkedList;

public class Main {

    public static void getStackInfo(Stack stack) {
        stack.getTop();
        stack.getHeight();
        System.out.println();
    }

    public static void main(String[] args) {

        Stack myStack = new Stack(4);
        getStackInfo(myStack);

        myStack.push(3);
        getStackInfo(myStack);

        myStack.pop();

        System.out.println("\nStack:");
        myStack.printStack();
    }
}
